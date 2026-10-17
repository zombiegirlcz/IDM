package com.revolut.feature.card_management.impl.ui.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.navigable.flow.FlowStep;
import h93.f0;
import i93.e;
import i93.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wy2.b;
import wy2.c;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Settings", "DisposableCardSettings", "LinkedWallets", "SetTransactionLimit", "Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step$DisposableCardSettings;", "Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step$LinkedWallets;", "Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step$SetTransactionLimit;", "Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step$Settings;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevolutCardSettingsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step$DisposableCardSettings;", "Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisposableCardSettings extends RevolutCardSettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DisposableCardSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f64857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f64858b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisposableCardSettings((f0) parcel.readSerializable(), (AccountId) parcel.readParcelable(DisposableCardSettings.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisposableCardSettings[i];
            }
        }

        public DisposableCardSettings(f0 disposableCard, AccountId accountId) {
            Intrinsics.checkNotNullParameter(disposableCard, "disposableCard");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f64857a = disposableCard;
            this.f64858b = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DisposableCardSettings)) {
                return false;
            }
            DisposableCardSettings disposableCardSettings = (DisposableCardSettings) obj2;
            return Intrinsics.f(this.f64857a, disposableCardSettings.f64857a) && Intrinsics.f(this.f64858b, disposableCardSettings.f64858b);
        }

        public final int hashCode() {
            return this.f64858b.hashCode() + (this.f64857a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64857a);
            dest.writeParcelable(this.f64858b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step$LinkedWallets;", "Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedWallets extends RevolutCardSettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkedWallets> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64859a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedWallets(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedWallets[i];
            }
        }

        public LinkedWallets(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64859a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkedWallets) && Intrinsics.f(this.f64859a, ((LinkedWallets) obj2).f64859a);
        }

        public final int hashCode() {
            return this.f64859a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64859a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step$SetTransactionLimit;", "Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetTransactionLimit extends RevolutCardSettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SetTransactionLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f64860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f64862c;
        public final l d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetTransactionLimit(c.valueOf(parcel.readString()), parcel.readString(), e.valueOf(parcel.readString()), (l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetTransactionLimit[i];
            }
        }

        public SetTransactionLimit(c flowType, String cardId, e cardSettingsType, l transactionLimit) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(cardSettingsType, "cardSettingsType");
            Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
            this.f64860a = flowType;
            this.f64861b = cardId;
            this.f64862c = cardSettingsType;
            this.d = transactionLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetTransactionLimit)) {
                return false;
            }
            SetTransactionLimit setTransactionLimit = (SetTransactionLimit) obj2;
            return this.f64860a == setTransactionLimit.f64860a && Intrinsics.f(this.f64861b, setTransactionLimit.f64861b) && this.f64862c == setTransactionLimit.f64862c && Intrinsics.f(this.d, setTransactionLimit.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f64862c.hashCode() + p.a.c(this.f64860a.hashCode() * 31, 31, this.f64861b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64860a.name());
            dest.writeString(this.f64861b);
            dest.writeString(this.f64862c.name());
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step$Settings;", "Lcom/revolut/feature/card_management/impl/ui/kompot/RevolutCardSettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Settings extends RevolutCardSettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f64864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wy2.a f64865c;
        public final b d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Settings(parcel.readString(), (AccountId) parcel.readParcelable(Settings.class.getClassLoader()), wy2.a.valueOf(parcel.readString()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        public Settings(String cardId, AccountId accountId, wy2.a flowName, b flowType) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f64863a = cardId;
            this.f64864b = accountId;
            this.f64865c = flowName;
            this.d = flowType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) obj2;
            return Intrinsics.f(this.f64863a, settings.f64863a) && Intrinsics.f(this.f64864b, settings.f64864b) && this.f64865c == settings.f64865c && this.d == settings.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f64865c.hashCode() + h30.l.b(this.f64864b, this.f64863a.hashCode() * 31, 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64863a);
            dest.writeParcelable(this.f64864b, i);
            dest.writeString(this.f64865c.name());
            dest.writeString(this.d.name());
        }
    }

    private RevolutCardSettingsFlowContract$Step() {
    }
}

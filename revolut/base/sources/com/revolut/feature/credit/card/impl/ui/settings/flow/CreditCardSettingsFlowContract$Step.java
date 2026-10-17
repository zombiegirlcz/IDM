package com.revolut.feature.credit.card.impl.ui.settings.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/card/impl/ui/settings/flow/CreditCardSettingsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Settings", "SelectDueDate", "Lcom/revolut/feature/credit/card/impl/ui/settings/flow/CreditCardSettingsFlowContract$Step$SelectDueDate;", "Lcom/revolut/feature/credit/card/impl/ui/settings/flow/CreditCardSettingsFlowContract$Step$Settings;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardSettingsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/settings/flow/CreditCardSettingsFlowContract$Step$SelectDueDate;", "Lcom/revolut/feature/credit/card/impl/ui/settings/flow/CreditCardSettingsFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectDueDate extends CreditCardSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectDueDate f69634a = new SelectDueDate();

        @NotNull
        public static final Parcelable.Creator<SelectDueDate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectDueDate.f69634a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectDueDate[i];
            }
        }

        private SelectDueDate() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof SelectDueDate);
        }

        public final int hashCode() {
            return 167373768;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/settings/flow/CreditCardSettingsFlowContract$Step$Settings;", "Lcom/revolut/feature/credit/card/impl/ui/settings/flow/CreditCardSettingsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings extends CreditCardSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Settings f69635a = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f69635a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        private Settings() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private CreditCardSettingsFlowContract$Step() {
    }
}

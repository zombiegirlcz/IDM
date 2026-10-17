package com.revolut.feature.credit.card.impl.ui.limit_hub.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xp3.d;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Manage", "Settings", "LimitHistory", "LimitIncreasePreference", "Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step$LimitHistory;", "Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step$LimitIncreasePreference;", "Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step$Manage;", "Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step$Settings;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardLimitHubFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step$LimitHistory;", "Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LimitHistory extends CreditCardLimitHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LimitHistory f69530a = new LimitHistory();

        @NotNull
        public static final Parcelable.Creator<LimitHistory> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LimitHistory.f69530a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitHistory[i];
            }
        }

        private LimitHistory() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step$LimitIncreasePreference;", "Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitIncreasePreference extends CreditCardLimitHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LimitIncreasePreference> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f69532b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVarValueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(d.valueOf(parcel.readString()));
                }
                return new LimitIncreasePreference(dVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitIncreasePreference[i];
            }
        }

        public LimitIncreasePreference(d dVar, ArrayList availableOptions) {
            Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
            this.f69531a = dVar;
            this.f69532b = availableOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitIncreasePreference)) {
                return false;
            }
            LimitIncreasePreference limitIncreasePreference = (LimitIncreasePreference) obj2;
            return this.f69531a == limitIncreasePreference.f69531a && this.f69532b.equals(limitIncreasePreference.f69532b);
        }

        public final int hashCode() {
            d dVar = this.f69531a;
            return this.f69532b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            d dVar = this.f69531a;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
            Iterator itY = j6.a.y(this.f69532b, dest);
            while (itY.hasNext()) {
                dest.writeString(((d) itY.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step$Manage;", "Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Manage extends CreditCardLimitHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Manage f69533a = new Manage();

        @NotNull
        public static final Parcelable.Creator<Manage> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Manage.f69533a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Manage[i];
            }
        }

        private Manage() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step$Settings;", "Lcom/revolut/feature/credit/card/impl/ui/limit_hub/flow/CreditCardLimitHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Settings extends CreditCardLimitHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f69534a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Settings((dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        public Settings(dj0.d approvedLimit) {
            Intrinsics.checkNotNullParameter(approvedLimit, "approvedLimit");
            this.f69534a = approvedLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Settings) && Intrinsics.f(this.f69534a, ((Settings) obj2).f69534a);
        }

        public final int hashCode() {
            return this.f69534a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69534a);
        }
    }

    private CreditCardLimitHubFlowContract$Step() {
    }
}

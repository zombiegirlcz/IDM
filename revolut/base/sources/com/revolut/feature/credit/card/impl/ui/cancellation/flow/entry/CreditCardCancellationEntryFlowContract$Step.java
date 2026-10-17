package com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.credit.card.api.models.cancellation.RepaymentDeferral;
import com.revolut.feature.credit.card.api.navigation.CreditCardCancellationDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import hl4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BlockedScreen", "WithdrawalFlow", "CancellationFlow", "Error", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step$BlockedScreen;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step$CancellationFlow;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step$Error;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step$WithdrawalFlow;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardCancellationEntryFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step$BlockedScreen;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockedScreen implements CreditCardCancellationEntryFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlockedScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hl4.a f69136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f69137b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlockedScreen(hl4.a.valueOf(parcel.readString()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockedScreen[i];
            }
        }

        public BlockedScreen(hl4.a reason, b countryCode) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f69136a = reason;
            this.f69137b = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BlockedScreen)) {
                return false;
            }
            BlockedScreen blockedScreen = (BlockedScreen) obj2;
            return this.f69136a == blockedScreen.f69136a && Intrinsics.f(this.f69137b, blockedScreen.f69137b);
        }

        public final int hashCode() {
            return this.f69137b.f297794a.hashCode() + (this.f69136a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69136a.name());
            dest.writeSerializable(this.f69137b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step$CancellationFlow;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationFlow implements CreditCardCancellationEntryFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancellationFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditCardCancellationDestination.CancellationType f69139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f69140c;
        public final d d;
        public final RepaymentDeferral e;
        public final PayoffBreakdown f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f69141g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationFlow(parcel.readString(), (CreditCardCancellationDestination.CancellationType) parcel.readParcelable(CancellationFlow.class.getClassLoader()), parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), (d) parcel.readSerializable(), (RepaymentDeferral) parcel.readParcelable(CancellationFlow.class.getClassLoader()), (PayoffBreakdown) parcel.readParcelable(CancellationFlow.class.getClassLoader()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationFlow[i];
            }
        }

        public CancellationFlow(String facilityId, CreditCardCancellationDestination.CancellationType cancellationType, g gVar, d dVar, RepaymentDeferral repaymentDeferral, PayoffBreakdown payoffBreakdown, b bVar) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
            this.f69138a = facilityId;
            this.f69139b = cancellationType;
            this.f69140c = gVar;
            this.d = dVar;
            this.e = repaymentDeferral;
            this.f = payoffBreakdown;
            this.f69141g = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancellationFlow)) {
                return false;
            }
            CancellationFlow cancellationFlow = (CancellationFlow) obj2;
            return Intrinsics.f(this.f69138a, cancellationFlow.f69138a) && Intrinsics.f(this.f69139b, cancellationFlow.f69139b) && this.f69140c == cancellationFlow.f69140c && Intrinsics.f(this.d, cancellationFlow.d) && Intrinsics.f(this.e, cancellationFlow.e) && Intrinsics.f(this.f, cancellationFlow.f) && Intrinsics.f(this.f69141g, cancellationFlow.f69141g);
        }

        public final int hashCode() {
            int iHashCode = (this.f69139b.hashCode() + (this.f69138a.hashCode() * 31)) * 31;
            g gVar = this.f69140c;
            int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            d dVar = this.d;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            RepaymentDeferral repaymentDeferral = this.e;
            int iHashCode4 = (iHashCode3 + (repaymentDeferral == null ? 0 : repaymentDeferral.hashCode())) * 31;
            PayoffBreakdown payoffBreakdown = this.f;
            int iHashCode5 = (iHashCode4 + (payoffBreakdown == null ? 0 : payoffBreakdown.hashCode())) * 31;
            b bVar = this.f69141g;
            return iHashCode5 + (bVar != null ? bVar.f297794a.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69138a);
            dest.writeParcelable(this.f69139b, i);
            g gVar = this.f69140c;
            if (gVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(gVar.name());
            }
            dest.writeSerializable(this.d);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeSerializable(this.f69141g);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step$Error;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Error implements CreditCardCancellationEntryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f69142a = new Error();

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Error.f69142a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        private Error() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step$WithdrawalFlow;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/entry/CreditCardCancellationEntryFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithdrawalFlow implements CreditCardCancellationEntryFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WithdrawalFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69143a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithdrawalFlow(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithdrawalFlow[i];
            }
        }

        public WithdrawalFlow(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f69143a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithdrawalFlow) && Intrinsics.f(this.f69143a, ((WithdrawalFlow) obj2).f69143a);
        }

        public final int hashCode() {
            return this.f69143a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69143a);
        }
    }
}

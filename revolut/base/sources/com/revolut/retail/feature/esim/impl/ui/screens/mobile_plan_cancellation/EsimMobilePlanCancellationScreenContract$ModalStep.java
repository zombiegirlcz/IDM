package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionWithdrawalConfirmation;
import dej.h3;
import dj0.d;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/EsimMobilePlanCancellationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CancellationTerms", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/EsimMobilePlanCancellationScreenContract$ModalStep$CancellationTerms;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanCancellationScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/EsimMobilePlanCancellationScreenContract$ModalStep$CancellationTerms;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/EsimMobilePlanCancellationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationTerms implements EsimMobilePlanCancellationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancellationTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f101110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f101111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f101112c;
        public final d d;
        public final Long e;
        public final d f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Long f101113g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Long f101114h;
        public final Instant i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f101115j;
        public final h3 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Instant f101116l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final EsimSubscriptionWithdrawalConfirmation f101117m;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationTerms((d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (Instant) parcel.readSerializable(), parcel.readInt() != 0, h3.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), (EsimSubscriptionWithdrawalConfirmation) parcel.readParcelable(CancellationTerms.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationTerms[i];
            }
        }

        public CancellationTerms(d totalRefund, Double d, Long l2, d dVar, Long l3, d dVar2, Long l4, Long l5, Instant instant, boolean z, h3 refundStrategy, Instant instant2, EsimSubscriptionWithdrawalConfirmation esimSubscriptionWithdrawalConfirmation) {
            Intrinsics.checkNotNullParameter(totalRefund, "totalRefund");
            Intrinsics.checkNotNullParameter(refundStrategy, "refundStrategy");
            this.f101110a = totalRefund;
            this.f101111b = d;
            this.f101112c = l2;
            this.d = dVar;
            this.e = l3;
            this.f = dVar2;
            this.f101113g = l4;
            this.f101114h = l5;
            this.i = instant;
            this.f101115j = z;
            this.k = refundStrategy;
            this.f101116l = instant2;
            this.f101117m = esimSubscriptionWithdrawalConfirmation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancellationTerms)) {
                return false;
            }
            CancellationTerms cancellationTerms = (CancellationTerms) obj2;
            return Intrinsics.f(this.f101110a, cancellationTerms.f101110a) && Intrinsics.f(this.f101111b, cancellationTerms.f101111b) && Intrinsics.f(this.f101112c, cancellationTerms.f101112c) && Intrinsics.f(this.d, cancellationTerms.d) && Intrinsics.f(this.e, cancellationTerms.e) && Intrinsics.f(this.f, cancellationTerms.f) && Intrinsics.f(this.f101113g, cancellationTerms.f101113g) && Intrinsics.f(this.f101114h, cancellationTerms.f101114h) && Intrinsics.f(this.i, cancellationTerms.i) && this.f101115j == cancellationTerms.f101115j && this.k == cancellationTerms.k && Intrinsics.f(this.f101116l, cancellationTerms.f101116l) && Intrinsics.f(this.f101117m, cancellationTerms.f101117m);
        }

        public final int hashCode() {
            int iHashCode = this.f101110a.hashCode() * 31;
            Double d = this.f101111b;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            Long l2 = this.f101112c;
            int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
            d dVar = this.d;
            int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Long l3 = this.e;
            int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
            d dVar2 = this.f;
            int iHashCode6 = (iHashCode5 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
            Long l4 = this.f101113g;
            int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.f101114h;
            int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
            Instant instant = this.i;
            int iHashCode9 = (this.k.hashCode() + j6.a.c((iHashCode8 + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.f101115j)) * 31;
            Instant instant2 = this.f101116l;
            int iHashCode10 = (iHashCode9 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            EsimSubscriptionWithdrawalConfirmation esimSubscriptionWithdrawalConfirmation = this.f101117m;
            return iHashCode10 + (esimSubscriptionWithdrawalConfirmation != null ? esimSubscriptionWithdrawalConfirmation.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101110a);
            Double d = this.f101111b;
            if (d == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
            }
            Long l2 = this.f101112c;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            dest.writeSerializable(this.d);
            Long l3 = this.e;
            if (l3 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l3);
            }
            dest.writeSerializable(this.f);
            Long l4 = this.f101113g;
            if (l4 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l4);
            }
            Long l5 = this.f101114h;
            if (l5 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l5);
            }
            dest.writeSerializable(this.i);
            dest.writeInt(this.f101115j ? 1 : 0);
            dest.writeString(this.k.name());
            dest.writeSerializable(this.f101116l);
            dest.writeParcelable(this.f101117m, i);
        }
    }
}

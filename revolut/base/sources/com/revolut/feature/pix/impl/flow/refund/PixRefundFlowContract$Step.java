package com.revolut.feature.pix.impl.flow.refund;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pix/impl/flow/refund/PixRefundFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Amount", "Review", "Lcom/revolut/feature/pix/impl/flow/refund/PixRefundFlowContract$Step$Amount;", "Lcom/revolut/feature/pix/impl/flow/refund/PixRefundFlowContract$Step$Review;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixRefundFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/refund/PixRefundFlowContract$Step$Amount;", "Lcom/revolut/feature/pix/impl/flow/refund/PixRefundFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount implements PixRefundFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f80731c;
        public final Instant d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(String payerName, String groupId, d limit, Instant until) {
            Intrinsics.checkNotNullParameter(payerName, "payerName");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(limit, "limit");
            Intrinsics.checkNotNullParameter(until, "until");
            this.f80729a = payerName;
            this.f80730b = groupId;
            this.f80731c = limit;
            this.d = until;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj2;
            return Intrinsics.f(this.f80729a, amount.f80729a) && Intrinsics.f(this.f80730b, amount.f80730b) && Intrinsics.f(this.f80731c, amount.f80731c) && Intrinsics.f(this.d, amount.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + v7.c(p.a.c(this.f80729a.hashCode() * 31, 31, this.f80730b), 31, this.f80731c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80729a);
            dest.writeString(this.f80730b);
            dest.writeSerializable(this.f80731c);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/refund/PixRefundFlowContract$Step$Review;", "Lcom/revolut/feature/pix/impl/flow/refund/PixRefundFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements PixRefundFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f80732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f80734c;
        public final d d;
        public final Instant e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVar = (d) parcel.readSerializable();
                String string = parcel.readString();
                String string2 = parcel.readString();
                return new Review(dVar, (d) parcel.readSerializable(), string, string2, parcel.readString(), (Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(d amount, d originalAmount, String groupId, String payerName, String reference, Instant instant) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(payerName, "payerName");
            Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.f80732a = amount;
            this.f80733b = groupId;
            this.f80734c = payerName;
            this.d = originalAmount;
            this.e = instant;
            this.f = reference;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return Intrinsics.f(this.f80732a, review.f80732a) && Intrinsics.f(this.f80733b, review.f80733b) && Intrinsics.f(this.f80734c, review.f80734c) && Intrinsics.f(this.d, review.d) && Intrinsics.f(this.e, review.e) && Intrinsics.f(this.f, review.f);
        }

        public final int hashCode() {
            int iC = v7.c(p.a.c(p.a.c(this.f80732a.hashCode() * 31, 31, this.f80733b), 31, this.f80734c), 31, this.d);
            Instant instant = this.e;
            return this.f.hashCode() + ((iC + (instant == null ? 0 : instant.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80732a);
            dest.writeString(this.f80733b);
            dest.writeString(this.f80734c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            dest.writeString(this.f);
        }
    }
}

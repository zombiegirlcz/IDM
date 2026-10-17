package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "NewPaymentLink", "RequestCustomAmountAndNote", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$InputData$NewPaymentLink;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$InputData$RequestCustomAmountAndNote;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentLinksAmountScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$InputData$NewPaymentLink;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewPaymentLink implements PaymentLinksAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NewPaymentLink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f102198a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewPaymentLink(f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewPaymentLink[i];
            }
        }

        public NewPaymentLink(f direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.f102198a = direction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewPaymentLink) && this.f102198a == ((NewPaymentLink) obj2).f102198a;
        }

        public final int hashCode() {
            return this.f102198a.hashCode();
        }

        @Override // com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData
        /* JADX INFO: renamed from: k, reason: from getter */
        public final f getF102201c() {
            return this.f102198a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102198a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$InputData$RequestCustomAmountAndNote;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestCustomAmountAndNote implements PaymentLinksAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RequestCustomAmountAndNote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f102199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f102201c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestCustomAmountAndNote((d) parcel.readSerializable(), parcel.readString(), f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestCustomAmountAndNote[i];
            }
        }

        public RequestCustomAmountAndNote(d dVar, String str, f fVar) {
            this.f102199a = dVar;
            this.f102200b = str;
            this.f102201c = fVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RequestCustomAmountAndNote)) {
                return false;
            }
            RequestCustomAmountAndNote requestCustomAmountAndNote = (RequestCustomAmountAndNote) obj2;
            return Intrinsics.f(this.f102199a, requestCustomAmountAndNote.f102199a) && Intrinsics.f(this.f102200b, requestCustomAmountAndNote.f102200b) && this.f102201c == requestCustomAmountAndNote.f102201c;
        }

        public final int hashCode() {
            d dVar = this.f102199a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            String str = this.f102200b;
            return this.f102201c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData
        /* JADX INFO: renamed from: k, reason: from getter */
        public final f getF102201c() {
            return this.f102201c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102199a);
            dest.writeString(this.f102200b);
            dest.writeString(this.f102201c.name());
        }
    }

    /* JADX INFO: renamed from: k */
    f getF102201c();
}

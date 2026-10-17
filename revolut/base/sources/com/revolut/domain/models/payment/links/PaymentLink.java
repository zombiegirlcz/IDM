package com.revolut.domain.models.payment.links;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/payment/links/PaymentLink;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentLink implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentLink> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f60420c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentLink(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentLink[i];
        }
    }

    public PaymentLink(long j2, String id10, String link, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f60418a = id10;
        this.f60419b = link;
        this.f60420c = j2;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentLink)) {
            return false;
        }
        PaymentLink paymentLink = (PaymentLink) obj2;
        return Intrinsics.f(this.f60418a, paymentLink.f60418a) && Intrinsics.f(this.f60419b, paymentLink.f60419b) && this.f60420c == paymentLink.f60420c && Intrinsics.f(this.d, paymentLink.d);
    }

    public final int hashCode() {
        int iC = d.c(p.a.c(this.f60418a.hashCode() * 31, 31, this.f60419b), 31, this.f60420c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60418a);
        dest.writeString(this.f60419b);
        dest.writeLong(this.f60420c);
        dest.writeString(this.d);
    }
}

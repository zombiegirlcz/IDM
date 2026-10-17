package com.revolut.feature.transport.models.transit;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicketActivationParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "bxf/b", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PurchasedTransitTicketActivationParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PurchasedTransitTicketActivationParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bxf.b f92699c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f92700g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PurchasedTransitTicketActivationParams(parcel.readString(), parcel.readString(), bxf.b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PurchasedTransitTicketActivationParams[i];
        }
    }

    public PurchasedTransitTicketActivationParams(String id10, String code, bxf.b type, String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f92697a = id10;
        this.f92698b = code;
        this.f92699c = type;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f92700g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PurchasedTransitTicketActivationParams)) {
            return false;
        }
        PurchasedTransitTicketActivationParams purchasedTransitTicketActivationParams = (PurchasedTransitTicketActivationParams) obj2;
        return Intrinsics.f(this.f92697a, purchasedTransitTicketActivationParams.f92697a) && Intrinsics.f(this.f92698b, purchasedTransitTicketActivationParams.f92698b) && this.f92699c == purchasedTransitTicketActivationParams.f92699c && Intrinsics.f(this.d, purchasedTransitTicketActivationParams.d) && Intrinsics.f(this.e, purchasedTransitTicketActivationParams.e) && Intrinsics.f(this.f, purchasedTransitTicketActivationParams.f) && this.f92700g == purchasedTransitTicketActivationParams.f92700g;
    }

    public final int hashCode() {
        int iHashCode = (this.f92699c.hashCode() + p.a.c(this.f92697a.hashCode() * 31, 31, this.f92698b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.f92700g) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92697a);
        dest.writeString(this.f92698b);
        dest.writeString(this.f92699c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeInt(this.f92700g ? 1 : 0);
    }
}

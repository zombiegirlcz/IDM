package com.revolut.feature.alipay.impl.ui.supportedqrs;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/alipay/impl/ui/supportedqrs/SupportedQRsScreenContract$SupportedQR", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SupportedQRsScreenContract$SupportedQR implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SupportedQRsScreenContract$SupportedQR> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61091c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SupportedQRsScreenContract$SupportedQR(parcel.readString(), parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SupportedQRsScreenContract$SupportedQR[i];
        }
    }

    public SupportedQRsScreenContract$SupportedQR(String id10, String name, String logo, b country) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f61089a = id10;
        this.f61090b = name;
        this.f61091c = logo;
        this.d = country;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SupportedQRsScreenContract$SupportedQR)) {
            return false;
        }
        SupportedQRsScreenContract$SupportedQR supportedQRsScreenContract$SupportedQR = (SupportedQRsScreenContract$SupportedQR) obj2;
        return Intrinsics.f(this.f61089a, supportedQRsScreenContract$SupportedQR.f61089a) && Intrinsics.f(this.f61090b, supportedQRsScreenContract$SupportedQR.f61090b) && Intrinsics.f(this.f61091c, supportedQRsScreenContract$SupportedQR.f61091c) && Intrinsics.f(this.d, supportedQRsScreenContract$SupportedQR.d);
    }

    public final int hashCode() {
        return this.d.f297794a.hashCode() + p.a.c(p.a.c(this.f61089a.hashCode() * 31, 31, this.f61090b), 31, this.f61091c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61089a);
        dest.writeString(this.f61090b);
        dest.writeString(this.f61091c);
        dest.writeSerializable(this.d);
    }
}

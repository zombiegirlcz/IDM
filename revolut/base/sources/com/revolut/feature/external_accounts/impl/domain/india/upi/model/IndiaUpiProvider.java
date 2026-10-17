package com.revolut.feature.external_accounts.impl.domain.india.upi.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/india/upi/model/IndiaUpiProvider;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndiaUpiProvider implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndiaUpiProvider> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72376c;
    public final String d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndiaUpiProvider(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IndiaUpiProvider[i];
        }
    }

    public IndiaUpiProvider(String id10, String name, String logo, String androidPackage, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(androidPackage, "androidPackage");
        this.f72374a = id10;
        this.f72375b = name;
        this.f72376c = logo;
        this.d = androidPackage;
        this.e = z;
    }

    public static IndiaUpiProvider a(IndiaUpiProvider indiaUpiProvider, boolean z) {
        String id10 = indiaUpiProvider.f72374a;
        String name = indiaUpiProvider.f72375b;
        String logo = indiaUpiProvider.f72376c;
        String androidPackage = indiaUpiProvider.d;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(androidPackage, "androidPackage");
        return new IndiaUpiProvider(id10, name, logo, androidPackage, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IndiaUpiProvider)) {
            return false;
        }
        IndiaUpiProvider indiaUpiProvider = (IndiaUpiProvider) obj2;
        return Intrinsics.f(this.f72374a, indiaUpiProvider.f72374a) && Intrinsics.f(this.f72375b, indiaUpiProvider.f72375b) && Intrinsics.f(this.f72376c, indiaUpiProvider.f72376c) && Intrinsics.f(this.d, indiaUpiProvider.d) && this.e == indiaUpiProvider.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(p.a.c(p.a.c(this.f72374a.hashCode() * 31, 31, this.f72375b), 31, this.f72376c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72374a);
        dest.writeString(this.f72375b);
        dest.writeString(this.f72376c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
    }
}

package com.revolut.domain.models.openbanking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/Provider;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Provider implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Provider> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60403c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Provider(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Provider[i];
        }
    }

    public Provider(String provider, String logoUrl, String title, String description, String str) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f60401a = provider;
        this.f60402b = logoUrl;
        this.f60403c = title;
        this.d = description;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Provider)) {
            return false;
        }
        Provider provider = (Provider) obj2;
        return Intrinsics.f(this.f60401a, provider.f60401a) && Intrinsics.f(this.f60402b, provider.f60402b) && Intrinsics.f(this.f60403c, provider.f60403c) && Intrinsics.f(this.d, provider.d) && Intrinsics.f(this.e, provider.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f60401a.hashCode() * 31, 31, this.f60402b), 31, this.f60403c), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60401a);
        dest.writeString(this.f60402b);
        dest.writeString(this.f60403c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}

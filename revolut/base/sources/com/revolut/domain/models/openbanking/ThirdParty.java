package com.revolut.domain.models.openbanking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/ThirdParty;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThirdParty implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ThirdParty> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60406c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ThirdParty(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThirdParty[i];
        }
    }

    public ThirdParty(String id10, String name, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f60404a = id10;
        this.f60405b = name;
        this.f60406c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThirdParty)) {
            return false;
        }
        ThirdParty thirdParty = (ThirdParty) obj2;
        return Intrinsics.f(this.f60404a, thirdParty.f60404a) && Intrinsics.f(this.f60405b, thirdParty.f60405b) && Intrinsics.f(this.f60406c, thirdParty.f60406c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f60404a.hashCode() * 31, 31, this.f60405b);
        String str = this.f60406c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60404a);
        dest.writeString(this.f60405b);
        dest.writeString(this.f60406c);
    }
}

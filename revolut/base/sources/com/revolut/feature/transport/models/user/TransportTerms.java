package com.revolut.feature.transport.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/user/TransportTerms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransportTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransportTerms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92741c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransportTerms(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransportTerms[i];
        }
    }

    public TransportTerms(String id10, String uri2, String title, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f92739a = id10;
        this.f92740b = uri2;
        this.f92741c = title;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransportTerms)) {
            return false;
        }
        TransportTerms transportTerms = (TransportTerms) obj2;
        return Intrinsics.f(this.f92739a, transportTerms.f92739a) && Intrinsics.f(this.f92740b, transportTerms.f92740b) && Intrinsics.f(this.f92741c, transportTerms.f92741c) && Intrinsics.f(this.d, transportTerms.d) && Intrinsics.f(this.e, transportTerms.e) && Intrinsics.f(this.f, transportTerms.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f92739a.hashCode() * 31, 31, this.f92740b), 31, this.f92741c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92739a);
        dest.writeString(this.f92740b);
        dest.writeString(this.f92741c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}

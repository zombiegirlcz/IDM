package com.revolut.shared.feature.user_declarations.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/models/NamePrefill;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NamePrefill implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NamePrefill> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105038c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f105039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f105040h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NamePrefill(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NamePrefill[i];
        }
    }

    public NamePrefill(String firstName, String lastName, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f105036a = firstName;
        this.f105037b = lastName;
        this.f105038c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f105039g = str5;
        this.f105040h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NamePrefill)) {
            return false;
        }
        NamePrefill namePrefill = (NamePrefill) obj2;
        return Intrinsics.f(this.f105036a, namePrefill.f105036a) && Intrinsics.f(this.f105037b, namePrefill.f105037b) && Intrinsics.f(this.f105038c, namePrefill.f105038c) && Intrinsics.f(this.d, namePrefill.d) && Intrinsics.f(this.e, namePrefill.e) && Intrinsics.f(this.f, namePrefill.f) && Intrinsics.f(this.f105039g, namePrefill.f105039g) && Intrinsics.f(this.f105040h, namePrefill.f105040h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f105036a.hashCode() * 31, 31, this.f105037b);
        String str = this.f105038c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f105039g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f105040h;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105036a);
        dest.writeString(this.f105037b);
        dest.writeString(this.f105038c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f105039g);
        dest.writeString(this.f105040h);
    }
}

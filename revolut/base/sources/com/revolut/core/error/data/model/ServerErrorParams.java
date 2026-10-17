package com.revolut.core.error.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/error/data/model/ServerErrorParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class ServerErrorParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ServerErrorParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f51370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f51372c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f51373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f51374h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f51375j;
    public final String k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            dj0.d dVar = (dj0.d) parcel.readSerializable();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ServerErrorParams(dVar, string, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ServerErrorParams[i];
        }
    }

    public ServerErrorParams(dj0.d dVar, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f51370a = dVar;
        this.f51371b = str;
        this.f51372c = bool;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f51373g = str5;
        this.f51374h = str6;
        this.i = str7;
        this.f51375j = str8;
        this.k = str9;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final dj0.d getF51370a() {
        return this.f51370a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getF51372c() {
        return this.f51372c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getK() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF51375j() {
        return this.f51375j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ServerErrorParams)) {
            return false;
        }
        ServerErrorParams serverErrorParams = (ServerErrorParams) obj2;
        return Intrinsics.f(this.f51370a, serverErrorParams.f51370a) && Intrinsics.f(this.f51371b, serverErrorParams.f51371b) && Intrinsics.f(this.f51372c, serverErrorParams.f51372c) && Intrinsics.f(this.d, serverErrorParams.d) && Intrinsics.f(this.e, serverErrorParams.e) && Intrinsics.f(this.f, serverErrorParams.f) && Intrinsics.f(this.f51373g, serverErrorParams.f51373g) && Intrinsics.f(this.f51374h, serverErrorParams.f51374h) && Intrinsics.f(this.i, serverErrorParams.i) && Intrinsics.f(this.f51375j, serverErrorParams.f51375j) && Intrinsics.f(this.k, serverErrorParams.k);
    }

    /* JADX INFO: renamed from: getDescription, reason: from getter */
    public final String getF51374h() {
        return this.f51374h;
    }

    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF51373g() {
        return this.f51373g;
    }

    public final int hashCode() {
        dj0.d dVar = this.f51370a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        String str = this.f51371b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f51372c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f51373g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f51374h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f51375j;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f51370a);
        dest.writeString(this.f51371b);
        Boolean bool = this.f51372c;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f51373g);
        dest.writeString(this.f51374h);
        dest.writeString(this.i);
        dest.writeString(this.f51375j);
        dest.writeString(this.k);
    }

    public ServerErrorParams() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }
}

package com.revolut.core.android.model.country;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/android/model/country/CountryInfo;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "core_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryInfo implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<CountryInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51206c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CountryInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountryInfo[i];
        }
    }

    public CountryInfo(String code, String name, String phoneCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
        this.f51204a = code;
        this.f51205b = name;
        this.f51206c = phoneCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CountryInfo)) {
            return false;
        }
        CountryInfo countryInfo = (CountryInfo) obj2;
        return Intrinsics.f(this.f51204a, countryInfo.f51204a) && Intrinsics.f(this.f51205b, countryInfo.f51205b) && Intrinsics.f(this.f51206c, countryInfo.f51206c);
    }

    public final int hashCode() {
        return this.f51206c.hashCode() + p.a.c(this.f51204a.hashCode() * 31, 31, this.f51205b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51204a);
        dest.writeString(this.f51205b);
        dest.writeString(this.f51206c);
    }
}

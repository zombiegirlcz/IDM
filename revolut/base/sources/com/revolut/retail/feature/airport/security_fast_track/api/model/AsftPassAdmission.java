package com.revolut.retail.feature.airport.security_fast_track.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import bti.l;
import bti.m;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/model/AsftPassAdmission;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftPassAdmission implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsftPassAdmission> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f98727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f98728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98729c;
    public final Instant d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftPassAdmission(m.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : l.valueOf(parcel.readString()), parcel.readString(), (Instant) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftPassAdmission[i];
        }
    }

    public AsftPassAdmission(m type, l lVar, String passIdentifier, Instant expirationDate, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(passIdentifier, "passIdentifier");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f98727a = type;
        this.f98728b = lVar;
        this.f98729c = passIdentifier;
        this.d = expirationDate;
        this.e = str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftPassAdmission)) {
            return false;
        }
        AsftPassAdmission asftPassAdmission = (AsftPassAdmission) obj2;
        return this.f98727a == asftPassAdmission.f98727a && this.f98728b == asftPassAdmission.f98728b && Intrinsics.f(this.f98729c, asftPassAdmission.f98729c) && Intrinsics.f(this.d, asftPassAdmission.d) && Intrinsics.f(this.e, asftPassAdmission.e) && Intrinsics.f(this.f, asftPassAdmission.f);
    }

    public final int hashCode() {
        int iHashCode = this.f98727a.hashCode() * 31;
        l lVar = this.f98728b;
        int iC = b.c(p.a.c((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f98729c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98727a.name());
        l lVar = this.f98728b;
        if (lVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(lVar.name());
        }
        dest.writeString(this.f98729c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}

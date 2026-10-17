package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.o1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimProfile;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimProfile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimProfile> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f100424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimProfileInstallationConfirmation f100425c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimProfileDetails f100426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EsimMigrationFromDataPlansOnly f100427h;
    public final EsimProfileApn i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EsimProfileScope f100428j;
    public final EsimProfileLock k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimProfile(parcel.readString(), o1.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : EsimProfileInstallationConfirmation.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EsimProfileDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimMigrationFromDataPlansOnly.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimProfileApn.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimProfileScope.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EsimProfileLock.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimProfile[i];
        }
    }

    public EsimProfile(String id10, o1 state, EsimProfileInstallationConfirmation esimProfileInstallationConfirmation, String str, String str2, String str3, EsimProfileDetails esimProfileDetails, EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly, EsimProfileApn esimProfileApn, EsimProfileScope esimProfileScope, EsimProfileLock esimProfileLock) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f100423a = id10;
        this.f100424b = state;
        this.f100425c = esimProfileInstallationConfirmation;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f100426g = esimProfileDetails;
        this.f100427h = esimMigrationFromDataPlansOnly;
        this.i = esimProfileApn;
        this.f100428j = esimProfileScope;
        this.k = esimProfileLock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimProfile)) {
            return false;
        }
        EsimProfile esimProfile = (EsimProfile) obj2;
        return Intrinsics.f(this.f100423a, esimProfile.f100423a) && this.f100424b == esimProfile.f100424b && Intrinsics.f(this.f100425c, esimProfile.f100425c) && Intrinsics.f(this.d, esimProfile.d) && Intrinsics.f(this.e, esimProfile.e) && Intrinsics.f(this.f, esimProfile.f) && Intrinsics.f(this.f100426g, esimProfile.f100426g) && Intrinsics.f(this.f100427h, esimProfile.f100427h) && Intrinsics.f(this.i, esimProfile.i) && Intrinsics.f(this.f100428j, esimProfile.f100428j) && Intrinsics.f(this.k, esimProfile.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f100424b.hashCode() + (this.f100423a.hashCode() * 31)) * 31;
        EsimProfileInstallationConfirmation esimProfileInstallationConfirmation = this.f100425c;
        int iHashCode2 = (iHashCode + (esimProfileInstallationConfirmation == null ? 0 : esimProfileInstallationConfirmation.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EsimProfileDetails esimProfileDetails = this.f100426g;
        int iHashCode6 = (iHashCode5 + (esimProfileDetails == null ? 0 : esimProfileDetails.hashCode())) * 31;
        EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly = this.f100427h;
        int iHashCode7 = (iHashCode6 + (esimMigrationFromDataPlansOnly == null ? 0 : Boolean.hashCode(esimMigrationFromDataPlansOnly.f100292a))) * 31;
        EsimProfileApn esimProfileApn = this.i;
        int iHashCode8 = (iHashCode7 + (esimProfileApn == null ? 0 : esimProfileApn.hashCode())) * 31;
        EsimProfileScope esimProfileScope = this.f100428j;
        int iHashCode9 = (iHashCode8 + (esimProfileScope == null ? 0 : esimProfileScope.hashCode())) * 31;
        EsimProfileLock esimProfileLock = this.k;
        return iHashCode9 + (esimProfileLock != null ? esimProfileLock.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100423a);
        dest.writeString(this.f100424b.name());
        EsimProfileInstallationConfirmation esimProfileInstallationConfirmation = this.f100425c;
        if (esimProfileInstallationConfirmation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimProfileInstallationConfirmation.writeToParcel(dest, i);
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        EsimProfileDetails esimProfileDetails = this.f100426g;
        if (esimProfileDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimProfileDetails.writeToParcel(dest, i);
        }
        EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly = this.f100427h;
        if (esimMigrationFromDataPlansOnly == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimMigrationFromDataPlansOnly.writeToParcel(dest, i);
        }
        EsimProfileApn esimProfileApn = this.i;
        if (esimProfileApn == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimProfileApn.writeToParcel(dest, i);
        }
        EsimProfileScope esimProfileScope = this.f100428j;
        if (esimProfileScope == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimProfileScope.writeToParcel(dest, i);
        }
        EsimProfileLock esimProfileLock = this.k;
        if (esimProfileLock == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimProfileLock.writeToParcel(dest, i);
        }
    }
}

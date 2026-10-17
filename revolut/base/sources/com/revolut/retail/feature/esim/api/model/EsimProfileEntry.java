package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.o1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimProfileEntry;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimProfileEntry implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimProfileEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f100441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100442c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimMigrationFromDataPlansOnly f100443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EsimProfileScope f100444h;
    public final EsimProfileLock i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimProfileEntry(parcel.readString(), o1.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EsimMigrationFromDataPlansOnly.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimProfileScope.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EsimProfileLock.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimProfileEntry[i];
        }
    }

    public EsimProfileEntry(String id10, o1 state, String str, String str2, String str3, String str4, EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly, EsimProfileScope esimProfileScope, EsimProfileLock esimProfileLock) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f100440a = id10;
        this.f100441b = state;
        this.f100442c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f100443g = esimMigrationFromDataPlansOnly;
        this.f100444h = esimProfileScope;
        this.i = esimProfileLock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimProfileEntry)) {
            return false;
        }
        EsimProfileEntry esimProfileEntry = (EsimProfileEntry) obj2;
        return Intrinsics.f(this.f100440a, esimProfileEntry.f100440a) && this.f100441b == esimProfileEntry.f100441b && Intrinsics.f(this.f100442c, esimProfileEntry.f100442c) && Intrinsics.f(this.d, esimProfileEntry.d) && Intrinsics.f(this.e, esimProfileEntry.e) && Intrinsics.f(this.f, esimProfileEntry.f) && Intrinsics.f(this.f100443g, esimProfileEntry.f100443g) && Intrinsics.f(this.f100444h, esimProfileEntry.f100444h) && Intrinsics.f(this.i, esimProfileEntry.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f100441b.hashCode() + (this.f100440a.hashCode() * 31)) * 31;
        String str = this.f100442c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly = this.f100443g;
        int iHashCode6 = (iHashCode5 + (esimMigrationFromDataPlansOnly == null ? 0 : Boolean.hashCode(esimMigrationFromDataPlansOnly.f100292a))) * 31;
        EsimProfileScope esimProfileScope = this.f100444h;
        int iHashCode7 = (iHashCode6 + (esimProfileScope == null ? 0 : esimProfileScope.hashCode())) * 31;
        EsimProfileLock esimProfileLock = this.i;
        return iHashCode7 + (esimProfileLock != null ? esimProfileLock.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100440a);
        dest.writeString(this.f100441b.name());
        dest.writeString(this.f100442c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly = this.f100443g;
        if (esimMigrationFromDataPlansOnly == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimMigrationFromDataPlansOnly.writeToParcel(dest, i);
        }
        EsimProfileScope esimProfileScope = this.f100444h;
        if (esimProfileScope == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimProfileScope.writeToParcel(dest, i);
        }
        EsimProfileLock esimProfileLock = this.i;
        if (esimProfileLock == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimProfileLock.writeToParcel(dest, i);
        }
    }
}

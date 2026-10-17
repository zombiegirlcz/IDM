package com.revolut.shared.feature.wealth.models.screener;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import zel.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/screener/ScreenerCollection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "zel/d", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerCollection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScreenerCollection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105156c;
    public final String d;
    public final int e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f105157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f105158h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ScreenerSelectedSorting f105159j;
    public final List k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i2);
            int iA = 0;
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList3.add(z.valueOf(parcel.readString()));
            }
            d dVarValueOf = d.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iE = 0;
                while (iE != i5) {
                    iE = j6.a.e(ScreenerCollection.class, parcel, arrayList4, iE, 1);
                }
                arrayList = arrayList4;
            }
            ScreenerSelectedSorting screenerSelectedSortingCreateFromParcel = parcel.readInt() == 0 ? null : ScreenerSelectedSorting.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                while (iA != i6) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ScreenerInstrument.CREATOR, parcel, arrayList5, iA, 1);
                }
                arrayList2 = arrayList5;
            }
            return new ScreenerCollection(string, string2, string3, string4, i, numValueOf, arrayList3, dVarValueOf, arrayList, screenerSelectedSortingCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerCollection[i];
        }
    }

    public ScreenerCollection(String id10, String icon, String name, String str, int i, Integer num, ArrayList instrumentTypes, d createdBy, ArrayList arrayList, ScreenerSelectedSorting screenerSelectedSorting, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        this.f105154a = id10;
        this.f105155b = icon;
        this.f105156c = name;
        this.d = str;
        this.e = i;
        this.f = num;
        this.f105157g = instrumentTypes;
        this.f105158h = createdBy;
        this.i = arrayList;
        this.f105159j = screenerSelectedSorting;
        this.k = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerCollection)) {
            return false;
        }
        ScreenerCollection screenerCollection = (ScreenerCollection) obj2;
        return Intrinsics.f(this.f105154a, screenerCollection.f105154a) && Intrinsics.f(this.f105155b, screenerCollection.f105155b) && Intrinsics.f(this.f105156c, screenerCollection.f105156c) && Intrinsics.f(this.d, screenerCollection.d) && this.e == screenerCollection.e && Intrinsics.f(this.f, screenerCollection.f) && this.f105157g.equals(screenerCollection.f105157g) && this.f105158h == screenerCollection.f105158h && Intrinsics.f(this.i, screenerCollection.i) && Intrinsics.f(this.f105159j, screenerCollection.f105159j) && Intrinsics.f(this.k, screenerCollection.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f105154a.hashCode() * 31, 31, this.f105155b), 31, this.f105156c);
        String str = this.d;
        int iB = j6.a.b(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.f;
        int iHashCode = (this.f105158h.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105157g, (iB + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31;
        List list = this.i;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ScreenerSelectedSorting screenerSelectedSorting = this.f105159j;
        int iHashCode3 = (iHashCode2 + (screenerSelectedSorting == null ? 0 : screenerSelectedSorting.hashCode())) * 31;
        List list2 = this.k;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105154a);
        dest.writeString(this.f105155b);
        dest.writeString(this.f105156c);
        dest.writeString(this.d);
        dest.writeInt(this.e);
        Integer num = this.f;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Iterator itY = j6.a.y(this.f105157g, dest);
        while (itY.hasNext()) {
            dest.writeString(((z) itY.next()).name());
        }
        dest.writeString(this.f105158h.name());
        List list = this.i;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        ScreenerSelectedSorting screenerSelectedSorting = this.f105159j;
        if (screenerSelectedSorting == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            screenerSelectedSorting.writeToParcel(dest, i);
        }
        List list2 = this.k;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = v0.a.q(dest, 1, list2);
        while (itQ2.hasNext()) {
            ((ScreenerInstrument) itQ2.next()).writeToParcel(dest, i);
        }
    }
}

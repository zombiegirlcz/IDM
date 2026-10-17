package com.revolut.feature.wealth.models.robo;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.portfolio_metrics.RegionSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.SectorSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.TopHoldingSubclassAllocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xdh.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/robo/Template;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Template implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Template> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xdh.a f95707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95708c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f95709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f95710h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f95711j;
    public final BenchmarkInfo k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f95712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f95713m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            xdh.a aVarValueOf = xdh.a.valueOf(parcel.readString());
            d dVarValueOf = d.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iA = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Template.class, parcel, arrayList, iE, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(SectorSubclassAllocation.CREATOR, parcel, arrayList2, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList3 = new ArrayList(i3);
                int iA3 = 0;
                while (iA3 != i3) {
                    iA3 = org.bouncycastle.jcajce.provider.digest.a.a(RegionSubclassAllocation.CREATOR, parcel, arrayList3, iA3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList4 = new ArrayList(i5);
                while (iA != i5) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TopHoldingSubclassAllocation.CREATOR, parcel, arrayList4, iA, 1);
                }
            }
            return new Template(string, aVarValueOf, dVarValueOf, string2, string3, arrayList, arrayList2, arrayList3, arrayList4, parcel.readString(), parcel.readInt() != 0 ? BenchmarkInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Template[i];
        }
    }

    public Template(String id10, xdh.a riskProfile, d thematicGroup, String name, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str2, BenchmarkInfo benchmarkInfo, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
        Intrinsics.checkNotNullParameter(thematicGroup, "thematicGroup");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f95706a = id10;
        this.f95707b = riskProfile;
        this.f95708c = thematicGroup;
        this.d = name;
        this.e = str;
        this.f = arrayList;
        this.f95709g = arrayList2;
        this.f95710h = arrayList3;
        this.i = arrayList4;
        this.f95711j = str2;
        this.k = benchmarkInfo;
        this.f95712l = str3;
        this.f95713m = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Template)) {
            return false;
        }
        Template template = (Template) obj2;
        return Intrinsics.f(this.f95706a, template.f95706a) && this.f95707b == template.f95707b && this.f95708c == template.f95708c && Intrinsics.f(this.d, template.d) && Intrinsics.f(this.e, template.e) && Intrinsics.f(this.f, template.f) && Intrinsics.f(this.f95709g, template.f95709g) && Intrinsics.f(this.f95710h, template.f95710h) && Intrinsics.f(this.i, template.i) && Intrinsics.f(this.f95711j, template.f95711j) && Intrinsics.f(this.k, template.k) && Intrinsics.f(this.f95712l, template.f95712l) && Intrinsics.f(this.f95713m, template.f95713m);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f95708c.hashCode() + ((this.f95707b.hashCode() + (this.f95706a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f95709g;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f95710h;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.i;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str2 = this.f95711j;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BenchmarkInfo benchmarkInfo = this.k;
        int iHashCode7 = (iHashCode6 + (benchmarkInfo == null ? 0 : benchmarkInfo.hashCode())) * 31;
        String str3 = this.f95712l;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95713m;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95706a);
        dest.writeString(this.f95707b.name());
        dest.writeString(this.f95708c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        List list2 = this.f95709g;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((SectorSubclassAllocation) itQ2.next()).writeToParcel(dest, i);
            }
        }
        List list3 = this.f95710h;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ3 = v0.a.q(dest, 1, list3);
            while (itQ3.hasNext()) {
                ((RegionSubclassAllocation) itQ3.next()).writeToParcel(dest, i);
            }
        }
        List list4 = this.i;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ4 = v0.a.q(dest, 1, list4);
            while (itQ4.hasNext()) {
                ((TopHoldingSubclassAllocation) itQ4.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.f95711j);
        BenchmarkInfo benchmarkInfo = this.k;
        if (benchmarkInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            benchmarkInfo.writeToParcel(dest, i);
        }
        dest.writeString(this.f95712l);
        dest.writeString(this.f95713m);
    }
}

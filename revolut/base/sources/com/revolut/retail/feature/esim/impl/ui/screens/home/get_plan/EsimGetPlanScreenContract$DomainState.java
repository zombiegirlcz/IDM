package com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan;

import android.os.Parcel;
import android.os.Parcelable;
import cli.j;
import com.revolut.data.model.Data;
import fij.o;
import fij.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class EsimGetPlanScreenContract$DomainState implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f100986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f100987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f100988c;
    public final CoverageOptions d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f100989g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$DomainState$CoverageOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoverageOptions implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CoverageOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f100990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f100991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f100992c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(CoverageOptions.class, parcel, arrayList, iE2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iE3 = 0;
                while (iE3 != i2) {
                    iE3 = j6.a.e(CoverageOptions.class, parcel, arrayList2, iE3, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iE != i3) {
                    iE = j6.a.e(CoverageOptions.class, parcel, arrayList3, iE, 1);
                }
                return new CoverageOptions(arrayList, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoverageOptions[i];
            }
        }

        public CoverageOptions() {
            this(7, null, null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CoverageOptions)) {
                return false;
            }
            CoverageOptions coverageOptions = (CoverageOptions) obj2;
            return Intrinsics.f(this.f100990a, coverageOptions.f100990a) && Intrinsics.f(this.f100991b, coverageOptions.f100991b) && Intrinsics.f(this.f100992c, coverageOptions.f100992c);
        }

        public final int hashCode() {
            return this.f100992c.hashCode() + p.a.d(this.f100990a.hashCode() * 31, 31, this.f100991b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f100990a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.f100991b, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
            Iterator itV3 = p.a.v(this.f100992c, dest);
            while (itV3.hasNext()) {
                dest.writeParcelable((Parcelable) itV3.next(), i);
            }
        }

        public CoverageOptions(int i, List list, List list2, List list3) {
            this((i & 1) != 0 ? f0.f322471a : list, (i & 2) != 0 ? f0.f322471a : list2, (i & 4) != 0 ? f0.f322471a : list3);
        }

        public CoverageOptions(List countryOptions, List regionalOptions, List globalOptions) {
            Intrinsics.checkNotNullParameter(countryOptions, "countryOptions");
            Intrinsics.checkNotNullParameter(regionalOptions, "regionalOptions");
            Intrinsics.checkNotNullParameter(globalOptions, "globalOptions");
            this.f100990a = countryOptions;
            this.f100991b = regionalOptions;
            this.f100992c = globalOptions;
        }
    }

    public EsimGetPlanScreenContract$DomainState() {
        this(0);
    }

    public static EsimGetPlanScreenContract$DomainState a(EsimGetPlanScreenContract$DomainState esimGetPlanScreenContract$DomainState, o oVar, Map map, Map map2, CoverageOptions coverageOptions, Data data, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            oVar = esimGetPlanScreenContract$DomainState.f100986a;
        }
        o oVar2 = oVar;
        if ((i & 2) != 0) {
            map = esimGetPlanScreenContract$DomainState.f100987b;
        }
        Map tabIdToSelectedItem = map;
        if ((i & 4) != 0) {
            map2 = esimGetPlanScreenContract$DomainState.f100988c;
        }
        Map tabIdToSelectedCoverage = map2;
        if ((i & 8) != 0) {
            coverageOptions = esimGetPlanScreenContract$DomainState.d;
        }
        CoverageOptions coverageOptions2 = coverageOptions;
        if ((i & 16) != 0) {
            data = esimGetPlanScreenContract$DomainState.e;
        }
        Data planTabs = data;
        if ((i & 32) != 0) {
            data2 = esimGetPlanScreenContract$DomainState.f;
        }
        Data userCompany = data2;
        if ((i & 64) != 0) {
            data3 = esimGetPlanScreenContract$DomainState.f100989g;
        }
        Data phoneNumberSelections = data3;
        esimGetPlanScreenContract$DomainState.getClass();
        Intrinsics.checkNotNullParameter(tabIdToSelectedItem, "tabIdToSelectedItem");
        Intrinsics.checkNotNullParameter(tabIdToSelectedCoverage, "tabIdToSelectedCoverage");
        Intrinsics.checkNotNullParameter(planTabs, "planTabs");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        return new EsimGetPlanScreenContract$DomainState(oVar2, tabIdToSelectedItem, tabIdToSelectedCoverage, coverageOptions2, planTabs, userCompany, phoneNumberSelections);
    }

    public final p c(o id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        List list = (List) this.e.getContent();
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((p) next).f135451a, id10)) {
                obj2 = next;
                break;
            }
        }
        return (p) obj2;
    }

    public final p e() {
        o oVar = this.f100986a;
        if (oVar != null) {
            return c(oVar);
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimGetPlanScreenContract$DomainState)) {
            return false;
        }
        EsimGetPlanScreenContract$DomainState esimGetPlanScreenContract$DomainState = (EsimGetPlanScreenContract$DomainState) obj2;
        return Intrinsics.f(this.f100986a, esimGetPlanScreenContract$DomainState.f100986a) && Intrinsics.f(this.f100987b, esimGetPlanScreenContract$DomainState.f100987b) && Intrinsics.f(this.f100988c, esimGetPlanScreenContract$DomainState.f100988c) && Intrinsics.f(this.d, esimGetPlanScreenContract$DomainState.d) && Intrinsics.f(this.e, esimGetPlanScreenContract$DomainState.e) && Intrinsics.f(this.f, esimGetPlanScreenContract$DomainState.f) && Intrinsics.f(this.f100989g, esimGetPlanScreenContract$DomainState.f100989g);
    }

    public final int hashCode() {
        o oVar = this.f100986a;
        int iE = p.a.e(p.a.e((oVar == null ? 0 : oVar.hashCode()) * 31, 31, this.f100987b), 31, this.f100988c);
        CoverageOptions coverageOptions = this.d;
        return this.f100989g.hashCode() + kii.e.c(this.f, kii.e.c(this.e, (iE + (coverageOptions != null ? coverageOptions.hashCode() : 0)) * 31, 31), 31);
    }

    public EsimGetPlanScreenContract$DomainState(o oVar, Map tabIdToSelectedItem, Map tabIdToSelectedCoverage, CoverageOptions coverageOptions, Data planTabs, Data userCompany, Data phoneNumberSelections) {
        Intrinsics.checkNotNullParameter(tabIdToSelectedItem, "tabIdToSelectedItem");
        Intrinsics.checkNotNullParameter(tabIdToSelectedCoverage, "tabIdToSelectedCoverage");
        Intrinsics.checkNotNullParameter(planTabs, "planTabs");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        this.f100986a = oVar;
        this.f100987b = tabIdToSelectedItem;
        this.f100988c = tabIdToSelectedCoverage;
        this.d = coverageOptions;
        this.e = planTabs;
        this.f = userCompany;
        this.f100989g = phoneNumberSelections;
    }

    public /* synthetic */ EsimGetPlanScreenContract$DomainState(int i) {
        this(null, r0.g(), r0.g(), null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}

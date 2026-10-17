package m2j;

import com.revolut.data.model.Data;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f202037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BalancesInteractor$InputData.RegisteredIdentity f202038c;

    public /* synthetic */ g0(j0 j0Var, BalancesInteractor$InputData.RegisteredIdentity registeredIdentity, int i) {
        this.f202036a = i;
        this.f202037b = j0Var;
        this.f202038c = registeredIdentity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        String str2;
        Boolean enabled = (Boolean) obj2;
        switch (this.f202036a) {
            case 0:
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (!enabled.booleanValue()) {
                    return te0.w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
                }
                BalancesInteractor$InputData.RegisteredIdentity registeredIdentity = this.f202038c;
                if (registeredIdentity instanceof BalancesInteractor$InputData.RegisteredIdentity.Custom) {
                    str = ((BalancesInteractor$InputData.RegisteredIdentity.Custom) registeredIdentity).f99400a;
                } else {
                    if (!(registeredIdentity instanceof BalancesInteractor$InputData.RegisteredIdentity.Selected)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = null;
                }
                final j0 j0Var = this.f202037b;
                final int i = 0;
                return pd.b.r(nim.a.w(rd0.e.c(j0Var.f202049b.b(w4l.j.f294644c), kotlin.coroutines.g.f186406a), new lu6.p(str, 9)), new Function1() { // from class: m2j.i0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        List teenProfiles = (List) obj3;
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(teenProfiles, "teenProfiles");
                                if (teenProfiles.isEmpty()) {
                                    return te0.w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
                                }
                                List<TeenProfile> list = teenProfiles;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                                for (final TeenProfile teenProfile : list) {
                                    final int i2 = 1;
                                    arrayList.add(nim.a.w(rd0.e.c(j0Var.f202048a.c(teenProfile.f90334a, w4l.j.f294644c), p0.f264003c), new Function1() { // from class: m2j.h0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            List vaults = (List) obj4;
                                            switch (i2) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(vaults, "vaults");
                                                    return new Pair(teenProfile, vaults);
                                                default:
                                                    Intrinsics.checkNotNullParameter(vaults, "walletsWithPockets");
                                                    ArrayList arrayList2 = new ArrayList();
                                                    for (Object obj5 : vaults) {
                                                        if (((fo3.c) ((Pair) obj5).f186385a).f136802b == fo3.e.ACTIVE) {
                                                            arrayList2.add(obj5);
                                                        }
                                                    }
                                                    Pair pair = (Pair) zhm.d0.d0(arrayList2);
                                                    List list2 = pair != null ? (List) pair.f186386b : null;
                                                    if (list2 == null) {
                                                        list2 = zhm.f0.f322471a;
                                                    }
                                                    ArrayList arrayList3 = new ArrayList();
                                                    for (Object obj6 : list2) {
                                                        if (((io3.d) obj6).e == io3.l.CURRENT) {
                                                            arrayList3.add(obj6);
                                                        }
                                                    }
                                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                                    Iterator it8 = arrayList3.iterator();
                                                    while (it8.hasNext()) {
                                                        arrayList4.add(new k0(teenProfile, (io3.d) it8.next()));
                                                    }
                                                    return arrayList4;
                                            }
                                        }
                                    }));
                                }
                                return nim.a.w(mif.a.l(arrayList), new m2g.c(26));
                            default:
                                Intrinsics.checkNotNullParameter(teenProfiles, "teenProfiles");
                                if (teenProfiles.isEmpty()) {
                                    return te0.w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
                                }
                                List<TeenProfile> list2 = teenProfiles;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                                for (final TeenProfile teenProfile2 : list2) {
                                    ppg.b bVar = j0Var.f202050c;
                                    ypg.p pVar = (ypg.p) bVar;
                                    final int i3 = 0;
                                    arrayList2.add(nim.a.w(pVar.f(w4l.h.f294642c, new pcd.f(pcd.l0.REGULAR, new pcd.k(teenProfile2.f90334a))), new Function1() { // from class: m2j.h0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            List vaults = (List) obj4;
                                            switch (i3) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(vaults, "vaults");
                                                    return new Pair(teenProfile2, vaults);
                                                default:
                                                    Intrinsics.checkNotNullParameter(vaults, "walletsWithPockets");
                                                    ArrayList arrayList22 = new ArrayList();
                                                    for (Object obj5 : vaults) {
                                                        if (((fo3.c) ((Pair) obj5).f186385a).f136802b == fo3.e.ACTIVE) {
                                                            arrayList22.add(obj5);
                                                        }
                                                    }
                                                    Pair pair = (Pair) zhm.d0.d0(arrayList22);
                                                    List list22 = pair != null ? (List) pair.f186386b : null;
                                                    if (list22 == null) {
                                                        list22 = zhm.f0.f322471a;
                                                    }
                                                    ArrayList arrayList3 = new ArrayList();
                                                    for (Object obj6 : list22) {
                                                        if (((io3.d) obj6).e == io3.l.CURRENT) {
                                                            arrayList3.add(obj6);
                                                        }
                                                    }
                                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                                    Iterator it8 = arrayList3.iterator();
                                                    while (it8.hasNext()) {
                                                        arrayList4.add(new k0(teenProfile2, (io3.d) it8.next()));
                                                    }
                                                    return arrayList4;
                                            }
                                        }
                                    }));
                                }
                                return nim.a.w(mif.a.l(arrayList2), new m2g.c(25));
                        }
                    }
                });
            default:
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (!enabled.booleanValue()) {
                    return te0.w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
                }
                BalancesInteractor$InputData.RegisteredIdentity registeredIdentity2 = this.f202038c;
                if (registeredIdentity2 instanceof BalancesInteractor$InputData.RegisteredIdentity.Custom) {
                    str2 = ((BalancesInteractor$InputData.RegisteredIdentity.Custom) registeredIdentity2).f99400a;
                } else {
                    if (!(registeredIdentity2 instanceof BalancesInteractor$InputData.RegisteredIdentity.Selected)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = null;
                }
                final j0 j0Var2 = this.f202037b;
                final int i2 = 1;
                return pd.b.r(nim.a.w(rd0.e.c(j0Var2.f202049b.b(w4l.j.f294644c), kotlin.coroutines.g.f186406a), new lu6.p(str2, 9)), new Function1() { // from class: m2j.i0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        List teenProfiles = (List) obj3;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(teenProfiles, "teenProfiles");
                                if (teenProfiles.isEmpty()) {
                                    return te0.w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
                                }
                                List<TeenProfile> list = teenProfiles;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                                for (final TeenProfile teenProfile : list) {
                                    final int i22 = 1;
                                    arrayList.add(nim.a.w(rd0.e.c(j0Var2.f202048a.c(teenProfile.f90334a, w4l.j.f294644c), p0.f264003c), new Function1() { // from class: m2j.h0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            List vaults = (List) obj4;
                                            switch (i22) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(vaults, "vaults");
                                                    return new Pair(teenProfile, vaults);
                                                default:
                                                    Intrinsics.checkNotNullParameter(vaults, "walletsWithPockets");
                                                    ArrayList arrayList22 = new ArrayList();
                                                    for (Object obj5 : vaults) {
                                                        if (((fo3.c) ((Pair) obj5).f186385a).f136802b == fo3.e.ACTIVE) {
                                                            arrayList22.add(obj5);
                                                        }
                                                    }
                                                    Pair pair = (Pair) zhm.d0.d0(arrayList22);
                                                    List list22 = pair != null ? (List) pair.f186386b : null;
                                                    if (list22 == null) {
                                                        list22 = zhm.f0.f322471a;
                                                    }
                                                    ArrayList arrayList3 = new ArrayList();
                                                    for (Object obj6 : list22) {
                                                        if (((io3.d) obj6).e == io3.l.CURRENT) {
                                                            arrayList3.add(obj6);
                                                        }
                                                    }
                                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                                    Iterator it8 = arrayList3.iterator();
                                                    while (it8.hasNext()) {
                                                        arrayList4.add(new k0(teenProfile, (io3.d) it8.next()));
                                                    }
                                                    return arrayList4;
                                            }
                                        }
                                    }));
                                }
                                return nim.a.w(mif.a.l(arrayList), new m2g.c(26));
                            default:
                                Intrinsics.checkNotNullParameter(teenProfiles, "teenProfiles");
                                if (teenProfiles.isEmpty()) {
                                    return te0.w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
                                }
                                List<TeenProfile> list2 = teenProfiles;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                                for (final TeenProfile teenProfile2 : list2) {
                                    ppg.b bVar = j0Var2.f202050c;
                                    ypg.p pVar = (ypg.p) bVar;
                                    final int i3 = 0;
                                    arrayList2.add(nim.a.w(pVar.f(w4l.h.f294642c, new pcd.f(pcd.l0.REGULAR, new pcd.k(teenProfile2.f90334a))), new Function1() { // from class: m2j.h0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            List vaults = (List) obj4;
                                            switch (i3) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(vaults, "vaults");
                                                    return new Pair(teenProfile2, vaults);
                                                default:
                                                    Intrinsics.checkNotNullParameter(vaults, "walletsWithPockets");
                                                    ArrayList arrayList22 = new ArrayList();
                                                    for (Object obj5 : vaults) {
                                                        if (((fo3.c) ((Pair) obj5).f186385a).f136802b == fo3.e.ACTIVE) {
                                                            arrayList22.add(obj5);
                                                        }
                                                    }
                                                    Pair pair = (Pair) zhm.d0.d0(arrayList22);
                                                    List list22 = pair != null ? (List) pair.f186386b : null;
                                                    if (list22 == null) {
                                                        list22 = zhm.f0.f322471a;
                                                    }
                                                    ArrayList arrayList3 = new ArrayList();
                                                    for (Object obj6 : list22) {
                                                        if (((io3.d) obj6).e == io3.l.CURRENT) {
                                                            arrayList3.add(obj6);
                                                        }
                                                    }
                                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                                    Iterator it8 = arrayList3.iterator();
                                                    while (it8.hasNext()) {
                                                        arrayList4.add(new k0(teenProfile2, (io3.d) it8.next()));
                                                    }
                                                    return arrayList4;
                                            }
                                        }
                                    }));
                                }
                                return nim.a.w(mif.a.l(arrayList2), new m2g.c(25));
                        }
                    }
                });
        }
    }
}

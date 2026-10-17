package kxg;

import android.os.Parcelable;
import aw0.bb;
import aw0.cb;
import aw0.l1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.salary_switch.impl.R$string;
import dda.f;
import foh.i;
import hw0.x;
import hw0.z;
import ip0.hm0;
import ip0.jm0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ms0.v;
import rrc.i0;
import vim.g;
import zhm.d0;
import zhm.f0;
import zhm.m0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f190573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f190574c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f190575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f190576h;

    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.f190572a = i;
        this.f190573b = obj2;
        this.f190574c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.f190575g = obj7;
        this.f190576h = obj8;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean z;
        Function1 function1;
        List list;
        Iterable iterable;
        x xVar;
        boolean z3;
        switch (this.f190572a) {
            case 0:
                e eVar = (e) this.f190573b;
                b bVar = eVar.f190579c;
                String str = (String) this.f190574c;
                l1.c cVar = (l1.c) this.d;
                Function1 function12 = (Function1) this.e;
                Function1 function13 = (Function1) this.f;
                Function1 function14 = (Function1) this.f190575g;
                Function1 function15 = (Function1) this.f190576h;
                List points = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(points, "points");
                if (points.isEmpty()) {
                    return bVar.b(str);
                }
                dj0.d min = (dj0.d) function12.invoke(points);
                dj0.d max = (dj0.d) function13.invoke(points);
                List<Pair> listM1 = d0.m1(points);
                if ((listM1 instanceof Collection) && listM1.isEmpty()) {
                    z = true;
                } else {
                    for (Pair pair : listM1) {
                        if (!Intrinsics.f(function14.invoke(pair.f186385a), function14.invoke(pair.f186386b))) {
                            z = false;
                        }
                    }
                    z = true;
                }
                int i = R$attr.uikit_dp0;
                Pair pair2 = new Pair(Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(1.0f));
                mxg.b bVar2 = (mxg.b) eVar.f190577a;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(min, "min");
                Intrinsics.checkNotNullParameter(max, "max");
                v vVar = bVar2.f210258b;
                ((lxg.b) bVar2.f210257a).getClass();
                Intrinsics.checkNotNullParameter(min, "min");
                Intrinsics.checkNotNullParameter(max, "max");
                if (Intrinsics.f(min, max)) {
                    iterable = f0.f322471a;
                    function1 = function15;
                    list = points;
                } else {
                    dj0.d dVarK = pyd.c.k(pyd.c.H(max, min), 3L);
                    function1 = function15;
                    list = points;
                    kotlin.ranges.e eVar2 = new kotlin.ranges.e(0L, 3L);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Long> it8 = eVar2.iterator();
                    while (((g) it8).f289628c) {
                        dj0.d dVarO = pyd.c.O(min, pyd.c.U(dVarK, ((m0) it8).nextLong()));
                        if (dVarO != null) {
                            arrayList.add(dVarO);
                        }
                    }
                    int size = arrayList.size();
                    int i2 = 1;
                    while (true) {
                        if (i2 < size) {
                            dj0.d dVar = (dj0.d) arrayList.get(i2);
                            dj0.d dVar2 = (dj0.d) arrayList.get(i2 - 1);
                            dj0.d dVarA = lxg.b.a(dVar2);
                            int i3 = size;
                            if (!dVarA.equals(lxg.b.a(dVar)) || pyd.c.H(dVar, dVar2).compareTo(dVarA) >= 0) {
                                i2++;
                                size = i3;
                            } else {
                                iterable = f0.f322471a;
                            }
                        } else {
                            iterable = arrayList;
                        }
                    }
                }
                Iterable<dj0.d> iterable2 = iterable;
                ArrayList arrayList2 = new ArrayList(w.t(iterable2, 10));
                for (dj0.d dVar3 : iterable2) {
                    arrayList2.add(new hw0.a(i.r(dVar3, min, max), new MoneyClause(dVar3, new MoneyClause.Format.Shorts(false, 63), null, null, 12)));
                }
                z zVar = new z(vVar, false, true, (List) arrayList2);
                hm0 hm0Var = hm0.Thick;
                cb.Companion.getClass();
                cb cbVarC = bb.c();
                ArrayList arrayListA = ((nxg.b) eVar.f190578b).a();
                Object objD0 = d0.d0(list);
                if (objD0 != null) {
                    float fR = i.r((dj0.d) function14.invoke(objD0), min, max);
                    xVar = new x(z ? BitmapDescriptorFactory.HUE_RED : fR, BitmapDescriptorFactory.HUE_RED, new MoneyClause((dj0.d) function14.invoke(objD0), new MoneyClause.Format.Shorts(false, 63), null, null, 12), null, fR > 0.5f ? hw0.c.BELOW_LINE : hw0.c.ABOVE_LINE, hw0.b.START, false, false, null, 1994);
                } else {
                    xVar = null;
                }
                List list2 = list;
                jm0 jm0Var = new jm0(str, cbVarC, e.a(list2, z, min, max, function14), false, xVar, null, 0, false, bVar.a(), pair2, false, false, zVar, function1 != null ? u.c(new hw0.d((List) e.a(list2, z, min, max, function1), false, R$attr.uikit_colorDeepGrey, 12)) : null, cVar, hm0Var, arrayListA, null, null, null, 0, 0, 0, 0, -652248);
                int i5 = R$attr.uikit_dp0;
                yp0.b.p(jm0Var, i5, i5, i, i);
                return u.c(jm0Var);
            default:
                i0 i0Var = (i0) this.f190573b;
                Clause clause = (Clause) this.f190574c;
                Clause clause2 = (Clause) this.d;
                Clause clause3 = (Clause) this.e;
                Clause clause4 = (Clause) this.f;
                ResourceImage resourceImage = (ResourceImage) this.f190575g;
                List list3 = (List) this.f190576h;
                List content = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                f fVar = (f) d0.d0(content);
                wpc.f fVar2 = i0Var.f256779b;
                if (fVar2 instanceof wpc.d) {
                    z3 = true;
                } else {
                    if (!(fVar2 instanceof wpc.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z3 = false;
                }
                aim.e eVarB = u.b();
                List list4 = list3;
                if (!list4.isEmpty()) {
                    eVarB.addAll(list4);
                }
                if (fVar != null) {
                    aim.e eVarB2 = u.b();
                    if (!(fVar instanceof dda.d)) {
                        throw new IllegalArgumentException("Incorrect details content type");
                    }
                    if (z3) {
                        eVarB2.add(new ListSubheaderDelegate.Model("ID_ACCOUNT_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.salary_switch_share_details_subheader_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, 53242));
                    }
                    eVarB2.addAll(i0Var.f256778a.e((dda.d) fVar, false, false, false));
                    eVarB.addAll(u.a(eVarB2));
                }
                return new rrc.w(u.a(eVarB), true, clause, clause2, clause3, clause4, resourceImage);
        }
    }
}

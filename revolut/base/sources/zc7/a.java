package zc7;

import aii.u;
import amd.j;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.IconsTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$TotalWealthSelectType$Destination;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ BaseDraggableWidgetDelegate.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, BaseDraggableWidgetDelegate.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        Pair pair;
        int i;
        int i2;
        u destination;
        dj0.d dVarO;
        dj0.d dVarO2;
        int i3;
        List list;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) this.v).f55375c;
        Object obj3 = model instanceof IconsTileWidgetDelegate.Model ? ((IconsTileWidgetDelegate.Model) model).f55176j : model instanceof RowsWidgetDelegate.Model ? ((RowsWidgetDelegate.Model) model).f55231n : null;
        List list2 = obj3 instanceof List ? (List) obj3 : null;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        boolean z = model instanceof IconsTileWidgetDelegate.Model;
        List list3 = list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list3) {
            if (((j) obj4).f6332a != amd.b.LINKED_COMBINED) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (((j) obj5).f6332a.b() == yld.g.ASSET) {
                arrayList2.add(obj5);
            } else {
                arrayList3.add(obj5);
            }
        }
        Iterator it8 = list3.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((j) next).f6332a == amd.b.LINKED_COMBINED) {
                break;
            }
        }
        j jVar = (j) next;
        if (jVar == null || (list = jVar.f6333b) == null) {
            f0 f0Var = f0.f322471a;
            pair = new Pair(f0Var, f0Var);
        } else {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj6 : list) {
                if (((amd.d) obj6).f6312a == amd.e.LINKED_ACCOUNT) {
                    arrayList4.add(obj6);
                } else {
                    arrayList5.add(obj6);
                }
            }
            pair = new Pair(arrayList4, arrayList5);
        }
        List list4 = (List) pair.f186385a;
        List list5 = (List) pair.f186386b;
        int i5 = 0;
        if (arrayList3.isEmpty()) {
            i = 0;
        } else {
            Iterator it9 = arrayList3.iterator();
            i = 0;
            while (it9.hasNext()) {
                if (mra.d.w((j) it9.next()) && (i = i + 1) < 0) {
                    v.r();
                    throw null;
                }
            }
        }
        List list6 = list5;
        if ((list6 instanceof Collection) && list6.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it10 = list6.iterator();
            i2 = 0;
            while (it10.hasNext()) {
                if (mra.d.v((amd.d) it10.next()) && (i2 = i2 + 1) < 0) {
                    v.r();
                    throw null;
                }
            }
        }
        int i6 = i + i2;
        if (i6 > 0) {
            dj0.d.Companion.getClass();
            dj0.d dVarO0 = dj0.d.e;
            int i21 = 0;
            for (Object obj7 : arrayList2) {
                int i22 = i21 + 1;
                if (i21 < 0) {
                    v.s();
                    throw null;
                }
                dVarO0 = i21 == 0 ? mra.d.o0((j) obj7) : pyd.c.O(dVarO0, mra.d.o0((j) obj7));
                i21 = i22;
            }
            List list7 = (List) ue0.e.M(list4);
            if (list7 != null) {
                dj0.d.Companion.getClass();
                dVarO = dj0.d.e;
                int i32 = 0;
                for (Object obj8 : list7) {
                    int i33 = i32 + 1;
                    if (i32 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i32 == 0 ? ((amd.d) obj8).d : pyd.c.O(dVarO, ((amd.d) obj8).d);
                    i32 = i33;
                }
            } else {
                dVarO = null;
            }
            dj0.d dVarO3 = pyd.c.O(dVarO0, dVarO);
            dj0.d.Companion.getClass();
            dj0.d dVarO02 = dj0.d.e;
            int i43 = 0;
            for (Object obj9 : arrayList3) {
                int i59 = i43 + 1;
                if (i43 < 0) {
                    v.s();
                    throw null;
                }
                dVarO02 = i43 == 0 ? mra.d.o0((j) obj9) : pyd.c.O(dVarO02, mra.d.o0((j) obj9));
                i43 = i59;
            }
            List list8 = (List) ue0.e.M(list5);
            if (list8 != null) {
                dj0.d.Companion.getClass();
                dVarO2 = dj0.d.e;
                int i66 = 0;
                for (Object obj10 : list8) {
                    int i74 = i66 + 1;
                    if (i66 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO2 = i66 == 0 ? ((amd.d) obj10).d : pyd.c.O(dVarO2, ((amd.d) obj10).d);
                    i66 = i74;
                }
            } else {
                dVarO2 = null;
            }
            dj0.d dVarO4 = pyd.c.O(dVarO02, dVarO2);
            if (arrayList2.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it11 = arrayList2.iterator();
                i3 = 0;
                while (it11.hasNext()) {
                    if (mra.d.w((j) it11.next()) && (i3 = i3 + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
            List list9 = list4;
            if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                Iterator it12 = list9.iterator();
                while (it12.hasNext()) {
                    if (mra.d.v((amd.d) it12.next()) && (i5 = i5 + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
            destination = new AnalyticsFeatureConfig$TotalWealthSelectType$Destination(dVarO3, i3 + i5, dVarO4, i6, z ? com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE) : null);
        } else {
            destination = new AnalyticsFeatureConfig.TotalWealthScreen.Destination(yld.g.ASSET, NetWorthAccount.Personal.f87455a, null, null, z ? com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE) : null, 8);
        }
        this.u.f321242c.b(new fc7.d(destination));
        return Unit.f186387a;
    }
}

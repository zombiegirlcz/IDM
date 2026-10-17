package u9l;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import hbl.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.k;
import tof.a3;
import toh.h;
import u9l.b;
import whf.i;
import whf.j;
import whf.l;
import whf.m;
import whf.n;
import whf.p;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f278508a;

    public c(n defaultMapper) {
        Intrinsics.checkNotNullParameter(defaultMapper, "defaultMapper");
        this.f278508a = defaultMapper;
    }

    public static v9l.a a(RowDelegate.Model model, List list) {
        Object obj2 = model.u;
        Object obj3 = null;
        a3 a3Var = obj2 instanceof a3 ? (a3) obj2 : null;
        if (a3Var == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            v9l.a aVar = (v9l.a) next;
            Intrinsics.i(aVar, "null cannot be cast to non-null type com.revolut.shared.feature.retail.transaction.impl.models.RetailSharedTransaction");
            if (aVar.f287078a.equals(a3Var)) {
                obj3 = next;
                break;
            }
        }
        return (v9l.a) obj3;
    }

    public static RowDelegate.Model c(RowDelegate.Model model, List list, Function1 function1) {
        v9l.a aVarA = a(model, list);
        if (aVarA == null) {
            return model;
        }
        Object objInvoke = function1.invoke(aVarA);
        return RowDelegate.Model.x(model, null, null, null, null, null, 0, null, objInvoke != null, null, objInvoke, 0, 0, 0, 0, null, -4196353, 15);
    }

    public final List b(List transactions, hbl.c style, Function1 parcelProvider) {
        m kVar;
        q qVar;
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(parcelProvider, "parcelProvider");
        List<v9l.a> list = transactions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (v9l.a aVar : list) {
            if (aVar == null) {
                throw new IllegalArgumentException(("Unsupported SharedTransaction " + aVar).toString());
            }
            arrayList.add(aVar);
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((v9l.a) it8.next()).f287078a);
        }
        v9l.a aVar2 = (v9l.a) d0.d0(arrayList);
        p pVar = (aVar2 == null || (qVar = aVar2.f287079b) == null) ? null : new p(arrayList2, qVar, b.a.f278507a);
        if (pVar == null) {
            return f0.f322471a;
        }
        if (style instanceof hbl.b) {
            kVar = new l(new k(1022, false, false, false, false, false));
        } else {
            if (!(style instanceof hbl.a)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = new whf.k(0);
        }
        ArrayList<Object> arrayListC = ((anf.w) this.f278508a).c(pVar, kVar, style.a() ? new i(false) : j.a.f297643a);
        ArrayList arrayList3 = new ArrayList(w.t(arrayListC, 10));
        for (Object objA : arrayListC) {
            h hVar = new h(this, transactions, style, parcelProvider);
            if (objA instanceof wh) {
                wh swipeToActionDelegateModel = (wh) objA;
                Intrinsics.checkNotNullParameter(swipeToActionDelegateModel, "swipeToActionDelegateModel");
                objA = wh.a(swipeToActionDelegateModel, c((RowDelegate.Model) swipeToActionDelegateModel.f54925b, transactions, parcelProvider), null, null, 16381);
            } else if (objA instanceof SelectableDelegate.Model) {
                objA = (qv0.i) hVar.invoke((SelectableDelegate.Model) objA);
            }
            arrayList3.add(objA);
        }
        if (style.a()) {
            return arrayList3;
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        return arrayList3;
    }
}

package a0e;

import b9.w2;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.documents_hub.custom_filter.CustomFilterCalculationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l0;
import vkm.j2;
import vkm.t0;
import vkm.z1;
import wxd.z;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends yji.n implements d {
    public static final Set A;

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DocumentsHubScreenContract$InputData f353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w2 f354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e0e.i f355n;
    public final ehe.o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ehe.o f356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l2j.a f357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wzd.c f358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l0 f359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f360t;
    public final j2 u;
    public r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f363y;
    public boolean z;

    static {
        z[] elements = {z.FORMAT, z.LANGUAGE, z.HIDE_BALANCES};
        Intrinsics.checkNotNullParameter(elements, "elements");
        A = kotlin.collections.d.y0(elements);
    }

    public q(DocumentsHubScreenContract$InputData inputData, w2 customFilterInteractor, e0e.i periodSelectorBottomSheetProvider, ehe.o customContentPickerInteractorProvider, ehe.o languagePickerInteractorProvider, l2j.a currencyChooserFlowFactory, wzd.c customStatementDialogProvider, l0 popupMenuDialogDisplayer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(customFilterInteractor, "customFilterInteractor");
        Intrinsics.checkNotNullParameter(periodSelectorBottomSheetProvider, "periodSelectorBottomSheetProvider");
        Intrinsics.checkNotNullParameter(customContentPickerInteractorProvider, "customContentPickerInteractorProvider");
        Intrinsics.checkNotNullParameter(languagePickerInteractorProvider, "languagePickerInteractorProvider");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(customStatementDialogProvider, "customStatementDialogProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        this.f353l = inputData;
        this.f354m = customFilterInteractor;
        this.f355n = periodSelectorBottomSheetProvider;
        this.o = customContentPickerInteractorProvider;
        this.f356p = languagePickerInteractorProvider;
        this.f357q = currencyChooserFlowFactory;
        this.f358r = customStatementDialogProvider;
        this.f359s = popupMenuDialogDisplayer;
        this.f360t = vkm.q.c(null);
        j2 j2VarC = vkm.q.c(null);
        this.u = j2VarC;
        this.f361w = j2VarC;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f362x = z1VarB;
    }

    public static boolean b3(r rVar) {
        Set set;
        Iterable iterable = (List) rVar.e.getContent();
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable2, 10));
        Iterator it8 = iterable2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((lyd.q) it8.next()).f200796a);
        }
        Set setI1 = d0.i1(arrayList);
        return (setI1.isEmpty() || (set = rVar.f368h) == null || !set.containsAll(setI1)) ? false : true;
    }

    public static String c3(r rVar, z zVar) {
        Map map;
        List list;
        yxd.c cVar = rVar.f370l;
        if (cVar == null || (map = cVar.f317664c) == null || (list = (List) map.get(zVar)) == null) {
            return null;
        }
        return (String) d0.d0(list);
    }

    @Override // yji.n
    public final void D2() {
        Continuation continuation = null;
        int i = 0;
        yji.n.j2(this, vkm.q.Q(new t38.e(this.f360t, 24, this.f362x, new n(3, 0, continuation)), new m(continuation, this, i)), null, new p(this, continuation, i), 3);
        w2 w2Var = this.f354m;
        yji.n.j2(this, new t0((j2) ((zjh.i) w2Var.e).f322838b, 1), null, new p(this, continuation, 1), 3);
        yji.n.j2(this, new t0(((h0e.b) w2Var.f).f148375a, 1), null, new p(this, continuation, 2), 3);
        yji.n.j2(this, rd0.e.b(this.f359s.f256113c), null, new p(this, continuation, 3), 3);
    }

    public final void Z2(yxd.c cVar) {
        yxd.c cVar2;
        r rVarA;
        while (true) {
            j2 j2Var = this.u;
            Object value = j2Var.getValue();
            r rVar = (r) value;
            if (rVar != null) {
                cVar2 = cVar;
                rVarA = r.a(rVar, null, null, null, null, null, null, null, cVar2, 2047);
            } else {
                cVar2 = cVar;
                rVarA = null;
            }
            if (j2Var.h(value, rVarA)) {
                return;
            } else {
                cVar = cVar2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d3(a0e.r r26) throws com.revolut.feature.statements.impl.ui.documents_hub.custom_filter.CustomFilterCalculationException {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0e.q.d3(a0e.r):void");
    }

    public final void e3(z setting, List selectedItemIds) {
        Set setI1;
        Object value;
        r rVar;
        j2 j2Var = this.u;
        r state = (r) j2Var.getValue();
        if (state == null) {
            return;
        }
        z zVar = state.f366c;
        w2 w2Var = this.f354m;
        if (setting != zVar) {
            w2Var.getClass();
            Intrinsics.checkNotNullParameter(setting, "setting");
            Intrinsics.checkNotNullParameter(selectedItemIds, "selectedOptionIds");
            Z2(((h0e.b) w2Var.f).b(setting, selectedItemIds));
            return;
        }
        w2Var.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectedItemIds, "selectedItemIds");
        List list = (List) state.e.getContent();
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((lyd.q) it8.next()).f200796a);
            }
            setI1 = d0.i1(arrayList);
        } else {
            setI1 = null;
        }
        if (setI1 == null) {
            setI1 = h0.f322473a;
        }
        Set setA = c.a(d0.i1(selectedItemIds), setI1);
        if (Intrinsics.f(setA, state.f368h)) {
            return;
        }
        r rVarA = r.a(state, null, null, null, setA, null, null, null, null, 3967);
        j2Var.getClass();
        j2Var.g(null, rVarA);
        List selectedOptionIds = d0.d1(setA);
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(selectedOptionIds, "selectedOptionIds");
        Z2(((h0e.b) w2Var.f).b(setting, selectedOptionIds));
        try {
            d3(rVarA);
        } catch (CustomFilterCalculationException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            do {
                value = j2Var.getValue();
                rVar = (r) value;
            } while (!j2Var.h(value, rVar != null ? r.a(rVar, null, null, new Data(null, e, false, 5, null), null, null, null, null, null, 4031) : null));
        } catch (CancellationException e2) {
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x025a A[LOOP:9: B:102:0x0254->B:104:0x025a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f3(a0e.r r27) {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0e.q.f3(a0e.r):void");
    }
}

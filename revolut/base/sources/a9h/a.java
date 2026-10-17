package a9h;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import dfj.v;
import f19.h;
import gim.i;
import go.g;
import hm8.d;
import hw3.f0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mrl.f;
import nel.z;
import nii.l1;
import nii.n1;
import o9c.n0;
import om4.l3;
import om4.x2;
import pdi.j;
import pe0.q;
import prl.r;
import r19.e;
import skm.e0;
import tdc.l;
import tof.i3;
import tof.j3;
import u6c.p;
import w4l.k;
import yhm.o;
import z9h.n;
import zh9.u0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2653y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f2651w = obj2;
        this.f2653y = obj3;
        this.f2652x = str;
    }

    private final Object b(Object obj2) {
        of8.b bVar = (of8.b) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        int i = om8.b.f226773a[bVar.k.f235517a.ordinal()];
        if (i == 1) {
            return new g(new Data(d.f153540a, null, false, 6, null), 2);
        }
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new g(new Data(hm8.c.f153539a, null, false, 6, null), 2);
            }
            throw new NoWhenBranchMatchedException();
        }
        om8.c cVar = (om8.c) this.f2651w;
        String juniorId = (String) this.f2652x;
        k loadingStrategy = (k) this.f2653y;
        jm8.b bVar2 = cVar.f226775b;
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(bVar2.e.b(juniorId, loadingStrategy), new l3(16));
    }

    private final Object c(Object obj2) {
        String enabledFeatures = (String) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = ((p19.a) this.f2651w).f231883b;
        h placementReference = (h) this.f2652x;
        k loadingStrategy = (k) this.f2653y;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(placementReference, "placementReference");
        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(eVar.e.e(new r19.d(placementReference, enabledFeatures), loadingStrategy));
    }

    private final Object n(Object obj2) {
        CategoryImage categoryImage;
        CategoryColor categoryColor;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i3 i3Var = (i3) this.v;
        Continuation continuation = null;
        j3 j3Var = i3Var instanceof j3 ? (j3) i3Var : null;
        q qVar = (q) ((k7i.i) this.f2651w).f182070c;
        pe0.d dVar = pe0.d.ALL;
        String id10 = i3Var.getId();
        List listC = u.c((String) this.f2652x);
        String str = (String) this.f2653y;
        pe0.e entry = new pe0.e(dVar, id10, listC, str == null ? null : str, j3Var != null ? j3Var.f272845c : null, (j3Var == null || (categoryImage = j3Var.d) == null) ? null : categoryImage.name(), (j3Var == null || (categoryColor = j3Var.e) == null) ? null : categoryColor.name());
        Intrinsics.checkNotNullParameter(entry, "entry");
        e0.C(qVar.f235312c, null, null, new j(qVar, entry, continuation, 1), 3);
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        CategoryImage categoryImage;
        CategoryColor categoryColor;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i3 i3Var = (i3) this.v;
        Continuation continuation = null;
        j3 j3Var = i3Var instanceof j3 ? (j3) i3Var : null;
        q qVar = (q) ((k7i.i) this.f2651w).f182070c;
        pe0.d dVar = pe0.d.CURRENT;
        String id10 = i3Var.getId();
        String str = (String) this.f2652x;
        pe0.e entry = new pe0.e(dVar, id10, (List) this.f2653y, str == null ? null : str, j3Var != null ? j3Var.f272845c : null, (j3Var == null || (categoryImage = j3Var.d) == null) ? null : categoryImage.name(), (j3Var == null || (categoryColor = j3Var.e) == null) ? null : categoryColor.name());
        Intrinsics.checkNotNullParameter(entry, "entry");
        e0.C(qVar.f235312c, null, null, new j(qVar, entry, continuation, 1), 3);
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    private final Object p(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        r rVar = (r) this.v;
        n.l(String.class, rVar.f239350c, r.a(rVar, (bfl.g) this.f2651w, (z) this.f2652x), u1.g((dfl.r) this.f2653y, f.f208159b));
        return Unit.f186387a;
    }

    private final Object s(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return i1c.b.b(((com.revolut.feature.rev_points.impl.ui.transactions.list.d) this.v).u, (ArrayList) this.f2651w, (k71.q) this.f2653y, (String) this.f2652x);
    }

    private final Object t(Object obj2) {
        ApmNewContactNavigation$Tab apmNewContactNavigation$Tab;
        com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) this.f2653y;
        n1 n1Var = (n1) this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if ((((ApmNewContactNavigation$Tab) this.f2651w) instanceof ApmNewContactNavigation$Tab.TAX) && (apmNewContactNavigation$Tab = (ApmNewContactNavigation$Tab) this.f2652x) != null && (n1Var instanceof l1)) {
            aVar.H2(aVar.u, new q22.k(apmNewContactNavigation$Tab, 1));
        } else {
            aVar.C2(c12.i.f20334a);
        }
        return Unit.f186387a;
    }

    private final Object u(Object obj2) {
        List list = (List) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (list.isEmpty()) {
            od0.i.Companion.getClass();
            return new g(new Data(od0.i.f224256b, null, false, 6, null), 2);
        }
        List<String> list2 = list;
        qmc.h hVar = (qmc.h) this.f2651w;
        k kVar = (k) this.f2653y;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (String str : list2) {
            zjh.f fVar = hVar.f247801a;
            Intrinsics.h(str);
            arrayList.add(rd0.e.b(fVar.B(str, kVar)));
        }
        return nim.a.v(u0.k(arrayList), new qc0.w((String) this.f2652x, 15));
    }

    private final Object v(Object obj2) {
        tdc.d dVar = (tdc.d) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        tdc.r rVar = (tdc.r) this.f2651w;
        dj0.d dVar2 = (dj0.d) this.f2652x;
        tdc.h hVar = (tdc.h) this.f2653y;
        if (dVar instanceof tdc.c) {
            tdc.c cVar = (tdc.c) dVar;
            return rVar.f269963l.c(new p(cVar.f269949a, hVar.f269953c, (u6c.u) rVar.f269968r.getValue(), rVar.o.l(), Long.valueOf(dVar2.f115082a), dVar2.f115083b, false, hVar.f269951a), cVar.f269950b, w4l.h.f294642c);
        }
        rVar.getClass();
        if (!(dVar instanceof tdc.a)) {
            throw new NoWhenBranchMatchedException();
        }
        od0.i.Companion.getClass();
        return zi0.c.i(od0.i.f224256b);
    }

    private final Object w(Object obj2) {
        Object cVar;
        Pair pair = (Pair) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) pair.f186385a;
        tdc.h hVar = (tdc.h) pair.f186386b;
        tdc.r rVar = (tdc.r) this.f2651w;
        rVar.getClass();
        if (lVar instanceof tdc.i) {
            cVar = tdc.a.f269948a;
        } else {
            if (!(lVar instanceof tdc.k)) {
                throw new NoWhenBranchMatchedException();
            }
            tdc.k kVar = (tdc.k) lVar;
            cVar = new tdc.c(kVar.f269956b, kVar.f269957c);
        }
        rVar.f269967q.k(tdc.n.f269961a);
        return vkm.q.Q(rVar.f269967q, new v(5, (dj0.d) this.f2653y, rVar, cVar, (dj0.d) this.f2652x, hVar, null));
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a((r10.r) this.f2651w, (String) this.f2652x, (k) this.f2653y, continuation, 0);
                aVar.v = obj2;
                return aVar;
            case 1:
                a aVar2 = new a(continuation, (aob.i) this.f2651w, (ejb.b) this.f2652x, (aob.g) this.f2653y, 1);
                aVar2.v = obj2;
                return aVar2;
            case 2:
                a aVar3 = new a((c2d.h) this.f2651w, (xi0.b) this.f2652x, (Comparator) this.f2653y, continuation, 2);
                aVar3.v = obj2;
                return aVar3;
            case 3:
                a aVar4 = new a((c2d.h) this.f2651w, (Function1) this.f2652x, (Comparator) this.f2653y, continuation, 3);
                aVar4.v = obj2;
                return aVar4;
            case 4:
                a aVar5 = new a((com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f2651w, (ProductAccountDescriptor$Value) this.f2652x, (cm2.i) this.f2653y, continuation, 4);
                aVar5.v = obj2;
                return aVar5;
            case 5:
                return new a((e0a.w) this.v, (ChatItem) this.f2651w, (String) this.f2652x, (zm3.l) this.f2653y, continuation, 5);
            case 6:
                a aVar6 = new a((ejk.e) this.f2651w, (hha.d) this.f2652x, (hha.i) this.f2653y, continuation, 6);
                aVar6.v = obj2;
                return aVar6;
            case 7:
                a aVar7 = new a((r10.d) this.f2651w, (String) this.f2652x, (k) this.f2653y, continuation, 7);
                aVar7.v = obj2;
                return aVar7;
            case 8:
                a aVar8 = new a((fo1.e0) this.f2651w, (io3.d) this.f2652x, (AccountId) this.f2653y, continuation, 8);
                aVar8.v = obj2;
                return aVar8;
            case 9:
                a aVar9 = new a(9, (gm7.d) this.f2651w, (Function1) this.f2653y, (String) this.f2652x, continuation);
                aVar9.v = obj2;
                return aVar9;
            case 10:
                return new a((String) this.f2652x, (String) this.v, (String) this.f2651w, (f0) this.f2653y, continuation);
            case 11:
                a aVar10 = new a((nel.n) this.f2651w, (hxk.b) this.f2652x, (gxk.f) this.f2653y, continuation, 11);
                aVar10.v = obj2;
                return aVar10;
            case 12:
                return new a((List) this.v, (hy2.f) this.f2651w, (hha.d) this.f2652x, (b93.b) this.f2653y, continuation, 12);
            case 13:
                a aVar11 = new a(13, (i0e.q) this.f2651w, (Set) this.f2653y, (String) this.f2652x, continuation);
                aVar11.v = obj2;
                return aVar11;
            case 14:
                a aVar12 = new a((jab.a) this.f2651w, (String) this.f2652x, (k) this.f2653y, continuation, 14);
                aVar12.v = obj2;
                return aVar12;
            case 15:
                a aVar13 = new a((Function0) this.f2651w, (kja.d) this.f2652x, (k8e.a) this.f2653y, continuation, 15);
                aVar13.v = obj2;
                return aVar13;
            case 16:
                a aVar14 = new a((ldi.f) this.f2651w, (String) this.f2652x, (RevPointsTransactionPageParams) this.f2653y, continuation, 16);
                aVar14.v = obj2;
                return aVar14;
            case 17:
                a aVar15 = new a(17, (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.f2651w, (n0) this.f2653y, (String) this.f2652x, continuation);
                aVar15.v = obj2;
                return aVar15;
            case 18:
                a aVar16 = new a((yw4.p) this.f2651w, (x2) this.f2652x, (k) this.f2653y, continuation, 18);
                aVar16.v = obj2;
                return aVar16;
            case 19:
                a aVar17 = new a((om8.c) this.f2651w, (String) this.f2652x, (k) this.f2653y, continuation, 19);
                aVar17.v = obj2;
                return aVar17;
            case 20:
                a aVar18 = new a((p19.a) this.f2651w, (h) this.f2652x, (k) this.f2653y, continuation, 20);
                aVar18.v = obj2;
                return aVar18;
            case 21:
                return new a((i3) this.v, (k7i.i) this.f2651w, (String) this.f2652x, (String) this.f2653y, continuation, 21);
            case 22:
                return new a((i3) this.v, (k7i.i) this.f2651w, (String) this.f2652x, (List) this.f2653y, continuation, 22);
            case 23:
                return new a((r) this.v, (bfl.g) this.f2651w, (z) this.f2652x, (dfl.r) this.f2653y, continuation, 23);
            case 24:
                return new a((com.revolut.feature.rev_points.impl.ui.transactions.list.d) this.v, (ArrayList) this.f2651w, (k71.q) this.f2653y, (String) this.f2652x, continuation);
            case 25:
                a aVar19 = new a((ApmNewContactNavigation$Tab) this.f2651w, (ApmNewContactNavigation$Tab) this.f2652x, (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) this.f2653y, continuation, 25);
                aVar19.v = obj2;
                return aVar19;
            case 26:
                a aVar20 = new a(26, (qmc.h) this.f2651w, (k) this.f2653y, (String) this.f2652x, continuation);
                aVar20.v = obj2;
                return aVar20;
            case 27:
                a aVar21 = new a((tdc.r) this.f2651w, (dj0.d) this.f2652x, (tdc.h) this.f2653y, continuation, 27);
                aVar21.v = obj2;
                return aVar21;
            case 28:
                a aVar22 = new a((tdc.r) this.f2651w, (dj0.d) this.f2652x, (dj0.d) this.f2653y, continuation, 28);
                aVar22.v = obj2;
                return aVar22;
            default:
                a aVar23 = new a(continuation, (tnb.g) this.f2651w, (djb.k) this.f2652x, (ejb.b) this.f2653y, 29);
                aVar23.v = obj2;
                return aVar23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((a) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05fb  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v13, types: [com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.graphics.pdf.PdfDocument] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.io.FileOutputStream, java.io.OutputStream] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9h.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.revolut.feature.rev_points.impl.ui.transactions.list.d dVar, ArrayList arrayList, k71.q qVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 24;
        this.v = dVar;
        this.f2651w = arrayList;
        this.f2653y = qVar;
        this.f2652x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Serializable serializable, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f2651w = obj3;
        this.f2652x = serializable;
        this.f2653y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2651w = obj2;
        this.f2652x = obj3;
        this.f2653y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f2652x = str;
        this.v = str2;
        this.f2651w = str3;
        this.f2653y = f0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Continuation continuation, Object obj2, Object obj3, Object obj4, int i) {
        super(2, continuation);
        this.u = i;
        this.f2651w = obj2;
        this.f2652x = obj3;
        this.f2653y = obj4;
    }
}

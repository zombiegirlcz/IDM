package ahe;

import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import vkm.c2;
import vkm.d2;
import vkm.j2;
import vkm.t1;
import yfe.h;
import yfe.w1;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 implements t {

    @NotNull
    private static final x Companion = new x();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f5038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f5039x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f5040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f5042c;
    public final jhe.a d;
    public final Map e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wsg.b f5043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ppk.f f5044h;
    public final b1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f5045j;
    public final lge.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lge.j f5046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jhe.g f5047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vge.j0 f5048n;
    public final t1j.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f5049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f5050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vge.s0 f5051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f5052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ukm.q f5053t;
    public final Lazy u;
    public final t1 v;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f5038w = kotlin.time.c.h(1000L, pkm.e.MILLISECONDS);
    }

    public w0(CoroutineScope scope, b aggregator, e categoryState, jhe.a defaultItemMapper, ImmutableMap customItemMappers, ImmutableMap snapshotProviders, wsg.b walletInteractor, ppk.f ratesInteractor, b1 snapshotRepository, ImmutableMap externalProviders, lge.h titleProvider, lge.j iconProvider, jhe.g gridOrganizer, vge.j0 advisedDiscoverProductsDecorator, t1j.b hiddenDiscoverItemsDecorator, n hiddenPlaceholdersRepository, f orderRepository, vge.s0 convertedBalanceDecorator) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(aggregator, "aggregator");
        Intrinsics.checkNotNullParameter(categoryState, "categoryState");
        Intrinsics.checkNotNullParameter(defaultItemMapper, "defaultItemMapper");
        Intrinsics.checkNotNullParameter(customItemMappers, "customItemMappers");
        Intrinsics.checkNotNullParameter(snapshotProviders, "snapshotProviders");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(snapshotRepository, "snapshotRepository");
        Intrinsics.checkNotNullParameter(externalProviders, "externalProviders");
        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
        Intrinsics.checkNotNullParameter(iconProvider, "iconProvider");
        Intrinsics.checkNotNullParameter(gridOrganizer, "gridOrganizer");
        Intrinsics.checkNotNullParameter(advisedDiscoverProductsDecorator, "advisedDiscoverProductsDecorator");
        Intrinsics.checkNotNullParameter(hiddenDiscoverItemsDecorator, "hiddenDiscoverItemsDecorator");
        Intrinsics.checkNotNullParameter(hiddenPlaceholdersRepository, "hiddenPlaceholdersRepository");
        Intrinsics.checkNotNullParameter(orderRepository, "orderRepository");
        Intrinsics.checkNotNullParameter(convertedBalanceDecorator, "convertedBalanceDecorator");
        this.f5040a = scope;
        this.f5041b = aggregator;
        this.f5042c = categoryState;
        this.d = defaultItemMapper;
        this.e = customItemMappers;
        this.f = snapshotProviders;
        this.f5043g = walletInteractor;
        this.f5044h = ratesInteractor;
        this.i = snapshotRepository;
        this.f5045j = externalProviders;
        this.k = titleProvider;
        this.f5046l = iconProvider;
        this.f5047m = gridOrganizer;
        this.f5048n = advisedDiscoverProductsDecorator;
        this.o = hiddenDiscoverItemsDecorator;
        this.f5049p = hiddenPlaceholdersRepository;
        this.f5050q = orderRepository;
        this.f5051r = convertedBalanceDecorator;
        Continuation continuation = null;
        this.f5052s = vkm.q.c(null);
        ukm.q qVarA = vc.s.a(-1, null, null, 6);
        this.f5053t = qVarA;
        this.u = yhm.j.b(new a2g.a(this, 14));
        this.v = vkm.q.M(rd0.e.e(new vkm.q0(vkm.q.Q(new vkm.y(new a35.j(2, 2, continuation), vkm.q.K(qVarA)), new a0e.m(continuation, this, 12)), new af4.e(this, continuation, 10), 1), zhm.h0.f322473a, new a19.e(3, 1, continuation)), scope, c2.a(d2.Companion, 1000L, 2), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ahe.w0 r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof ahe.p0
            if (r0 == 0) goto L13
            r0 = r5
            ahe.p0 r0 = (ahe.p0) r0
            int r1 = r0.f5023w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5023w = r1
            goto L18
        L13:
            ahe.p0 r0 = new ahe.p0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5023w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            kotlin.Lazy r5 = r4.u
            java.lang.Object r5 = r5.getValue()
            skm.g0 r5 = (skm.g0) r5
            r0.f5023w = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            vkm.j2 r4 = r4.f5052s
        L47:
            java.lang.Object r0 = r4.getValue()
            r1 = r0
            com.revolut.data.model.Data r1 = (com.revolut.data.model.Data) r1
            if (r1 != 0) goto L51
            r1 = r5
        L51:
            boolean r0 = r4.h(r0, r1)
            if (r0 == 0) goto L47
            if (r1 != 0) goto L5a
            return r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.w0.a(ahe.w0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ahe.w0 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof ahe.q0
            if (r0 == 0) goto L13
            r0 = r7
            ahe.q0 r0 = (ahe.q0) r0
            int r1 = r0.f5025w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5025w = r1
            goto L18
        L13:
            ahe.q0 r0 = new ahe.q0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5025w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L59
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            ahe.b1 r7 = r6.i
            r0.f5025w = r4
            ahe.k1 r7 = (ahe.k1) r7
            ne0.j r2 = r7.f5009a
            java.lang.String r4 = "snapshot_entries_key"
            java.lang.Object r2 = r2.get(r4)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L55
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            a07.d r4 = new a07.d
            r5 = 23
            r4.<init>(r7, r3, r5)
            java.lang.Object r7 = skm.e0.J(r2, r4, r0)
            goto L56
        L55:
            r7 = r2
        L56:
            if (r7 != r1) goto L59
            return r1
        L59:
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L7e
            jhe.g r0 = r6.f5047m
            java.util.Set r1 = r7.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = r6.d(r7, r1)
            java.util.Set r7 = r7.keySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = zhm.d0.d1(r7)
            java.util.List r6 = r0.b(r6, r7)
            r7 = 0
            r0 = 3
            com.revolut.data.model.Data r6 = zi0.c.P(r6, r7, r3, r0)
            return r6
        L7e:
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 3
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.w0.b(ahe.w0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:69|111|70|115|71|72|73|74|75|126|76|(1:146)(12:79|122|80|81|113|82|(0)|84|93|130|133|(1:24))) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:132|29|(4:32|(1:137)(2:36|135)|37|30)|134|38|(2:41|39)|138|42|(4:45|(2:47|140)(1:141)|48|43)|139|49|120|50|(6:128|52|53|124|54|(1:145)(4:57|117|58|(3:60|133|(1:24))(9:61|113|82|(0)|84|93|130|133|(1:24))))(12:69|111|70|115|71|72|73|74|75|126|76|(1:146)(12:79|122|80|81|113|82|(0)|84|93|130|133|(1:24)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:12|13|14|(1:122)|80|81|113|82|(3:85|(3:88|(1:143)(1:144)|86)|142)|84|93|130|133|(2:26|(1:28)(14:132|29|(4:32|(1:137)(2:36|135)|37|30)|134|38|(2:41|39)|138|42|(4:45|(2:47|140)(1:141)|48|43)|139|49|120|50|(6:128|52|53|124|54|(1:145)(4:57|117|58|(3:60|133|(1:24))(9:61|113|82|(0)|84|93|130|133|(1:24))))(12:69|111|70|115|71|72|73|74|75|126|76|(1:146)(12:79|122|80|81|113|82|(0)|84|93|130|133|(1:24)))))|131|109|110) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:128)|52|53|124|54|(1:145)(4:57|117|58|(3:60|133|(1:24))(9:61|113|82|(0)|84|93|130|133|(1:24)))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0201, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0203, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0205, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0206, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020c, code lost:
    
        r7 = zhm.h0.f322473a;
        r12 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, "Failed to produce TotalWealth snapshot for categoryKey=" + r4.f225354a, r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0227, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0177, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0178, code lost:
    
        r6 = r11;
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017a, code lost:
    
        r11 = r4;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01df, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e2, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ed, code lost:
    
        r1 = r18;
        r4 = r11;
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fd, code lost:
    
        r6 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0045: MOVE (r1 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:16:0x0045 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0046: MOVE (r10 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:16:0x0045 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x004a: MOVE (r6 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:16:0x0045 */
    /* JADX WARN: Path cross not found for [B:84:0x01c5, B:85:0x01c7], limit reached: 144 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c7 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:82:0x01bb, B:93:0x01e3, B:85:0x01c7, B:86:0x01cb, B:88:0x01d1), top: B:113:0x01bb }] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0169 -> B:24:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(ahe.w0 r18, java.util.List r19, xi0.b r20, java.util.List r21, gim.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.w0.c(ahe.w0, java.util.List, xi0.b, java.util.List, gim.c):java.lang.Object");
    }

    public static dj0.d f(ArrayList arrayList, xi0.b bVar, List list) {
        int i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof ProductAccount.ValueItem.Main) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = arrayList2.iterator();
        while (true) {
            i = 0;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (!kotlin.text.a0.H(((ProductAccount.ValueItem.Main) next).f89504c.f89729a, "Total-", false)) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            dj0.d dVarA = com.revolut.feature.tab.accounts.api.model.a.a((ProductAccount.ValueItem.Main) it9.next());
            if (dVarA != null) {
                arrayList4.add(dVarA);
            }
        }
        if (arrayList4.isEmpty()) {
            return new dj0.d(0L, bVar);
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        for (Object obj3 : arrayList4) {
            int i2 = i + 1;
            Object obj4 = null;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            if (i == 0) {
                dj0.d dVarK = (dj0.d) obj3;
                if (!Intrinsics.f(dVarK.f115083b, bVar)) {
                    Iterator it10 = list.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            break;
                        }
                        Object next2 = it10.next();
                        n9l.a aVar = (n9l.a) next2;
                        if (Intrinsics.f(aVar.f213661a, dVarK.f115083b) && Intrinsics.f(aVar.f213662b, bVar)) {
                            obj4 = next2;
                            break;
                        }
                    }
                    n9l.a aVar2 = (n9l.a) obj4;
                    dVarK = aVar2 != null ? pyd.c.K(dVarK, aVar2.f213663c, bVar) : new dj0.d(0L, bVar);
                }
                dVarO = dVarK;
            } else {
                dj0.d dVarK2 = (dj0.d) obj3;
                if (!Intrinsics.f(dVarK2.f115083b, bVar)) {
                    Iterator it11 = list.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            break;
                        }
                        Object next3 = it11.next();
                        n9l.a aVar3 = (n9l.a) next3;
                        if (Intrinsics.f(aVar3.f213661a, dVarK2.f115083b) && Intrinsics.f(aVar3.f213662b, bVar)) {
                            obj4 = next3;
                            break;
                        }
                    }
                    n9l.a aVar4 = (n9l.a) obj4;
                    dVarK2 = aVar4 != null ? pyd.c.K(dVarK2, aVar4.f213663c, bVar) : new dj0.d(0L, bVar);
                }
                dVarO = pyd.c.O(dVarO, dVarK2);
            }
            i = i2;
        }
        return dVarO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final ArrayList d(Map map, Iterable iterable) {
        boolean z;
        yfe.r0 r0VarB;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            TotalWealthCategoryKey totalWealthCategoryKey = (TotalWealthCategoryKey) it8.next();
            ohe.e eVar = (ohe.e) map.get(totalWealthCategoryKey);
            ?? fVar = 0;
            fVar = 0;
            if (eVar != null) {
                yfe.h hVar = eVar.f225359a;
                yfe.a aVarA = com.revolut.feature.tab.accounts.api.total_wealth.a.a(totalWealthCategoryKey);
                yfe.b bVar = (yfe.b) this.e.get(aVarA);
                try {
                    boolean z3 = hVar instanceof h.c;
                    jhe.a aVar = this.d;
                    if (z3) {
                        if (bVar == null || (r0VarB = bVar.a((h.c) hVar)) == null) {
                            r0VarB = aVar.a(aVarA, (yfe.h0) hVar);
                        }
                    } else {
                        if (!(hVar instanceof h.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r0VarB = bVar != null ? bVar.b((h.a) hVar) : aVar.b(aVarA, (yfe.k) hVar);
                    }
                    if (eVar.f225360b) {
                        yfe.q0 q0Var = r0VarB instanceof yfe.q0 ? (yfe.q0) r0VarB : null;
                        if (q0Var != null) {
                            yfe.x0 iconGroup = q0Var.f313297c.f313247a;
                            Intrinsics.checkNotNullParameter(iconGroup, "iconGroup");
                            yfe.d1 supplementary = new yfe.d1(iconGroup, true);
                            Clause title = q0Var.f313295a;
                            dj0.d balance = q0Var.f313296b;
                            w1 w1Var = q0Var.d;
                            boolean z4 = q0Var.e;
                            dj0.d moneyToDisplay = q0Var.f;
                            Intrinsics.checkNotNullParameter(title, "title");
                            Intrinsics.checkNotNullParameter(balance, "balance");
                            Intrinsics.checkNotNullParameter(supplementary, "supplementary");
                            Intrinsics.checkNotNullParameter(moneyToDisplay, "moneyToDisplay");
                            r0VarB = new yfe.q0(title, balance, supplementary, w1Var, z4, moneyToDisplay);
                        }
                    }
                    fVar = new ohe.f(totalWealthCategoryKey, r0VarB, hVar);
                } finally {
                    if (!z) {
                    }
                }
            }
            if (fVar != 0) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public final Object e(gim.i iVar) {
        Object objN = vkm.q.n(this.v, iVar);
        return objN == fim.a.COROUTINE_SUSPENDED ? objN : Unit.f186387a;
    }
}

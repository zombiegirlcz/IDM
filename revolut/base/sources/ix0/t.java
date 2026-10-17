package ix0;

import android.content.Context;
import au0.m4;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.yc0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class t {

    @NotNull
    public static final n Companion = new n();
    public static final AtomicInteger v = new AtomicInteger(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f169294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f169295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f169296c;
    public u d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wy0.a f169297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u80.d f169298h;
    public final BigDecimal i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xi0.b f169299j;
    public final ihm.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public bw0.h f169300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f169301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.b f169302n;
    public ifm.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ifm.b f169303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f169304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f169305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f169306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f169307t;
    public Boolean u;

    public t(Context context, boolean z, m callback, u colorsCalculator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(colorsCalculator, "colorsCalculator");
        this.f169294a = context;
        this.f169295b = z;
        this.f169296c = callback;
        this.d = colorsCalculator;
        bw0.j jVar = bw0.j.ADD;
        d01.b bVarA = a(jVar, true);
        bw0.j jVar2 = bw0.j.SUBTRACT;
        d01.b bVarA2 = a(jVar2, true);
        bw0.j jVar3 = bw0.j.MULTIPLY;
        d01.b bVarA3 = a(jVar3, true);
        bw0.j jVar4 = bw0.j.DIVIDE;
        d01.b bVarA4 = a(jVar4, true);
        bw0.j jVar5 = bw0.j.EQUALS;
        List listK = zhm.v.k(bVarA, bVarA2, bVarA3, bVarA4, a(jVar5, true));
        this.e = jh.d.k(context) ? zhm.b0.L(listK) : listK;
        List listK2 = zhm.v.k(a(jVar, false), a(jVar2, false), a(jVar3, false), a(jVar4, false), a(jVar5, false));
        this.f = jh.d.k(context) ? zhm.b0.L(listK2) : listK2;
        this.f169297g = jh.d.f(context);
        this.f169298h = new u80.d(jh.d.e(context));
        this.i = BigDecimal.ZERO;
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        ihm.b bVarE = ihm.b.e(iVar);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.k = bVarE;
        this.f169301m = new o(zhm.f0.f322471a);
        ihm.b bVarE2 = ihm.b.e(iVar);
        Intrinsics.checkNotNullExpressionValue(bVarE2, "createDefault(...)");
        this.f169302n = bVarE2;
        this.f169303p = new ifm.b();
        this.f169305r = a0.d.n("AmountEdit_", v.incrementAndGet());
        callback.a(new m4(this, 5));
        callback.j(new l(this, 1));
    }

    public static d01.b a(bw0.j jVar, boolean z) {
        String strValueOf = String.valueOf(jVar.b());
        return new d01.b(strValueOf, new TextClause(strValueOf, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), jVar, z, d01.f.ARITHMETIC, null, 32);
    }

    public static boolean f(String str, boolean z) {
        bw0.j.Companion.getClass();
        for (bw0.j jVar : bw0.j.cachedValues) {
            if (kotlin.text.d0.K(str, jVar.b())) {
                if (!z) {
                    return true;
                }
                bw0.j[] jVarArrValues = bw0.j.values();
                ArrayList arrayList = new ArrayList(jVarArrValues.length);
                for (bw0.j jVar2 : jVarArrValues) {
                    arrayList.add(String.valueOf(jVar2.b()));
                }
                Intrinsics.checkNotNullExpressionValue(str.substring(kotlin.text.d0.V(str, arrayList) + 1), "substring(...)");
                return !kotlin.text.d0.W(r5);
            }
        }
        return false;
    }

    public final bw0.j b() {
        od0.i iVar = (od0.i) this.k.f();
        if (iVar != null) {
            return (bw0.j) iVar.f224257a;
        }
        return null;
    }

    public final String c() {
        od0.i iVar = (od0.i) this.f169302n.f();
        if (iVar != null) {
            return (String) iVar.f224257a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(java.lang.String r5) {
        /*
            r4 = this;
            u80.d r0 = r4.f169298h
            char r0 = r0.d()
            r1 = 6
            r2 = 0
            int r0 = kotlin.text.d0.X(r5, r0, r2, r1)
            ix0.m r1 = r4.f169296c
            yz0.b r1 = r1.u()
            if (r1 == 0) goto L19
            boolean r1 = r1.g()
            goto L1a
        L19:
            r1 = r2
        L1a:
            r3 = -1
            if (r0 != r3) goto L20
            java.lang.String r5 = ""
            return r5
        L20:
            xi0.b r3 = r4.f169299j
            if (r3 == 0) goto L35
            if (r1 != 0) goto L2d
            boolean r1 = cp5.d.A(r3)
            if (r1 == 0) goto L2d
            goto L2e
        L2d:
            r3 = 0
        L2e:
            if (r3 == 0) goto L35
            int r1 = r3.b()
            goto L36
        L35:
            r1 = r2
        L36:
            int r5 = r5.length()
            int r5 = r5 + (-1)
            int r5 = r5 - r0
            int r1 = r1 - r5
            if (r1 >= 0) goto L41
            goto L42
        L41:
            r2 = r1
        L42:
            java.lang.String r5 = "0"
            java.lang.String r5 = kotlin.text.a0.C(r5, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.t.d(java.lang.String):java.lang.String");
    }

    public final void e(Clause clause) {
        m mVar = this.f169296c;
        yz0.b bVarU = mVar.u();
        zp0.d dVar = bVarU instanceof zp0.d ? (zp0.d) bVarU : null;
        if (dVar != null) {
            dVar.f324113q = false;
        }
        if (clause instanceof MoneyClause) {
            clause = MoneyClause.b((MoneyClause) clause, null, new MoneyClause.Format.Editable(), null, null, 13);
        }
        mVar.s(clause);
    }

    public final efm.r g() {
        efm.r rVarDistinctUntilChanged = this.k.switchMap(new ivb.i(new l(this, 3), 8)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final efm.r h() {
        efm.r rVarG = g();
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        efm.r rVarStartWith = rVarG.startWith("");
        m mVar = this.f169296c;
        efm.r rVarDistinctUntilChanged = efm.r.combineLatest(rVarStartWith, mVar.n(), mVar.C(), mVar.c(), new ivb.i(new b3.a(this, 2), 7)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final void i() {
        p(this.f169296c.u());
        d01.g gVarE0 = this.f169297g.e0();
        if (gVarE0 != null) {
            efm.r rVarD = ((iz0.e) gVarE0).d(this.f169305r);
            l lVar = new l(this, 0);
            efm.r rVarOnErrorResumeNext = rVarD.onErrorResumeNext(new a08.r(26, new i2i.d0(new BreadcrumbException(), 25)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0d.g(19, lVar), new a0d.g(19, r.f169284a));
            Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
            te0.w.j0(this.f169303p, cVarSubscribe);
        }
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(bw0.h r19) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.t.j(bw0.h):void");
    }

    public final void k(bw0.j jVar) {
        od0.i.Companion.getClass();
        this.k.onNext(od0.h.a(jVar));
    }

    public final void l(yz0.b bVar) {
        m mVar = this.f169296c;
        yz0.b bVarU = mVar.u();
        mVar.H(bVar);
        boolean z = bVar instanceof zp0.d;
        zp0.d dVar = z ? (zp0.d) bVar : null;
        this.f169299j = dVar != null ? dVar.f324107h : null;
        boolean z3 = (bVarU instanceof zp0.d) && z && Intrinsics.f(((zp0.d) bVarU).f324107h, ((zp0.d) bVar).f324107h);
        if (b() != null && c() != null && !z3) {
            k(null);
            mVar.g(c());
            od0.i.Companion.getClass();
            this.f169302n.onNext(od0.h.a(null));
        }
        p(bVar);
    }

    public final void m(bw0.h hVar) {
        m mVar = this.f169296c;
        String strW = mVar.w();
        String strR = hVar.f19180b;
        if (!Intrinsics.f(strW, strR)) {
            if (this.f169295b) {
                if (strR == null) {
                    strR = null;
                } else if (Intrinsics.f(this.f169306s, strR)) {
                    strR = this.f169307t;
                } else {
                    u80.d dVar = this.f169298h;
                    dVar.e(strR);
                    BigDecimal emptyDecimal = this.i;
                    Intrinsics.checkNotNullExpressionValue(emptyDecimal, "emptyDecimal");
                    String strA = dVar.a(emptyDecimal);
                    this.f169306s = strR;
                    m70.a.c(kotlin.jvm.internal.t0.f186434a);
                    if (CharsKt.e(kotlin.text.f0.P0(kotlin.text.a0.F(strA, strR, "", false)))) {
                        strR = a0.d.r(this.f169306s, " ");
                    }
                    this.f169307t = strR;
                }
            }
            mVar.l(strR);
        }
        mVar.G(true);
        r();
    }

    public final void n(boolean z) {
        List list = z ? this.e : this.f;
        d01.g gVarE0 = this.f169297g.e0();
        if (gVarE0 != null) {
            ((iz0.e) gVarE0).g(this.f169305r, list);
        }
    }

    public final void o() {
        o oVar = this.f169301m;
        if (oVar == null) {
            throw new NoWhenBranchMatchedException();
        }
        d01.g gVarE0 = this.f169297g.e0();
        if (gVarE0 != null) {
            iz0.e eVar = (iz0.e) gVarE0;
            eVar.g(this.f169305r, oVar.f169269a);
        }
    }

    public final void p(yz0.b bVar) {
        ifm.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
        zp0.d dVar = bVar instanceof zp0.d ? (zp0.d) bVar : null;
        if (dVar == null) {
            return;
        }
        dVar.f324113q = b() != null;
        efm.r rVarG0 = te0.w.G0(dVar.f324109l, dVar.f324110m, dVar.k);
        l lVar = new l(this, 2);
        efm.r rVarOnErrorResumeNext = rVarG0.onErrorResumeNext(new a08.r(26, new i2i.d0(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0d.g(19, lVar), new a0d.g(19, s.f169287a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        this.o = cVarSubscribe;
    }

    public final void q() {
        bw0.h hVar = this.f169300l;
        if (hVar == null) {
            return;
        }
        this.f169296c.k(this.d.E(hVar));
    }

    public final void r() {
        bw0.h hVar = this.f169300l;
        if (hVar == null) {
            return;
        }
        this.f169296c.B(this.d.B(hVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.t.s():void");
    }

    public final void t() {
        bw0.h hVar = this.f169300l;
        if (hVar == null) {
            return;
        }
        m mVar = this.f169296c;
        String strY = mVar.y();
        boolean zA = mVar.A();
        wy0.a aVar = this.f169297g;
        if (!zA || strY == null) {
            d01.g gVarE0 = aVar.e0();
            if (gVarE0 != null) {
                ((iz0.e) gVarE0).c(this.f169305r);
                return;
            }
            return;
        }
        o oVar = this.f169301m;
        oVar.getClass();
        boolean zIsEmpty = oVar.f169269a.isEmpty();
        boolean z = strY.length() > 0;
        int i = q.f169280a[hVar.k.ordinal()];
        if (i == 1) {
            n(z);
            return;
        }
        if (i == 2) {
            if (zIsEmpty) {
                n(z);
                return;
            } else {
                o();
                return;
            }
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            d01.g gVarE02 = aVar.e0();
            if (gVarE02 != null) {
                ((iz0.e) gVarE02).c(this.f169305r);
                return;
            }
            return;
        }
        if (z) {
            n(true);
        } else if (zIsEmpty) {
            n(false);
        } else {
            o();
        }
    }

    public t(Context context, boolean z, m mVar) {
        this(context, z, mVar, new b9.u(z, mVar, new yc0(1, context, kli.a.class, "obtainColorFromAttr", "obtainColorFromAttr(Landroid/content/Context;I)I", 1, 3)));
    }
}

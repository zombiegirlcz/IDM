package cc7;

import bw4.s;
import c69.v;
import efm.r;
import ip0.t80;
import ip0.u80;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends yji.n implements sb7.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f22949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f22950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yb7.a f22951n;
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f22952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f22953q;

    public h(j60.a bottomDialogControllerExtension, m widgetState, yb7.a interactor, a mapper) {
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f22949l = bottomDialogControllerExtension;
        this.f22950m = widgetState;
        this.f22951n = interactor;
        this.o = mapper;
        this.f22952p = ta6.a.a(1);
        this.f22953q = ta6.a.a(0);
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        yji.n.l2(this, q.Q(this.f22952p, new s(continuation, this, 13)), null, new cbh.g(this, continuation, 2), 3);
        yji.n.l2(this, q.Q(this.f22953q, new a32.b(continuation, this, 20)), null, null, 7);
        r rVarFilter = this.f22949l.t().filter(new c64.a(new c8i.c(24), 16)).filter(new c64.a(new c8i.c(25), 17));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        yji.n.l2(this, rd0.e.b(rVarFilter), null, new c65.i(this, continuation, 7), 3);
    }

    public final vkm.d Z2(zb7.f npsScreen) {
        Intrinsics.checkNotNullParameter(npsScreen, "npsScreen");
        this.f22952p.k(npsScreen);
        m mVar = this.f22950m;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(npsScreen, "npsScreen");
        r map = mVar.f22963b.c(te0.s.f270018a).map(new c64.a(new bwc.i(1, mVar.f22962a, c.class, "mapState", "mapState(Lcom/revolut/feature/home/nps/ui/HomeNpsWidgetInternalContract$NpsWidgetState;)Ljava/util/List;", 0, 14), 18));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(ue0.e.E(map, f0.f322471a));
    }

    public final void b3(t80 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.f166478a.equals("NPS_RATING_BAR_ID")) {
            m mVar = this.f22950m;
            d dVar = new d((zb7.g) zi0.c.I(((e) mVar.f22963b.get()).f22947a), h0.f322473a, "");
            te0.r rVar = mVar.f22964c;
            od0.i.Companion.getClass();
            rVar.set(od0.h.a(dVar));
            this.f22949l.x(this.o.b(dVar));
        }
    }

    public final void c3(t80 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.f166478a.equals("NPS_RATING_BAR_ID")) {
            T2(new bv4.h(this, null, 15), new yi5.b(27));
        }
    }

    public final void d3(u80 clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        n nVar = o.Companion;
        int i = clickData.f166632b;
        nVar.getClass();
        zb7.c cVarC = o.values()[i].c();
        String str = clickData.f166631a;
        if (str.equals("NPS_RATING_BAR_ID")) {
            this.f22953q.k(cVarC);
        }
        if (str.equals("NPS_DETAILS_RATING_BAR_ID")) {
            f3(new v(cVarC, 21));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(zb7.c r15, java.util.Set r16, java.lang.String r17, final boolean r18, gim.c r19) {
        /*
            r14 = this;
            r0 = r19
            boolean r1 = r0 instanceof cc7.g
            if (r1 == 0) goto L15
            r1 = r0
            cc7.g r1 = (cc7.g) r1
            int r2 = r1.f22948w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f22948w = r2
            goto L1a
        L15:
            cc7.g r1 = new cc7.g
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f22948w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r0)
            goto L8d
        L29:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L31:
            yhm.o.b(r0)
            cc7.m r0 = r14.f22950m
            te0.r r0 = r0.f22963b
            java.lang.Object r0 = r0.get()
            cc7.e r0 = (cc7.e) r0
            com.revolut.data.model.Data r0 = r0.f22947a
            java.lang.Object r0 = r0.getContent()
            zb7.g r0 = (zb7.g) r0
            if (r0 != 0) goto L4b
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        L4b:
            java.lang.String r8 = r0.f
            java.lang.String r9 = r0.f320838a
            zb7.d r10 = new zb7.d
            r0 = r16
            r3 = r17
            r10.<init>(r9, r15, r0, r3)
            yb7.a r15 = r14.f22951n
            r15.getClass()
            java.lang.String r0 = "npsReview"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r3 = "surveyName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            vb7.f r6 = r15.f312204a
            r6.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            vb7.c r5 = new vb7.c
            r7 = r18
            r5.<init>()
            pfm.h r15 = new pfm.h
            r0 = 1
            r15.<init>(r5, r0)
            java.lang.String r0 = "defer(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            r1.f22948w = r4
            java.lang.Object r15 = nim.a.a(r15, r1)
            if (r15 != r2) goto L8d
            return r2
        L8d:
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r15 = com.revolut.feature.home.nps.R$string.revolut_nps_feedback_success_title
            r0 = 14
            r1 = 0
            r4.<init>(r15, r1, r1, r0)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r5 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r6 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_check
            int r15 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorWhite
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            r12 = 0
            r13 = 246(0xf6, float:3.45E-43)
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r9 = 108(0x6c, float:1.51E-43)
            java.lang.String r3 = "FEEDBACK_SUBMITTED_DIALOG_ID"
            r6 = r5
            r5 = 0
            mii.f r15 = te0.w.a(r3, r4, r5, r6, r7, r8, r9)
            r14.L2(r15)
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: cc7.h.e3(zb7.c, java.util.Set, java.lang.String, boolean, gim.c):java.lang.Object");
    }

    public final void f3(Function1 func) {
        m mVar = this.f22950m;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(func, "func");
        te0.r rVar = mVar.f22964c;
        if (((od0.i) rVar.get()).d()) {
            d dVar = (d) func.invoke(((od0.i) rVar.get()).c());
            od0.i.Companion.getClass();
            rVar.set(od0.h.a(dVar));
        }
        this.f22949l.A(this.o.b((d) ((od0.i) rVar.get()).c()));
    }
}

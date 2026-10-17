package com.revolut.feature.shared.help_centre.impl.faq.screens.article;

import a3i.i;
import av7.l;
import b73.h;
import b8d.g0;
import b8d.l0;
import b8d.m;
import b8d.s;
import b8d.v;
import b8d.y;
import com.revolut.core.model.faq.FaqAction;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData;
import ep6.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.g;
import jki.p;
import kge.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import p9d.e;
import v20.d1;
import v20.e1;
import vkm.q;
import wli.x;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends g implements s {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f86236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f86237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l0 f86238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f86239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hg0.b f86240t;
    public final n u;
    public final FaqArticleScreenContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final hg0.d f86241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final lde.n f86242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f86243y;
    public final m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p stateMapper, d callRequestNextTicketProvider, x deeplinkHandler, l0 deeplinkModifier, e faqActionHelper, hg0.b faqInteractor, n feedbackExtension, FaqArticleScreenContract$InputData inputData, hg0.d lightenedFaqInteractor, lde.n widgetsInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(callRequestNextTicketProvider, "callRequestNextTicketProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkModifier, "deeplinkModifier");
        Intrinsics.checkNotNullParameter(faqActionHelper, "faqActionHelper");
        Intrinsics.checkNotNullParameter(faqInteractor, "faqInteractor");
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(lightenedFaqInteractor, "lightenedFaqInteractor");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.f86236p = callRequestNextTicketProvider;
        this.f86237q = deeplinkHandler;
        this.f86238r = deeplinkModifier;
        this.f86239s = faqActionHelper;
        this.f86240t = faqInteractor;
        this.u = feedbackExtension;
        this.v = inputData;
        this.f86241w = lightenedFaqInteractor;
        this.f86242x = widgetsInteractor;
        this.f86243y = b.a(inputData);
        this.z = inputData instanceof FaqArticleScreenContract$InputData.OpenByFaqNode ? C2(zi0.c.P(((FaqArticleScreenContract$InputData.OpenByFaqNode) inputData).f86230b.getF51435b(), false, null, 3)) : C2(new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A2(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c r5, java.util.List r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof b8d.j0
            if (r0 == 0) goto L13
            r0 = r7
            b8d.j0 r0 = (b8d.j0) r0
            int r1 = r0.f13170y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13170y = r1
            goto L18
        L13:
            b8d.j0 r0 = new b8d.j0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13168w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13170y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            aj0.c r6 = r0.v
            java.util.List r0 = r0.u
            java.util.List r0 = (java.util.List) r0
            yhm.o.b(r7)
            goto L5f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r7)
            jki.i r7 = r5.t2()
            b8d.m r7 = (b8d.m) r7
            com.revolut.data.model.Data r7 = r7.f13177b
            java.lang.Object r7 = r7.getContent()
            aj0.c r7 = (aj0.c) r7
            if (r7 != 0) goto L4b
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4b:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            r0.u = r2
            r0.v = r7
            r0.f13170y = r3
            java.lang.Object r0 = r5.B2(r0)
            if (r0 != r1) goto L5b
            return r1
        L5b:
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r4
        L5f:
            java.util.List r7 = (java.util.List) r7
            b8d.r r1 = new b8d.r
            java.lang.String r6 = r6.f5343g
            r1.<init>(r6, r0, r7)
            r5.v2(r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.A2(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof b8d.h0
            if (r0 == 0) goto L13
            r0 = r6
            b8d.h0 r0 = (b8d.h0) r0
            int r1 = r0.f13164x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13164x = r1
            goto L18
        L13:
            b8d.h0 r0 = new b8d.h0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13164x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aj0.c r0 = r0.u
            yhm.o.b(r6)
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            jki.i r6 = r5.t2()
            b8d.m r6 = (b8d.m) r6
            com.revolut.data.model.Data r6 = r6.f13177b
            java.lang.Object r6 = r6.getContent()
            aj0.c r6 = (aj0.c) r6
            if (r6 != 0) goto L47
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L47:
            r0.u = r6
            r0.f13164x = r3
            java.lang.Object r0 = r5.B2(r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r4 = r0
            r0 = r6
            r6 = r4
        L55:
            java.util.List r6 = (java.util.List) r6
            b8d.p r1 = new b8d.p
            java.lang.String r2 = r0.f5343g
            java.util.List r0 = r0.f5344h
            r1.<init>(r2, r0, r6)
            r5.v2(r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.y2(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c r5, com.revolut.core.model.faq.FaqAction r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof b8d.i0
            if (r0 == 0) goto L13
            r0 = r7
            b8d.i0 r0 = (b8d.i0) r0
            int r1 = r0.f13167y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13167y = r1
            goto L18
        L13:
            b8d.i0 r0 = new b8d.i0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13165w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13167y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            aj0.c r6 = r0.v
            com.revolut.core.model.faq.FaqAction r0 = r0.u
            yhm.o.b(r7)
            goto L5a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            jki.i r7 = r5.t2()
            b8d.m r7 = (b8d.m) r7
            com.revolut.data.model.Data r7 = r7.f13177b
            java.lang.Object r7 = r7.getContent()
            aj0.c r7 = (aj0.c) r7
            if (r7 != 0) goto L49
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L49:
            r0.u = r6
            r0.v = r7
            r0.f13167y = r3
            java.lang.Object r0 = r5.B2(r0)
            if (r0 != r1) goto L56
            return r1
        L56:
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r4
        L5a:
            java.util.List r7 = (java.util.List) r7
            b8d.q r1 = new b8d.q
            java.lang.String r6 = r6.f5343g
            r1.<init>(r6, r0, r7)
            r5.v2(r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.z2(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c, com.revolut.core.model.faq.FaqAction, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof b8d.w
            if (r0 == 0) goto L13
            r0 = r8
            b8d.w r0 = (b8d.w) r0
            int r1 = r0.f13198w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13198w = r1
            goto L18
        L13:
            b8d.w r0 = new b8d.w
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13198w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            goto L54
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            yhm.o.b(r8)
            java.lang.String r8 = r7.f86243y
            hg0.d r2 = r7.f86241w
            hg0.m r2 = (hg0.m) r2
            vkm.y r8 = r2.c(r8)
            a35.k r2 = new a35.k
            r5 = 3
            r6 = 18
            r2.<init>(r5, r6, r4)
            zhm.h0 r5 = zhm.h0.f322473a
            vkm.y r8 = rd0.e.e(r8, r5, r2)
            r0.f13198w = r3
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r0 = r8
            java.util.List r0 = (java.util.List) r0
            boolean r0 = ue0.e.n(r0)
            if (r0 != 0) goto L5e
            return r8
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.B2(gim.c):java.lang.Object");
    }

    public final m C2(Data data) {
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(null, null, true, 3, null);
        FaqArticleScreenContract$InputData faqArticleScreenContract$InputData = this.v;
        return new m(data, data2, data3, data4, data5, faqArticleScreenContract$InputData.getF86232a(), faqArticleScreenContract$InputData.getD());
    }

    public final void D2(Object obj2, String itemId) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "FAQ_SUGGESTED_ACTIONS_ITEM_ID")) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.model.faq.FaqAction");
                objA = (FaqAction) obj2;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = yhm.m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            Continuation continuation = null;
            if (objA instanceof yhm.n) {
                objA = null;
            }
            FaqAction faqAction = (FaqAction) objA;
            if (faqAction == null) {
                return;
            }
            n2(new l(this, faqAction, continuation, 21), new whi.b(6));
        }
    }

    public final void E2(Object obj2) {
        aj0.c cVar = (aj0.c) ((b8d.m) t2()).f13177b.getContent();
        String str = cVar != null ? cVar.f5343g : null;
        if (str == null || !(!d0.W(str))) {
            IllegalStateException illegalStateException = new IllegalStateException("Request call is visible while specialisation queue is not present");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (obj2 instanceof d1.c) {
            v2(new b8d.n(str));
            return;
        }
        if (obj2 instanceof e1) {
            v2(new b8d.o(((e1) obj2).f285371a, str));
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException(a0.d.m(obj2, "Could not handle parcel = "));
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
    }

    public final void S0(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Continuation continuation = null;
        if (this.f86237q.y1(url2) && a0.y(url2, "chat", false)) {
            n2(new g0(1, this, continuation), new whi.b(6));
        } else {
            n2(new l(this, url2, continuation, 20), new whi.b(6));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        hg0.m mVar = (hg0.m) this.f86241w;
        String str = this.f86243y;
        Continuation continuation = null;
        wkm.l lVarQ = q.Q(new i(q.Q(new vkm.v(mVar.b(str, false), new b8d.x(1, this, null)), new y(1, this, continuation)), this, 29), new y(0, this, continuation));
        n nVar = this.u;
        yji.l.b1(this, new t38.e(lVarQ, 24, nVar.F1(), new a0e.o(this, continuation, 23)), new aee.g(2, this, c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 4, 12), null, 6);
        n2(new g0(3, this, continuation), new h(16));
        yji.l.b1(this, nVar.I1(str, yo6.d.FAQ, null), null, new l(this, continuation, 19), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }
}

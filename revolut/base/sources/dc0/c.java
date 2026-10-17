package dc0;

import f30.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112776c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f112774a = i;
        this.f112775b = obj2;
        this.f112776c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ebk.a
            if (r0 == 0) goto L13
            r0 = r13
            ebk.a r0 = (ebk.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ebk.a r0 = new ebk.a
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r13)
            goto Lc3
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            yhm.o.b(r13)
            java.lang.Object r13 = r11.f112775b
            kotlinx.coroutines.flow.FlowCollector r13 = (kotlinx.coroutines.flow.FlowCollector) r13
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r2 = r11.f112776c
            ebk.b r2 = (ebk.b) r2
            abk.e r2 = r2.f124380l
            r2.getClass()
            java.lang.String r2 = "errors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r12.iterator()
        L57:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L70
            java.lang.Object r6 = r5.next()
            r7 = r6
            yqi.b r7 = (yqi.b) r7
            boolean r7 = r7 instanceof srf.a
            if (r7 == 0) goto L6c
            r2.add(r6)
            goto L57
        L6c:
            r4.add(r6)
            goto L57
        L70:
            hrf.h r5 = new hrf.h
            r6 = 2
            yqi.b[] r6 = new yqi.b[r6]
            java.util.Iterator r7 = r12.iterator()
        L79:
            boolean r8 = r7.hasNext()
            r9 = 0
            if (r8 == 0) goto L8c
            java.lang.Object r8 = r7.next()
            r10 = r8
            yqi.b r10 = (yqi.b) r10
            boolean r10 = r10 instanceof urf.b
            if (r10 == 0) goto L79
            goto L8d
        L8c:
            r8 = r9
        L8d:
            r7 = 0
            r6[r7] = r8
            java.util.Iterator r12 = r12.iterator()
        L94:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto La6
            java.lang.Object r7 = r12.next()
            r8 = r7
            yqi.b r8 = (yqi.b) r8
            boolean r8 = r8 instanceof urf.a
            if (r8 == 0) goto L94
            r9 = r7
        La6:
            r6[r3] = r9
            java.lang.String r12 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r12)
            java.util.List r12 = kotlin.collections.d.L(r6)
            java.lang.Object r12 = zhm.d0.d0(r12)
            yqi.b r12 = (yqi.b) r12
            r5.<init>(r4, r2, r12)
            r0.v = r3
            java.lang.Object r12 = r13.emit(r5, r0)
            if (r12 != r1) goto Lc3
            return r1
        Lc3:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ek2.r
            if (r0 == 0) goto L13
            r0 = r7
            ek2.r r0 = (ek2.r) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ek2.r r0 = new ek2.r
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L52
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f112775b
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            r2 = r6
            zv0.b r2 = (zv0.b) r2
            java.lang.Object r4 = r5.f112776c
            com.revolut.feature.atm.impl.ui.redesign.details.a r4 = (com.revolut.feature.atm.impl.ui.redesign.details.a) r4
            tk2.p r4 = r4.f63170x
            vkm.u1 r4 = r4.f271851l
            kotlinx.coroutines.flow.StateFlow r4 = r4.f290128a
            java.lang.Object r4 = r4.getValue()
            if (r2 == r4) goto L52
            r0.v = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r34, kotlin.coroutines.Continuation r35) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof eqd.f
            if (r0 == 0) goto L13
            r0 = r10
            eqd.f r0 = (eqd.f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            eqd.f r0 = new eqd.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r10)
            goto L95
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            yhm.o.b(r10)
            java.lang.Object r10 = r8.f112775b
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            d1h.g r9 = (d1h.g) r9
            com.revolut.data.model.Data r9 = r9.f110649a
            r2 = 0
            if (r9 == 0) goto L8c
            java.lang.Object r4 = r9.getContent()     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L72
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L68
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L68
        L4c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L68
            r6 = r5
            rdh.a r6 = (rdh.a) r6     // Catch: java.lang.Throwable -> L68
            rdh.b r6 = r6.f253457a     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = r8.f112776c     // Catch: java.lang.Throwable -> L68
            eqd.g r7 = (eqd.g) r7     // Catch: java.lang.Throwable -> L68
            eqd.c r7 = r7.o     // Catch: java.lang.Throwable -> L68
            rdh.b r7 = r7.d     // Catch: java.lang.Throwable -> L68
            if (r6 != r7) goto L4c
            rdh.a r5 = (rdh.a) r5     // Catch: java.lang.Throwable -> L68
            goto L73
        L68:
            r4 = move-exception
            goto L82
        L6a:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "Collection contains no element matching the predicate."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L68
            throw r4     // Catch: java.lang.Throwable -> L68
        L72:
            r5 = r2
        L73:
            java.lang.Throwable r4 = r9.getError()     // Catch: java.lang.Throwable -> L68
            boolean r6 = r9.getLoading()     // Catch: java.lang.Throwable -> L68
            com.revolut.data.model.Data r7 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L68
            r7.<init>(r5, r4, r6)     // Catch: java.lang.Throwable -> L68
            r2 = r7
            goto L8c
        L82:
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            boolean r9 = r9.getLoading()
            r5.<init>(r2, r4, r9)
            r2 = r5
        L8c:
            r0.v = r3
            java.lang.Object r9 = r10.emit(r2, r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f112776c
            eql.c0 r0 = (eql.c0) r0
            boolean r1 = r10 instanceof eql.u
            if (r1 == 0) goto L17
            r1 = r10
            eql.u r1 = (eql.u) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            eql.u r1 = new eql.u
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r10)
            goto L8d
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r10)
            java.lang.Object r10 = r8.f112775b
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r9.iterator()
        L47:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r9.next()
            r6 = r5
            com.revolut.sso.api.signin_social.LinkSocialAccountControllerModelExtension$SocialAccount r6 = (com.revolut.sso.api.signin_social.LinkSocialAccountControllerModelExtension$SocialAccount) r6
            hjl.c r6 = r6.f106023a
            int[] r7 = eql.o.f128513a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            if (r6 == r4) goto L76
            r7 = 2
            if (r6 == r7) goto L78
            r7 = 3
            if (r6 == r7) goto L76
            r7 = 4
            if (r6 != r7) goto L70
            iy8.b r6 = r0.f128499x
            boolean r6 = r6.a()
            goto L7e
        L70:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L76:
            r6 = r4
            goto L7e
        L78:
            gql.a r6 = r0.f128497t
            boolean r6 = r6.a()
        L7e:
            if (r6 == 0) goto L47
            r3.add(r5)
            goto L47
        L84:
            r1.v = r4
            java.lang.Object r9 = r10.emit(r3, r1)
            if (r9 != r2) goto L8d
            return r2
        L8d:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ey5.g
            if (r0 == 0) goto L13
            r0 = r13
            ey5.g r0 = (ey5.g) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ey5.g r0 = new ey5.g
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L7c
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            java.lang.Object r13 = r11.f112775b
            kotlinx.coroutines.flow.FlowCollector r13 = (kotlinx.coroutines.flow.FlowCollector) r13
            ey5.c r12 = (ey5.c) r12
            java.lang.Object r2 = r11.f112776c
            ey5.j r2 = (ey5.j) r2
            ey5.f r2 = r2.f130579p
            r2.getClass()
            java.lang.String r2 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            aw0.q0 r2 = new aw0.q0
            java.lang.String r12 = r12.f130573a
            aw0.p0 r4 = new aw0.p0
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r5 = 2131961858(0x7f132802, float:1.9560425E38)
            r7 = 14
            r10 = 0
            r6.<init>(r5, r10, r10, r7)
            ey5.b r8 = new ey5.b
            r8.<init>(r12)
            r9 = 12
            java.lang.String r5 = "LIST_ID_CRYPTO_COLLECTION_DETAILS_ACTION_BUY"
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r12 = 0
            aw0.p0[] r12 = new aw0.p0[r12]
            java.lang.String r5 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r5)
            java.util.List r12 = kotlin.collections.d.L(r12)
            r2.<init>(r4, r10, r12)
            r0.v = r3
            java.lang.Object r12 = r13.emit(r2, r0)
            if (r12 != r1) goto L7c
            return r1
        L7c:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f112776c
            r10.w r0 = (r10.w) r0
            boolean r1 = r10 instanceof eyh.b
            if (r1 == 0) goto L17
            r1 = r10
            eyh.b r1 = (eyh.b) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            eyh.b r1 = new eyh.b
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r10)
            goto L74
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r10)
            java.lang.Object r10 = r8.f112775b
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            yhm.r r9 = (yhm.r) r9
            java.lang.Object r3 = r9.f314201a
            com.revolut.data.model.Data r3 = (com.revolut.data.model.Data) r3
            java.lang.Object r5 = r9.f314202b
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r9 = r9.f314203c
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            eyh.a r6 = new eyh.a
            r0.getClass()
            boolean r0 = pyd.c.E(r3)
            r7 = 0
            if (r0 == 0) goto L5b
            boolean r0 = zi0.c.E(r3)
            if (r0 == 0) goto L5b
            r3 = r7
        L5b:
            boolean r0 = pyd.c.E(r5)
            if (r0 == 0) goto L68
            boolean r0 = zi0.c.E(r5)
            if (r0 == 0) goto L68
            r5 = r7
        L68:
            r6.<init>(r3, r5, r9)
            r1.v = r4
            java.lang.Object r9 = r10.emit(r6, r1)
            if (r9 != r2) goto L74
            return r2
        L74:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof f23.i0
            if (r0 == 0) goto L13
            r0 = r6
            f23.i0 r0 = (f23.i0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            f23.i0 r0 = new f23.i0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L69
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f112775b
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState r5 = (com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState) r5
            java.lang.Object r2 = r4.f112776c
            f23.l0 r2 = (f23.l0) r2
            r2.getClass()
            boolean r2 = r5 instanceof com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState.NotOnboarded
            if (r2 != 0) goto L5b
            boolean r2 = r5 instanceof com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState.Pending
            if (r2 == 0) goto L48
            goto L5b
        L48:
            boolean r2 = r5 instanceof com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState.Onboarded
            if (r2 == 0) goto L55
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState$Onboarded r5 = (com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState.Onboarded) r5
            com.revolut.feature.freelancer.common.models.FreelancerAccountDetails r5 = r5.f73273a
            com.revolut.feature.freelancer.common.models.FreelancerPermissions r5 = r5.f73270b
            boolean r5 = r5.f73321a
            goto L5c
        L55:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L5b:
            r5 = r3
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.v = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L69
            return r1
        L69:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object m(Object obj2, Continuation continuation) {
        Object objA;
        return (((Boolean) obj2).booleanValue() || (objA = h.a((h) this.f112775b, (c0) this.f112776c, continuation)) != fim.a.COROUTINE_SUSPENDED) ? Unit.f186387a : objA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r2.emit(r11, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof fhf.h
            if (r0 == 0) goto L13
            r0 = r11
            fhf.h r0 = (fhf.h) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            fhf.h r0 = new fhf.h
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r11)
            goto L8f
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            int r10 = r0.f135221y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f135220x
            yhm.o.b(r11)
            goto L77
        L3b:
            yhm.o.b(r11)
            java.lang.Object r11 = r9.f112775b
            r2 = r11
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            tof.a3 r10 = (tof.a3) r10
            r11 = 0
            if (r10 == 0) goto L80
            tof.x6 r10 = r10.I
            tof.e3 r10 = r10.d
            if (r10 == 0) goto L80
            java.lang.String r10 = r10.f272726a
            if (r10 == 0) goto L80
            java.lang.Object r6 = r9.f112776c
            fhf.j r6 = (fhf.j) r6
            d3j.b r6 = r6.f135224q
            w4l.h r7 = w4l.h.f294642c
            efm.r r10 = r6.j(r10, r7)
            efm.d0 r10 = r10.firstOrError()
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r6)
            r0.f135220x = r2
            r0.f135221y = r11
            r0.v = r3
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L74
            goto L8e
        L74:
            r8 = r11
            r11 = r10
            r10 = r8
        L77:
            com.revolut.data.model.Data r11 = (com.revolut.data.model.Data) r11
            java.lang.Object r11 = r11.getContent()
            f5j.a r11 = (f5j.a) r11
            goto L82
        L80:
            r10 = r11
            r11 = r5
        L82:
            r0.f135220x = r5
            r0.f135221y = r10
            r0.v = r4
            java.lang.Object r10 = r2.emit(r11, r0)
            if (r10 != r1) goto L8f
        L8e:
            return r1
        L8f:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.o(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r2.emit(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof fq.f
            if (r0 == 0) goto L13
            r0 = r8
            fq.f r0 = (fq.f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            fq.f r0 = new fq.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L65
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            int r7 = r0.f137146y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f137145x
            yhm.o.b(r8)
            goto L57
        L3a:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f112775b
            r2 = r8
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            k01.e r7 = (k01.e) r7
            java.lang.Object r8 = r6.f112776c
            k01.l r8 = (k01.l) r8
            r0.f137145x = r2
            r5 = 0
            r0.f137146y = r5
            r0.v = r4
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L56
            goto L64
        L56:
            r7 = r5
        L57:
            r4 = 0
            r0.f137145x = r4
            r0.f137146y = r7
            r0.v = r3
            java.lang.Object r7 = r2.emit(r8, r0)
            if (r7 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.p(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.q(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof fv6.q
            if (r0 == 0) goto L13
            r0 = r7
            fv6.q r0 = (fv6.q) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            fv6.q r0 = new fv6.q
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L61
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f112775b
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            r2 = r6
            com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery r2 = (com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery) r2
            java.lang.Object r4 = r5.f112776c
            com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b r4 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b) r4
            cli.y r4 = r4.f73736s
            java.lang.Object r4 = r4.f22677a
            vkm.j2 r4 = (vkm.j2) r4
            java.lang.Object r4 = r4.getValue()
            fv6.g r4 = (fv6.g) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L61
            java.lang.String r2 = r2.f73370a
            if (r2 == 0) goto L61
            boolean r2 = kotlin.text.d0.W(r2)
            if (r2 == 0) goto L58
            goto L61
        L58:
            r0.v = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.r(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0b57  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:561:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:573:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r63, kotlin.coroutines.Continuation r64) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

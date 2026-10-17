package p72;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import r10.t;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements d12.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l72.e f233524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f233525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l72.f f233526c;
    public final l72.c d;
    public final m72.a e;

    public g(l72.e interactor, t multibancoErrorProvider, l72.f pendingPaymentsInteractor, l72.c cardInteractor, m72.a sdkInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(multibancoErrorProvider, "multibancoErrorProvider");
        Intrinsics.checkNotNullParameter(pendingPaymentsInteractor, "pendingPaymentsInteractor");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        Intrinsics.checkNotNullParameter(sdkInteractor, "sdkInteractor");
        this.f233524a = interactor;
        this.f233525b = multibancoErrorProvider;
        this.f233526c = pendingPaymentsInteractor;
        this.d = cardInteractor;
        this.e = sdkInteractor;
    }

    @Override // d12.b
    public final z a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        z zVarE = this.f233525b.e(throwable);
        return zVarE != null ? zVarE : new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    @Override // d12.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p72.g.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p72.b
            if (r0 == 0) goto L13
            r0 = r5
            p72.b r0 = (p72.b) r0
            int r1 = r0.f233513w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233513w = r1
            goto L18
        L13:
            p72.b r0 = new p72.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233513w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f233513w = r3
            l72.f r5 = r4.f233526c
            a72.f r5 = r5.f192509a
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = zhm.d0.d0(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p72.g.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(h02.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p72.c
            if (r0 == 0) goto L13
            r0 = r6
            p72.c r0 = (p72.c) r0
            int r1 = r0.f233515x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233515x = r1
            goto L18
        L13:
            p72.c r0 = new p72.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233515x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            h02.c r5 = r0.u
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f233515x = r3
            m72.a r6 = r4.e
            m72.k r6 = (m72.k) r6
            x92.j r6 = r6.f203294a
            java.lang.String r2 = r5.f148181b
            java.lang.String r3 = r5.f148182c
            java.lang.Object r6 = r6.i(r2, r3, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            z92.d r6 = (z92.d) r6
            boolean r0 = r6 instanceof z92.c
            if (r0 == 0) goto L52
            java.lang.String r5 = r5.f148180a
            return r5
        L52:
            boolean r5 = r6 instanceof z92.a
            r0 = 0
            if (r5 == 0) goto L68
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "No PendingPayment found in the SDK"
            r5.<init>(r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r0, r0, r5, r6)
            return r0
        L68:
            boolean r5 = r6 instanceof z92.b
            if (r5 == 0) goto L7a
            z92.b r6 = (z92.b) r6
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError r5 = r6.f320299a
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r0, r0, r5, r6)
            return r0
        L7a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p72.g.d(h02.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus.Registered r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p72.e
            if (r0 == 0) goto L13
            r0 = r6
            p72.e r0 = (p72.e) r0
            int r1 = r0.f233520x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233520x = r1
            goto L18
        L13:
            p72.e r0 = new p72.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233520x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus$Registered r5 = r0.u
            yhm.o.b(r6)
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f233520x = r3
            m72.a r6 = r4.e
            m72.k r6 = (m72.k) r6
            e8.r r6 = r6.f203298h
            kotlin.reflect.KProperty[] r2 = m72.k.i
            r3 = 0
            r2 = r2[r3]
            java.lang.Object r6 = r6.b(r2)
            kotlinx.coroutines.flow.MutableSharedFlow r6 = (kotlinx.coroutines.flow.MutableSharedFlow) r6
            java.lang.Object r6 = r6.emit(r5, r0)
            if (r6 != r1) goto L50
            goto L52
        L50:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L52:
            if (r6 != r1) goto L55
            return r1
        L55:
            p72.a r6 = new p72.a
            r0 = 0
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p72.g.e(com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus$Registered, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus.Registered r7, h02.c r8, gim.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p72.f
            if (r0 == 0) goto L13
            r0 = r9
            p72.f r0 = (p72.f) r0
            int r1 = r0.f233523y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233523y = r1
            goto L18
        L13:
            p72.f r0 = new p72.f
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f233521w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233523y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus$Registered r7 = r0.u
            yhm.o.b(r9)
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            h02.c r8 = r0.v
            com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus$Registered r7 = r0.u
            yhm.o.b(r9)
            goto L50
        L3c:
            yhm.o.b(r9)
            r0.u = r7
            r0.v = r8
            r0.f233523y = r4
            m72.a r9 = r6.e
            m72.k r9 = (m72.k) r9
            java.lang.Object r9 = r9.a(r7, r0)
            if (r9 != r1) goto L50
            goto L63
        L50:
            z92.j r9 = (z92.j) r9
            boolean r2 = r9 instanceof z92.h
            r4 = 0
            if (r2 != 0) goto L6c
            r0.u = r7
            r0.v = r4
            r0.f233523y = r3
            java.lang.Object r9 = r6.d(r8, r0)
            if (r9 != r1) goto L64
        L63:
            return r1
        L64:
            java.lang.String r9 = (java.lang.String) r9
            p72.a r8 = new p72.a
            r8.<init>(r7, r9)
            return r8
        L6c:
            z92.h r9 = (z92.h) r9
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError r7 = r9.f320305a
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = r7.getF62689a()
            java.lang.String r0 = r7.getF62691c()
            java.lang.String r1 = r7.getD()
            java.lang.String r2 = ", code="
            java.lang.String r3 = ", reason="
            java.lang.String r5 = "MbWayInitResult Error: operation="
            java.lang.StringBuilder r9 = v0.a.m(r5, r9, r2, r0, r3)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p72.g.f(com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus$Registered, h02.c, gim.c):java.lang.Object");
    }
}

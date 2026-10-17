package qh2;

import e8.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements eh2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f246445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f246446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nh2.e f246447c;
    public final vz1.j d;
    public final r e;
    public static final /* synthetic */ KProperty[] f = {o0.f186429a.j(new h0(o.class, "statusCheckTriggerFlow", "getStatusCheckTriggerFlow()Lkotlinx/coroutines/flow/MutableSharedFlow;", 0))};

    @NotNull
    public static final i Companion = new i();

    public o(uw1.c featureChecker, a interactor, nh2.e keyProvider, vz1.j preferencesRepository, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f246445a = featureChecker;
        this.f246446b = interactor;
        this.f246447c = keyProvider;
        this.d = preferencesRepository;
        this.e = new r((Function0) new qba.b(coroutineScope, this, 11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r12.e(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        if (r12.e(r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(qh2.o r12, gim.c r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof qh2.m
            if (r0 == 0) goto L13
            r0 = r13
            qh2.m r0 = (qh2.m) r0
            int r1 = r0.f246443x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246443x = r1
            goto L18
        L13:
            qh2.m r0 = new qh2.m
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f246443x
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L47
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r13)
            goto Lb8
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            boolean r2 = r0.u
            yhm.o.b(r13)
            goto L94
        L3f:
            yhm.o.b(r13)
            goto L79
        L43:
            yhm.o.b(r13)
            goto L57
        L47:
            yhm.o.b(r13)
            nh2.e r13 = r12.f246447c
            r0.f246443x = r6
            com.revolut.feature.apm.core.impl.crypto.o r13 = r13.f215296a
            java.lang.Object r13 = r13.e(r0)
            if (r13 != r1) goto L57
            goto Lb7
        L57:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r2 = r13.booleanValue()
            if (r2 != 0) goto L7c
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r6 = rd0.c.DEBUG
            r10 = 0
            r11 = 16
            java.lang.String r7 = "WeroStatusChecker"
            java.lang.String r8 = "No previous keys - check wero status"
            r9 = 0
            rd0.d.b(r6, r7, r8, r9, r10, r11)
            r0.u = r2
            r0.f246443x = r5
            java.lang.Object r12 = r12.e(r0)
            if (r12 != r1) goto L79
            goto Lb7
        L79:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L7c:
            vz1.j r13 = r12.d
            r0.u = r2
            r0.f246443x = r4
            vz1.i r4 = new vz1.i
            r5 = 0
            r6 = 0
            r4.<init>(r13, r6, r5)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r4, r0)
            if (r13 != r1) goto L94
            goto Lb7
        L94:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r4 = "ACTIVE"
            boolean r13 = kotlin.jvm.internal.Intrinsics.f(r13, r4)
            if (r13 != 0) goto Lbb
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r4 = rd0.c.DEBUG
            r8 = 0
            r9 = 16
            java.lang.String r5 = "WeroStatusChecker"
            java.lang.String r6 = "No wero status stored locally - check wero status on BE"
            r7 = 0
            rd0.d.b(r4, r5, r6, r7, r8, r9)
            r0.u = r2
            r0.f246443x = r3
            java.lang.Object r12 = r12.e(r0)
            if (r12 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        Lbb:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qh2.o.a(qh2.o, gim.c):java.lang.Object");
    }

    public final Object b(gim.c cVar) throws Throwable {
        vz1.i iVar = new vz1.i(this.d, null, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, iVar, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (b(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (d(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.NotRegistered r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof qh2.j
            if (r0 == 0) goto L13
            r0 = r8
            qh2.j r0 = (qh2.j) r0
            int r1 = r0.f246439w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246439w = r1
            goto L18
        L13:
            qh2.j r0 = new qh2.j
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f246439w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L92
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L7e
        L39:
            yhm.o.b(r8)
            goto L6b
        L3d:
            yhm.o.b(r8)
            java.util.List r7 = r7.getTerms()
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L5e
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r0 = rd0.c.DEBUG
            r4 = 0
            r5 = 16
            java.lang.String r1 = "WeroStatusChecker"
            java.lang.String r2 = "Cannot silently register wero - user must accept terms"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L5e:
            r0.f246439w = r5
            qh2.a r7 = r6.f246446b
            qh2.h r7 = (qh2.h) r7
            java.lang.Object r8 = r7.f(r0)
            if (r8 != r1) goto L6b
            goto L91
        L6b:
            i02.h r8 = (i02.h) r8
            i02.f r7 = i02.f.f157280a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r7 == 0) goto L81
            r0.f246439w = r4
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r1) goto L7e
            goto L91
        L7e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L81:
            i02.g r7 = i02.g.f157281a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r7 == 0) goto L95
            r0.f246439w = r3
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r1) goto L92
        L91:
            return r1
        L92:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L95:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qh2.o.c(com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus$NotRegistered, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (b(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof qh2.k
            if (r0 == 0) goto L13
            r0 = r9
            qh2.k r0 = (qh2.k) r0
            int r1 = r0.f246440w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246440w = r1
            goto L18
        L13:
            qh2.k r0 = new qh2.k
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f246440w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L7c
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            yhm.o.b(r9)
            goto L67
        L37:
            yhm.o.b(r9)
            qh2.a r9 = r8.f246446b
            qh2.h r9 = (qh2.h) r9
            qd8.e r2 = new qd8.e
            r6 = 4
            r2.<init>(r9, r5, r6)
            vkm.v1 r6 = new vkm.v1
            r6.<init>(r2)
            q7b.j r2 = new q7b.j
            r7 = 15
            r2.<init>(r5, r9, r7)
            wkm.l r9 = vkm.q.Q(r6, r2)
            hr4.b r2 = new hr4.b
            r6 = 3
            r2.<init>(r6, r7, r5)
            vkm.v1 r9 = vkm.q.R(r9, r2)
            r0.f246440w = r4
            java.lang.Object r9 = vkm.q.E(r9, r0)
            if (r9 != r1) goto L67
            goto L7b
        L67:
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            java.lang.Object r9 = r9.getContent()
            com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus r9 = (com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus) r9
            boolean r2 = r9 instanceof com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.Active
            if (r2 == 0) goto L7f
            r0.f246440w = r3
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L7f:
            boolean r0 = r9 instanceof com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.NotRegistered
            if (r0 == 0) goto L94
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Polling WeroStatus in background finished with unsupported state: NotRegistered"
            r9.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r5, r5, r9, r0)
            goto Lbb
        L94:
            boolean r0 = r9 instanceof com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.Pending
            if (r0 == 0) goto La9
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Polling WeroStatus in background finished with unsupported state: Pending"
            r9.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r5, r5, r9, r0)
            goto Lbb
        La9:
            if (r9 != 0) goto Lbe
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Polling WeroStatus in background finished with unsupported state: null"
            r9.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r5, r5, r9, r0)
        Lbb:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lbe:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qh2.o.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (b(r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (d(r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        if (c((com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.NotRegistered) r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof qh2.n
            if (r0 == 0) goto L13
            r0 = r8
            qh2.n r0 = (qh2.n) r0
            int r1 = r0.f246444w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246444w = r1
            goto L18
        L13:
            qh2.n r0 = new qh2.n
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f246444w
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            yhm.o.b(r8)
            goto L85
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            yhm.o.b(r8)
            goto L73
        L3c:
            yhm.o.b(r8)
            goto L63
        L40:
            yhm.o.b(r8)
            goto L54
        L44:
            yhm.o.b(r8)
            r0.f246444w = r6
            qh2.a r8 = r7.f246446b
            qh2.h r8 = (qh2.h) r8
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L54
            goto L84
        L54:
            com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus r8 = (com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus) r8
            boolean r2 = r8 instanceof com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.Active
            if (r2 == 0) goto L66
            r0.f246444w = r5
            java.lang.Object r8 = r7.b(r0)
            if (r8 != r1) goto L63
            goto L84
        L63:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L66:
            boolean r2 = r8 instanceof com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.Pending
            if (r2 == 0) goto L76
            r0.f246444w = r4
            java.lang.Object r8 = r7.d(r0)
            if (r8 != r1) goto L73
            goto L84
        L73:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L76:
            boolean r2 = r8 instanceof com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.NotRegistered
            if (r2 == 0) goto L88
            com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus$NotRegistered r8 = (com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.NotRegistered) r8
            r0.f246444w = r3
            java.lang.Object r8 = r7.c(r8, r0)
            if (r8 != r1) goto L85
        L84:
            return r1
        L85:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L88:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qh2.o.e(gim.c):java.lang.Object");
    }
}

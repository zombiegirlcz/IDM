package de9;

import com.revolut.data.model.Data;
import com.revolut.feature.passcode.PasscodeScreenContract$HeaderMode;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends jki.g implements n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PasscodeScreenContract$InputData f113340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final oe9.a f113341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fe9.h f113342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ie9.d f113343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wl0.c f113344t;
    public final io.c u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1 f113345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f113346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h f113347y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(PasscodeScreenContract$InputData inputData, oe9.a passcodeVerificationObservable, fe9.h biometricPromptControllerModelExtension, ie9.d passcodeLockRepository, wl0.c biometricHelper, io.c appStartupTracker, b passcodeDependenciesProvider, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(passcodeVerificationObservable, "passcodeVerificationObservable");
        Intrinsics.checkNotNullParameter(biometricPromptControllerModelExtension, "biometricPromptControllerModelExtension");
        Intrinsics.checkNotNullParameter(passcodeLockRepository, "passcodeLockRepository");
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(appStartupTracker, "appStartupTracker");
        Intrinsics.checkNotNullParameter(passcodeDependenciesProvider, "passcodeDependenciesProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f113340p = inputData;
        this.f113341q = passcodeVerificationObservable;
        this.f113342r = biometricPromptControllerModelExtension;
        this.f113343s = passcodeLockRepository;
        this.f113344t = biometricHelper;
        this.u = appStartupTracker;
        this.v = passcodeDependenciesProvider;
        this.f113345w = vkm.q.b(1, 5, null);
        this.f113347y = new h("", 0L, false, new Data(null, null, false, 7, null), inputData.f78620a.getF78619a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r10 == r4) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(de9.x r9, gim.c r10) throws java.lang.Throwable {
        /*
            fe9.h r0 = r9.f113342r
            ie9.d r1 = r9.f113343s
            com.revolut.feature.passcode.PasscodeScreenContract$InputData r2 = r9.f113340p
            boolean r3 = r10 instanceof de9.s
            if (r3 == 0) goto L19
            r3 = r10
            de9.s r3 = (de9.s) r3
            int r4 = r3.f113336w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f113336w = r4
            goto L1e
        L19:
            de9.s r3 = new de9.s
            r3.<init>(r9, r10)
        L1e:
            java.lang.Object r10 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f113336w
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L3d
            if (r5 == r8) goto L39
            if (r5 != r6) goto L31
            yhm.o.b(r10)
            goto L6c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            yhm.o.b(r10)
            goto L50
        L3d:
            yhm.o.b(r10)
            boolean r10 = r2.f78622c
            if (r10 == 0) goto L76
            r3.f113336w = r8
            r10 = r1
            ie9.h r10 = (ie9.h) r10
            java.lang.Object r10 = r10.b(r3)
            if (r10 != r4) goto L50
            goto L6b
        L50:
            boolean r10 = r10 instanceof ie9.b
            if (r10 != 0) goto L74
            r3.f113336w = r6
            ie9.h r1 = (ie9.h) r1
            r1.getClass()
            ie9.g r10 = new ie9.g
            r5 = 0
            r10.<init>(r1, r5, r7)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r1, r10, r3)
            if (r10 != r4) goto L6c
        L6b:
            return r4
        L6c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L76
        L74:
            r10 = r8
            goto L77
        L76:
            r10 = r7
        L77:
            jki.i r1 = r9.t2()
            de9.h r1 = (de9.h) r1
            com.revolut.data.model.Data r1 = r1.d
            java.lang.Object r1 = r1.getContent()
            oe9.d r3 = oe9.d.f224567a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L9b
            jki.i r1 = r9.t2()
            de9.h r1 = (de9.h) r1
            com.revolut.data.model.Data r1 = r1.d
            boolean r1 = r1.getLoading()
            if (r1 != 0) goto L9b
            r1 = r8
            goto L9c
        L9b:
            r1 = r7
        L9c:
            if (r10 == 0) goto La7
            fe9.f r9 = new fe9.f
            r9.<init>(r6)
            r0.d3(r9)
            goto Lc5
        La7:
            if (r1 == 0) goto Lc5
            com.revolut.feature.passcode.PasscodeScreenContract$VerificationMode r10 = r2.f78626l
            boolean r10 = r10.getF78629a()
            if (r10 == 0) goto Lc0
            wl0.c r9 = r9.f113344t
            rm0.j r9 = r9.c()
            rm0.d r10 = rm0.d.f255149a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lc0
            r7 = r8
        Lc0:
            boolean r9 = r2.f78623g
            r0.e3(r7, r9)
        Lc5:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: de9.x.y2(de9.x, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(de9.x r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof de9.t
            if (r0 == 0) goto L13
            r0 = r5
            de9.t r0 = (de9.t) r0
            int r1 = r0.f113337w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113337w = r1
            goto L18
        L13:
            de9.t r0 = new de9.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113337w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.passcode.PasscodeScreenContract$InputData r5 = r4.f113340p
            boolean r5 = r5.f78622c
            if (r5 != 0) goto L3b
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L3b:
            ie9.d r5 = r4.f113343s
            r0.f113337w = r3
            ie9.h r5 = (ie9.h) r5
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            ie9.c r5 = (ie9.c) r5
            boolean r0 = r5 instanceof ie9.b
            if (r0 == 0) goto L6a
            jki.i r0 = r4.t2()
            de9.h r0 = (de9.h) r0
            boolean r0 = r0.f113324c
            if (r0 != 0) goto L6a
            ie9.b r5 = (ie9.b) r5
            long r0 = r5.f160674a
            r4.A2(r0)
            fe9.h r4 = r4.f113342r
            fe9.f r5 = new fe9.f
            r0 = 2
            r5.<init>(r0)
            r4.d3(r5)
        L6a:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: de9.x.z2(de9.x, gim.c):java.lang.Object");
    }

    public final void A2(long j2) {
        a2 a2Var = this.f113346x;
        if (a2Var == null || !a2Var.d()) {
            this.f113346x = yji.l.a1(this, new vkm.t(ta6.a.H(j2, 1000L, TimeUnit.MILLISECONDS), new awd.b(this, (Continuation) null, 27)), null, null, new u(this, null), 3);
        }
    }

    @Override // yji.l
    public final void I1() throws Throwable {
        yji.l.a1(this, this.f113341q.f224564a, null, null, new v(this, null), 3);
        if (this.f113340p.f78620a instanceof PasscodeScreenContract$HeaderMode.Dynamic) {
            this.v.a();
            hx7.e.n(new IllegalStateException("Header mode is dynamic, but header provider is missing"));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        n2(new w(this, continuation, 0), new whi.b(6));
        n2(new w(this, continuation, 1), new whi.b(6));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f113347y;
    }
}

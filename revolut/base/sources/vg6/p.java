package vg6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe6.a f288779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f288780b;

    public p(oe6.a externalInstitutionsInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f288779a = externalInstitutionsInteractor;
        this.f288780b = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vg6.m
            if (r0 == 0) goto L13
            r0 = r6
            vg6.m r0 = (vg6.m) r0
            int r1 = r0.f288775x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288775x = r1
            goto L18
        L13:
            vg6.m r0 = new vg6.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288775x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.u
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L29
            goto L4f
        L29:
            r6 = move-exception
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            oe6.a r6 = r4.f288779a     // Catch: java.lang.Exception -> L29
            w4l.j r2 = w4l.j.f294644c     // Catch: java.lang.Exception -> L29
            xg6.j r6 = (xg6.j) r6     // Catch: java.lang.Exception -> L29
            efm.d0 r6 = r6.d(r5, r2)     // Catch: java.lang.Exception -> L29
            rfm.f0 r6 = zi0.c.t(r6)     // Catch: java.lang.Exception -> L29
            r0.u = r5     // Catch: java.lang.Exception -> L29
            r0.f288775x = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = nim.a.b(r6, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L4f
            return r1
        L4f:
            com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution r6 = (com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution) r6     // Catch: java.lang.Exception -> L29
            java.lang.String r6 = r6.f66108b     // Catch: java.lang.Exception -> L29
            goto L5f
        L54:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
            r6 = r2
        L5f:
            if (r6 != 0) goto L62
            goto L63
        L62:
            r5 = r6
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vg6.p.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:32|(1:105)|33|34|87|35|36|91|37|38|95|39|40|103|41|42|85|43|44|89|45|46|97|47|(5:50|101|51|52|(1:75)(2:76|(4:79|14|80|(1:81)(0))))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0143, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        r6 = r10;
        r10 = r12;
        r12 = r9;
        r9 = r11;
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014b, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014e, code lost:
    
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0151, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0152, code lost:
    
        r11 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0155, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
    
        r12 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0159, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015a, code lost:
    
        r13 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015e, code lost:
    
        r9 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x019b -> B:14:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vg6.p.b(java.lang.String, gim.c):java.lang.Object");
    }
}

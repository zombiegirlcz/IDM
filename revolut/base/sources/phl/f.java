package phl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f236348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hlm.c f236349b;

    static {
        Intrinsics.checkNotNullParameter("wealth_corporate_event_closed_banner_keys", "id");
    }

    public f(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f236348a = personalisationStorage;
        this.f236349b = hlm.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
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
    public final java.lang.Object a(java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "wealth_corporate_event_closed_banner_keys"
            mk0.a r1 = r10.f236348a
            boolean r2 = r12 instanceof phl.d
            if (r2 == 0) goto L17
            r2 = r12
            phl.d r2 = (phl.d) r2
            int r3 = r2.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.z = r3
            goto L1c
        L17:
            phl.d r2 = new phl.d
            r2.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r2.f236345x
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.z
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L4a
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L35
            hlm.a r11 = r2.v
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L32
            goto La4
        L32:
            r12 = move-exception
            goto Lac
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            int r11 = r2.f236344w
            hlm.a r4 = r2.v
            java.lang.String r6 = r2.u
            yhm.o.b(r12)
            r12 = r4
            r4 = r11
            r11 = r6
            goto L5f
        L4a:
            yhm.o.b(r12)
            r2.u = r11
            hlm.c r12 = r10.f236349b
            r2.v = r12
            r4 = 0
            r2.f236344w = r4
            r2.z = r6
            java.lang.Object r6 = r12.lock(r7, r2)
            if (r6 != r3) goto L5f
            goto La2
        L5f:
            tk0.e r6 = new tk0.e     // Catch: java.lang.Throwable -> L6f
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r1.a(r6)     // Catch: java.lang.Throwable -> L6f
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L6f
            if (r6 != 0) goto L74
            zhm.f0 r6 = zhm.f0.f322471a     // Catch: java.lang.Throwable -> L6f
            goto L74
        L6f:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
            goto Lac
        L74:
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList r6 = zhm.d0.f1(r6)     // Catch: java.lang.Throwable -> L6f
            boolean r8 = r6.contains(r11)     // Catch: java.lang.Throwable -> L6f
            if (r8 != 0) goto L83
            r6.add(r11)     // Catch: java.lang.Throwable -> L6f
        L83:
            int r11 = r6.size()     // Catch: java.lang.Throwable -> L6f
            r8 = 500(0x1f4, float:7.0E-43)
            if (r11 <= r8) goto L8f
            java.util.List r6 = zhm.d0.W0(r8, r6)     // Catch: java.lang.Throwable -> L6f
        L8f:
            tk0.e r11 = new tk0.e     // Catch: java.lang.Throwable -> L6f
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            r2.u = r7     // Catch: java.lang.Throwable -> L6f
            r2.v = r12     // Catch: java.lang.Throwable -> L6f
            r2.f236344w = r4     // Catch: java.lang.Throwable -> L6f
            r2.z = r5     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r11 = r1.e(r11, r6, r2)     // Catch: java.lang.Throwable -> L6f
            if (r11 != r3) goto La3
        La2:
            return r3
        La3:
            r11 = r12
        La4:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L32
            r11.unlock(r7)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        Lac:
            r11.unlock(r7)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: phl.f.a(java.lang.String, gim.c):java.lang.Object");
    }
}

package omg;

import ipa.j;
import ipa.k;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements hpa.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f226841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final emg.a f226842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zm0.c f226843c;

    public g(CoroutineScope scope, emg.a userChecklistInteractor, zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(userChecklistInteractor, "userChecklistInteractor");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f226841a = scope;
        this.f226842b = userChecklistInteractor;
        this.f226843c = sessionProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(omg.g r5, gim.c r6) {
        /*
            emg.a r0 = r5.f226842b
            boolean r1 = r6 instanceof omg.f
            if (r1 == 0) goto L15
            r1 = r6
            omg.f r1 = (omg.f) r1
            int r2 = r1.f226840w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f226840w = r2
            goto L1a
        L15:
            omg.f r1 = new omg.f
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f226840w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r6)
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            zm0.c r5 = r5.f226843c
            cn0.g r5 = (cn0.g) r5
            mm0.o r5 = r5.d()
            boolean r5 = r5 instanceof mm0.n
            if (r5 != 0) goto L48
            cmg.a r5 = cmg.a.RELOAD_AND_SHOW
            r0.b(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L48:
            r1.f226840w = r4
            java.lang.Object r6 = r0.g(r1)
            if (r6 != r2) goto L51
            return r2
        L51:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L5e
            cmg.a r5 = cmg.a.SHOW
            r0.b(r5)
        L5e:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: omg.g.a(omg.g, gim.c):java.lang.Object");
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i = 0;
        if (!Intrinsics.f(k.b(message), "fincrime_checklist")) {
            return false;
        }
        p0 p0Var = p0.f264001a;
        e0.C(this.f226841a, elm.f.f127540b, null, new e(this, null, i), 2);
        return true;
    }
}

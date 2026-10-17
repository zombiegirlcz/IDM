package wxl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f301014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hlm.c f301015b;

    static {
        Intrinsics.checkNotNullParameter("VIEWED_NUDGES", "id");
    }

    public d(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f301014a = personalisationStorage;
        this.f301015b = hlm.d.a();
    }

    @Override // wxl.a
    public final boolean a(String str) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-ui_kit-nudge-core-models-Nudge-Id$-nudgeId$0");
        List list = (List) kii.e.n("VIEWED_NUDGES", this.f301014a);
        if (list == null) {
            list = f0.f322471a;
        }
        return !list.contains(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (r1.e(r8, r11, r2) == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // wxl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "VIEWED_NUDGES"
            mk0.a r1 = r10.f301014a
            boolean r2 = r12 instanceof wxl.c
            if (r2 == 0) goto L17
            r2 = r12
            wxl.c r2 = (wxl.c) r2
            int r3 = r2.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.z = r3
            goto L1e
        L17:
            wxl.c r2 = new wxl.c
            gim.c r12 = (gim.c) r12
            r2.<init>(r10, r12)
        L1e:
            java.lang.Object r12 = r2.f301012x
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.z
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L4c
            if (r4 == r6) goto L3f
            if (r4 != r5) goto L37
            hlm.a r11 = r2.v
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L34
            goto L97
        L34:
            r12 = move-exception
            goto L9f
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            int r11 = r2.f301011w
            hlm.a r4 = r2.v
            java.lang.String r6 = r2.u
            yhm.o.b(r12)
            r12 = r4
            r4 = r11
            r11 = r6
            goto L61
        L4c:
            yhm.o.b(r12)
            r2.u = r11
            hlm.c r12 = r10.f301015b
            r2.v = r12
            r4 = 0
            r2.f301011w = r4
            r2.z = r6
            java.lang.Object r6 = r12.lock(r7, r2)
            if (r6 != r3) goto L61
            goto L95
        L61:
            tk0.e r6 = new tk0.e     // Catch: java.lang.Throwable -> L71
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r1.a(r6)     // Catch: java.lang.Throwable -> L71
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L71
            if (r6 != 0) goto L76
            zhm.f0 r6 = zhm.f0.f322471a     // Catch: java.lang.Throwable -> L71
            goto L76
        L71:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
            goto L9f
        L76:
            boolean r8 = r6.contains(r11)     // Catch: java.lang.Throwable -> L71
            if (r8 != 0) goto L96
            tk0.e r8 = new tk0.e     // Catch: java.lang.Throwable -> L71
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L71
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r11 = zhm.d0.F0(r11, r6)     // Catch: java.lang.Throwable -> L71
            r2.u = r7     // Catch: java.lang.Throwable -> L71
            r2.v = r12     // Catch: java.lang.Throwable -> L71
            r2.f301011w = r4     // Catch: java.lang.Throwable -> L71
            r2.z = r5     // Catch: java.lang.Throwable -> L71
            java.lang.Object r11 = r1.e(r8, r11, r2)     // Catch: java.lang.Throwable -> L71
            if (r11 != r3) goto L96
        L95:
            return r3
        L96:
            r11 = r12
        L97:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L34
            r11.unlock(r7)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L9f:
            r11.unlock(r7)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: wxl.d.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

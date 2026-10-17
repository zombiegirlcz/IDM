package ate;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final grb.a f9037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yse.e f9038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f9039c;

    public e(grb.a appTipsProvider, yse.e repository) {
        Intrinsics.checkNotNullParameter(appTipsProvider, "appTipsProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f9037a = appTipsProvider;
        this.f9038b = repository;
        this.f9039c = ta6.a.a(0);
    }

    public final cte.a a(String id10) {
        cte.a aVar;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(id10, "id");
        Iterator it8 = ((List) this.f9037a.f145960a.getValue()).iterator();
        do {
            aVar = null;
            if (!it8.hasNext()) {
                break;
            }
            cte.a aVarC = ((wse.a) it8.next()).c();
            if (aVarC.f108659a.equals(id10)) {
                aVar = aVarC;
            }
        } while (aVar == null);
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r5.f9039c.emit(r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ate.c
            if (r0 == 0) goto L13
            r0 = r7
            ate.c r0 = (ate.c) r0
            int r1 = r0.f9033x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9033x = r1
            goto L18
        L13:
            ate.c r0 = new ate.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f9033x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4d
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f9033x = r4
            yse.e r7 = r5.f9038b
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 != r1) goto L48
            goto L4a
        L48:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L4a:
            if (r7 != r1) goto L4d
            goto L5a
        L4d:
            r7 = 0
            r0.u = r7
            r0.f9033x = r3
            vkm.z1 r7 = r5.f9039c
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ate.e.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r3.c(r5, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ate.d
            if (r0 == 0) goto L13
            r0 = r12
            ate.d r0 = (ate.d) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ate.d r0 = new ate.d
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f9035x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            yse.e r3 = r10.f9038b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L2e
            goto L9f
        L2e:
            r11 = move-exception
            goto La2
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            int r11 = r0.f9034w
            int r2 = r0.v
            java.util.ArrayList r5 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L2e
            goto L62
        L43:
            yhm.o.b(r12)
            grb.a r12 = r10.f9037a     // Catch: java.lang.Exception -> L2e
            java.util.ArrayList r11 = r12.b(r11)     // Catch: java.lang.Exception -> L2e
            kotlinx.coroutines.flow.Flow r12 = r3.a()     // Catch: java.lang.Exception -> L2e
            r0.u = r11     // Catch: java.lang.Exception -> L2e
            r2 = 0
            r0.v = r2     // Catch: java.lang.Exception -> L2e
            r0.f9034w = r2     // Catch: java.lang.Exception -> L2e
            r0.z = r5     // Catch: java.lang.Exception -> L2e
            java.lang.Object r12 = vkm.q.x(r12, r0)     // Catch: java.lang.Exception -> L2e
            if (r12 != r1) goto L60
            goto L9e
        L60:
            r5 = r11
            r11 = r2
        L62:
            com.revolut.data.model.Data r12 = (com.revolut.data.model.Data) r12     // Catch: java.lang.Exception -> L2e
            java.lang.Object r12 = r12.getContent()     // Catch: java.lang.Exception -> L2e
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Exception -> L2e
            if (r12 != 0) goto L6d
            goto L90
        L6d:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2e
            r7.<init>()     // Catch: java.lang.Exception -> L2e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L2e
        L76:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Exception -> L2e
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Exception -> L2e
            r9 = r8
            cte.a r9 = (cte.a) r9     // Catch: java.lang.Exception -> L2e
            java.lang.String r9 = r9.f108659a     // Catch: java.lang.Exception -> L2e
            boolean r9 = r12.contains(r9)     // Catch: java.lang.Exception -> L2e
            if (r9 != 0) goto L76
            r7.add(r8)     // Catch: java.lang.Exception -> L2e
            goto L76
        L8f:
            r5 = r7
        L90:
            r0.u = r6     // Catch: java.lang.Exception -> L2e
            r0.v = r2     // Catch: java.lang.Exception -> L2e
            r0.f9034w = r11     // Catch: java.lang.Exception -> L2e
            r0.z = r4     // Catch: java.lang.Exception -> L2e
            java.lang.Object r11 = r3.c(r5, r0)     // Catch: java.lang.Exception -> L2e
            if (r11 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2e
            goto Lab
        La2:
            zhm.h0 r12 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r6, r6, r11, r12)
        Lab:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ate.e.c(java.lang.String, gim.c):java.lang.Object");
    }
}

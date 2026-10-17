package ami;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f6458a;

    public n(d4m.a documentScannerLazy, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(documentScannerLazy, "documentScannerLazy");
                this.f6458a = documentScannerLazy;
                break;
            default:
                Intrinsics.checkNotNullParameter(documentScannerLazy, "featureGatewaysWrapper");
                this.f6458a = documentScannerLazy;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.app.Activity r5, s96.d r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof s96.e
            if (r0 == 0) goto L13
            r0 = r7
            s96.e r0 = (s96.e) r0
            int r1 = r0.f261118w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261118w = r1
            goto L18
        L13:
            s96.e r0 = new s96.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261118w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L4c
        L27:
            r5 = move-exception
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            d4m.a r7 = r4.f6458a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)     // Catch: java.lang.Throwable -> L27
            s96.a r7 = (s96.a) r7     // Catch: java.lang.Throwable -> L27
            r0.f261118w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r7.getStartScanIntent(r5, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L4c
            return r1
        L4c:
            android.content.IntentSender r7 = (android.content.IntentSender) r7     // Catch: java.lang.Throwable -> L27
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L57
        L51:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r5)
        L57:
            java.lang.Throwable r5 = yhm.m.a(r7)
            if (r5 == 0) goto L63
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L62
            goto L63
        L62:
            throw r5
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ami.n.a(android.app.Activity, s96.d, gim.c):java.lang.Object");
    }

    public awa.b b(zli.b deeplink) {
        awa.b bVar;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        nkm.g gVar = new nkm.g(y.n(d0.Q(((yhi.a) this.f6458a.get()).f314167a), m.f6457a));
        do {
            bVar = null;
            Object obj2 = null;
            if (!gVar.hasNext()) {
                break;
            }
            Iterator it8 = y0.b(((dwa.a) ((wli.p) gVar.next())).f120353a).iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                Set set = ((awa.b) next).f10755b;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it9 = set.iterator();
                    while (it9.hasNext()) {
                        if (hx7.l.s(deeplink, (String) it9.next()) != null) {
                            obj2 = next;
                            break;
                        }
                    }
                }
            }
            bVar = (awa.b) obj2;
        } while (bVar == null);
        return bVar;
    }
}

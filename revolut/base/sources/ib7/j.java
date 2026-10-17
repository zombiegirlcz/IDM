package ib7;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f160113a;

    public j(ImmutableMap mappers, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(mappers, "mappers");
                this.f160113a = mappers;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(mappers, "exitDelegates");
                this.f160113a = mappers;
                break;
            default:
                Intrinsics.checkNotNullParameter(mappers, "hiddenAccountsListItemMappers");
                this.f160113a = mappers;
                break;
        }
    }

    public k8b.a a(iel.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Object obj2 = this.f160113a.get(event.getClass());
        if (obj2 instanceof k8b.a) {
            return (k8b.a) obj2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(it3.d r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kz3.b
            if (r0 == 0) goto L13
            r0 = r7
            kz3.b r0 = (kz3.b) r0
            int r1 = r0.f191060w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191060w = r1
            goto L18
        L13:
            kz3.b r0 = new kz3.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191060w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            goto L4c
        L28:
            r6 = move-exception
            goto L50
        L2a:
            r6 = move-exception
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            java.util.Map r7 = r5.f160113a     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            ft3.j1 r2 = r6.f168328j     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r7 = r7.get(r2)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            lz3.a r7 = (lz3.a) r7     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            if (r7 == 0) goto L59
            r0.f191060w = r3     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r7 = r7.a(r6, r0)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            if (r7 != r1) goto L4c
            return r1
        L4c:
            aii.u r7 = (aii.u) r7     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r4 = r7
            goto L59
        L50:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r6, r7)
        L59:
            kz3.d r6 = new kz3.d
            r6.<init>(r4)
            return r6
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ib7.j.b(it3.d, gim.c):java.lang.Object");
    }

    public j(Map swipeableAssetTradeActionsProviders) {
        Intrinsics.checkNotNullParameter(swipeableAssetTradeActionsProviders, "swipeableAssetTradeActionsProviders");
        this.f160113a = swipeableAssetTradeActionsProviders;
    }
}

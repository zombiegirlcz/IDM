package uge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements wfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f280028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final she.g f280029b;

    public c(m navigator, she.g productAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        this.f280028a = navigator;
        this.f280029b = productAccountDestinationResolver;
    }

    public static ProductAccountDescriptor$Value.Main b(String str, String str2) {
        Object next;
        if (!d0.W(str) && !d0.W(str2)) {
            Iterator<E> it8 = ProductId.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((ProductId) next).getId(), str)) {
                    break;
                }
            }
            ProductId productId = (ProductId) next;
            if (productId != null) {
                return new ProductAccountDescriptor$Value.Main(new ProductAccountId(str2, null), productId);
            }
        }
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "home") && Intrinsics.f(cVar.e(2), "accounts");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof uge.b
            if (r0 == 0) goto L13
            r0 = r7
            uge.b r0 = (uge.b) r0
            int r1 = r0.f280027w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280027w = r1
            goto L1a
        L13:
            uge.b r0 = new uge.b
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280027w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r7)
            goto L52
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            r7 = 3
            java.lang.String r7 = r6.e(r7)
            r2 = 4
            java.lang.String r6 = r6.e(r2)
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r6 = b(r7, r6)
            if (r6 == 0) goto L5a
            r0.f280027w = r4
            zfe.f r7 = zfe.g.Companion
            she.g r7 = r5.f280029b
            java.lang.Object r7 = r7.c(r6, r3, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            com.revolut.kompot.common.ParcelableDestination r7 = (com.revolut.kompot.common.ParcelableDestination) r7
            q06.h r6 = new q06.h
            r6.<init>(r7, r3)
            return r6
        L5a:
            q06.i r6 = new q06.i
            q06.b r7 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.f160140a
            r7.<init>(r0, r3)
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uge.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new a(this, deeplink, null));
    }
}

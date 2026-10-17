package v9k;

import efm.d0;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import jf0.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q06.k;
import sri.m;
import to7.f;
import ue0.e;
import wp5.y;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements d, k {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f287075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9k.a f287076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa5.a f287077c;
    public final zm0.c d;

    public c(m navigator, x9k.a intercator, aa5.a navigationFactory, zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(intercator, "intercator");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f287075a = navigator;
        this.f287076b = intercator;
        this.f287077c = navigationFactory;
        this.d = sessionProvider;
    }

    public static z95.b b(jf0.c cVar) {
        String str = (String) r0.h("name", cVar.d);
        HashMap map = cVar.d;
        CharSequence charSequence = (CharSequence) r0.h("expirationDate", map);
        Object value = z9k.a.f320511a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        LocalDateTime localDateTime = LocalDateTime.parse(charSequence, (DateTimeFormatter) value);
        Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
        z95.b bVar = new z95.b(str, localDateTime, (String) r0.h("applicationId", map), z95.a.valueOf((String) r0.h("flowType", map)));
        if (localDateTime.isAfter(LocalDateTime.now())) {
            return bVar;
        }
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "credit") && Intrinsics.f(cVar.e(2), "onboarding_pcw");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof v9k.b
            if (r0 == 0) goto L13
            r0 = r8
            v9k.b r0 = (v9k.b) r0
            int r1 = r0.f287074w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f287074w = r1
            goto L1a
        L13:
            v9k.b r0 = new v9k.b
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f287074w
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r8)
            goto L7c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L6b
        L39:
            yhm.o.b(r8)
            zm0.c r8 = r6.d
            cn0.g r8 = (cn0.g) r8
            mm0.o r8 = r8.d()
            boolean r8 = r8 instanceof mm0.m
            if (r8 != 0) goto L49
            goto L5b
        L49:
            r8 = 4
            java.lang.String r8 = r7.e(r8)
            int r8 = r8.length()
            if (r8 <= 0) goto L55
            goto L5b
        L55:
            z95.b r7 = b(r7)
            if (r7 != 0) goto L5c
        L5b:
            return r5
        L5c:
            x9k.a r8 = r6.f287076b
            pfm.r r7 = r8.b(r7)
            r0.f287074w = r3
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L6b
            goto L7b
        L6b:
            aa5.a r7 = r6.f287077c
            y9k.b r7 = (y9k.b) r7
            ufm.i r7 = r7.a()
            r0.f287074w = r4
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r8)
            r0.<init>(r8)
            r7.<init>(r0, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v9k.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new f(this, deeplink, 13), 0);
        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
        return e.F(cVar, Boolean.TRUE);
    }
}

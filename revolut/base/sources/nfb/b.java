package nfb;

import ecm.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f214886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f214887b;

    public b(d4m.a userInteractor, q retailPreferencesInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(retailPreferencesInteractor, "retailPreferencesInteractor");
        this.f214886a = userInteractor;
        this.f214887b = retailPreferencesInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nfb.a
            if (r0 == 0) goto L13
            r0 = r6
            nfb.a r0 = (nfb.a) r0
            int r1 = r0.f214885w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214885w = r1
            goto L18
        L13:
            nfb.a r0 = new nfb.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214885w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L28
            goto L52
        L28:
            r6 = move-exception
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            d4m.a r6 = r5.f214886a     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L28
            ylg.b r6 = (ylg.b) r6     // Catch: java.lang.Throwable -> L28
            w4l.j r2 = w4l.j.f294644c     // Catch: java.lang.Throwable -> L28
            ang.f r6 = (ang.f) r6     // Catch: java.lang.Throwable -> L28
            akg.n r6 = r6.j(r2)     // Catch: java.lang.Throwable -> L28
            zfd.e r6 = zi0.c.w(r6)     // Catch: java.lang.Throwable -> L28
            r0.f214885w = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = vkm.q.z(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L52
            return r1
        L52:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L61
            java.lang.Object r6 = r6.getContent()     // Catch: java.lang.Throwable -> L28
            do3.n r6 = (do3.n) r6     // Catch: java.lang.Throwable -> L28
            goto L62
        L5d:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lbb
        L61:
            r6 = r3
        L62:
            ecm.q r0 = r5.f214887b
            java.lang.Object r0 = r0.f124861b
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            if (r6 == 0) goto L8f
            com.revolut.feature.address.models.Address r6 = r6.k
            if (r6 == 0) goto L8f
            java.lang.String r1 = r6.getCountry()
            boolean r1 = kotlin.text.d0.W(r1)
            if (r1 != 0) goto L79
            goto L7a
        L79:
            r6 = r3
        L7a:
            if (r6 == 0) goto L8f
            wi0.b r6 = nz8.d.g(r6)
            wi0.a r1 = wi0.b.Companion
            r1.getClass()
            wi0.b r1 = wi0.b.L0
            boolean r6 = r6.equals(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
        L8f:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r3, r6)
            java.lang.String r1 = "key"
            java.lang.String r2 = "REVOLUT_BANK_BRANDING_ENABLED"
            if (r6 == 0) goto Laa
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            android.content.SharedPreferences$Editor r6 = r0.edit()
            android.content.SharedPreferences$Editor r6 = r6.putBoolean(r2, r4)
            r6.apply()
            goto Lb8
        Laa:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            android.content.SharedPreferences$Editor r6 = r0.edit()
            android.content.SharedPreferences$Editor r6 = r6.remove(r2)
            r6.apply()
        Lb8:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        Lbb:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nfb.b.a(gim.c):java.lang.Object");
    }
}

package nfj;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.esim.impl.network.EsimEventsService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements q {

    @NotNull
    public static final r Companion = new r();
    public static final Type f = new TypeToken<List<? extends kfj.u>>() { // from class: com.revolut.retail.feature.esim.impl.repositories.EsimEventsRepositoryImpl$Companion$eventsDtoType$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimEventsService f215047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f215048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f215049c;
    public final dfj.k0 d;
    public final x4l.c e;

    public u(EsimEventsService service, ne0.j memoryCache, ue0.c storage, dfj.k0 esimInstallationStateInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        this.f215047a = service;
        this.f215048b = memoryCache;
        this.f215049c = storage;
        this.d = esimInstallationStateInteractor;
        Continuation continuation = null;
        this.e = new x4l.c(new mtj.k(this, continuation, 11), new l(this, 1), new n8i.e(this, 16), new naf.j(this, continuation, 10), new lp6.g(this, continuation, 22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (r9.f(r11, r6, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nfj.u r9, java.lang.String r10, gim.c r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof nfj.t
            if (r0 == 0) goto L16
            r0 = r11
            nfj.t r0 = (nfj.t) r0
            int r1 = r0.f215043x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f215043x = r1
            goto L1b
        L16:
            nfj.t r0 = new nfj.t
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215043x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r11)
            goto Lb6
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.String r10 = r0.u
            yhm.o.b(r11)
            goto L4c
        L3c:
            yhm.o.b(r11)
            dfj.k0 r11 = r9.d
            r0.u = r10
            r0.f215043x = r4
            java.lang.Object r11 = r11.a(r0)
            if (r11 != r1) goto L4c
            goto Lb5
        L4c:
            java.util.List r11 = (java.util.List) r11
            ne0.j r2 = r9.f215048b
            java.lang.String r4 = b(r11)
            java.lang.Object r2 = r2.get(r4)
            java.util.List r2 = (java.util.List) r2
            r4 = 0
            if (r2 != 0) goto L7c
            ue0.c r2 = r9.f215049c
            java.lang.String r5 = b(r11)
            java.lang.String r6 = "eventsDtoType"
            java.lang.reflect.Type r7 = nfj.u.f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            java.lang.Object r2 = r2.T2(r5, r7)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L77
            java.util.ArrayList r2 = knm.b.N(r2)
            goto L78
        L77:
            r2 = r4
        L78:
            if (r2 != 0) goto L7c
            zhm.f0 r2 = zhm.f0.f322471a
        L7c:
            r5 = r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L88:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto La1
            java.lang.Object r7 = r5.next()
            r8 = r7
            dej.n r8 = (dej.n) r8
            java.lang.String r8 = r8.f113592a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r10)
            if (r8 != 0) goto L88
            r6.add(r7)
            goto L88
        La1:
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto Lb9
            x4l.c r9 = r9.e
            r0.u = r4
            r0.f215043x = r3
            java.lang.Object r9 = r9.f(r11, r6, r0)
            if (r9 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lb9:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.u.a(nfj.u, java.lang.String, gim.c):java.lang.Object");
    }

    public static String b(List list) {
        return j6.a.q("KEY_EVENTS", zhm.d0.k0(list, "", null, null, 0, null, 62));
    }
}

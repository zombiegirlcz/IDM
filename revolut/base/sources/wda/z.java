package wda;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class z {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f296508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f296509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ze0.a f296510c;
    public final Lazy d;
    public final w4l.f e;

    public z(ue0.c storage, ne0.j memoryCache, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f296508a = storage;
        this.f296509b = memoryCache;
        this.f296510c = forceReloadStrategyFactory;
        this.d = yhm.j.b(new vt3.a(this, 18));
        w6b.a aVar = new w6b.a(26);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: wda.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f296501b;

            {
                this.f296501b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String storageKey = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
                        z zVar = this.f296501b;
                        if (((qe0.s) zVar.d.getValue()).a(storageKey + "_TS", true)) {
                            return null;
                        }
                        return (x) zVar.f296509b.get(storageKey);
                    default:
                        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
                        z zVar2 = this.f296501b;
                        if (((qe0.s) zVar2.d.getValue()).a(storageKey + "_TS", true)) {
                            return null;
                        }
                        return (x) j6.a.k(x.class, zVar2.f296508a, storageKey);
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: wda.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f296503b;

            {
                this.f296503b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String storageKey = (String) obj2;
                x snapshot = (x) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
                        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                        this.f296503b.f296509b.f(storageKey, snapshot);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
                        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                        this.f296503b.f296508a.G(snapshot, storageKey, wim.z.d(o0.b(x.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        this.e = new w4l.f(aVar, function1, function2, new Function1(this) { // from class: wda.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f296501b;

            {
                this.f296501b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String storageKey = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
                        z zVar = this.f296501b;
                        if (((qe0.s) zVar.d.getValue()).a(storageKey + "_TS", true)) {
                            return null;
                        }
                        return (x) zVar.f296509b.get(storageKey);
                    default:
                        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
                        z zVar2 = this.f296501b;
                        if (((qe0.s) zVar2.d.getValue()).a(storageKey + "_TS", true)) {
                            return null;
                        }
                        return (x) j6.a.k(x.class, zVar2.f296508a, storageKey);
                }
            }
        }, new Function2(this) { // from class: wda.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f296503b;

            {
                this.f296503b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String storageKey = (String) obj2;
                x snapshot = (x) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
                        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                        this.f296503b.f296509b.f(storageKey, snapshot);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
                        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                        this.f296503b.f296508a.G(snapshot, storageKey, wim.z.d(o0.b(x.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wda.y
            if (r0 == 0) goto L13
            r0 = r6
            wda.y r0 = (wda.y) r0
            int r1 = r0.f296507w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296507w = r1
            goto L18
        L13:
            wda.y r0 = new wda.y
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296507w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L65
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            w4l.f r6 = r4.e
            w4l.j r2 = w4l.j.f294644c
            efm.r r5 = r6.e(r5, r2)
            wd3.a r6 = new wd3.a
            r2 = 2
            r6.<init>(r2)
            efm.r r5 = nim.a.w(r5, r6)
            w6b.a r6 = new w6b.a
            r2 = 25
            r6.<init>(r2)
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r6, r3)
            wd3.a r6 = new wd3.a
            r2 = 3
            r6.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            efm.r r5 = ue0.e.H(r5, r2, r6)
            r0.f296507w = r3
            java.lang.Object r6 = nim.a.e(r5, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            java.util.Set r6 = (java.util.Set) r6
            if (r6 != 0) goto L6c
            zhm.h0 r5 = zhm.h0.f322473a
            return r5
        L6c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wda.z.a(java.lang.String, gim.c):java.lang.Object");
    }
}

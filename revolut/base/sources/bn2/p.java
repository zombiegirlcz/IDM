package bn2;

import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.backgroundpicker.api.model.ThemeAgnosticBackgroundKey;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km2.k f17033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final km2.i f17034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ekg.g f17035c;
    public final fn2.c d;

    public p(km2.k chosenBackgroundRepository, km2.i backgroundCatalogueRepository, ekg.g uiPersonalisationInteractor, fn2.c defaultBackgroundIdResolver, lm2.a storageScopeResolver) {
        Intrinsics.checkNotNullParameter(chosenBackgroundRepository, "chosenBackgroundRepository");
        Intrinsics.checkNotNullParameter(backgroundCatalogueRepository, "backgroundCatalogueRepository");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(defaultBackgroundIdResolver, "defaultBackgroundIdResolver");
        Intrinsics.checkNotNullParameter(storageScopeResolver, "storageScopeResolver");
        this.f17033a = chosenBackgroundRepository;
        this.f17034b = backgroundCatalogueRepository;
        this.f17035c = uiPersonalisationInteractor;
        this.d = defaultBackgroundIdResolver;
    }

    public static boolean k(BackgroundKey backgroundKey) throws Throwable {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (backgroundKey instanceof ThemeAgnosticBackgroundKey) {
            throw new IllegalArgumentException("Theme specific flow is not supported for this ThemeAgnosticBackgroundKey");
        }
        objA = Boolean.TRUE;
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        Boolean bool = (Boolean) objA;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(em2.e r5, com.revolut.feature.backgroundpicker.api.model.BackgroundKey r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof bn2.g
            if (r0 == 0) goto L13
            r0 = r7
            bn2.g r0 = (bn2.g) r0
            int r1 = r0.f17010w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17010w = r1
            goto L18
        L13:
            bn2.g r0 = new bn2.g
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17010w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            if (r5 == 0) goto L48
            com.revolut.feature.backgroundpicker.api.model.PersistedBackground r6 = new com.revolut.feature.backgroundpicker.api.model.PersistedBackground
            com.revolut.feature.backgroundpicker.api.model.ChosenBackground r7 = new com.revolut.feature.backgroundpicker.api.model.ChosenBackground
            java.lang.String r0 = r5.a()
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r5 = fm2.a.a(r5)
            r7.<init>(r0, r5)
            r5 = 0
            r6.<init>(r7, r5)
            return r6
        L48:
            r0.f17010w = r3
            java.lang.Object r7 = r4.b(r6, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            com.revolut.feature.backgroundpicker.api.model.ChosenBackground r7 = (com.revolut.feature.backgroundpicker.api.model.ChosenBackground) r7
            if (r7 != 0) goto L80
            km2.i r5 = r4.f17034b
            km2.u r5 = r5.f185695c
            kotlin.Lazy r5 = r5.f185709a
            java.lang.Object r5 = r5.getValue()
            java.util.Map r5 = (java.util.Map) r5
            java.util.Collection r5 = r5.values()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r5 = zhm.d0.a0(r5)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = zhm.d0.b0(r5)
            em2.e r5 = (em2.e) r5
            com.revolut.feature.backgroundpicker.api.model.ChosenBackground r7 = new com.revolut.feature.backgroundpicker.api.model.ChosenBackground
            java.lang.String r6 = r5.a()
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r5 = fm2.a.a(r5)
            r7.<init>(r6, r5)
        L80:
            com.revolut.feature.backgroundpicker.api.model.PersistedBackground r5 = new com.revolut.feature.backgroundpicker.api.model.PersistedBackground
            r5.<init>(r7, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.p.a(em2.e, com.revolut.feature.backgroundpicker.api.model.BackgroundKey, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.backgroundpicker.api.model.BackgroundKey r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bn2.h
            if (r0 == 0) goto L13
            r0 = r6
            bn2.h r0 = (bn2.h) r0
            int r1 = r0.f17014w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17014w = r1
            goto L18
        L13:
            bn2.h r0 = new bn2.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17014w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ekg.g r6 = r4.f17035c
            com.revolut.feature.uipersonalisation.api.models.AppTheme r6 = r6.j()
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r6 = r6.f94561a
            r0.f17014w = r3
            java.io.Serializable r6 = r4.j(r5, r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L48
            goto L5e
        L48:
            km2.i r5 = r4.f17034b
            em2.e r5 = r5.b(r6)
            if (r5 == 0) goto L5e
            com.revolut.feature.backgroundpicker.api.model.ChosenBackground r6 = new com.revolut.feature.backgroundpicker.api.model.ChosenBackground
            java.lang.String r0 = r5.a()
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r5 = fm2.a.a(r5)
            r6.<init>(r0, r5)
            return r6
        L5e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.p.b(com.revolut.feature.backgroundpicker.api.model.BackgroundKey, gim.c):java.lang.Object");
    }

    public final Object c(BackgroundKey key, gim.c cVar) {
        km2.j storageScope = lm2.a.a(key, this.f17035c.j().f94561a);
        km2.r rVar = (km2.r) this.f17033a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(storageScope, "storageScope");
        Map mapG = (Map) rVar.f185706b.h(new tk0.f(km2.m.a(km2.r.Companion, storageScope)));
        if (mapG == null) {
            mapG = r0.g();
        }
        String str = (String) mapG.get(key.b());
        return a(str != null ? this.f17034b.b(str) : null, key, cVar);
    }

    public final boolean d(GlobalThemeDeclaration theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        return ((km2.r) this.f17033a).a(m70.a.j(theme));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
    
        if (r1 == r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0112, code lost:
    
        if (r1 == r5) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.backgroundpicker.api.model.BackgroundKey r20, java.lang.String r21, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r22, gim.c r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.p.e(com.revolut.feature.backgroundpicker.api.model.BackgroundKey, java.lang.String, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, gim.c):java.lang.Object");
    }

    public final Object f(BackgroundKey backgroundKey, String str, gim.c cVar) throws Throwable {
        Object objE = e(backgroundKey, str, this.f17035c.j().f94561a, cVar);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }

    public final ahd.y g(BackgroundKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new ahd.y(new ba4.x(vkm.q.Q(mo3.a.g(this.f17035c.c(), null, new bk6.n(16), 1), new a32.b((Continuation) null, this, key, 10)), this, 5), this, key, 7);
    }

    public final ahd.y h(Set keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return new ahd.y(vkm.q.Q(mo3.a.g(this.f17035c.c(), null, new bk6.n(15), 1), new a32.b((Continuation) null, keys, this, 9)), keys, this, 8);
    }

    public final a83.j0 i(Set keys, GlobalThemeDeclaration theme) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(theme, "theme");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : keys) {
            if (k((BackgroundKey) obj2)) {
                arrayList.add(obj2);
            }
        }
        Set keys2 = zhm.d0.i1(arrayList);
        km2.j storageScope = m70.a.j(theme);
        km2.r rVar = (km2.r) this.f17033a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(keys2, "keys");
        Intrinsics.checkNotNullParameter(storageScope, "storageScope");
        return new a83.j0(new hy1.b0(rVar.b(storageScope), keys2, rVar, 18), 11);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(com.revolut.feature.backgroundpicker.api.model.BackgroundKey r5, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof bn2.o
            if (r0 == 0) goto L13
            r0 = r7
            bn2.o r0 = (bn2.o) r0
            int r1 = r0.f17032w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17032w = r1
            goto L18
        L13:
            bn2.o r0 = new bn2.o
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17032w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L43
        L27:
            r5 = move-exception
            goto L48
        L29:
            r5 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            fn2.c r7 = r4.d     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f17032w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r7.n(r5, r6, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L4e
        L48:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r5)
        L4e:
            java.lang.Throwable r5 = yhm.m.a(r7)
            if (r5 == 0) goto L57
            hx7.e.n(r5)
        L57:
            boolean r5 = r7 instanceof yhm.n
            if (r5 == 0) goto L5c
            r7 = 0
        L5c:
            return r7
        L5d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.p.j(com.revolut.feature.backgroundpicker.api.model.BackgroundKey, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, gim.c):java.io.Serializable");
    }
}

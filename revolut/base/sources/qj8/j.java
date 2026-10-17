package qj8;

import ald.n;
import ald.p;
import ald.q;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_profile.impl.services.JuniorProfileService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import skm.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorProfileService f246788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f246789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f246790c;
    public final CoroutineScope d;
    public final hlm.c e;
    public final hlm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f246791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f246792h;
    public final x4l.c i;

    public j(JuniorProfileService service, ne0.j memoryCache, ue0.c storage, CoroutineScope scope, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f246788a = service;
        this.f246789b = memoryCache;
        this.f246790c = storage;
        this.d = scope;
        this.e = hlm.d.a();
        this.f = hlm.d.a();
        b.Companion companion = kotlin.time.b.INSTANCE;
        final int i = 1;
        this.f246791g = ((ze0.c) forceReloadStrategyFactory).b(kotlin.time.b.f(kotlin.time.c.g(1, pkm.e.MINUTES)));
        Continuation continuation = null;
        final int i2 = 0;
        this.f246792h = new x4l.c(new n(this, continuation, 6), new Function1(this) { // from class: qj8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f246775b;

            {
                this.f246775b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String parentRegId = (String) obj2;
                        Intrinsics.checkNotNullParameter(parentRegId, "parentRegId");
                        return (List) this.f246775b.f246789b.get(e.a(j.Companion, parentRegId));
                    default:
                        a juniorProfileParams = (a) obj2;
                        Intrinsics.checkNotNullParameter(juniorProfileParams, "juniorProfileParams");
                        List list = (List) this.f246775b.f246789b.get(e.a(j.Companion, juniorProfileParams.f246773b));
                        Object obj3 = null;
                        if (list == null) {
                            return null;
                        }
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                if (j.a((com.revolut.feature.junior_profile.api.models.a) next, juniorProfileParams.f246772a)) {
                                    obj3 = next;
                                }
                            }
                        }
                        return (com.revolut.feature.junior_profile.api.models.a) obj3;
                }
            }
        }, new Function2(this) { // from class: qj8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f246777b;

            {
                this.f246777b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String parentRegId = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(parentRegId, "parentRegId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        j jVar = this.f246777b;
                        e0.C(jVar.d, null, null, new i(jVar.e, null, jVar, parentRegId, value, 1), 3);
                        break;
                    default:
                        a juniorProfileParams = (a) obj2;
                        com.revolut.feature.junior_profile.api.models.a profile = (com.revolut.feature.junior_profile.api.models.a) obj3;
                        Intrinsics.checkNotNullParameter(juniorProfileParams, "juniorProfileParams");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        String strA = e.a(j.Companion, juniorProfileParams.f246773b);
                        j jVar2 = this.f246777b;
                        e0.C(jVar2.d, null, null, new h(jVar2.e, null, jVar2, strA, profile, 1), 3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new p(this, continuation, 11), new q(this, continuation, 4));
        this.i = new x4l.c(new pti.d(this, continuation, 9), new Function1(this) { // from class: qj8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f246775b;

            {
                this.f246775b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String parentRegId = (String) obj2;
                        Intrinsics.checkNotNullParameter(parentRegId, "parentRegId");
                        return (List) this.f246775b.f246789b.get(e.a(j.Companion, parentRegId));
                    default:
                        a juniorProfileParams = (a) obj2;
                        Intrinsics.checkNotNullParameter(juniorProfileParams, "juniorProfileParams");
                        List list = (List) this.f246775b.f246789b.get(e.a(j.Companion, juniorProfileParams.f246773b));
                        Object obj3 = null;
                        if (list == null) {
                            return null;
                        }
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                if (j.a((com.revolut.feature.junior_profile.api.models.a) next, juniorProfileParams.f246772a)) {
                                    obj3 = next;
                                }
                            }
                        }
                        return (com.revolut.feature.junior_profile.api.models.a) obj3;
                }
            }
        }, new Function2(this) { // from class: qj8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f246777b;

            {
                this.f246777b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String parentRegId = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(parentRegId, "parentRegId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        j jVar = this.f246777b;
                        e0.C(jVar.d, null, null, new i(jVar.e, null, jVar, parentRegId, value, 1), 3);
                        break;
                    default:
                        a juniorProfileParams = (a) obj2;
                        com.revolut.feature.junior_profile.api.models.a profile = (com.revolut.feature.junior_profile.api.models.a) obj3;
                        Intrinsics.checkNotNullParameter(juniorProfileParams, "juniorProfileParams");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        String strA = e.a(j.Companion, juniorProfileParams.f246773b);
                        j jVar2 = this.f246777b;
                        e0.C(jVar2.d, null, null, new h(jVar2.e, null, jVar2, strA, profile, 1), 3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new qc3.c(this, continuation, 16), new pfk.q(this, continuation, 18));
    }

    public static boolean a(com.revolut.feature.junior_profile.api.models.a aVar, String str) {
        if (aVar instanceof JuniorBankingProfile) {
            return Intrinsics.f(((JuniorBankingProfile) aVar).getF77103j(), str);
        }
        if (!(aVar instanceof com.revolut.feature.junior_profile.api.models.c)) {
            throw new NoWhenBranchMatchedException();
        }
        List listE = ((com.revolut.feature.junior_profile.api.models.c) aVar).e();
        if ((listE instanceof Collection) && listE.isEmpty()) {
            return false;
        }
        Iterator it8 = listE.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((com.revolut.feature.junior_profile.api.models.f) it8.next()).a(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (r6.f246792h.f(r8, r9, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, java.lang.String r8, w4l.k r9, gim.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof qj8.f
            if (r0 == 0) goto L13
            r0 = r10
            qj8.f r0 = (qj8.f) r0
            int r1 = r0.f246780y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246780y = r1
            goto L18
        L13:
            qj8.f r0 = new qj8.f
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f246778w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f246780y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            goto L92
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.String r8 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r10)
            goto L60
        L3a:
            yhm.o.b(r10)
            vkm.d r9 = r6.c(r8, r9)
            qc8.a r10 = new qc8.a
            r2 = 26
            r10.<init>(r2)
            qc8.a r2 = new qc8.a
            r5 = 27
            r2.<init>(r5)
            jhi.b r9 = mo3.a.e(r9, r10, r2)
            r0.u = r7
            r0.v = r8
            r0.f246780y = r4
            java.lang.Object r10 = vkm.q.x(r9, r0)
            if (r10 != r1) goto L60
            goto L91
        L60:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L6b:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r10.next()
            r4 = r2
            com.revolut.feature.junior_profile.api.models.a r4 = (com.revolut.feature.junior_profile.api.models.a) r4
            boolean r4 = a(r4, r7)
            if (r4 != 0) goto L6b
            r9.add(r2)
            goto L6b
        L82:
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f246780y = r3
            x4l.c r7 = r6.f246792h
            java.lang.Object r7 = r7.f(r8, r9, r0)
            if (r7 != r1) goto L92
        L91:
            return r1
        L92:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qj8.j.b(java.lang.String, java.lang.String, w4l.k, gim.c):java.lang.Object");
    }

    public final vkm.d c(String parentRegId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(parentRegId, "parentRegId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f246792h.b(parentRegId, this.f246791g.c(Unit.f186387a, loadingStrategy));
    }
}

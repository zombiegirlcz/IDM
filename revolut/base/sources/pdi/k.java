package pdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.feature_rev_points_pocket_impl.network.RevPointsPocketService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p24.q;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketService f235257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f235258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f235259c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    public k(RevPointsPocketService revPointsPocketService, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(revPointsPocketService, "revPointsPocketService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f235257a = revPointsPocketService;
        this.f235258b = memoryCache;
        this.f235259c = storage;
        Continuation continuation = null;
        final int i = 0;
        final int i2 = 1;
        this.d = new x4l.c(new e(this, continuation, 2), new Function1(this) { // from class: pdi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f235245b;

            {
                this.f235245b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f235245b.f235258b.get("POINTS_POCKET_THRESHOLDS_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (RevPointsPocketState) this.f235245b.f235258b.get("POINTS_POCKET_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f235245b.f235258b.get("POINTS_POCKET_BENEFITS_KEY");
                }
            }
        }, new Function2(this) { // from class: pdi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f235247b;

            {
                this.f235247b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        List thresholds = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
                        this.f235247b.f235258b.f("POINTS_POCKET_THRESHOLDS_KEY", thresholds);
                        break;
                    case 1:
                        RevPointsPocketState pocketState = (RevPointsPocketState) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(pocketState, "pocketState");
                        this.f235247b.f235258b.f("POINTS_POCKET_KEY", pocketState);
                        break;
                    default:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f235247b.f235258b.f("POINTS_POCKET_BENEFITS_KEY", benefits);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, 2), new g(this, continuation, i2));
        this.e = new x4l.c(new e(this, continuation, i2), new Function1(this) { // from class: pdi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f235245b;

            {
                this.f235245b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f235245b.f235258b.get("POINTS_POCKET_THRESHOLDS_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (RevPointsPocketState) this.f235245b.f235258b.get("POINTS_POCKET_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f235245b.f235258b.get("POINTS_POCKET_BENEFITS_KEY");
                }
            }
        }, new Function2(this) { // from class: pdi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f235247b;

            {
                this.f235247b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        List thresholds = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
                        this.f235247b.f235258b.f("POINTS_POCKET_THRESHOLDS_KEY", thresholds);
                        break;
                    case 1:
                        RevPointsPocketState pocketState = (RevPointsPocketState) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(pocketState, "pocketState");
                        this.f235247b.f235258b.f("POINTS_POCKET_KEY", pocketState);
                        break;
                    default:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f235247b.f235258b.f("POINTS_POCKET_BENEFITS_KEY", benefits);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, i2), new q(this, continuation, i2));
        e eVar = new e(this, continuation, 0);
        final int i3 = 2;
        Function1 function1 = new Function1(this) { // from class: pdi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f235245b;

            {
                this.f235245b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f235245b.f235258b.get("POINTS_POCKET_THRESHOLDS_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (RevPointsPocketState) this.f235245b.f235258b.get("POINTS_POCKET_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f235245b.f235258b.get("POINTS_POCKET_BENEFITS_KEY");
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: pdi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f235247b;

            {
                this.f235247b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i3) {
                    case 0:
                        List thresholds = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
                        this.f235247b.f235258b.f("POINTS_POCKET_THRESHOLDS_KEY", thresholds);
                        break;
                    case 1:
                        RevPointsPocketState pocketState = (RevPointsPocketState) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(pocketState, "pocketState");
                        this.f235247b.f235258b.f("POINTS_POCKET_KEY", pocketState);
                        break;
                    default:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f235247b.f235258b.f("POINTS_POCKET_BENEFITS_KEY", benefits);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i5 = 0;
        this.f = new x4l.c(eVar, function1, function2, new f(this, continuation, i5), new g(this, continuation, i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof pdi.h
            if (r0 == 0) goto L13
            r0 = r7
            pdi.h r0 = (pdi.h) r0
            int r1 = r0.f235251x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235251x = r1
            goto L18
        L13:
            pdi.h r0 = new pdi.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235251x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.u
            yhm.o.b(r7)
            return r0
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.u
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            yhm.o.b(r7)
            goto L56
        L3c:
            yhm.o.b(r7)
            omg.e r7 = new omg.e
            r2 = 29
            r5 = 0
            r7.<init>(r6, r5, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.u = r5
            r0.f235251x = r4
            java.lang.Object r7 = skm.e0.J(r2, r7, r0)
            if (r7 != r1) goto L56
            goto L6c
        L56:
            r2 = r7
            com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo r2 = (com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo) r2
            kotlin.Unit r4 = kotlin.Unit.f186387a
            com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState$Active r5 = new com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState$Active
            r5.<init>(r2)
            r0.u = r7
            r0.f235251x = r3
            x4l.c r2 = r6.e
            java.lang.Object r0 = r2.f(r4, r5, r0)
            if (r0 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pdi.k.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r3.d(r10, false, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(wj0.b r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof pdi.i
            if (r0 == 0) goto L13
            r0 = r10
            pdi.i r0 = (pdi.i) r0
            int r1 = r0.f235254y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235254y = r1
            goto L18
        L13:
            pdi.i r0 = new pdi.i
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f235252w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235254y
            x4l.c r3 = r8.e
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L48
            if (r2 == r7) goto L40
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            yhm.o.b(r10)
            goto L81
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            int r9 = r0.v
            kotlin.Unit r2 = r0.u
            yhm.o.b(r10)
            goto L72
        L40:
            kotlin.Unit r9 = r0.u
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            yhm.o.b(r10)
            goto L62
        L48:
            yhm.o.b(r10)
            pdi.j r10 = new pdi.j
            r2 = 0
            r10.<init>(r8, r9, r2, r4)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            r0.u = r2
            r0.v = r4
            r0.f235254y = r7
            java.lang.Object r9 = skm.e0.J(r9, r10, r0)
            if (r9 != r1) goto L62
            goto L80
        L62:
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r0.u = r2
            r0.v = r4
            r0.f235254y = r6
            java.lang.Object r9 = r3.e(r2, r0)
            if (r9 != r1) goto L71
            goto L80
        L71:
            r9 = r4
        L72:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            r0.u = r2
            r0.v = r9
            r0.f235254y = r5
            java.lang.Object r9 = r3.d(r10, r4, r0)
            if (r9 != r1) goto L81
        L80:
            return r1
        L81:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pdi.k.b(wj0.b, gim.c):java.lang.Object");
    }
}

package i98;

import hq1.f;
import i6j.p;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import w4l.h;
import w4l.i;
import w4l.k;
import yhm.j;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements ic8.b {

    @NotNull
    public static final a Companion = new a();
    public static final Set e = y0.b(w5l.c.IN_REVIEW);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e98.a f159610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5l.a f159611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f159612c;
    public final Lazy d;

    public e(e98.a repository, x5l.a sharedRepository, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(sharedRepository, "sharedRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f159610a = repository;
        this.f159611b = sharedRepository;
        this.f159612c = featureToggleInteractor;
        this.d = j.b(new f(this, 24));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (d(true, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof i98.c
            if (r0 == 0) goto L13
            r0 = r9
            i98.c r0 = (i98.c) r0
            int r1 = r0.f159608w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159608w = r1
            goto L18
        L13:
            i98.c r0 = new i98.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159608w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            goto L71
        L2d:
            r7 = move-exception
            goto L74
        L2f:
            r7 = move-exception
            goto L81
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            yhm.o.b(r9)
            goto L68
        L3d:
            yhm.o.b(r9)
            kotlin.Lazy r9 = r6.d
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L5b
            r0.f159608w = r5
            x5l.a r9 = r6.f159611b
            d6l.h r9 = (d6l.h) r9
            java.lang.Object r7 = r9.b(r7, r8, r0)
            if (r7 != r1) goto L68
            goto L70
        L5b:
            r0.f159608w = r4
            e98.a r9 = r6.f159610a
            e98.f r9 = (e98.f) r9
            java.lang.Object r7 = r9.a(r7, r8, r0)
            if (r7 != r1) goto L68
            goto L70
        L68:
            r0.f159608w = r3     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            java.lang.Object r7 = r6.d(r5, r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            goto L7e
        L74:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r9, r0, r0, r7, r8)
        L7e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i98.e.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final Flow c(boolean z) {
        if (!((Boolean) this.d.getValue()).booleanValue()) {
            e98.f fVar = (e98.f) this.f159610a;
            x4l.c cVar = fVar.f;
            Unit unit = Unit.f186387a;
            return cVar.c(unit, fVar.e.a(unit, z));
        }
        k loadingStrategy = z ? i.f294643c : h.f294642c;
        d6l.h hVar = (d6l.h) this.f159611b;
        Set states = e;
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(hVar.f111642l.b(new d6l.d(states), loadingStrategy), new p(16));
    }

    public final Object d(boolean z, gim.c cVar) {
        if (((Boolean) this.d.getValue()).booleanValue()) {
            Object objD = ((d6l.h) this.f159611b).f111642l.d(new d6l.d(e), z, cVar);
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (objD != aVar) {
                objD = Unit.f186387a;
            }
            return objD == aVar ? objD : Unit.f186387a;
        }
        x4l.c cVar2 = ((e98.f) this.f159610a).f;
        Unit unit = Unit.f186387a;
        Object objD2 = cVar2.d(unit, z, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objD2 != aVar2) {
            objD2 = unit;
        }
        return objD2 == aVar2 ? objD2 : unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (d(true, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof i98.d
            if (r0 == 0) goto L13
            r0 = r8
            i98.d r0 = (i98.d) r0
            int r1 = r0.f159609w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159609w = r1
            goto L18
        L13:
            i98.d r0 = new i98.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159609w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            goto L71
        L2d:
            r7 = move-exception
            goto L74
        L2f:
            r7 = move-exception
            goto L81
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            yhm.o.b(r8)
            goto L68
        L3d:
            yhm.o.b(r8)
            kotlin.Lazy r8 = r6.d
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5b
            r0.f159609w = r5
            x5l.a r8 = r6.f159611b
            d6l.h r8 = (d6l.h) r8
            java.lang.Object r7 = r8.d(r7, r0)
            if (r7 != r1) goto L68
            goto L70
        L5b:
            r0.f159609w = r4
            e98.a r8 = r6.f159610a
            e98.f r8 = (e98.f) r8
            java.lang.Object r7 = r8.b(r7, r0)
            if (r7 != r1) goto L68
            goto L70
        L68:
            r0.f159609w = r3     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            java.lang.Object r7 = r6.d(r5, r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            goto L7e
        L74:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r7, r8)
        L7e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i98.e.e(java.lang.String, gim.c):java.lang.Object");
    }
}

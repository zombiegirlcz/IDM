package lmg;

import com.revolut.feature.user.checklist.api.UserChecklistContentType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lb0.b0;
import lkf.v;
import om4.d0;
import skm.e0;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements emg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f197056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final skd.i f197057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k7i.i f197058c;
    public final d0 d;
    public final s e;

    public m(d4m.a userChecklistRepository, skd.i slotManagerInteractor, k7i.i userChecklistDynamicItemsInteractor, d0 mainApplicationSlotContextProvider, s userChecklistVisibilityTracker) {
        Intrinsics.checkNotNullParameter(userChecklistRepository, "userChecklistRepository");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(userChecklistDynamicItemsInteractor, "userChecklistDynamicItemsInteractor");
        Intrinsics.checkNotNullParameter(mainApplicationSlotContextProvider, "mainApplicationSlotContextProvider");
        Intrinsics.checkNotNullParameter(userChecklistVisibilityTracker, "userChecklistVisibilityTracker");
        this.f197056a = userChecklistRepository;
        this.f197057b = slotManagerInteractor;
        this.f197058c = userChecklistDynamicItemsInteractor;
        this.d = mainApplicationSlotContextProvider;
        this.e = userChecklistVisibilityTracker;
    }

    @Override // emg.a
    public final Object a(String str, qmg.j jVar) throws Throwable {
        hx7.e.n(new UnsupportedOperationException("Marking step as completed is not supported for user checklist"));
        return Unit.f186387a;
    }

    @Override // emg.a
    public final void b(cmg.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ((mmg.a) this.f197056a.get()).b(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // emg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof lmg.g
            if (r0 == 0) goto L13
            r0 = r8
            lmg.g r0 = (lmg.g) r0
            int r1 = r0.f197048y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f197048y = r1
            goto L18
        L13:
            lmg.g r0 = new lmg.g
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f197046w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f197048y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L6a
        L2b:
            r8 = move-exception
            goto L72
        L2d:
            r8 = move-exception
            goto L7c
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            int r2 = r0.v
            int r4 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L59
        L3f:
            yhm.o.b(r8)
            d4m.a r8 = r7.f197056a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            mmg.a r8 = (mmg.a) r8     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r2 = 0
            r0.u = r2     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.v = r2     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.f197048y = r4     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r8 = r8.c(r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r8 != r1) goto L58
            goto L69
        L58:
            r4 = r2
        L59:
            fmg.n0 r8 = (fmg.n0) r8     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            k7i.i r6 = r7.f197058c     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.u = r4     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.v = r2     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.f197048y = r3     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r8 = r6.o(r8, r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            boolean r0 = r8 instanceof fmg.n0     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r0 == 0) goto L71
            fmg.n0 r8 = (fmg.n0) r8     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            return r8
        L71:
            return r5
        L72:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r5, r5, r8, r0)
            return r5
        L7c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.m.c(gim.c):java.lang.Object");
    }

    @Override // emg.a
    public final Flow d() {
        return new v(((mmg.a) this.f197056a.get()).d(), this, 6);
    }

    @Override // emg.a
    public final Flow e(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.u(new ll6.i(this, (Continuation) null, 11), ((mmg.a) this.f197056a.get()).e(loadingStrategy));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // emg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lmg.i
            if (r0 == 0) goto L13
            r0 = r5
            lmg.i r0 = (lmg.i) r0
            int r1 = r0.f197050w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f197050w = r1
            goto L18
        L13:
            lmg.i r0 = new lmg.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f197050w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f197050w = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            fmg.n0 r5 = (fmg.n0) r5
            if (r5 == 0) goto L44
            fmg.t r5 = fmg.t.IN_PROGRESS
            if (r5 != 0) goto L44
            goto L45
        L44:
            r3 = 0
        L45:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.m.f(gim.c):java.lang.Object");
    }

    @Override // emg.a
    public final Object g(gim.c cVar) {
        return e0.o(new b0(this, (Continuation) null, 24), cVar);
    }

    @Override // emg.a
    public final void h(UserChecklistContentType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.e.a(type);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // emg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lmg.h
            if (r0 == 0) goto L13
            r0 = r5
            lmg.h r0 = (lmg.h) r0
            int r1 = r0.f197049w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f197049w = r1
            goto L18
        L13:
            lmg.h r0 = new lmg.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f197049w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f197049w = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            if (r5 == 0) goto L3e
            goto L3f
        L3e:
            r3 = 0
        L3f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.m.i(gim.c):java.lang.Object");
    }

    @Override // emg.a
    public final void j(UserChecklistContentType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.e.b(type);
    }
}

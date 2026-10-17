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

/* JADX INFO: loaded from: classes13.dex */
public final class f implements emg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f197043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final skd.i f197044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f197045c;
    public final s d;

    public f(d4m.a adoptionJourneyRepository, skd.i slotManagerInteractor, d0 mainApplicationSlotContextProvider, s userChecklistVisibilityTracker) {
        Intrinsics.checkNotNullParameter(adoptionJourneyRepository, "adoptionJourneyRepository");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(mainApplicationSlotContextProvider, "mainApplicationSlotContextProvider");
        Intrinsics.checkNotNullParameter(userChecklistVisibilityTracker, "userChecklistVisibilityTracker");
        this.f197043a = adoptionJourneyRepository;
        this.f197044b = slotManagerInteractor;
        this.f197045c = mainApplicationSlotContextProvider;
        this.d = userChecklistVisibilityTracker;
    }

    @Override // emg.a
    public final Object a(String str, qmg.j jVar) {
        Object objA = ((mmg.a) this.f197043a.get()).a(str, jVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // emg.a
    public final void b(cmg.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ((mmg.a) this.f197043a.get()).b(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // emg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lmg.a
            if (r0 == 0) goto L13
            r0 = r5
            lmg.a r0 = (lmg.a) r0
            int r1 = r0.f197038w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f197038w = r1
            goto L18
        L13:
            lmg.a r0 = new lmg.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f197038w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L47
        L27:
            r5 = move-exception
            goto L4a
        L29:
            r5 = move-exception
            goto L55
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            d4m.a r5 = r4.f197043a     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            mmg.a r5 = (mmg.a) r5     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r0.f197038w = r3     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r5.c(r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L47
            return r1
        L47:
            fmg.p r5 = (fmg.p) r5     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            return r5
        L4a:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
            return r2
        L55:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.f.c(gim.c):java.lang.Object");
    }

    @Override // emg.a
    public final Flow d() {
        return new v(((mmg.a) this.f197043a.get()).d(), this, 5);
    }

    @Override // emg.a
    public final Flow e(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((mmg.a) this.f197043a.get()).e(loadingStrategy);
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
            boolean r0 = r5 instanceof lmg.c
            if (r0 == 0) goto L13
            r0 = r5
            lmg.c r0 = (lmg.c) r0
            int r1 = r0.f197040w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f197040w = r1
            goto L18
        L13:
            lmg.c r0 = new lmg.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f197040w
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
            r0.f197040w = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            fmg.p r5 = (fmg.p) r5
            if (r5 == 0) goto L48
            fmg.t r5 = r5.a()
            fmg.t r0 = fmg.t.IN_PROGRESS
            if (r5 != r0) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.f.f(gim.c):java.lang.Object");
    }

    @Override // emg.a
    public final Object g(gim.c cVar) {
        return e0.o(new b0(this, (Continuation) null, 23), cVar);
    }

    @Override // emg.a
    public final void h(UserChecklistContentType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.d.a(type);
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
            boolean r0 = r5 instanceof lmg.b
            if (r0 == 0) goto L13
            r0 = r5
            lmg.b r0 = (lmg.b) r0
            int r1 = r0.f197039w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f197039w = r1
            goto L18
        L13:
            lmg.b r0 = new lmg.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f197039w
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
            r0.f197039w = r3
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
        throw new UnsupportedOperationException("Method not decompiled: lmg.f.i(gim.c):java.lang.Object");
    }

    @Override // emg.a
    public final void j(UserChecklistContentType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.d.b(type);
    }
}

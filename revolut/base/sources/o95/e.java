package o95;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.overdraft.api.OverdraftApi$Toggles$OverdraftHomeScreen;
import f95.b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n14.k;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements e95.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f223074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i95.e f223075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f223076c;

    public e(g overdraftProductFeatureTogglesInteractor, i95.e overdraftDetailsRepository, p95.a overdraftSubtitleMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(overdraftProductFeatureTogglesInteractor, "overdraftProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(overdraftDetailsRepository, "overdraftDetailsRepository");
        Intrinsics.checkNotNullParameter(overdraftSubtitleMapper, "overdraftSubtitleMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f223074a = overdraftProductFeatureTogglesInteractor;
        this.f223075b = overdraftDetailsRepository;
        this.f223076c = featureToggleInteractor;
    }

    public final Flow a() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (this.f223076c.a(OverdraftApi$Toggles$OverdraftHomeScreen.f70634c)) {
            return new go.g(new Data(b.a.f132822a, null, false, 6, null), 2);
        }
        return k.p(xam.a.h(new jkh.g((Continuation) null, this, 15), this.f223074a.j()), new b(1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r8 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o95.d
            if (r0 == 0) goto L13
            r0 = r8
            o95.d r0 = (o95.d) r0
            int r1 = r0.f223073w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223073w = r1
            goto L18
        L13:
            o95.d r0 = new o95.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223073w
            o95.g r3 = r7.f223074a
            r4 = 2
            r5 = 1
            r6 = 3
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r6) goto L30
            yhm.o.b(r8)
            goto Lbd
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            yhm.o.b(r8)
            goto L9e
        L3c:
            yhm.o.b(r8)
            goto L5f
        L40:
            yhm.o.b(r8)
            gte.a r8 = r7.f223076c
            com.revolut.feature.credit.overdraft.api.OverdraftApi$Toggles$OverdraftHomeScreen r2 = com.revolut.feature.credit.overdraft.api.OverdraftApi$Toggles$OverdraftHomeScreen.f70634c
            boolean r8 = r8.a(r2)
            if (r8 != 0) goto Lc0
            cxe.u r8 = r3.j()
            r2 = 0
            jhi.b r8 = mo3.a.g(r8, r2, r2, r6)
            r0.f223073w = r5
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L5f
            goto Lbc
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L68
            goto Lc0
        L68:
            w4l.j r8 = w4l.j.f294644c
            wkm.l r8 = r3.l(r8)
            o69.b r2 = new o69.b
            r3 = 29
            r2.<init>(r3)
            akg.n r8 = nim.a.v(r8, r2)
            o95.b r2 = new o95.b
            r3 = 0
            r2.<init>(r3)
            cxe.u r8 = n14.k.p(r8, r2)
            o4a.a r2 = new o4a.a
            r3 = 21
            r2.<init>(r3)
            o4a.a r3 = new o4a.a
            r5 = 22
            r3.<init>(r5)
            jhi.b r8 = mo3.a.e(r8, r2, r3)
            r0.f223073w = r4
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L9e
            goto Lbc
        L9e:
            od0.i r8 = (od0.i) r8
            java.lang.Object r8 = r8.f224257a
            f95.d r8 = (f95.d) r8
            if (r8 == 0) goto Lbd
            java.lang.String r8 = r8.f132830a
            if (r8 == 0) goto Lbd
            r0.f223073w = r6
            i95.e r2 = r7.f223075b
            x4l.c r2 = r2.e
            r3 = 0
            java.lang.Object r8 = r2.d(r8, r3, r0)
            if (r8 != r1) goto Lb8
            goto Lba
        Lb8:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        Lba:
            if (r8 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lc0:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o95.e.b(gim.c):java.lang.Object");
    }
}

package com.revolut.feature.travel.experiences.impl.ui.screen.cancellation;

import com.revolut.data.model.Data;
import i4b.f;
import jki.g;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import md6.q;
import rt4.o;
import s1g.h;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f93039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u1g.b f93040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u1g.c f93041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c1g.h f93042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hyf.a f93043t;
    public final f u;
    public final s1g.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p stateMapper, TravelExperiencesCancellationScreenContract$InputData inputData, j60.a bottomDialog, u1g.b bottomItemMapper, u1g.c refundBreakdownBottomDialogItemMapper, c1g.h bookingInteractor, hyf.a experiencesFeatureInteractor, f legalEntityContextProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(bottomItemMapper, "bottomItemMapper");
        Intrinsics.checkNotNullParameter(refundBreakdownBottomDialogItemMapper, "refundBreakdownBottomDialogItemMapper");
        Intrinsics.checkNotNullParameter(bookingInteractor, "bookingInteractor");
        Intrinsics.checkNotNullParameter(experiencesFeatureInteractor, "experiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.f93039p = bottomDialog;
        this.f93040q = bottomItemMapper;
        this.f93041r = refundBreakdownBottomDialogItemMapper;
        this.f93042s = bookingInteractor;
        this.f93043t = experiencesFeatureInteractor;
        this.u = legalEntityContextProvider;
        this.v = new s1g.g(inputData.f93026a, new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum y2(com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e r5, com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode.BookingCancellation r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.a
            if (r0 == 0) goto L13
            r0 = r7
            com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.a r0 = (com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.a) r0
            int r1 = r0.f93032w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93032w = r1
            goto L18
        L13:
            com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.a r0 = new com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f93032w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L4a
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r7)
            c1g.h r5 = r5.f93042s
            java.lang.String r6 = r6.f93028b
            r7 = 0
            vkm.d r5 = r5.a(r6, r7)
            r6 = 3
            jhi.b r5 = mo3.a.g(r5, r4, r4, r6)
            r0.f93032w = r3
            java.lang.Object r7 = vkm.q.z(r5, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking r7 = (com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking) r7
            if (r7 == 0) goto L51
            iyf.b r5 = r7.f92752l
            return r5
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e.y2(com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e, com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode$BookingCancellation, gim.c):java.lang.Enum");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.u.j(new q(md6.p.EXPERIENCES, false)), null, null, new o(this, null, 21), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.v;
    }
}

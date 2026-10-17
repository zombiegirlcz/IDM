package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsCampaignsHubScreenContract$ModalStep f93863w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, TravelHotelsCampaignsHubScreenContract$ModalStep travelHotelsCampaignsHubScreenContract$ModalStep, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f93863w = travelHotelsCampaignsHubScreenContract$ModalStep;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f93863w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r9 == r2) goto L27;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.b r0 = r8.v
            i9g.h0 r1 = r0.f93865q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$ModalStep r4 = r8.f93863w
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L23
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L17
            yhm.o.b(r9)
            goto L95
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            yhm.o.b(r9)
            goto L38
        L23:
            yhm.o.b(r9)
            r9 = r4
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$ModalStep$DatesSelection r9 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$ModalStep.DatesSelection) r9
            com.revolut.feature_travel_hotels_models.property.search.LocationType r9 = r9.f93862b
            pfm.h r9 = r1.m(r9)
            r8.u = r6
            java.lang.Object r9 = nim.a.a(r9, r8)
            if (r9 != r2) goto L38
            goto L94
        L38:
            r8.u = r5
            cli.y r9 = r0.f93867s
            java.lang.Object r9 = r9.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            obg.f r9 = (obg.f) r9
            com.revolut.data.model.Data r9 = r9.f223941c
            java.lang.Object r9 = r9.getContent()
            ggi.a r9 = (ggi.a) r9
            r3 = 0
            if (r9 == 0) goto L71
            java.util.ArrayList r9 = r9.f143690b
            java.util.Iterator r9 = r9.iterator()
        L57:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r9.next()
            r6 = r5
            com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption r6 = (com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption) r6
            java.lang.String r6 = r6.f98141a
            java.lang.String r7 = "CAMPAIGNS"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L57
            r3 = r5
        L6f:
            com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption r3 = (com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption) r3
        L71:
            fag.t0 r9 = r1.f159799a
            r9.getClass()
            f0d.m r1 = new f0d.m
            r5 = 7
            r1.<init>(r9, r3, r5)
            pfm.h r9 = new pfm.h
            r3 = 2
            r9.<init>(r1, r3)
            java.lang.String r1 = "fromAction(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            java.lang.Object r9 = nim.a.a(r9, r8)
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            if (r9 != r1) goto L90
            goto L92
        L90:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L92:
            if (r9 != r2) goto L95
        L94:
            return r2
        L95:
            obg.h r9 = new obg.h
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$ModalStep$DatesSelection r4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$ModalStep.DatesSelection) r4
            com.revolut.feature_travel_hotels_models.property.search.LocationType r1 = r4.f93862b
            r9.<init>(r1)
            r0.C2(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

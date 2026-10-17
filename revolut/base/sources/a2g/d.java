package a2g;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelExperiencesDetailsScreen travelExperiencesDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.u
            com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreen r8 = r7.v
            a2g.k r8 = r8.T2()
            kotlin.jvm.internal.Intrinsics.h(r0)
            a2g.r r8 = (a2g.r) r8
            com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreenContract$InputData r1 = r8.f852p
            java.lang.String r2 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = r0.f51822a
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 0
            com.revolut.kompot.common.ModalDestination$Style$POPUP r6 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            switch(r3) {
                case -1576389876: goto L63;
                case 76163699: goto L4a;
                case 234653323: goto L39;
                case 940669308: goto L29;
                default: goto L28;
            }
        L28:
            goto L6b
        L29:
            java.lang.String r0 = "ADDITIONAL_INFORMATION_ITEM_ID"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6b
            java.lang.String r0 = r1.f93059a
            l1g.c r1 = l1g.c.ADDITIONAL_INFORMATION
            r8.y2(r0, r1)
            goto L8b
        L39:
            java.lang.String r0 = "DEPARTURE_AND_RETURN_ITEM_ID"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L42
            goto L6b
        L42:
            java.lang.String r0 = r1.f93059a
            l1g.c r1 = l1g.c.DEPARTURE_AND_RETURN
            r8.y2(r0, r1)
            goto L8b
        L4a:
            java.lang.String r0 = "ITINERARY_ITEM_ID"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L53
            goto L6b
        L53:
            java.lang.String r0 = r1.f93059a
            com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreen r1 = new com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreen
            com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreenContract$InputData r2 = new com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreenContract$InputData
            r2.<init>(r0)
            r1.<init>(r2)
            yji.l.j2(r8, r1, r6, r5, r4)
            goto L8b
        L63:
            java.lang.String r1 = "CANCELLATION_POLICY_ID"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6e
        L6b:
            int r8 = jli.h.f175850a
            goto L8b
        L6e:
            java.lang.Object r0 = r0.e
            java.lang.String r1 = "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.experience.TravelExperience"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            myf.a r0 = (myf.a) r0
            com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen r1 = new com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen
            com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$InputData r2 = new com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$InputData
            com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode$ExperiencePreview r3 = new com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode$ExperiencePreview
            com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy$Experience r0 = r0.f210457l
            r3.<init>(r0)
            r2.<init>(r3)
            r1.<init>(r2)
            yji.l.g2(r8, r1, r6, r5, r4)
        L8b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a2g.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

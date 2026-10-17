package n1g;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBrief;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePreview;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesBookingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelExperiencesBookingDetailsScreen travelExperiencesBookingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesBookingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVar = (f) this.v.f93017e0.getValue();
        Intrinsics.h(model);
        r rVar = (r) fVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51822a;
        Object obj3 = model.e;
        RowDelegate.Model model2 = null;
        if (Intrinsics.f(str, "EXPERIENCE_MANAGE_BOOKING_ITEM")) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking");
            TravelExperiencesBooking travelExperiencesBooking = (TravelExperiencesBooking) obj3;
            j60.a aVar2 = rVar.f211342q;
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.experiences_booking_manage_booking_title, null, null, 14), null, null, 30);
            rp0.l lVar = rp0.l.WINDOW;
            RowDelegate.Model model3 = new RowDelegate.Model("CANCEL_BOOKING_ITEM_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cross, Integer.valueOf(R$attr.uikit_colorBlue), R$attr.uikit_colorBlue_10, 8.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.experiences_booking_cancel_booking_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorBlue), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, travelExperiencesBooking, null, 0, 0, 0, 0, 532676600);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            if (travelExperiencesBooking.f92747b == iyf.c.CONFIRMED && travelExperiencesBooking.f92754n != null) {
                model2 = model3;
            }
            aVar2.x(new rp0.y(zhm.v.l(model2), tVar, lVar, null, null, null, 1016));
        } else if (Intrinsics.f(str, "EXPERIENCE_ITEM")) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking");
            TravelExperienceBrief travelExperienceBrief = ((TravelExperiencesBooking) obj3).f;
            String str2 = travelExperienceBrief.f92804a;
            String str3 = (String) d0.d0(travelExperienceBrief.f92806c);
            yji.l.g2(rVar, new TravelExperiencesDetailsScreen(new TravelExperiencesDetailsScreenContract$InputData(str2, null, str3 != null ? new TravelExperiencePreview(travelExperienceBrief.f92805b, str3, null) : null, a2g.h.PREVIEW)), null, null, 3);
        }
        return Unit.f186387a;
    }
}

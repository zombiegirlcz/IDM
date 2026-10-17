package hbg;

import android.net.Uri;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.k9;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsBookingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TravelHotelsBookingDetailsScreen travelHotelsBookingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsBookingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE3;
        j60.a aVar2 = bVar.A;
        cli.y yVar = bVar.P;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        if (Intrinsics.f(str, "VIEW_PROPERTY_ITEM_ID")) {
            bVar.M2();
        } else {
            Continuation continuation = null;
            if (Intrinsics.f(str, "POLICIES_ITEM_ID")) {
                rei.g gVar = (rei.g) ((l) ((j2) yVar.f22677a).getValue()).f150703a.getContent();
                if (gVar != null) {
                    bVar.C2(new o(gVar.f.f98005a));
                    j60.a.v(aVar2, false, null, 3);
                }
            } else {
                int i = 1;
                if (Intrinsics.f(str, "CANCELLATION_OPTIONS_ITEM_ID")) {
                    bVar.K2(true);
                } else if (Intrinsics.f(str, "TRAVEL_INFORMATION_ITEM_ID")) {
                    bVar.C2(new s(bVar.o.f93646a));
                    j60.a.v(aVar2, false, null, 3);
                } else if (Intrinsics.f(str, "CHANGE_DATES_ITEM_ID")) {
                    bVar.n2(new z(bVar, continuation, i), new whi.b(6));
                } else if (Intrinsics.f(str, "OTHER_ITEM_ID")) {
                    bVar.n2(new z(bVar, continuation, 2), new whi.b(6));
                } else if (Intrinsics.f(str, "ADDITIONAL_INFORMATION_ITEM_ID")) {
                    rei.g gVar2 = (rei.g) ((l) ((j2) yVar.f22677a).getValue()).f150703a.getContent();
                    if (gVar2 != null) {
                        com.revolut.kompot.navigable.vc.modal.a aVar3 = bVar.Q;
                        String str2 = gVar2.f.f98005a;
                        rei.e eVar = gVar2.e;
                        oki.h.v2(aVar3, new TravelHotelsBookingDetailsScreenContract$ModalStep.AdditionalInformation(str2, eVar.f253602a, eVar.f253603b), ModalDestination.Style.POPUP.f98311a);
                    }
                } else if (Intrinsics.f(str, "CONTACT_PROPERTY_CALL_ITEM_ID")) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
                    bVar.E.getClass();
                    bVar.C1(new BridgeDestination(nd.o.h((String) obj3)));
                } else if (Intrinsics.f(str, "CONTACT_PROPERTY_MESSAGE_ITEM_ID")) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
                    String str3 = (String) obj3;
                    Uri uriG = ((f80.b) bVar.L).g(str3);
                    if (uriG == null) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("The link '", str3, "' is malformed or invalid."));
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    } else {
                        com.revolut.feature.blue_prompt.fullscreen.a aVar4 = ms2.g.Companion;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_booking_details_contact_property_section_send_message_prompt_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_booking_details_contact_property_section_send_message_prompt_subtitle, null, null, 14);
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
                        BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30));
                        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
                        BrowserCommand browserCommand = new BrowserCommand(uriG);
                        k9 k9Var = k9.Hotels;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        bVar.C1(new BridgeDestination(com.revolut.feature.blue_prompt.fullscreen.a.a(aVar4, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, null, browserCommand, null, null, resourceImage, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33259185)));
                    }
                } else if (obj3 instanceof a3) {
                    bVar.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P((a3) obj3), null, null, null, 126))));
                } else if (obj3 instanceof RevPointsTransaction) {
                    bVar.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails((RevPointsTransaction) obj3, null, false, null, true, 14)));
                }
            }
        }
        return Unit.f186387a;
    }
}

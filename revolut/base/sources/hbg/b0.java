package hbg;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import grl.k9;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0(this.v, continuation, 0);
            default:
                return new b0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b0) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.s1();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.blue_prompt.fullscreen.a aVar3 = ms2.g.Companion;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_booking_details_partial_booking_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_booking_details_partial_booking_subtitle, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.hotels_common_action_contact_support, null, null, 14);
                BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D110", null, null, null, 30));
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
                FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                k9 k9Var = k9.Hotels;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                bVar.C1(new BridgeDestination(com.revolut.feature.blue_prompt.fullscreen.a.a(aVar3, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, null, finishCommand, null, null, resourceImage, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33259185)));
                break;
        }
        return Unit.f186387a;
    }
}

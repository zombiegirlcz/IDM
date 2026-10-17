package y5g;

import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements n {
    public static pf a(String str, boolean z) {
        return new pf(null, new ResourceImage(z ? R$drawable.uikit_icn_24_chevron_right : R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, false, null, str, OnfidoActivity.RESULT_EXIT_BACKGROUND_STOP);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listA = null;
        a aVar = new a(new TextLocalisedClause(R$string.travel_flights_booking_documents_screen_title, null, null, 14));
        aim.e eVarB = u.b();
        n7g.b bVar = domainState.f311080b;
        List listC = u.c(new RowDelegate.Model("FLIGHTS_TRAVEL_DOCUMENT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.travel_flights_booking_documents_travel_document, null, null, 14), null, 0, null, null, null, 0, a("FLIGHTS_TRAVEL_DOCUMENT_LOADING", bVar.f213089a), false, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532673528));
        Data data = domainState.f311081c;
        ArrayList arrayListE0 = d0.E0((List) iii.c.f(data, new y4b.b(this, 24), new y13.a(29), new l(this, 0)), listC);
        yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayListE0);
        if (data.getError() != null && data.getContent() == null && !data.getLoading()) {
            Intrinsics.checkNotNullParameter("FLIGHTS_RECEIPTS_ERROR", "listId");
            listA = q4g.b.a(4, "FLIGHTS_RECEIPTS_ERROR", true);
        }
        if (listA != null) {
            eVarB.addAll(listA);
        }
        return new i(aVar, u.a(eVarB));
    }
}

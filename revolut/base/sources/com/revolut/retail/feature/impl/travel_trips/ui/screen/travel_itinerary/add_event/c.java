package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event;

import avj.q;
import cli.n;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelItineraryAddEventContract$InputData f101638a;

    public c(TravelItineraryAddEventContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f101638a = inputData;
    }

    public static List a(TextLocalisedClause textLocalisedClause) {
        return u.c(new IconNavBarMenuItem("delete_event", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), textLocalisedClause, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
    }

    public static InputTextDelegate.Model b(int i, Clause clause, String str, boolean z) {
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, clause, new TextLocalisedClause(i, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, z, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -570425352, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r22) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.c.c(cli.j):cli.o");
    }
}

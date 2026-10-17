package rui;

import bti.m;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements Function1 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CenteredContentTileDelegate.Model a(m type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = i.f257561a[type.ordinal()];
        if (i == 1) {
            CenteredContentTileDelegate.Model modelA = CenteredContentTileDelegate.Model.Companion.a(CenteredContentTileDelegate.Model.INSTANCE, "ID_NON_QR_INSTRUCTIONS", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_person_checked, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorWidgetBackground, 16.0f, Float.valueOf(40.0f), null, 32), new TextLocalisedClause(R$string.asft_pass_details_no_code, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, false, null, 0, 0, 0, 0, 32696);
            yp0.b.r(modelA, 0, 0, 0, 0, 15);
            return modelA;
        }
        if (i == 2 || i == 3 || i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return a((m) obj2);
    }
}

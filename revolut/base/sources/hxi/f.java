package hxi;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import ip0.dv;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ixi.b f156603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f156604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f156605c;

    public f(ixi.b openingHoursClauseBuilder) {
        Intrinsics.checkNotNullParameter(openingHoursClauseBuilder, "openingHoursClauseBuilder");
        this.f156603a = openingHoursClauseBuilder;
        this.f156604b = new ResourceImage(R$drawable.uikit_icn_24_heart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.airport_lounges_lounge_details_header_remove_from_saved_lounges, null, null, 14), LDSFile.EF_DG4_TAG);
        this.f156605c = new ResourceImage(R$drawable.uikit_icn_24_heart_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.airport_lounges_lounge_details_header_add_to_saved_lounges, null, null, 14), LDSFile.EF_DG4_TAG);
    }

    public static List a() {
        dv dvVar = new dv("ID_LOUNGE_0");
        yp0.b.l(dvVar, 0, 0, 0, 0, null, false, 63);
        dv dvVar2 = new dv("ID_LOUNGE_1");
        yp0.b.l(dvVar2, 0, 0, 0, 0, null, false, 63);
        return v.k(dvVar, dvVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate.Model b(svi.b r33, hxi.d r34) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hxi.f.b(svi.b, hxi.d):com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate$Model");
    }
}

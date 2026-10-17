package oee;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressExtKt;
import com.revolut.feature.support.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f224582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f224583b;

    public c(gte.a featureToggleInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f224582a = featureToggleInteractor;
        this.f224583b = w.y0(new o10.c(this, 14));
    }

    public static RowDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, Clause clause, pf pfVar, int i) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause, null, 0, clause, null, null, 0, pfVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    public static RowDelegate.Model b(h93.h deliveryStatus, boolean z) {
        Clause inline;
        Intrinsics.checkNotNullParameter(deliveryStatus, "deliveryStatus");
        Address address = deliveryStatus.f;
        if (address == null || (inline = AddressExtKt.formatInline(address)) == null) {
            return null;
        }
        return a("LIST_ID_DELIVERY_ADDRESS", new TextLocalisedClause(R$string.delivery_details_address, null, null, 14), inline, z ? new pf(new TextLocalisedClause(R.string.common_action_edit, null, null, 14), null, h4.FLAT, false, null, null, 506) : null, R$drawable.uikit_icn_24_location_arrow);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b3  */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model c(h93.h r31) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oee.c.c(h93.h):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    public final RowDelegate.Model d(h93.h deliveryStatus) {
        TextLocalisedClause textLocalisedClause;
        String country;
        String country2;
        Intrinsics.checkNotNullParameter(deliveryStatus, "deliveryStatus");
        String str = deliveryStatus.f150140n;
        Address address = deliveryStatus.f;
        if ("STANDARD".equalsIgnoreCase(str)) {
            wi0.b bVarC = (address == null || (country2 = address.getCountry()) == null) ? null : com.bumptech.glide.d.c(country2);
            wi0.b.Companion.getClass();
            textLocalisedClause = Intrinsics.f(bVarC, wi0.b.f297776t) ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.delivery_details_tracking_contact_provider, null, null, 14) : new TextLocalisedClause(R$string.delivery_details_tracking_not_expected, null, null, 14);
        } else {
            String trackingLink = deliveryStatus.f150134c;
            if (trackingLink != null) {
                Intrinsics.checkNotNullParameter(trackingLink, "trackingLink");
                textLocalisedClause = new TextLocalisedClause(R$string.delivery_details_tracking_available_placeholder, zhm.u.c(new TextLocalisedClause(R$string.delivery_details_tracking_available_tap_here, null, new Click(28, (Integer) null, (Object) trackingLink, "ACTION_ID_OPEN_TRACKING_LINK", false), 10)), null, 12);
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.delivery_details_tracking_expected, null, null, 14);
            }
        }
        wi0.b bVarC2 = (address == null || (country = address.getCountry()) == null) ? null : com.bumptech.glide.d.c(country);
        wi0.b.Companion.getClass();
        return a("LIST_ID_TRACKING_LINK", textLocalisedClause, Intrinsics.f(bVarC2, wi0.b.f297776t) ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.delivery_details_tracking_contact_provider_subtitle, zhm.v.k(new HtmlClause(4, 28, (Integer) null, (Object) null, "+359 2 9609520"), new HtmlClause(2, 28, (Integer) null, (Object) null, "revolut@directservices.bg")), null, 12) : null, null, R$drawable.uikit_icn_24_map_point);
    }
}

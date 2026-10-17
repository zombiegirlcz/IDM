package hj1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import t70.g;
import yhm.j;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f152644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gj1.b f152645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f152646c;

    public c(g localization, n8b.a countryInteractor, c90.c uiResources, gj1.b addressFormCustomizations) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(addressFormCustomizations, "addressFormCustomizations");
        this.f152644a = uiResources;
        this.f152645b = addressFormCustomizations;
        this.f152646c = j.b(new h1g.a(this, 19));
    }

    public final koi.j a(Address address, TextLocalisedClause clause) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(clause, "clause");
        String postcode = address.getPostcode();
        if (postcode == null) {
            postcode = "";
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("POSTAL_CODE_SEARCH_ID", new TextClause(postcode, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), clause, null, false, null, false, null, null, null, null, (ResourceImage) this.f152646c.getValue(), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -100667400, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
        return model;
    }
}

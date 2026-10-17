package jw6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lr6.h;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f178941a;

    public c(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f178941a = uiKitResources;
    }

    public final CellDetailsNoteDelegate.Model a(h address) throws IOException {
        Intrinsics.checkNotNullParameter(address, "address");
        String[] elements = {address.f199405b, address.f199406c, address.f, address.e, address.d, this.f178941a.b(new CountryClause(address.f199404a, null)).toString()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        String strK0 = d0.k0(kotlin.collections.d.L(elements), null, null, null, 0, null, 63);
        String str = !kotlin.text.d0.W(strK0) ? strK0 : null;
        if (str == null) {
            return null;
        }
        CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("LIST_ID_BILLING_ADDRESS", new TextLocalisedClause(R$string.freelancer_billing_address_title, null, null, 14), null, new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, null, null, null, new b(str), null, 0, 128964);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}

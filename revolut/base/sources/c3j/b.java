package c3j;

import aw0.o9;
import c2d.n;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.beneficiary.BankInformationCopFlow;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import ez0.h;
import ip0.f6;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f20950a;

    public b(d3j.b beneficiaryInteractor) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        this.f20950a = beneficiaryInteractor;
    }

    public final f6 a(String str, String str2) {
        Image resourceImage;
        if (str == null) {
            return null;
        }
        if (str2 != null) {
            resourceImage = new UrlImage(str2, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, Integer.valueOf(R$drawable.uikit_icn_24_bank), (Integer) null, (h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524218);
        } else {
            resourceImage = new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        return new f6("ID_BANK_TRANSFER_NAME", new TextLocalisedClause(R.string.transfer_review_bank_name, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), resourceImage, null, 992);
    }

    public final r b(String country, String str, LinkedHashMap linkedHashMap, BankInformationCopFlow bankInformationCopFlow) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(bankInformationCopFlow, "bankInformationCopFlow");
        r map = zi0.c.J(this.f20950a.i(bankInformationCopFlow, country, str, linkedHashMap)).map(new c2i.c(new n(28), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}

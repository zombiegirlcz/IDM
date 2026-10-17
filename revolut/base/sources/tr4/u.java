package tr4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gs4.n f273745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f273746b;

    public u(gs4.n transactionSectionMapper, gs4.l instalmentDocumentMapper, bp4.g localizationProvider) {
        Intrinsics.checkNotNullParameter(transactionSectionMapper, "transactionSectionMapper");
        Intrinsics.checkNotNullParameter(instalmentDocumentMapper, "instalmentDocumentMapper");
        Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
        this.f273745a = transactionSectionMapper;
        this.f273746b = new p(new TextLocalisedClause(R$string.credit_card_instalment_confirmation_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    public static ResourceImage a() {
        return new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.f273733a, new tpl.o(this, 5), new tp8.l(this, 6), new tch.c(this, 7));
    }
}

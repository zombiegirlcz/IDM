package dt4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import dmj.e0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt4.h f117382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gs4.n f117383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f117384c;

    public r(vt4.h suggestedBarDelegateMapper, bp4.g localizationProvider, gs4.n transactionSectionMapper) {
        Intrinsics.checkNotNullParameter(suggestedBarDelegateMapper, "suggestedBarDelegateMapper");
        Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
        Intrinsics.checkNotNullParameter(transactionSectionMapper, "transactionSectionMapper");
        this.f117382a = suggestedBarDelegateMapper;
        this.f117383b = transactionSectionMapper;
        this.f117384c = new l(new TextLocalisedClause(R$string.credit_card_instalment_term_header_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f117367a, new e0(this, 27), new p(this, 0), new dbg.b(this, 11));
    }
}

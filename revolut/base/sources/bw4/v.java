package bw4;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements cli.n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f19240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final he2.b f19241b;

    public v(vt4.e creditCardPaymentSourceMapper, gte.a featureToggleInteractor, he2.b creditCardSectionMapper, gs4.l instalmentDocumentMapper) {
        Intrinsics.checkNotNullParameter(creditCardPaymentSourceMapper, "creditCardPaymentSourceMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardSectionMapper, "creditCardSectionMapper");
        Intrinsics.checkNotNullParameter(instalmentDocumentMapper, "instalmentDocumentMapper");
        this.f19240a = featureToggleInteractor;
        this.f19241b = creditCardSectionMapper;
    }

    public static ResourceImage a(v vVar) {
        return new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("id_credit_card_statement_financing_summary_title", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_section_summary_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f19225a, new bq7.j(this, 19), new t(this, 0), new b88.o(this, 20));
    }
}

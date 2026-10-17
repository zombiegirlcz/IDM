package nsc;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.sca_prompt.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nmb.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd.k f218789a;

    public o(nd.k beneficiaryNameProvider) {
        Intrinsics.checkNotNullParameter(beneficiaryNameProvider, "beneficiaryNameProvider");
        this.f218789a = beneficiaryNameProvider;
    }

    public final RowDelegate.Model a(String str, int i, RecipientPaymentsSettings recipientPaymentsSettings, boolean z) {
        pf pfVar;
        String strK = com.google.android.gms.internal.mlkit_vision_face.a.k(i, str, "_");
        Clause clauseI = this.f218789a.i(recipientPaymentsSettings.f79672a);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_logo_revolut, new Color.Solid(R$attr.uikit_colorBlack), new Color.Solid(R$attr.uikit_colorWhite)), null, null, false, null, false, 62);
        if (z) {
            pfVar = new pf(new TextLocalisedClause(R$string.crypto_sca_trusted_entities_add, null, null, 14), null, null, false, null, null, 510);
        } else {
            pfVar = null;
        }
        return new RowDelegate.Model(strK, image40, clauseI, null, 0, null, null, null, 0, pfVar, false, null, false, null, null, null, null, null, null, recipientPaymentsSettings, null, 0, 0, 0, 0, 532675576);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f218778a, new nrb.c(this, 8), new v(27), new nrd.i(this, 2));
        int i = n.f218788a[domainState.f218779b.ordinal()];
        TextLocalisedClause textLocalisedClause = null;
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_sca_trusted_entities_subtitle, null, null, 14);
        } else if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new h(textLocalisedClause, list);
    }
}

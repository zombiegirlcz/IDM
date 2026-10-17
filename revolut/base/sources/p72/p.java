package p72;

import c12.x;
import c12.z;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f233538a;

    public p(z apmRecipientListExtension) {
        Intrinsics.checkNotNullParameter(apmRecipientListExtension, "apmRecipientListExtension");
        this.f233538a = apmRecipientListExtension;
    }

    public final x a(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new x(new ApmRecipientListInputData(ApmMultibanco.f61815c, transferDirection, new TextLocalisedClause(R$string.apm_select_contact_search_placeholder, null, null, 14)), this.f233538a);
    }
}

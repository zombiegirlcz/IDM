package wal;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.shared.feature.suspicious_transaction.api.models.Agreement;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements p {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tal.e f295982a;

    public j(tal.e uiModelsMapper) {
        Intrinsics.checkNotNullParameter(uiModelsMapper, "uiModelsMapper");
        this.f295982a = uiModelsMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SuspiciousTransactionDialog.Screen.RiskAgreement riskAgreement = domainState.f295975c;
        tal.f fVar = (tal.f) this.f295982a;
        tal.a aVarA = fVar.a(riskAgreement);
        SuspiciousTransactionDialog.Screen.RiskAgreement riskAgreement2 = domainState.f295975c;
        RowDelegate.Model modelC = fVar.c(riskAgreement2.e);
        Agreement agreement = riskAgreement2.f;
        boolean z = domainState.f295974b;
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("LIST_ID_AGREEMENT_DESCRIPTION", (Clause) null, (Clause) new TextClause(agreement.f104903a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        TextClause textClause = new TextClause(agreement.f104904b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(agreement.f104905c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause3 = new TextClause(agreement.f104905c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (!z) {
            textClause3 = null;
        }
        List listK = v.k(model, new InputTextDelegate.Model("LIST_ID_AGREEMENT_INPUT", null, textClause, textClause2, false, null, false, textClause3, null, null, null, null, null, false, null, null, z, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -131214, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new e(ue0.e.J(modelC, listK), fVar.b(riskAgreement2, domainState.f295973a), aVarA);
    }
}

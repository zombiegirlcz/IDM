package hr7;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import ip0.zj;
import java.util.List;
import kl7.z1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Clause textLocalisedClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RequestedDocument requestedDocument = domainState.f154786a;
        int i = j.f154790a[requestedDocument.f75302b.ordinal()];
        if (i == 1) {
            String str = requestedDocument.i;
            textLocalisedClause = str == null ? new TextLocalisedClause(R$string.car_insurance_requested_documents_rejection_reason_title_driving_licence_main_driver, null, null, 14) : new TextLocalisedClause(R$string.car_insurance_requested_documents_rejection_reason_title_driving_licence_additional_driver, u.c(str), null, 12);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_requested_documents_rejection_reason_title_no_claims_statement, null, null, 14);
        } else if (i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_requested_documents_rejection_reason_title_proof_of_driving_experience, null, null, 14);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextClause(requestedDocument.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        z1 z1Var = requestedDocument.f75302b;
        Intrinsics.checkNotNullParameter(z1Var, "<this>");
        ComplexImage.Regular regular = new ComplexImage.Regular(mra.d.B(zq7.i.f324416a[z1Var.ordinal()] == 1 ? "3D186" : "3D021"));
        zj zjVar = zj.REGULAR;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.car_insurance_requested_documents_rejection_reason_comment_title, null, null, 14);
        String str2 = requestedDocument.f75304g;
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("FULL_SCREEN_STATE_ID", textLocalisedClause2, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, regular, zjVar, null, false, null, null, false, 0, 0, 31680);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new g(textLocalisedClause, u.c(model));
    }
}

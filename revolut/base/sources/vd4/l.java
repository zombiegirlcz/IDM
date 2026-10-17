package vd4;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import vd4.h;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        String str;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str2 = domainState.f287779c;
        h hVar = domainState.d;
        TextClause textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_manual_underwriting_upload_add_password_document_password, null, null, 14);
        boolean z = false;
        boolean z3 = hVar != null;
        if (hVar instanceof h.b) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_manual_underwriting_upload_add_password_incorrect_password, null, null, 14);
        } else {
            if (!(hVar instanceof h.a)) {
                if (hVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = null;
                InputTextDelegate.Model model = new InputTextDelegate.Model("view-id-password-input", textClause, null, textLocalisedClause3, false, textLocalisedClause, null, null, null, null, null, false, null, null, z3, false, 129, 0, null, false, false, null, true, null, false, false, false, null, null, 0, -539099276, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                yp0.b.l(model, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
                List listC = u.c(model);
                str = domainState.f287779c;
                if (str != null && str.length() != 0 && !domainState.e && hVar == null) {
                    z = true;
                }
                return new i(listC, z);
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_error_generic, null, null, 14);
        }
        textLocalisedClause = textLocalisedClause2;
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("view-id-password-input", textClause, null, textLocalisedClause3, false, textLocalisedClause, null, null, null, null, null, false, null, null, z3, false, 129, 0, null, false, false, null, true, null, false, false, false, null, null, 0, -539099276, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
        List listC2 = u.c(model2);
        str = domainState.f287779c;
        if (str != null) {
            z = true;
        }
        return new i(listC2, z);
    }
}

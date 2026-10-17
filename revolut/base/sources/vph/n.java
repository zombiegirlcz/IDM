package vph;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f291218a;

    public n(l nameFilter) {
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        this.f291218a = nameFilter;
    }

    public final List a(String str, moh.a validationStatus) {
        boolean z;
        TextLocalisedClause textLocalisedClause;
        n nVar;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(validationStatus, "validationStatus");
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_screener_new_screener_collection_name, null, null, 14);
        int[] iArr = m.f291217a;
        switch (iArr[validationStatus.ordinal()]) {
            case 1:
            case 2:
                z = false;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                z = true;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        boolean z3 = z;
        switch (iArr[validationStatus.ordinal()]) {
            case 1:
            case 2:
            case 5:
                textLocalisedClause = null;
                nVar = this;
                List listC = u.c(new InputTextDelegate.Model("screener-list-id", textClause, null, textLocalisedClause3, false, null, false, textLocalisedClause, null, null, null, null, null, true, 40, null, z3, false, false, false, null, 0, null, null, false, false, null, null, true, u.c(nVar.f291218a), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610793100, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 3:
                textLocalisedClause2 = new TextLocalisedClause(R$string.screener_edit_name_error_too_long, null, null, 14);
                nVar = this;
                textLocalisedClause = textLocalisedClause2;
                List listC2 = u.c(new InputTextDelegate.Model("screener-list-id", textClause, null, textLocalisedClause3, false, null, false, textLocalisedClause, null, null, null, null, null, true, 40, null, z3, false, false, false, null, 0, null, null, false, false, null, null, true, u.c(nVar.f291218a), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610793100, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                return listC2;
            case 4:
                textLocalisedClause2 = new TextLocalisedClause(R$string.screener_edit_name_error_too_short, null, null, 14);
                nVar = this;
                textLocalisedClause = textLocalisedClause2;
                List listC22 = u.c(new InputTextDelegate.Model("screener-list-id", textClause, null, textLocalisedClause3, false, null, false, textLocalisedClause, null, null, null, null, null, true, 40, null, z3, false, false, false, null, 0, null, null, false, false, null, null, true, u.c(nVar.f291218a), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610793100, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
                yp0.b.k(listC22, 0, 0, 0, 0, 31);
                return listC22;
            case 6:
                textLocalisedClause2 = new TextLocalisedClause(R$string.screener_edit_name_error_name_already_exists, null, null, 14);
                nVar = this;
                textLocalisedClause = textLocalisedClause2;
                List listC222 = u.c(new InputTextDelegate.Model("screener-list-id", textClause, null, textLocalisedClause3, false, null, false, textLocalisedClause, null, null, null, null, null, true, 40, null, z3, false, false, false, null, 0, null, null, false, false, null, null, true, u.c(nVar.f291218a), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610793100, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
                yp0.b.k(listC222, 0, 0, 0, 0, 31);
                return listC222;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

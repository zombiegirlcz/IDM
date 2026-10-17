package c55;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBorrower;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static tf a() {
        return new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
    }

    public static TextLocalisedClause b(List list, LoanBackupCard.ExternalCard externalCard) {
        int i = R$string.loan_management_details_backup_card_other_user_card;
        String str = externalCard.f70130b;
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            LoanBorrower loanBorrower = (LoanBorrower) it8.next();
            if (Intrinsics.f(str, loanBorrower.f70138a)) {
                String str2 = loanBorrower.f70140c;
                return new TextLocalisedClause(i, zhm.u.c((str2 == null || kotlin.text.d0.W(str2)) ? new TextLocalisedClause(R$string.loan_management_details_borrower_co_borrower, null, null, 14) : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

package p9d;

import com.revolut.core.model.faq.FaqNode;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TrackableClause;
import com.revolut.feature.shared.help_centre.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i {
    public static final TrackableClause a(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        return new TrackableClause(clause, R$string.help_center_main_screen_accessibility_label);
    }

    public static final TextLocalisedClause b(FaqNode faqNode) {
        return faqNode instanceof FaqNode.Category ? new TextLocalisedClause(R$string.help_center_action_open_category, u.c(((FaqNode.Category) faqNode).f51425b), null, 12) : faqNode instanceof FaqNode.Topic ? new TextLocalisedClause(R$string.help_center_action_open_topic, u.c(((FaqNode.Topic) faqNode).f51431b), null, 12) : new TextLocalisedClause(R$string.help_center_action_open_article, u.c(faqNode.getF51435b()), null, 12);
    }

    public static final TextLocalisedClause c(PigeonNode pigeonNode) {
        gj0.c cVar = pigeonNode.f51436c;
        String str = pigeonNode.f51435b;
        int i = h.f234300a[cVar.ordinal()];
        if (i == 1) {
            return pigeonNode.f51437g == null ? new TextLocalisedClause(R$string.help_center_action_open_category, u.c(str), null, 12) : new TextLocalisedClause(R$string.help_center_action_open_topic, u.c(str), null, 12);
        }
        if (i == 2 || i == 3) {
            return new TextLocalisedClause(R$string.help_center_action_open_article, u.c(str), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}

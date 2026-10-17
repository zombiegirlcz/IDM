package kzj;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.limits.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f191119b;
        AccountId accountId = domainState.f191118a;
        if (accountId instanceof AccountId.Personal) {
            textLocalisedClause = new TextLocalisedClause(R$string.limits_screen_title, null, null, 14);
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.limits_screen_joint_title, null, null, 14);
        }
        return new c(textLocalisedClause, list);
    }
}

package zhf;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.j3;
import com.revolut.core.ui_kit.delegates.k3;
import com.revolut.core.ui_kit.delegates.l3;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.chat_widget.TransactionChatWidgetParcel$Retry;
import com.revolut.kompot.common.R$string;
import gw0.l;
import gw0.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f322405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f322406b;

    public d(thf.g transactionRowMapper, thf.d transactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionRowMapper, "transactionRowMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        this.f322405a = transactionRowMapper;
        this.f322406b = transactionIconResourcesMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState instanceof i) {
            return new y50.c(new ChatItemsDelegate.Model(new l3(1), ((i) domainState).f322418a, new gw0.i(t.SINGLE), null, l.NORMAL, null, null, 131048));
        }
        if (domainState instanceof h) {
            return new y50.c(new ChatItemsDelegate.Model(new k3(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), (ComplexImage.Regular) null, TransactionChatWidgetParcel$Retry.f92029a, 8), ((h) domainState).f322417a, new gw0.i(t.SINGLE), null, l.NORMAL, null, null, 131048));
        }
        if (!(domainState instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        j jVar2 = (j) domainState;
        return new y50.c(new ChatItemsDelegate.Model(new j3(u.c(((anf.k) this.f322405a).p(jVar2.f322420b, jVar2.f322421c, new thf.f(false, 3))), null), jVar2.f322419a, new gw0.i(t.SINGLE), null, l.NORMAL, null, null, 131048));
    }
}

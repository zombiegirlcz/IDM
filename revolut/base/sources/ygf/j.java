package ygf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import y66.q;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.h f313660a;

    public j(a9e.h subscriptionsItemMapper) {
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        this.f313660a = subscriptionsItemMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f((List) iii.c.f(domainState.f313648a, new ye1.m(24), new yd8.a(9), new q(this, domainState, 9)), u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ADD_NEW_SUBSCRIPTION_MENU_ID", new TextLocalisedClause(R$string.subscriptions_list_action_new, null, null, 14), null, 60)));
    }
}

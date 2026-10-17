package xwb;

import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import xo8.j0;
import xti.k;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {
    public static lw0.a a() {
        return new lw0.a(new TextLocalisedClause(R$string.gift_cards_purchase_title, null, null, 14), null, null, null, false, 30);
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(t1.t(domainState.f309343b, domainState.f309344c), new xub.e(this, 20), new k(this), new j0(7, domainState, this));
    }
}

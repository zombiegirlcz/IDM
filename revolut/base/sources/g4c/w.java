package g4c;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolut_shop.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4c.l f140495a;

    public w(i4c.l orderMapper) {
        Intrinsics.checkNotNullParameter(orderMapper, "orderMapper");
        this.f140495a = orderMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new m(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_purchase_history_title, null, null, 14), (List) iii.c.f(t1.t(domainState.f140475a, domainState.f140476b), new g3e.h(this, 20), new g3e.s(22), new fnk.o(this, 19)));
    }
}

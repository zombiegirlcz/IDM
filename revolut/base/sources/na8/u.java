package na8;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.JuniorIsaChildCreationScreenContract$InputData;
import ip0.lr;
import ip0.pr;
import ip0.rr;
import ip0.sr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorIsaChildCreationScreenContract$InputData f213848a;

    public u(JuniorIsaChildCreationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f213848a = inputData;
    }

    public static InputTextDelegate.Model b(u uVar, String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, lr lrVar, List list, boolean z, int i) {
        TextLocalisedClause textLocalisedClause4 = (i & 8) != 0 ? null : textLocalisedClause3;
        sr srVar = (i & 16) != 0 ? rr.f166227a : pr.f165860a;
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, textLocalisedClause, textLocalisedClause2, null, false, null, false, textLocalisedClause4, null, null, null, null, null, false, null, null, (i & 256) != 0 ? false : z, false, false, false, (i & 32) != 0 ? new lr(540673) : lrVar, 0, null, srVar, (i & 64) != 0, (i & 512) == 0, null, null, false, (i & 128) != 0 ? f0.f322471a : list, false, false, null, false, false, (i & 1024) == 0 ? 2 : 0, false, false, null, null, null, null, 0, 0, 0, 0, -1193410696, 65519);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final g a(boolean z) {
        return this.f213848a.f76778a == null ? new g(new TextLocalisedClause(R$string.junior_trading_child_creation_action_title, null, null, 14), z) : new g(new TextLocalisedClause(R$string.junior_trading_child_details_review_cta_confirm_details, null, null, 14), z);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(t1.t(domainState.f213828a, domainState.f213830c), new n7h.c(this, 14), new n8i.e(this, 4), new m88.c(this, domainState, 25));
    }

    public final m d() {
        return this.f213848a.f76778a == null ? new m(new TextLocalisedClause(R$string.junior_trading_child_creation_header_title, null, null, 14), null) : new m(new TextLocalisedClause(R$string.junior_trading_child_details_review_header_title, null, null, 14), new TextLocalisedClause(R$string.junior_trading_child_details_review_header_subtitle, null, null, 14));
    }
}

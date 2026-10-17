package nuc;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import njj.c1;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f219295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qhf.a f219296b;

    public p(whf.n transactionsListMapper, qhf.a transactionActionsMapper) {
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        Intrinsics.checkNotNullParameter(transactionActionsMapper, "transactionActionsMapper");
        this.f219295a = transactionsListMapper;
        this.f219296b = transactionActionsMapper;
    }

    public static m a(h hVar) {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_STATE_LIST_ID", new TextLocalisedClause(R$string.security_hub_hidden_transactions_empty_selection_title, null, null, 14), new TextLocalisedClause(R$string.security_hub_hidden_transactions_empty_selection_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_arrow_right_left, null, null, 6)), hVar.f219285c ? null : new l6(12, new TextLocalisedClause(R$string.security_hub_hidden_transactions_empty_button, null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(model);
        boolean z = hVar.f219285c;
        return new m(listC, false, true, z, f0.f322471a, z || hVar.f219284b.length() > 0, 48);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f219283a, new nrd.g(this, domainState), new nsl.d(this, 4), new c1(this, domainState, 8));
    }
}

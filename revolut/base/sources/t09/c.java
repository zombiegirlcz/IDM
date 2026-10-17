package t09;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.learn.shared.impl.R$string;
import ip0.ti0;
import ip0.ui0;
import ip0.xi0;
import ip0.zj;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q09.g0;
import q09.l;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f266959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f266960b;

    public c(h09.a contentCardsMapper, h09.f rewardMapper) {
        Intrinsics.checkNotNullParameter(contentCardsMapper, "contentCardsMapper");
        Intrinsics.checkNotNullParameter(rewardMapper, "rewardMapper");
        this.f266959a = u.c(new xi0("LOADING_ITEM_ID"));
        this.f266960b = u.c(new ui0("ERROR_ITEM_ID", u.c(new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.investmentlearn_start_lesson_error_generic, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.investmentlearn_start_lesson_error_generic_primary_button, null, null, 14), false, null, null, true, 0, 0, 31684)), (ti0) null, 12));
    }

    @Override // jki.p
    public final m a(i iVar) {
        l domainState = (l) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g0) iii.c.f(domainState.f241192a, new sx8.a(this, 8), new suf.a(this, 14), new sa5.b(this, domainState, 21));
    }
}

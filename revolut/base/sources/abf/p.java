package abf;

import a2f.q;
import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreenContract$AssetDraft;
import com.revolut.retail.common.ui.R$string;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements cli.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2963a = w.y0(new a92.d(7));

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Collection collectionValues = domainState.f2953b.values();
        boolean z = false;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it8 = collectionValues.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((TransferOutAssetSelectionScreenContract$AssetDraft) it8.next()).f91638b) {
                    z = true;
                    break;
                }
            }
        }
        return new m(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.common_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, null, 988), null, null, 55), d0.E0((Iterable) iii.c.f(domainState.f2952a, new a9h.b(this, 16), new a9d.p(5), new q(this, domainState, 8)), (List) this.f2963a.getValue()));
    }
}

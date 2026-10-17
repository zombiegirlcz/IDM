package aw1;

import au6.a3;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nii.g0;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends oki.h implements m {

    @NotNull
    public static final o Companion = new o();
    public final zu1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sv1.d f10661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.feature.apm.core.ui.api.navigation.a f10662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f10663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f10664s;

    public q(zu1.a brebInteractor, sv1.d dialogsProvider, com.revolut.feature.apm.core.ui.api.navigation.a registrationExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(brebInteractor, "brebInteractor");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(registrationExtension, "registrationExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = brebInteractor;
        this.f10661p = dialogsProvider;
        this.f10662q = registrationExtension;
        this.f10663r = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f10664s = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f10664s, new a3(continuation, this, 3)), null, null, new avk.i(this, continuation, 2), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I2(RowDelegate.Model model) {
        String str;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        String str2 = model.f53228a;
        if (obj2 instanceof Alias) {
            if (a0.H(str2, "ITEM_ACTIVE_ALIAS_ID_", false)) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.alias.Alias");
                Alias alias = (Alias) obj2;
                rv1.r rVar = (rv1.r) this.o;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(alias, "alias");
                rVar.f257673b.a(alias);
                B2();
                return;
            }
            Object[] objArr = 0;
            if (a0.H(str2, "ITEM_PENDING_ALIAS_ID_", false)) {
                yji.l.a1(this, X1(new y0("PENDING_DIALOG_ID", new g0(new TextLocalisedClause(R$string.apm_alias_unfreeze_dialog_pending_title, null, null, 14), new TextLocalisedClause(R$string.apm_alias_unfreeze_dialog_pending_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 4)), null, null, new akb.s(this, objArr == true ? 1 : 0, 25), 3);
                return;
            }
            if (a0.H(str2, "ITEM_OCCUPIED_ALIAS_ID_", false)) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.alias.Alias");
                Alias alias2 = (Alias) obj2;
                AliasStatus aliasStatus = alias2.f61880c;
                AliasStatus.OCCUPIED occupied = aliasStatus instanceof AliasStatus.OCCUPIED ? (AliasStatus.OCCUPIED) aliasStatus : null;
                if (occupied == null || (str = occupied.f61889b) == null) {
                    return;
                }
                C2(new k(alias2.f61879b, str));
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f10663r;
    }
}

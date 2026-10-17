package bi2;

import au6.a3;
import be7.s;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewAliasNavigation$InputData;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends oki.h implements d {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.apm.core.ui.api.navigation.a f15388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v02.b f15389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final os2.g f15390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v02.c f15391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f15392t;
    public final z1 u;

    public o(f settingsInteractor, com.revolut.feature.apm.core.ui.api.navigation.a aliasRegistrationExtension, v02.b aliasDeregisterExtension, os2.g newAliasNavigationProvider, v02.c aliasDialogMapper, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        Intrinsics.checkNotNullParameter(aliasRegistrationExtension, "aliasRegistrationExtension");
        Intrinsics.checkNotNullParameter(aliasDeregisterExtension, "aliasDeregisterExtension");
        Intrinsics.checkNotNullParameter(newAliasNavigationProvider, "newAliasNavigationProvider");
        Intrinsics.checkNotNullParameter(aliasDialogMapper, "aliasDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = settingsInteractor;
        this.f15388p = aliasRegistrationExtension;
        this.f15389q = aliasDeregisterExtension;
        this.f15390r = newAliasNavigationProvider;
        this.f15391s = aliasDialogMapper;
        this.f15392t = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.u = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.u, new a3(continuation, this, 21)), null, null, new n(this, continuation, 0), 3);
    }

    public final void I2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Continuation continuation = null;
        if (Intrinsics.f(model.f53228a, "ITEM_ALIAS_NEW")) {
            os2.g gVar = this.f15390r;
            gVar.getClass();
            C1(new com.revolut.kompot.common.b(e1(new c12.b(new ApmNewAliasNavigation$InputData(new TextLocalisedClause(R$string.wero_new_alias_title, null, null, 14), ApmWero.f61829c, (ApmAliasRegistrationMode) null, (ApmFooterContent.TextOnly) null, 28), (com.revolut.feature.apm.core.ui.api.navigation.a) gVar.f229224b)), (ModalDestination.Style) null, 6));
            return;
        }
        Object obj2 = model.u;
        if (obj2 instanceof Alias) {
            Alias alias = (Alias) obj2;
            ((j12.b) this.f15389q).Z2(alias, new beg.k(this, alias, 11));
        } else if (obj2 instanceof RegisterAlias$Alias) {
            l2(new s(this, (RegisterAlias$Alias) obj2, continuation, 8), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f15392t;
    }
}

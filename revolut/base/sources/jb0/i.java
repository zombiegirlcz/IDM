package jb0;

import aa0.s;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.backend_flow.impl.ui.base_form_screen.FormScreenSaveStateDelegate;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import iz1.p;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t0;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import org.jmrtd.lds.LDSFile;
import sa0.k;
import vkm.q;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends k implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gb0.a f172543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s f172544t;
    public final y u;
    public final hb0.j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gb0.a pagingExtension, s selectionInteractor, j stateMapper, c70.a clipboard, j60.a bottomDialogExtension, qa0.b externalNavigationExtension, FormScreen screen) {
        super(stateMapper, clipboard, externalNavigationExtension, bottomDialogExtension);
        Intrinsics.checkNotNullParameter(pagingExtension, "pagingExtension");
        Intrinsics.checkNotNullParameter(selectionInteractor, "selectionInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f172543s = pagingExtension;
        this.f172544t = selectionInteractor;
        EntitiesSelectionItem entitiesSelectionItemJ = ue8.c.J(screen);
        Set set = entitiesSelectionItemJ.d;
        Set set2 = set.isEmpty() ? entitiesSelectionItemJ.f63426g : null;
        FormScreen formScreenJ = FormScreen.J(screen, u.c(EntitiesSelectionItem.d(entitiesSelectionItemJ, set2 != null ? set2 : set, null, LDSFile.EF_SOD_TAG)), null, null, null, 65533);
        m70.a.c(t0.f186434a);
        this.u = mra.d.b(this, new d(formScreenJ, "", null), stateMapper, new FormScreenSaveStateDelegate(), false, 8);
        this.v = new hb0.j(this, 1);
    }

    @Override // yji.l
    public final void I1() {
        gb0.f fVar = (gb0.f) this.f172543s;
        fVar.getClass();
        hb0.j storage = this.v;
        Intrinsics.checkNotNullParameter(storage, "storage");
        fVar.f142212q = storage;
        Flow flowB = this.u.B(new h0() { // from class: jb0.h
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((d) obj2).f172538b;
            }
        });
        b.Companion companion = kotlin.time.b.INSTANCE;
        l.a1(this, q.q(new ahe.i(new vkm.y(new p(this, null, 21), t1.f(flowB, kotlin.time.c.g(300, pkm.e.MILLISECONDS))), 4)), null, null, new hp4.e(2, this.f172543s, gb0.a.class, "onNewSearch", "onNewSearch(Ljava/lang/String;)V", 4, 26), 3);
    }

    @Override // sa0.k
    public final void L2(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        H2(this.u, new f(screen, 0));
    }

    @Override // sa0.a
    public final void W0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        H2(this.u, new ik3.a(query, 29));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}

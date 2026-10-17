package yb0;

import aa0.s;
import cli.y;
import com.revolut.core.backend_flow.impl.ui.base_form_screen.FormScreenSaveStateDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.SelectedTransaction;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import r10.q;
import sa0.k;
import tof.a3;
import vkm.j2;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends k implements e {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f312148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dc0.f f312149t;
    public final s u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set f312150w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f312151x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h f312152y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q interactor, dc0.f pagingExtension, s selectionInteractor, j stateMapper, j60.a bottomDialogExtension, qa0.b externalNavigationExtension, c70.a clipboard, FormScreen screen) {
        super(stateMapper, clipboard, externalNavigationExtension, bottomDialogExtension);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pagingExtension, "pagingExtension");
        Intrinsics.checkNotNullParameter(selectionInteractor, "selectionInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f312148s = interactor;
        this.f312149t = pagingExtension;
        this.u = selectionInteractor;
        this.v = hx7.a.r(screen).f63704a;
        this.f312150w = hx7.a.r(screen).f;
        m70.a.c(t0.f186434a);
        this.f312151x = mra.d.b(this, new d(screen, "", new Data(null, null, true, 3, null), null), stateMapper, new FormScreenSaveStateDelegate(), false, 8);
        this.f312152y = new h(this);
    }

    @Override // yji.l
    public final void I1() {
        dc0.f fVar = this.f312149t;
        fVar.getClass();
        h storage = this.f312152y;
        Intrinsics.checkNotNullParameter(storage, "storage");
        fVar.f112783r = storage;
        l2(new y7i.h(this, null, 3), new y8a.h(this, 14));
    }

    @Override // sa0.k
    public final void L2(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        H2(this.f312151x, new jb0.f(screen, 3));
    }

    public final void M2(v9l.a aVar) {
        FormScreen formScreen = ((d) ((j2) this.f312151x.f22677a).getValue()).f312143a;
        a3 a3Var = aVar.f287078a;
        String str = a3Var.f272581b;
        String str2 = a3Var.f272609r;
        if (str2 == null) {
            str2 = "";
        }
        dj0.d dVar = a3Var.k;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(a3Var.f272591g.getMillis()), ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(...)");
        L2(this.u.c(formScreen, this.v, new SelectedTransaction(str, str2, dVar, oi0.d.R(localDateTimeOfInstant))));
    }

    @Override // sa0.a
    public final void W0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        H2(this.f312151x, new y9d.c(query, 5));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f312151x;
    }
}

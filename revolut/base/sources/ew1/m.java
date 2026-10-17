package ew1;

import cli.y;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends oki.h implements j {
    public final Alias o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zu1.a f129995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sv1.d f129996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.feature.apm.core.ui.api.navigation.a f129997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f129998s;

    public m(Alias alias, zu1.a brebInteractor, sv1.d dialogsProvider, com.revolut.feature.apm.core.ui.api.navigation.a registrationExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(brebInteractor, "brebInteractor");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(registrationExtension, "registrationExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = alias;
        this.f129995p = brebInteractor;
        this.f129996q = dialogsProvider;
        this.f129997r = registrationExtension;
        this.f129998s = mra.d.b(this, new e(alias), stateMapper, null, false, 12);
    }

    public static final void I2(m mVar, zz1.e eVar, int i) {
        mVar.f129996q.getClass();
        mVar.X1(sv1.d.b(eVar, i));
        if (eVar == zz1.e.COMPLETED) {
            mVar.C2(f.f129988a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f129998s;
    }
}

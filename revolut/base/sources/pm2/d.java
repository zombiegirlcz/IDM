package pm2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThemeCustomisationContract$InputData f237463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uhl.b f237464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f237465c;
    public final e4m.e d;
    public final e4m.e e;

    public d(c cVar, ThemeCustomisationContract$InputData themeCustomisationContract$InputData, uhl.b bVar) {
        this.f237465c = cVar;
        this.f237463a = themeCustomisationContract$InputData;
        this.f237464b = bVar;
        int i = 17;
        this.d = e4m.b.b(new pa6.f(cVar, this, 1, i));
        this.e = e4m.b.b(new pa6.f(cVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}

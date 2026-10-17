package cu1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.blik.impl.ui.settings.BlikSettingsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlikSettingsContract$InputData f108771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f108772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f108773c;
    public final e4m.e d;

    public p(k kVar, BlikSettingsContract$InputData blikSettingsContract$InputData) {
        this.f108772b = kVar;
        this.f108771a = blikSettingsContract$InputData;
        int i = 25;
        this.f108773c = e4m.b.b(new bt7.e(kVar, this, 0, i));
        this.d = e4m.b.b(new bt7.e(kVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f108773c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

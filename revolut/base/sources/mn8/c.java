package mn8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoparentsSettingsScreenContract$InputData f207419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f207420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f207421c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f207422g;

    public c(o oVar, BaseScreen baseScreen, CoparentsSettingsScreenContract$InputData coparentsSettingsScreenContract$InputData) {
        this.f207419a = coparentsSettingsScreenContract$InputData;
        this.f207420b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 19;
        this.f207421c = e4m.b.b(new mjl.b(oVar, this, 2, i));
        this.d = e4m.b.b(new mjl.b(oVar, this, 1, i));
        this.e = e4m.b.b(new mjl.b(oVar, this, 0, i));
        this.f = e4m.b.b(new mjl.b(oVar, this, 4, i));
        this.f207422g = e4m.b.b(new mjl.b(oVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}

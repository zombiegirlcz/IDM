package kyk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NationalitiesScreenContract$InputData f190949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f190950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f190951c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f190952g;

    public j(v vVar, f fVar, BaseScreen baseScreen, NationalitiesScreenContract$InputData nationalitiesScreenContract$InputData) {
        this.f190949a = nationalitiesScreenContract$InputData;
        this.f190950b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 21;
        this.f190951c = e4m.b.b(new il8.d(vVar, fVar, this, 2, i));
        this.d = e4m.b.b(new il8.d(vVar, fVar, this, 1, i));
        this.e = e4m.b.b(new il8.d(vVar, fVar, this, 0, i));
        this.f = e4m.b.b(new il8.d(vVar, fVar, this, 4, i));
        this.f190952g = e4m.b.b(new il8.d(vVar, fVar, this, 3, i));
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

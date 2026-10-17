package ku5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityScreenContract$InputData f189662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f189663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f189664c;
    public final e4m.e d;
    public final e4m.e e;

    public e(f fVar, ActivityScreenContract$InputData activityScreenContract$InputData) {
        this.f189663b = fVar;
        this.f189662a = activityScreenContract$InputData;
        int i = 6;
        this.f189664c = e4m.b.b(new kr9.m(fVar, this, 1, i));
        this.d = e4m.b.b(new kr9.m(fVar, this, 2, i));
        this.e = e4m.b.b(new kr9.m(fVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}

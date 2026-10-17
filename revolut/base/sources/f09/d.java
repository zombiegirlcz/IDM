package f09;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreenContract$InputData;
import eyd.j;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnHomeScreenContract$InputData f131055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f131056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f131057c;
    public final e4m.e d;

    public d(e eVar, LearnHomeScreenContract$InputData learnHomeScreenContract$InputData) {
        this.f131056b = eVar;
        this.f131055a = learnHomeScreenContract$InputData;
        int i = 10;
        this.f131057c = e4m.b.b(new j(eVar, this, 1, i));
        this.d = e4m.b.b(new j(eVar, this, 0, i));
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

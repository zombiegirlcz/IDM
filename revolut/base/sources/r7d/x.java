package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.top_level.TopLevelFaqScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopLevelFaqScreenContract$InputData f252189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252191c;
    public final e4m.e d;
    public final e4m.e e;

    public x(l lVar, t tVar, TopLevelFaqScreenContract$InputData topLevelFaqScreenContract$InputData) {
        this.f252189a = topLevelFaqScreenContract$InputData;
        this.f252190b = e4m.b.b(new w(lVar, tVar, this, 1, 0));
        int i = 0;
        this.f252191c = e4m.b.b(new w(lVar, tVar, this, 0, i));
        this.d = e4m.b.b(new w(lVar, tVar, this, 3, i));
        this.e = e4m.b.b(new w(lVar, tVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f252191c.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}

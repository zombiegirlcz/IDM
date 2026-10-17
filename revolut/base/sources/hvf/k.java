package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitSectionScreenContract$InputData f155924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f155925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155926c;
    public final e4m.e d;

    public k(q qVar, r rVar, TransitSectionScreenContract$InputData transitSectionScreenContract$InputData) {
        this.f155925b = qVar;
        this.f155924a = transitSectionScreenContract$InputData;
        int i = 7;
        this.f155926c = e4m.b.b(new hjg.b(qVar, this, 1, i));
        this.d = e4m.b.b(new hjg.b(qVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155925b.f155949n.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}

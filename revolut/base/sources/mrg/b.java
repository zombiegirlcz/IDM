package mrg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.view.image.core.BaseViewImageContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseViewImageContract$InputData f208122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f208123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f208124c;

    public b(c cVar, d dVar, BaseViewImageContract$InputData baseViewImageContract$InputData) {
        this.f208122a = baseViewImageContract$InputData;
        int i = 24;
        this.f208123b = e4m.b.b(new mjl.b(cVar, this, 1, i));
        this.f208124c = e4m.b.b(new mjl.b(cVar, this, 0, i));
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

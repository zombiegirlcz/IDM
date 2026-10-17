package nl5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.spare.change.impl.ui.change_spare_change.ChangeSpareChangeScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChangeSpareChangeScreenContract$InputData f217008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f217009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f217010c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f217011g;

    public d(e eVar, BaseScreen baseScreen, ChangeSpareChangeScreenContract$InputData changeSpareChangeScreenContract$InputData) {
        this.f217008a = changeSpareChangeScreenContract$InputData;
        this.f217009b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 5;
        this.f217010c = e4m.b.b(new nk7.e(this, 2, i));
        this.d = e4m.b.b(new nk7.e(this, 1, i));
        this.e = e4m.b.b(new nk7.e(this, 0, i));
        this.f = e4m.b.b(new nk7.e(this, 4, i));
        this.f217011g = e4m.b.b(new nk7.e(this, 3, i));
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

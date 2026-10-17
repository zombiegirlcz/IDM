package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class o8 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadingScreenContract$InputData f119468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119470c;

    public o8(c1 c1Var, LoadingScreenContract$InputData loadingScreenContract$InputData) {
        this.f119468a = loadingScreenContract$InputData;
        int i = 2;
        this.f119469b = e4m.b.b(new f6(this, 1, i));
        this.f119470c = e4m.b.b(new f6(this, 0, i));
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

package lal;

import com.google.common.collect.ImmutableSet;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.loading.LoadingScreenContract$InputData;
import java.util.Set;
import l9f.z;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadingScreenContract$InputData f193436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f193437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193438c;

    public e(k kVar, l lVar, LoadingScreenContract$InputData loadingScreenContract$InputData) {
        this.f193436a = loadingScreenContract$InputData;
        int i = 3;
        this.f193437b = e4m.b.b(new z(kVar, this, 1, i));
        this.f193438c = e4m.b.b(new z(kVar, this, 0, i));
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

package lal;

import com.google.common.collect.ImmutableSet;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel.CancelScreenContract$InputData;
import java.util.Set;
import l9f.z;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancelScreenContract$InputData f193431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f193432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193433c;
    public final e4m.e d;

    public c(k kVar, l lVar, CancelScreenContract$InputData cancelScreenContract$InputData) {
        this.f193431a = cancelScreenContract$InputData;
        int i = 2;
        this.f193432b = e4m.b.b(new z(kVar, this, 2, i));
        this.f193433c = e4m.b.b(new z(kVar, this, 1, i));
        this.d = e4m.b.b(new z(kVar, this, 0, i));
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

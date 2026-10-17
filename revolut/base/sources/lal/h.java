package lal;

import com.google.common.collect.ImmutableSet;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.SimpleConfirmationScreenContract$InputData;
import java.util.Set;
import l9f.z;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleConfirmationScreenContract$InputData f193445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f193446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193447c;
    public final e4m.e d;

    public h(k kVar, l lVar, SimpleConfirmationScreenContract$InputData simpleConfirmationScreenContract$InputData) {
        this.f193445a = simpleConfirmationScreenContract$InputData;
        int i = 4;
        this.f193446b = e4m.b.b(new z(kVar, this, 2, i));
        this.f193447c = e4m.b.b(new z(kVar, this, 1, i));
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

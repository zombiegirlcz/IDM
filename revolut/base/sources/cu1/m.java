package cu1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.blik.impl.ui.confirmation.BlikConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlikConfirmationScreenContract$InputData f108763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f108764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f108765c;

    public m(k kVar, o oVar, BlikConfirmationScreenContract$InputData blikConfirmationScreenContract$InputData) {
        this.f108763a = blikConfirmationScreenContract$InputData;
        int i = 24;
        this.f108764b = e4m.b.b(new bt7.e(kVar, this, 1, i));
        this.f108765c = e4m.b.b(new bt7.e(kVar, this, 0, i));
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

package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser.ReasonForTransferChooserScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReasonForTransferChooserScreenContract$InputData f199074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f199075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199076c;

    public q(i iVar, c cVar, ReasonForTransferChooserScreenContract$InputData reasonForTransferChooserScreenContract$InputData) {
        this.f199074a = reasonForTransferChooserScreenContract$InputData;
        int i = 8;
        this.f199075b = e4m.b.b(new ljl.y(this, 1, i));
        this.f199076c = e4m.b.b(new ljl.y(this, 0, i));
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

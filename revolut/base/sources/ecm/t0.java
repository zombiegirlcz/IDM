package ecm;

import com.google.common.base.Preconditions;
import gcm.q4;

/* JADX INFO: loaded from: classes13.dex */
public final class t0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f124876a;

    public t0(v0 v0Var) {
        this.f124876a = (v0) Preconditions.checkNotNull(v0Var, "result");
    }

    @Override // ecm.y0
    public final v0 a(q4 q4Var) {
        return this.f124876a;
    }

    public final String toString() {
        return "FixedResultPicker(" + this.f124876a + ")";
    }
}

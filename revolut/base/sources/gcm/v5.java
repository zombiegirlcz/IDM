package gcm;

/* JADX INFO: loaded from: classes22.dex */
public final class v5 extends z5 {
    @Override // gcm.z5
    public final boolean o(w5 w5Var) {
        synchronized (w5Var) {
            try {
                if (w5Var.f142933c != 0) {
                    return false;
                }
                w5Var.f142933c = -1;
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // gcm.z5
    public final void p(w5 w5Var) {
        synchronized (w5Var) {
            w5Var.f142933c = 0;
        }
    }
}

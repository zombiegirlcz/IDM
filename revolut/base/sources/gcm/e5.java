package gcm;

import com.revolut.tracking.v3.RawEvent;

/* JADX INFO: loaded from: classes13.dex */
public final class e5 implements g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RawEvent f142630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f142631b;

    public e5(x2 x2Var, RawEvent rawEvent) {
        this.f142631b = x2Var;
        this.f142630a = rawEvent;
    }

    @Override // gcm.g5
    public final void a(m5 m5Var) {
        m5Var.f142773a.c(this.f142631b.f142940a.c(this.f142630a));
        m5Var.f142773a.flush();
    }
}

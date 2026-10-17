package wfm;

import efm.c0;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends c0 {
    public static final r d = new r("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f297192c = d;

    @Override // efm.c0
    public final c0.a b() {
        return new q(this.f297192c);
    }
}

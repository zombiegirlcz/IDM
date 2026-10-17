package vgm;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends Scheduler {
    public static final n d = new n("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f289241c = d;

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final fgm.o b() {
        return new l(this.f289241c);
    }
}

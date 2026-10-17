package q80;

import android.os.MessageQueue;
import kotlin.Unit;
import skm.l;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements MessageQueue.IdleHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f242957a;

    public a(l lVar) {
        this.f242957a = lVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        m.Companion companion = m.INSTANCE;
        this.f242957a.resumeWith(Unit.f186387a);
        return false;
    }
}

package h8;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import mmm.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149920a = 0;

    public /* synthetic */ a(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ReentrantLock reentrantLock;
        f fVarB;
        switch (this.f149920a) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
                break;
            default:
                super.run();
                return;
        }
        while (true) {
            try {
                f.Companion.getClass();
                reentrantLock = f.f207259j;
                reentrantLock.lock();
                try {
                    f.Companion.getClass();
                    fVarB = mmm.c.b();
                    f.Companion.getClass();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (fVarB == f.i) {
                f.Companion.getClass();
                f.i = null;
                return;
            } else {
                Unit unit = Unit.f186387a;
                reentrantLock.unlock();
                if (fVarB != null) {
                    fVarB.l();
                }
            }
        }
    }

    public /* synthetic */ a(Runnable runnable, String str) {
        super(runnable, str);
    }

    public /* synthetic */ a(String str) {
        super(str);
    }
}

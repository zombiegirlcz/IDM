package ch;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f24085b;

    public /* synthetic */ r(Runnable runnable, int i) {
        this.f24084a = i;
        this.f24085b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24084a) {
            case 0:
                Deque deque = (Deque) i.f24027b.get();
                Preconditions.checkNotNull(deque);
                Runnable runnable = this.f24085b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                i.f24027b.set(new ArrayDeque());
                this.f24085b.run();
                break;
        }
    }
}

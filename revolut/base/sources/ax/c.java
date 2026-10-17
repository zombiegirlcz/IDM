package ax;

import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c {
    private c() {
    }

    public static Object a(Future future) {
        Object obj2;
        Intrinsics.checkNotNullParameter(future, "future");
        boolean z = false;
        while (true) {
            try {
                obj2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th10) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th10;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj2;
    }
}

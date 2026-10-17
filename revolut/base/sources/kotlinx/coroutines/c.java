package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import qza.q;
import skm.y;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c extends CoroutineDispatcher implements Closeable, AutoCloseable {
    static {
        y baseKey = CoroutineDispatcher.Key;
        q safeCast = new q(10);
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        if (baseKey != null) {
            f fVar = baseKey.f186403b;
        }
    }

    public abstract Executor m();
}

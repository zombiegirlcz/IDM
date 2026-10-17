package mgm;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends AtomicReference implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj2, Object obj3) {
        Throwable th10 = (Throwable) obj3;
        BiConsumer biConsumer = (BiConsumer) get();
        if (biConsumer != null) {
            biConsumer.accept(obj2, th10);
        }
    }
}

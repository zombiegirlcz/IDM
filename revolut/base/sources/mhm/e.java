package mhm;

import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import nhm.p;

/* JADX INFO: loaded from: classes13.dex */
public interface e extends Iterable {
    @Override // java.lang.Iterable
    default void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer, "action is null");
        p it8 = iterator();
        while (it8.hasNext()) {
            consumer.accept(it8.next());
        }
    }

    boolean isEmpty();

    @Override // java.lang.Iterable
    p iterator();

    @Override // java.lang.Iterable
    default Spliterator spliterator() {
        return Spliterators.spliterator(iterator(), isEmpty() ? 0L : 1L, 17488);
    }
}

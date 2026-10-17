package mhm;

import java.io.Serializable;
import java.util.Objects;
import java.util.function.Function;

/* JADX INFO: loaded from: classes13.dex */
public interface b extends Serializable, Function {
    @Override // java.util.function.Function
    default Function andThen(Function function) {
        Objects.requireNonNull(function, "after is null");
        return new a(this, function, 1);
    }

    Object apply(Object obj2);

    @Override // java.util.function.Function
    default Function compose(Function function) {
        Objects.requireNonNull(function, "before is null");
        return new a(this, function, 0);
    }
}

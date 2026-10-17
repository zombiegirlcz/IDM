package obm;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj2, Object obj3) {
        return ((Predicate) obj2).or((Predicate) obj3);
    }
}

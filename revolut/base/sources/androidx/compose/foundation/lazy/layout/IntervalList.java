package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0010J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\u0004H¦\u0002J6\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u000b0\u000fH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList;", "T", "", "size", "", "getSize", "()I", "get", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "index", "forEach", "", "fromIndex", "toIndex", "block", "Lkotlin/Function1;", "Interval", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IntervalList<T> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "T", "", "startIndex", "", "size", "value", "<init>", "(IILjava/lang/Object;)V", "getStartIndex", "()I", "getSize", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Interval<T> {
        private final int size;
        private final int startIndex;
        private final T value;

        public Interval(int i, int i2, T t2) {
            this.startIndex = i;
            this.size = i2;
            this.value = t2;
            if (!(i >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("startIndex should be >= 0");
            }
            if (i2 > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("size should be > 0");
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T getValue() {
            return this.value;
        }
    }

    void forEach(int fromIndex, int toIndex, @NotNull Function1<? super Interval<? extends T>, Unit> block);

    @NotNull
    Interval<T> get(int index);

    int getSize();
}

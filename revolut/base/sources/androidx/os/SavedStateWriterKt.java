package androidx.os;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"androidx/savedstate/SavedStateWriterKt__SavedStateWriter_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public abstract class SavedStateWriterKt {
    @NotNull
    public static final <T> ArrayList<T> toArrayListUnsafe(@NotNull Collection<?> collection) {
        return SavedStateWriterKt__SavedStateWriter_androidKt.toArrayListUnsafe(collection);
    }
}

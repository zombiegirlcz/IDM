package androidx.room.util;

import androidx.collection.ArrayMap;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"androidx/room/util/RelationUtil__RelationUtil_androidKt"}, d2 = {}, k = 4, mv = {2, 0, 0}, xi = 48)
public abstract class RelationUtil {
    public static final <K, V> void recursiveFetchArrayMap(@NotNull ArrayMap<K, V> arrayMap, boolean z, @NotNull Function1<? super ArrayMap<K, V>, Unit> function1) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchArrayMap(arrayMap, z, function1);
    }

    public static final <K, V> void recursiveFetchHashMap(@NotNull HashMap<K, V> map, boolean z, @NotNull Function1<? super HashMap<K, V>, Unit> function1) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchHashMap(map, z, function1);
    }
}

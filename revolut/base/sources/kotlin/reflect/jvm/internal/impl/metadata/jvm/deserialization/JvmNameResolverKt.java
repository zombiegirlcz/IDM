package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class JvmNameResolverKt {
    @NotNull
    public static final List<JvmProtoBuf.StringTableTypes.Record> toExpandedRecordsList(@NotNull List<JvmProtoBuf.StringTableTypes.Record> list) {
        ArrayList arrayListY = a.y("<this>", list);
        arrayListY.ensureCapacity(list.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list) {
            int range = record.getRange();
            for (int i = 0; i < range; i++) {
                arrayListY.add(record);
            }
        }
        arrayListY.trimToSize();
        return arrayListY;
    }
}

package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements Internal.EnumLiteMap {
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i) {
        return JvmProtoBuf.StringTableTypes.Record.Operation.valueOf(i);
    }
}

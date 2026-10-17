package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* JADX INFO: loaded from: classes14.dex */
public final class p implements Internal.EnumLiteMap {
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i) {
        return ProtoBuf.Expression.ConstantValue.valueOf(i);
    }
}

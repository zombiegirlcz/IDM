package yim;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import zim.g;
import zim.n0;
import zim.o2;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d {
    public static final n0 a(Function function) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                Pair<JvmNameResolver, ProtoBuf.Function> functionDataFrom = JvmProtoBufUtil.readFunctionDataFrom(strArrD1, metadata.d2());
                JvmNameResolver jvmNameResolver = (JvmNameResolver) functionDataFrom.f186385a;
                ProtoBuf.Function function2 = (ProtoBuf.Function) functionDataFrom.f186386b;
                MetadataVersion metadataVersion = new MetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = function.getClass();
                ProtoBuf.TypeTable typeTable = function2.getTypeTable();
                Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
                return new n0(g.f322635b, (SimpleFunctionDescriptor) o2.f(cls, function2, jvmNameResolver, new TypeTable(typeTable), metadataVersion, c.f));
            }
        }
        return null;
    }
}

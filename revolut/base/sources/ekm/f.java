package ekm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ProtoBuf.Type p0 = (ProtoBuf.Type) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return TypeDeserializer.simpleType$default((TypeDeserializer) this.receiver, p0, false, 2, null);
    }
}

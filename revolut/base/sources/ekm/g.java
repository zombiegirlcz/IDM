package ekm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class g extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        KotlinTypeRefiner p0 = (KotlinTypeRefiner) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new c((DeserializedClassDescriptor) this.receiver, p0);
    }
}

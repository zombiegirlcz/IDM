package akm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e(1, ValueParameterDescriptor.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ValueParameterDescriptor p0 = (ValueParameterDescriptor) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.declaresDefaultValue());
    }
}

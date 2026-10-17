package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class DescriptorBasedDeprecationInfoKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DescriptorBasedDeprecationInfoKt$DEPRECATED_FUNCTION_KEY$1 f187592a = new DescriptorBasedDeprecationInfoKt$DEPRECATED_FUNCTION_KEY$1();

    @NotNull
    public static final CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo> getDEPRECATED_FUNCTION_KEY() {
        return f187592a;
    }
}

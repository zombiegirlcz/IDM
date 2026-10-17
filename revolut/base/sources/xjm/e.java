package xjm;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306590a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f306590a) {
            case 0:
                DescriptorRendererOptions descriptorRendererOptions = (DescriptorRendererOptions) obj2;
                descriptorRendererOptions.setWithDefinedIn(false);
                descriptorRendererOptions.setVerbose(true);
                descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
                descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
                break;
        }
        return (CallableMemberDescriptor) obj2;
    }
}

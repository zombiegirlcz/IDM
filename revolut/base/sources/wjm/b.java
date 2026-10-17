package wjm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DescriptorRendererImpl f298165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinBuiltIns f298166c;

    public /* synthetic */ b(DescriptorRendererImpl descriptorRendererImpl, KotlinBuiltIns kotlinBuiltIns, int i) {
        this.f298164a = i;
        this.f298165b = descriptorRendererImpl;
        this.f298166c = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f298164a;
        KotlinBuiltIns kotlinBuiltIns = this.f298166c;
        DescriptorRendererImpl descriptorRendererImpl = this.f298165b;
        switch (i) {
            case 0:
                int i2 = DescriptorRendererImpl.f187537c;
                ClassifierNamePolicy classifierNamePolicy = descriptorRendererImpl.getClassifierNamePolicy();
                ClassDescriptor collection = kotlinBuiltIns.getCollection();
                Intrinsics.checkNotNullExpressionValue(collection, "getCollection(...)");
                String strRenderClassifier = classifierNamePolicy.renderClassifier(collection, descriptorRendererImpl);
                return d0.z0(strRenderClassifier, "Collection", strRenderClassifier);
            default:
                int i3 = DescriptorRendererImpl.f187537c;
                ClassifierNamePolicy classifierNamePolicy2 = descriptorRendererImpl.getClassifierNamePolicy();
                ClassDescriptor array = kotlinBuiltIns.getArray();
                Intrinsics.checkNotNullExpressionValue(array, "getArray(...)");
                String strRenderClassifier2 = classifierNamePolicy2.renderClassifier(array, descriptorRendererImpl);
                return d0.z0(strRenderClassifier2, "Array", strRenderClassifier2);
        }
    }
}

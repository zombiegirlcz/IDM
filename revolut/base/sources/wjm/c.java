package wjm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DescriptorRendererImpl f298168b;

    public /* synthetic */ c(DescriptorRendererImpl descriptorRendererImpl, int i) {
        this.f298167a = i;
        this.f298168b = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f298167a;
        DescriptorRendererImpl descriptorRendererImpl = this.f298168b;
        switch (i) {
            case 0:
                TypeProjection it8 = (TypeProjection) obj2;
                int i2 = DescriptorRendererImpl.f187537c;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8.isStarProjection()) {
                    return "*";
                }
                KotlinType type = it8.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                String strRenderType = descriptorRendererImpl.renderType(type);
                if (it8.getProjectionKind() == Variance.INVARIANT) {
                    return strRenderType;
                }
                return it8.getProjectionKind() + p.SPACE_CHAR + strRenderType;
            default:
                KotlinType kotlinType = (KotlinType) obj2;
                int i3 = DescriptorRendererImpl.f187537c;
                Intrinsics.h(kotlinType);
                return descriptorRendererImpl.renderType(kotlinType);
        }
    }
}

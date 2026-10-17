package wjm;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import zhm.a1;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f298152b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f298153c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public static final a f = new a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f298154g = new a(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f298155h = new a(6);
    public static final a i = new a(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f298156j = new a(8);
    public static final a k = new a(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f298157l = new a(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f298158m = new a(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f298159n = new a(12);
    public static final a o = new a(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f298160p = new a(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f298161q = new a(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f298162r = new a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298163a;

    public /* synthetic */ a(int i2) {
        this.f298163a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f298163a) {
            case 0:
                DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.setModifiers(h0.f322473a);
                return Unit.f186387a;
            case 1:
                DescriptorRendererOptions withOptions2 = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion2 = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions2, "$this$withOptions");
                withOptions2.setTextFormat(RenderingFormat.HTML);
                withOptions2.setModifiers(DescriptorRendererModifier.ALL);
                return Unit.f186387a;
            case 2:
                DescriptorRendererOptions withOptions3 = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion3 = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions3, "$this$withOptions");
                withOptions3.setWithDefinedIn(false);
                return Unit.f186387a;
            case 3:
                DescriptorRendererOptions withOptions4 = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion4 = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions4, "$this$withOptions");
                withOptions4.setWithDefinedIn(false);
                withOptions4.setModifiers(h0.f322473a);
                return Unit.f186387a;
            case 4:
                DescriptorRendererOptions withOptions5 = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion5 = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions5, "$this$withOptions");
                withOptions5.setWithDefinedIn(false);
                withOptions5.setModifiers(h0.f322473a);
                withOptions5.setWithoutSuperTypes(true);
                return Unit.f186387a;
            case 5:
                DescriptorRendererOptions withOptions6 = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion6 = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions6, "$this$withOptions");
                withOptions6.setModifiers(h0.f322473a);
                withOptions6.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                withOptions6.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
                return Unit.f186387a;
            case 6:
                DescriptorRendererOptions withOptions7 = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion7 = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions7, "$this$withOptions");
                withOptions7.setWithDefinedIn(false);
                withOptions7.setModifiers(h0.f322473a);
                withOptions7.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                withOptions7.setWithoutTypeParameters(true);
                withOptions7.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.NONE);
                withOptions7.setReceiverAfterName(true);
                withOptions7.setRenderCompanionObjectName(true);
                withOptions7.setWithoutSuperTypes(true);
                withOptions7.setStartFromName(true);
                return Unit.f186387a;
            case 7:
                DescriptorRendererOptions withOptions8 = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion8 = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions8, "$this$withOptions");
                withOptions8.setModifiers(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
                return Unit.f186387a;
            case 8:
                DescriptorRendererOptions withOptions9 = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion9 = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions9, "$this$withOptions");
                withOptions9.setModifiers(DescriptorRendererModifier.ALL);
                return Unit.f186387a;
            case 9:
                DescriptorRendererOptions withOptions10 = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion10 = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions10, "$this$withOptions");
                withOptions10.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                withOptions10.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
                return Unit.f186387a;
            case 10:
                DescriptorRendererOptions withOptions11 = (DescriptorRendererOptions) obj2;
                DescriptorRenderer.Companion companion11 = DescriptorRenderer.Companion;
                Intrinsics.checkNotNullParameter(withOptions11, "$this$withOptions");
                withOptions11.setDebugMode(true);
                withOptions11.setClassifierNamePolicy(ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
                withOptions11.setModifiers(DescriptorRendererModifier.ALL);
                return Unit.f186387a;
            case 11:
                KotlinType it8 = (KotlinType) obj2;
                int i2 = DescriptorRendererImpl.f187537c;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) it8).getOriginalTypeVariable() : it8;
            case 12:
                int i3 = DescriptorRendererImpl.f187537c;
                return "";
            case 13:
                DescriptorRendererOptions withOptions12 = (DescriptorRendererOptions) obj2;
                int i5 = DescriptorRendererImpl.f187537c;
                Intrinsics.checkNotNullParameter(withOptions12, "$this$withOptions");
                withOptions12.setExcludedTypeAnnotationClasses(a1.l(withOptions12.getExcludedTypeAnnotationClasses(), v.k(StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams)));
                return Unit.f186387a;
            case 14:
                KotlinType it9 = (KotlinType) obj2;
                KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.Y;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9;
            case 15:
                KProperty[] kPropertyArr2 = DescriptorRendererOptionsImpl.Y;
                Intrinsics.checkNotNullParameter((ValueParameterDescriptor) obj2, "it");
                return "...";
            default:
                String it10 = (String) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10;
        }
    }
}

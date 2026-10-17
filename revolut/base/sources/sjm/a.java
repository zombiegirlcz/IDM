package sjm;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f263742b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f263743c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263744a;

    public /* synthetic */ a(int i) {
        this.f263744a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        AnnotationsContainerWithConstants loadConstantFromProperty = (AnnotationsContainerWithConstants) obj2;
        MemberSignature it8 = (MemberSignature) obj3;
        switch (this.f263744a) {
            case 0:
                int i = AbstractBinaryClassAnnotationAndConstantLoader.f187047c;
                Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
                Intrinsics.checkNotNullParameter(it8, "it");
                return loadConstantFromProperty.getAnnotationParametersDefaultValues().get(it8);
            default:
                int i2 = AbstractBinaryClassAnnotationAndConstantLoader.f187047c;
                Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
                Intrinsics.checkNotNullParameter(it8, "it");
                return loadConstantFromProperty.getPropertyConstants().get(it8);
        }
    }
}

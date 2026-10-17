package cjm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import zhm.u;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JvmBuiltInsCustomizer f24728b;

    public /* synthetic */ d(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, int i) {
        this.f24727a = i;
        this.f24728b = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24727a) {
            case 0:
                return Annotations.Companion.create(u.c(AnnotationUtilKt.createDeprecatedAnnotation$default(this.f24728b.f186508a.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
            default:
                SimpleType anyType = this.f24728b.f186508a.getBuiltIns().getAnyType();
                Intrinsics.checkNotNullExpressionValue(anyType, "getAnyType(...)");
                return anyType;
        }
    }
}

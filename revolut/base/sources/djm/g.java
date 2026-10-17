package djm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FqName f115414b;

    public /* synthetic */ g(FqName fqName, int i) {
        this.f115413a = i;
        this.f115414b = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f115413a) {
            case 0:
                FqName it8 = (FqName) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(!it8.isRoot() && Intrinsics.f(it8.parent(), this.f115414b));
            default:
                Annotations it9 = (Annotations) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.mo3787findAnnotation(this.f115414b);
        }
    }
}

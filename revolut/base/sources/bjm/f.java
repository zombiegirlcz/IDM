package bjm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PrimitiveType f16208b;

    public /* synthetic */ f(PrimitiveType primitiveType, int i) {
        this.f16207a = i;
        this.f16208b = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16207a) {
            case 0:
                return PrimitiveType.a(this.f16208b);
            default:
                return PrimitiveType.b(this.f16208b);
        }
    }
}

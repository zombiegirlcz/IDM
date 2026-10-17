package fbm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends u implements Function1 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f133564h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, int i) {
        super(1);
        this.f = i;
        this.f133564h = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f) {
            case 0:
                Function1 it8 = (Function1) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.invoke(this.f133564h);
            default:
                Iterable iterable = (Iterable) obj2;
                Intrinsics.checkNotNullParameter(iterable, "$this$null");
                for (Object obj3 : iterable) {
                    if (Intrinsics.f(obj3, this.f133564h)) {
                        return obj3;
                    }
                }
                return null;
        }
    }
}

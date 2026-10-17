package h3l;

import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f149242b;

    public /* synthetic */ i(l lVar, int i) {
        this.f149241a = i;
        this.f149242b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f149241a) {
            case 0:
                mm.d dVar = this.f149242b.k;
                k3l.j result = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof k3l.h) {
                    return dVar.c0(new c(((k3l.h) result).f180818a));
                }
                if (result instanceof k3l.i) {
                    return dVar.c0(new d(((k3l.i) result).f180819a));
                }
                if (result instanceof k3l.g) {
                    return dVar.c0(new b(((k3l.g) result).f180817a));
                }
                if (!(result instanceof k3l.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                k3l.f fVar = (k3l.f) result;
                return dVar.c0(new a(fVar.f180815a, fVar.f180816b));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                return this.f149242b.k.c0(new b((StatusViewConfiguration) obj3));
        }
    }
}

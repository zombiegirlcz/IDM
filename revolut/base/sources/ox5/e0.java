package ox5;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xzg.n0 f230574b;

    public /* synthetic */ e0(xzg.n0 n0Var, int i) {
        this.f230573a = i;
        this.f230574b = n0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f230573a) {
            case 0:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return l.a(update, null, null, null, null, null, null, null, null, 0, this.f230574b, null, false, null, null, false, 32255);
            default:
                List assets = (List) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                xzg.n0 n0Var = this.f230574b;
                Intrinsics.h(n0Var);
                return new w0h.e(assets, n0Var);
        }
    }
}

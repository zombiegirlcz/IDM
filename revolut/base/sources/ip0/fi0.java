package ip0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class fi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ii0 f164268b;

    public /* synthetic */ fi0(ii0 ii0Var, int i) {
        this.f164267a = i;
        this.f164268b = ii0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        aw0.n6 it8 = (aw0.n6) obj2;
        switch (this.f164267a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f164268b;
    }
}

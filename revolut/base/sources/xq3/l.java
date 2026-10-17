package xq3;

import ft3.d1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f308083b;

    public /* synthetic */ l(d1 d1Var, int i) {
        this.f308082a = i;
        this.f308083b = d1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yoj.f it8 = (yoj.f) obj2;
        switch (this.f308082a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return Boolean.valueOf(tp3.b.a(it8, this.f308083b));
    }
}

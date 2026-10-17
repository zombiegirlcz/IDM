package ip0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class xm0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ an0 f167197b;

    public /* synthetic */ xm0(an0 an0Var, int i) {
        this.f167196a = i;
        this.f167197b = an0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f167196a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f167197b;
    }
}

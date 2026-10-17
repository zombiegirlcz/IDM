package t3b;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f267723b;

    public /* synthetic */ b(e eVar, int i) {
        this.f267722a = i;
        this.f267723b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        switch (this.f267722a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f267723b.getClass();
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f267723b.getClass();
                break;
        }
        return new tx0.l(null, 7);
    }
}

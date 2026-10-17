package m2j;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ efm.p f202029b;

    public /* synthetic */ f(efm.p pVar, int i) {
        this.f202028a = i;
        this.f202029b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202028a) {
            case 0:
                Long it8 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Long it9 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
            case 2:
                Long it10 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                break;
            case 3:
                Long it11 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                break;
            default:
                Long it12 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                break;
        }
        return this.f202029b;
    }
}

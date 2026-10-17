package ip0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class in implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn f164717b;

    public /* synthetic */ in(kn knVar, int i) {
        this.f164716a = i;
        this.f164717b = knVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f164716a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
            case 2:
                aw0.m9 it10 = (aw0.m9) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new mn(this.f164717b, it10.f10429a);
            default:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                break;
        }
        return this.f164717b;
    }
}

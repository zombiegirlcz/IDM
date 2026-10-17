package ip0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ph implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh f165825b;

    public /* synthetic */ ph(rh rhVar, int i) {
        this.f165824a = i;
        this.f165825b = rhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f165824a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f165825b;
    }
}

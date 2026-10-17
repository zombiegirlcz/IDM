package e5e;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wuk.j;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k3h.d f122814b;

    public /* synthetic */ e(k3h.d dVar, int i) {
        this.f122813a = i;
        this.f122814b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f122813a) {
            case 0:
                ((c) obj2).getClass();
                k3h.d ratingsState = this.f122814b;
                Intrinsics.checkNotNullParameter(ratingsState, "ratingsState");
                return new c(ratingsState);
            default:
                return j.f((j) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f122814b, null, null, null, null, null, null, null, null, null, 8380415);
        }
    }
}

package fb7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f133473b;

    public /* synthetic */ e0(n nVar, int i) {
        this.f133472a = i;
        this.f133473b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f133472a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j.a(update, this.f133473b, false, null, null, false, 126);
            default:
                return j.a((j) obj2, this.f133473b, false, null, null, false, 126);
        }
    }
}

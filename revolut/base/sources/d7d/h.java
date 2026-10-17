package d7d;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f111926b;

    public /* synthetic */ h(n nVar, int i) {
        this.f111925a = i;
        this.f111926b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        switch (this.f111925a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f111926b.z2(it8);
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f111926b.z2(it8);
                break;
        }
        return Boolean.TRUE;
    }
}

package f9g;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg0.e f132951b;

    public /* synthetic */ g(m mVar, lg0.e eVar, int i) {
        this.f132950a = i;
        this.f132951b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        switch (this.f132950a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return m.f(this.f132951b);
    }
}

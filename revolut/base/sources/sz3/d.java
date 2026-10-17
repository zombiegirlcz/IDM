package sz3;

import efm.d0;
import efm.i;
import efm.k;
import efm.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kdh.b f266752b;

    public /* synthetic */ d(kdh.b bVar, int i) {
        this.f266751a = i;
        this.f266752b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        switch (this.f266751a) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return r.error(this.f266752b.r0(throwable));
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return d0.l(this.f266752b.r0(throwable));
            case 2:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return efm.b.n(this.f266752b.r0(throwable));
            case 3:
                Intrinsics.checkNotNullParameter(throwable, "error");
                return k.f(this.f266752b.r0(throwable));
            default:
                Intrinsics.checkNotNullParameter(throwable, "error");
                return i.c(this.f266752b.r0(throwable));
        }
    }
}

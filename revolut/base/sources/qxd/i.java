package qxd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f250080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f250081c;

    public /* synthetic */ i(long j2, k kVar, int i) {
        this.f250079a = i;
        this.f250080b = j2;
        this.f250081c = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f250079a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, new dj0.d(this.f250080b, this.f250081c.o.f88200a), null, false, false, 14);
            default:
                return e.a((e) obj2, null, new dj0.d(this.f250080b, this.f250081c.o.f88200a), false, false, 13);
        }
    }
}

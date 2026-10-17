package eli;

import ej9.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f127468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rjg.a f127469c;

    public /* synthetic */ d(j jVar, rjg.a aVar, int i) {
        this.f127467a = i;
        this.f127468b = jVar;
        this.f127469c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f127467a) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return this.f127468b.e(throwable, this.f127469c).toFlowable(efm.a.BUFFER);
            case 1:
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                return this.f127468b.e(throwable2, this.f127469c).toFlowable(efm.a.BUFFER);
            case 2:
                efm.i errors = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(errors, "errors");
                s sVar = new s(new d(this.f127468b, this.f127469c, 1), 11);
                int i = efm.i.f125385a;
                return errors.f(sVar, i, i);
            default:
                efm.i errors2 = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(errors2, "errors");
                s sVar2 = new s(new d(this.f127468b, this.f127469c, 0), 9);
                int i2 = efm.i.f125385a;
                return errors2.f(sVar2, i2, i2);
        }
    }
}

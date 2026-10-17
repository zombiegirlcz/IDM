package qpf;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f248389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf0.c f248390c;

    public /* synthetic */ i(l lVar, jf0.c cVar, int i) {
        this.f248388a = i;
        this.f248389b = lVar;
        this.f248390c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f248388a) {
            case 0:
                List result = (List) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                a3 a3Var = (a3) d0.d0(result);
                if (a3Var == null) {
                    throw new IllegalStateException("Transaction needs to be present locally for troubleshooter deeplink");
                }
                this.f248389b.f248394b.c(u0.f(l.d(a3Var, this.f248390c)));
                break;
                break;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f248389b.f248394b.c(l.b(this.f248390c.e(2)));
                break;
        }
        return Boolean.TRUE;
    }
}

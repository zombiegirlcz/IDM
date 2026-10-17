package yua;

import a31.x;
import com.revolut.core.error.data.model.ServerErrorException;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f316943b;

    public /* synthetic */ g(q qVar, int i) {
        this.f316942a = i;
        this.f316943b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f316942a) {
            case 0:
                hbd.a params = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params, "it");
                x xVar = (x) this.f316943b.f316963a;
                Intrinsics.checkNotNullParameter(params, "params");
                return nim.a.w(xVar.i.f(params, true), new a09.a(25));
            case 1:
                hbd.a params2 = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params2, "it");
                x xVar2 = (x) this.f316943b.f316963a;
                Intrinsics.checkNotNullParameter(params2, "params");
                return nim.a.w(xVar2.i.f(params2, false), new a09.a(25));
            default:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof HttpException) {
                    ServerErrorException.Companion companion = ServerErrorException.INSTANCE;
                    kg.o oVar = this.f316943b.k;
                    companion.getClass();
                    if (ServerErrorException.Companion.c((HttpException) throwable, oVar).f.f51362a == 6104) {
                        return d0.m(qua.q.REASON_REQUIRED);
                    }
                }
                return d0.l(throwable);
        }
    }
}

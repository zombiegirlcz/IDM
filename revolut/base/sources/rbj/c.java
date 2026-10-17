package rbj;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.data.model.Data;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f253125b;

    public /* synthetic */ c(e eVar, int i) {
        this.f253124a = i;
        this.f253125b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f253124a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                this.f253125b.getClass();
                long j2 = e.d;
                long jPow = (long) Math.pow(2.0f, iIntValue);
                if (j2 > jPow) {
                    j2 = jPow;
                }
                return r.timer(j2, TimeUnit.SECONDS);
            case 1:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Throwable error = data.getError();
                e eVar = this.f253125b;
                ServerError serverErrorA = eVar.f253127b.a(error);
                if (serverErrorA == null || serverErrorA.f51362a != 9038) {
                    return w.h(data);
                }
                ubj.h hVar = (ubj.h) eVar.f253126a;
                hVar.getClass();
                pfm.h hVar2 = new pfm.h(new ty7.b(hVar, 1), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2.g(w.h(Data.copy$default(data, null, null, false, 6, null)));
            default:
                r errors = (r) obj2;
                Intrinsics.checkNotNullParameter(errors, "errors");
                return errors.takeWhile(new rbf.c(new r7i.r(25), 5)).zipWith(r.range(1, 100), new rbf.c(new rbh.j(6), 6)).flatMap(new rbf.c(new c(this.f253125b, 0), 7));
        }
    }
}

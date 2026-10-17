package ppk;

import com.revolut.data.model.Data;
import efm.r;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vpk.v;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f238625b;

    public /* synthetic */ e(f fVar, int i) {
        this.f238624a = i;
        this.f238625b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Collection currencyPairs = (Collection) obj2;
        switch (this.f238624a) {
            case 0:
                Intrinsics.checkNotNullParameter(currencyPairs, "pairs");
                if (currencyPairs.isEmpty()) {
                    r rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.h(rVarJust);
                    return rVarJust;
                }
                v vVar = this.f238625b.f238627b;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                return nim.a.w(vVar.f291269g.f(v.b(currencyPairs), false), new vn8.a(28));
            default:
                Intrinsics.checkNotNullParameter(currencyPairs, "pairs");
                if (currencyPairs.isEmpty()) {
                    r rVarJust2 = r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.h(rVarJust2);
                    return rVarJust2;
                }
                v vVar2 = this.f238625b.f238627b;
                vVar2.getClass();
                Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                return nim.a.w(vVar2.i.f(v.b(currencyPairs), true), new vn8.a(22));
        }
    }
}

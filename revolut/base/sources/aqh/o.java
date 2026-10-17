package aqh;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f8451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScreenerSelectedFilter.Options f8452c;

    public /* synthetic */ o(v vVar, ScreenerSelectedFilter.Options options, int i) {
        this.f8450a = i;
        this.f8451b = vVar;
        this.f8452c = options;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f8450a) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                vph.o oVar = this.f8451b.f8458p;
                List list = update.f8438c;
                oVar.getClass();
                return i.a(update, vph.o.c(list, this.f8452c), null, null, false, Constants.TAG_FB_CHARGING_STATUS);
            default:
                i update2 = (i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                vph.o oVar2 = this.f8451b.f8458p;
                List list2 = update2.f8438c;
                oVar2.getClass();
                return i.a(update2, vph.o.c(list2, this.f8452c), null, null, false, Constants.TAG_FB_CHARGING_STATUS);
        }
    }
}

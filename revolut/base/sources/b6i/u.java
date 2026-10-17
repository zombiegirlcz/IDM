package b6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s6i.e f12828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.amount.c f12829c;
    public final /* synthetic */ AccountWrapper d;
    public final /* synthetic */ AccountWrapper e;

    public /* synthetic */ u(s6i.e eVar, com.revolut.feature_move_money.impl.amount.c cVar, AccountWrapper accountWrapper, AccountWrapper accountWrapper2, int i) {
        this.f12827a = i;
        this.f12828b = eVar;
        this.f12829c = cVar;
        this.d = accountWrapper;
        this.e = accountWrapper2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12827a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                com.revolut.feature_move_money.impl.amount.c cVar = this.f12829c;
                return h.a(update, this.f12828b, null, null, null, false, false, null, cVar.H.a(this.d, this.e, cVar.Q2().f12787h), 0, 382);
            default:
                h hVar = (h) obj2;
                com.revolut.feature_move_money.impl.amount.c cVar2 = this.f12829c;
                return h.a(hVar, this.f12828b, null, null, null, false, false, null, cVar2.H.a(this.d, this.e, cVar2.Q2().f12787h), 0, 382);
        }
    }
}

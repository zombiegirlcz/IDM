package in1;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hn1.a f162604b;

    public /* synthetic */ n(hn1.a aVar, int i) {
        this.f162603a = i;
        this.f162604b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f162603a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, null, this.f162604b, 255);
            default:
                mn1.h update2 = (mn1.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                hn1.a aVar = this.f162604b;
                AccountId accountId = aVar.f154030a;
                io3.d dVar = aVar.f154031b;
                return mn1.h.a(update2, null, null, accountId, dVar.f163145a, z92.f.l(dVar), aVar.f154032c, null, 67);
        }
    }
}

package amh;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g6 f6410b;

    public /* synthetic */ k(g6 g6Var, int i) {
        this.f6409a = i;
        this.f6410b = g6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f6409a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, this.f6410b.f54199a, null, null, false, null, null, 62);
            case 1:
                dnc.d updateState = (dnc.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                dnc.k kVar = dnc.l.Companion;
                String value = this.f6410b.f54199a;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                dnc.l lVar = dnc.l.STOCKS_TAB_ID;
                if (!Intrinsics.f(value, lVar.a())) {
                    lVar = dnc.l.BONDS_TAB_ID;
                    if (!Intrinsics.f(value, lVar.a())) {
                        lVar = dnc.l.COMMODITIES_TAB_ID;
                        if (!Intrinsics.f(value, lVar.a())) {
                            lVar = dnc.l.CASH_TAB_ID;
                            if (!Intrinsics.f(value, lVar.a())) {
                                throw new IllegalStateException("Unsupported");
                            }
                        }
                    }
                }
                return dnc.d.a(updateState, lVar, null, null, null, null, null, 62);
            case 2:
                hea.o update2 = (hea.o) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return hea.o.a(update2, null, false, null, null, null, this.f6410b.f54199a, null, null, false, null, null, false, null, null, false, 32735);
            case 3:
                k0e.e update3 = (k0e.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return k0e.e.a(update3, this.f6410b.f54199a, null, null, null, null, null, 126);
            case 4:
                rlh.n update4 = (rlh.n) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Data selectedCollectionId = new Data(c0h.b.valueOf(this.f6410b.f54199a), null, false, 6, null);
                Data collections = update4.f255065a;
                Intrinsics.checkNotNullParameter(collections, "collections");
                Intrinsics.checkNotNullParameter(selectedCollectionId, "selectedCollectionId");
                return new rlh.n(collections, selectedCollectionId);
            default:
                wyd.x update5 = (wyd.x) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return wyd.x.a(update5, this.f6410b.f54199a, null, null, null, null, 30);
        }
    }
}

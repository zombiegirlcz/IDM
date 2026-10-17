package lr9;

import androidx.room.RxRoom;
import efm.d0;
import java.util.List;
import k37.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f199460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199461c;

    public /* synthetic */ l(p pVar, String str, int i) {
        this.f199459a = i;
        this.f199460b = pVar;
        this.f199461c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List groupBills = (List) obj2;
        switch (this.f199459a) {
            case 0:
                Intrinsics.checkNotNullParameter(groupBills, "groupBills");
                p pVar = this.f199460b;
                yq9.e eVar = pVar.e;
                String str = this.f199461c;
                d0 d0VarFirstOrError = RxRoom.createObservable(eVar.f315999a, false, new String[]{"payments_groups_bills_splits"}, new yq9.d(eVar, str, 1)).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return new ufm.i(w.H0(d0VarFirstOrError, pVar.a(str)), new b(29, new t(groupBills, 29)), 1);
            default:
                Intrinsics.checkNotNullParameter(groupBills, "groupSettlements");
                return new ufm.i(this.f199460b.a(this.f199461c), new b(28, new t(groupBills, 28)), 1);
        }
    }
}

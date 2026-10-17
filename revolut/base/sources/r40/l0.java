package r40;

import b50.a;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import r40.b;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f251351b;

    public /* synthetic */ l0(x0 x0Var, int i) {
        this.f251350a = i;
        this.f251351b = x0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f251350a) {
            case 0:
                x0 x0Var = this.f251351b;
                b50.a it8 = (b50.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, a.C0089a.f12419a)) {
                    throw new NoWhenBranchMatchedException();
                }
                x0Var.v2(b.a.f251322a);
                return Unit.f186387a;
            case 1:
                this.f251351b.F = (Boolean) obj2;
                return Unit.f186387a;
            case 2:
                x0 x0Var2 = this.f251351b;
                Instant before = (Instant) obj2;
                Intrinsics.checkNotNullParameter(before, "lastTime");
                if (x0Var2.f251376p.d instanceof ChatListFilter.Tickets) {
                    efm.r rVarJust = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
                    Intrinsics.h(rVarJust);
                    return rVarJust;
                }
                n30.n nVar = x0Var2.f251377q;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(before, "before");
                return nim.a.w(pd.b.t(((v20.f0) nVar.f211647a).f285392p.f(new v20.m(before), true), new n30.b(nVar, 3)), new r2d.d(26));
            default:
                x0 x0Var3 = this.f251351b;
                List tickets = (List) obj2;
                Intrinsics.checkNotNullParameter(tickets, "tickets");
                List list = tickets;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((kse.a) it9.next()).f189436a);
                }
                return nim.a.v(x0Var3.f251379s.b(arrayList, w4l.h.f294642c), new q2j.j(tickets, 20));
        }
    }
}

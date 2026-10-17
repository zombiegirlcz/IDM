package e6d;

import a08.f0;
import a08.g0;
import androidx.room.util.DBUtil;
import com.revolut.core.extensions.rx.BreadcrumbException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f122970b;

    public /* synthetic */ a(r rVar, int i) {
        this.f122969a = i;
        this.f122970b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f122969a) {
            case 0:
                w5d.a item = (w5d.a) obj2;
                Intrinsics.checkNotNullParameter(item, "it");
                u5d.c cVar = this.f122970b.f122987b;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                ufm.c cVar2 = new ufm.c(new u5d.b(cVar, item, 0), 2);
                Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                break;
            case 1:
                pfm.a aVar = new pfm.a(this.f122970b.c(((yvh.b) obj2).f317181j), new g0(11, new e05.h(new BreadcrumbException(), 12)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                Intrinsics.checkNotNullExpressionValue(aVar.w(new f0(7, h.f122979a), g.f122978a), "subscribe(...)");
                break;
            case 2:
                pfm.a aVar2 = new pfm.a(this.f122970b.c(((yvh.b) obj2).f317181j), new g0(11, new e05.h(new BreadcrumbException(), 14)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                Intrinsics.checkNotNullExpressionValue(aVar2.w(new f0(7, o.f122983a), n.f122982a), "subscribe(...)");
                break;
            case 3:
                d params = (d) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                break;
            case 4:
                d params2 = (d) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                u5d.c cVar3 = this.f122970b.f122987b;
                String ownerId = params2.f122976a;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                List list = (List) DBUtil.performBlocking(cVar3.a().f286197a, true, false, new uo7.k(ownerId, 21));
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(x5d.b.y((w5d.a) it8.next()));
                }
                break;
            case 5:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
            case 6:
                pfm.a aVar3 = new pfm.a(this.f122970b.c(((yvh.b) obj2).f317181j), new g0(11, new e05.h(new BreadcrumbException(), 15)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                Intrinsics.checkNotNullExpressionValue(aVar3.w(new f0(7, q.f122985a), p.f122984a), "subscribe(...)");
                break;
            default:
                pfm.a aVar4 = new pfm.a(this.f122970b.c(((yvh.b) obj2).f317181j), new g0(11, new e05.h(new BreadcrumbException(), 13)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
                Intrinsics.checkNotNullExpressionValue(aVar4.w(new f0(7, j.f122981a), i.f122980a), "subscribe(...)");
                break;
        }
        return Unit.f186387a;
    }
}

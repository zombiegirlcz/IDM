package t73;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268437a;

    public /* synthetic */ d(int i) {
        this.f268437a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Exception {
        List list;
        zh9.a aVarY;
        List list2;
        List list3;
        switch (this.f268437a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 1:
                q0 it8 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8;
            case 2:
                q0 it9 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9;
            case 3:
                q0 it10 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10;
            case 4:
                q0 it11 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                s63.g gVar = (s63.g) it11.f268506a.getContent();
                return (gVar == null || (list = gVar.f260121b) == null) ? zhm.f0.f322471a : list;
            case 5:
                Set it12 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(!it12.contains(i93.e.ATM_WITHDRAWAL));
            case 6:
                q0 update = (q0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return q0.a(update, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554399);
            case 7:
                q0 update2 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return q0.a(update2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 32899071);
            case 8:
                q0 update3 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return q0.a(update3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33030143);
            case 9:
                q0 update4 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return q0.a(update4, null, null, null, null, new Data(null, null, false, 6, null), null, null, null, null, null, null, null, null, null, null, null, false, 33553919);
            case 10:
                q0 it13 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13;
            case 11:
                q0 update5 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return q0.a(update5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33550335);
            case 12:
                q0 update6 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return q0.a(update6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33550335);
            case 13:
                return (q0) obj2;
            case 14:
                return q0.a((q0) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554427);
            case 15:
                od0.i.Companion.getClass();
                return q0.a((q0) obj2, null, null, od0.i.f224256b, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554383);
            case 16:
                return q0.a((q0) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 32899071);
            case 17:
                zh9.i0 i0Var = (zh9.i0) ((od0.i) obj2).f224257a;
                if (i0Var == null || (aVarY = cj9.c.Y(i0Var)) == null) {
                    throw new Exception("How it works configuration must exist for cards");
                }
                return aVarY;
            case 18:
                xh9.d it14 = (xh9.d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14 instanceof xh9.b);
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return zhm.d0.E0((List) pair.f186386b, (List) pair.f186385a);
            case 20:
                q0 it15 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                s63.g gVar2 = (s63.g) it15.f268506a.getContent();
                if (gVar2 != null) {
                    return gVar2.f260121b;
                }
                return null;
            case 21:
                Map it16 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return foh.i.f(it16);
            case 22:
                q0 it17 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.d;
            case 23:
                Data cardsContentData = (Data) obj2;
                Intrinsics.checkNotNullParameter(cardsContentData, "cardsContentData");
                m63.f fVar = (m63.f) cardsContentData.getContent();
                if (fVar == null || (list2 = fVar.f202995a) == null) {
                    list2 = zhm.f0.f322471a;
                }
                m63.f fVar2 = (m63.f) cardsContentData.getContent();
                if (fVar2 == null || (list3 = fVar2.f202996b) == null) {
                    list3 = zhm.f0.f322471a;
                }
                return new s63.c(list2, cardsContentData.getLoading(), list3);
            case 24:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return zhm.d0.E0((List) pair2.f186386b, (List) pair2.f186385a);
            case 25:
                q0 it18 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.d;
            case 26:
                h93.f0 f0Var = (h93.f0) ((od0.i) obj2).f224257a;
                if (f0Var != null) {
                    return f0Var.f150110a;
                }
                return null;
            case 27:
                Data it19 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf((it19.getLoading() && it19.getContent() == null) ? false : true);
            case 28:
                q0 it20 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.d;
            default:
                return (h93.f0) ((od0.i) obj2).f224257a;
        }
    }
}

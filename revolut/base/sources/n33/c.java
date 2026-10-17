package n33;

import com.revolut.core.ui_kit.delegates.NewProductDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardActivity;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211692a;

    public /* synthetic */ c(int i) {
        this.f211692a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f211692a;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                ProductSelectionDelegate.Model it8 = (ProductSelectionDelegate.Model) obj2;
                KProperty[] kPropertyArr = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new t(it8.f52973a, it8.i);
            case 1:
                RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new t(it9.f53228a, it9.u);
            case 2:
                NewProductDelegate.Model it10 = (NewProductDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new t(it10.f52781a, it10.f);
            case 3:
                Data it11 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.h hVar = od0.i.Companion;
                Object content = it11.getContent();
                hVar.getClass();
                return od0.h.a(content);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 5:
                do3.n it12 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return do3.q.y(it12);
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                wi0.b bVar = (wi0.b) pair.f186385a;
                List list = ((e7l.f) pair.f186386b).I0;
                return Boolean.valueOf(list == null || !list.contains(bVar));
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
            case 8:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                wi0.b bVar2 = (wi0.b) pair2.f186385a;
                List list2 = ((e7l.f) pair2.f186386b).K0;
                return Boolean.valueOf(list2 != null ? list2.contains(bVar2) : false);
            case 9:
                do3.n it13 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return do3.q.y(it13);
            case 10:
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf((it14.getLoading() && it14.getContent() == null) ? false : true);
            case 11:
                Data it15 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                od0.i iVar2 = (od0.i) it15.getContent();
                return Boolean.valueOf((iVar2 != null ? (n38.a) iVar2.f224257a : null) != null);
            case 12:
                ed5.c it16 = (ed5.c) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                it16.getClass();
                return Boolean.valueOf(it16 instanceof ed5.a);
            case 13:
                yh5.a it17 = (yh5.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(yh5.b.x(it17));
            case 14:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                Boolean bool = (Boolean) pair3.f186385a;
                Boolean bool2 = (Boolean) pair3.f186386b;
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                bla.c it18 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18 == bla.c.ENABLED);
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 17:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return m72.b.x(it19, od0.i.Companion);
            case 18:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                int iIntValue = ((Number) pair4.f186385a).intValue();
                int iIntValue2 = ((Number) pair4.f186386b).intValue();
                return new h(iIntValue, iIntValue2, iIntValue2 + 1 > iIntValue);
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 20:
                do3.n it20 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return do3.q.y(it20);
            case 21:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                List list3 = (List) pair5.f186385a;
                wi0.b bVar3 = (wi0.b) pair5.f186386b;
                od0.h hVar2 = od0.i.Companion;
                cl4.o.Companion.getClass();
                cl4.o oVarA = cl4.n.a(list3, bVar3);
                hVar2.getClass();
                return od0.h.a(oVarA);
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 25:
                Pair pair6 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair6, "<destruct>");
                List list4 = (List) pair6.f186385a;
                List list5 = (List) pair6.f186386b;
                aim.e eVarB = zhm.u.b();
                eVarB.addAll(list4);
                eVarB.addAll(list5);
                return zhm.u.a(eVarB);
            case 26:
                Pair pair7 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair7, "<destruct>");
                cl4.a aVar = (cl4.a) pair7.f186385a;
                List list6 = (List) pair7.f186386b;
                od0.h hVar3 = od0.i.Companion;
                cl4.h hVar4 = new cl4.h(false, true, false, aVar.f24928a, aVar.d, aVar.e, aVar.f, null, list6);
                hVar3.getClass();
                return od0.h.a(hVar4);
            case 27:
                e7l.f it21 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Integer.valueOf(it21.f123389r);
            case 28:
                Intrinsics.checkNotNullParameter((e7l.f) obj2, "it");
                return Boolean.valueOf(!r12.Q.isEmpty());
            default:
                ty0.a it22 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(Intrinsics.f(it22.f275445a, "PERSONAL_TERMS_ID"));
        }
    }

    public /* synthetic */ c(t0 t0Var) {
        this.f211692a = 26;
    }
}

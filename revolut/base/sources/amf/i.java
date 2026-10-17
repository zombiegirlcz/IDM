package amf;

import an.f;
import android.content.res.Resources;
import androidx.room.TransactorKt;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.sqlite.SQLiteStatement;
import androidx.view.SystemBarStyle;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.p0;
import tof.a3;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6379a;

    public /* synthetic */ i(int i) {
        this.f6379a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f6379a) {
            case 0:
                Intrinsics.checkNotNullParameter((a3) obj2, "it");
                return Boolean.TRUE;
            case 1:
                return amh.h.a((amh.h) obj2, null, null, null, true, null, null, 55);
            case 2:
                return amh.h.a((amh.h) obj2, null, null, null, false, null, null, 55);
            case 3:
                hha.d it8 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return dok.g.d(it8, null);
            case 4:
                p0.b it9 = (p0.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new an.e(it9);
            case 5:
                Intrinsics.checkNotNullParameter((p0.a) obj2, "it");
                return f.a.f6504a;
            case 6:
                p0.b it10 = (p0.b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new an.i(it10);
            case 7:
                Pair pair = (Pair) obj2;
                fab.c cVar = (fab.c) pair.f186385a;
                List list = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (Intrinsics.f(((SavingsProductData) obj3).f86683a.i, cVar.f133274a)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 8:
                List recipients = (List) obj2;
                Intrinsics.checkNotNullParameter(recipients, "recipients");
                return new im9.b(d0.P0(recipients, new km9.h()), recipients.size(), 0, 0);
            case 9:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                im9.b bVar = (im9.b) pair2.f186385a;
                return new an9.m(bVar.f162318a, (List) pair2.f186386b, bVar.f162319b, bVar.f162320c, bVar.d);
            case 10:
                an9.n update = (an9.n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return an9.n.a(update, null, null, h0.f322473a, null, 27);
            case 11:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 12:
                String email = (String) obj2;
                Intrinsics.checkNotNullParameter(email, "email");
                return Boolean.valueOf(e0m.g.a(email));
            case 13:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                String str = (String) rVar.f314201a;
                return Boolean.valueOf(((!((Boolean) rVar.f314203c).booleanValue()) | (!((Boolean) new an4.g(2).invoke(str, r1)).booleanValue())) & ((Boolean) new i(12).invoke((String) rVar.f314202b)).booleanValue());
            case 14:
                InputTextDelegate.TextData textData = (InputTextDelegate.TextData) obj2;
                Intrinsics.checkNotNullParameter(textData, "textData");
                return textData.f52598b.toString();
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return anc.n.f6753a;
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
            case 17:
                alc.n it11 = (alc.n) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.h hVar = od0.i.Companion;
                PortfolioGoal portfolioGoal = it11.f6215n;
                hVar.getClass();
                return od0.h.a(portfolioGoal);
            case 18:
                alc.n it12 = (alc.n) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.i;
            case 19:
                alc.n it13 = (alc.n) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.e != null);
            case 20:
                return Boolean.valueOf(SystemBarStyle.Companion.auto$lambda$0((Resources) obj2));
            case 21:
                return Boolean.valueOf(TransactorKt.execSQL$lambda$0((SQLiteStatement) obj2));
            case 22:
                return TriggerBasedInvalidationTracker.checkInvalidatedTables$lambda$14((SQLiteStatement) obj2);
            case 23:
                r rVar2 = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                q qVar = (q) rVar2.f314201a;
                anf.q qVar2 = (anf.q) rVar2.f314202b;
                List list2 = (List) rVar2.f314203c;
                boolean z = qVar2.f7746a;
                Map map = qVar2.f7747b;
                Map map2 = qVar2.f7748c;
                List<f5j.a> list3 = list2;
                int iB = q0.b(w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (f5j.a aVar : list3) {
                    linkedHashMap.put(aVar.f132329a, aVar);
                }
                return new Data(q.a(qVar, z, map, map2, linkedHashMap, 33460223), null, false, 6, null);
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 25:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                q qVar3 = (q) pair3.f186385a;
                List<f5j.a> list4 = (List) pair3.f186386b;
                int iB2 = q0.b(w.t(list4, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                for (f5j.a aVar2 : list4) {
                    linkedHashMap2.put(aVar2.f132329a, aVar2);
                }
                return new Data(q.a(qVar3, false, null, null, linkedHashMap2, 33488895), null, false, 6, null);
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return l35.d.f191853a;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new anf.q(0);
            case 28:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return new anf.q((Map) pair4.f186386b, (Map) pair4.f186385a, true);
            default:
                whf.a extras = (whf.a) obj2;
                Intrinsics.checkNotNullParameter(extras, "extras");
                return new Data(extras, null, false, 6, null);
        }
    }
}

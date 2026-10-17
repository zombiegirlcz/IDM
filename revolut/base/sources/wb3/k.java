package wb3;

import cfl.u;
import com.revolut.shared.feature.wealth.models.portfolio.StockBuyBlock;
import ggk.g1;
import ggk.h1;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import wf6.w;
import wi6.t;
import zhm.a0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f296008b;

    public /* synthetic */ k(String str, int i) {
        this.f296007a = i;
        this.f296008b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        Object next3;
        Pair pair;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        switch (this.f296007a) {
            case 0:
                return new d(((d) obj2).f295999a, new g(this.f296008b));
            case 1:
                wca.e update = (wca.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return wca.e.a(update, null, this.f296008b, 0L, 5);
            case 2:
                return wca.e.a((wca.e) obj2, this.f296008b, null, 0L, 6);
            case 3:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                wf0.n nVar = (wf0.n) pair2.f186385a;
                wi0.b bVar = (wi0.b) pair2.f186386b;
                return new zf0.c(this.f296008b, nVar.f296907b, nVar.f296906a, bVar);
            case 4:
                wgd.g update2 = (wgd.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return wgd.g.a(update2, this.f296008b, null, 2);
            case 5:
                wi6.h update3 = (wi6.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return wi6.h.a(update3, null, null, t.I2(this.f296008b, update3.f297809c), null, null, null, null, null, null, null, null, null, 4091);
            case 6:
                wi6.h update4 = (wi6.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return wi6.h.a(update4, null, null, null, null, t.I2(this.f296008b, update4.e), null, null, null, null, null, null, null, 4079);
            case 7:
                wi6.h update5 = (wi6.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return wi6.h.a(update5, null, null, null, t.I2(this.f296008b, update5.d), null, null, null, null, null, null, null, null, 4087);
            case 8:
                wi6.h update6 = (wi6.h) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return wi6.h.a(update6, null, null, null, null, null, t.I2(this.f296008b, update6.f), null, null, null, null, null, null, 4063);
            case 9:
                h1 layout = (h1) obj2;
                Intrinsics.checkNotNullParameter(layout, "layout");
                Iterator it8 = layout.f143727b.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((g1) next).f143718a, this.f296008b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (g1) next;
            case 10:
                h1 layout2 = (h1) obj2;
                Intrinsics.checkNotNullParameter(layout2, "layout");
                Iterator it9 = layout2.f143727b.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((g1) next2).f143718a, this.f296008b)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                return (g1) next2;
            case 11:
                Map response = (Map) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                return new rfm.o(new w(response, this.f296008b, 1));
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                s7 s7Var = new s7(this.f296008b, 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return s7Var;
            case 13:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                od0.i iVar = (od0.i) hVar.f288433a;
                n4l.e eVar = (n4l.e) hVar.f288434b;
                u uVar = (u) hVar.f288435c;
                Set set = (Set) hVar.d;
                return new uih.h(this.f296008b, (StockBuyBlock) iVar.g(), eVar, set, uVar);
            case 14:
                wm3.a update7 = (wm3.a) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return wm3.a.a(update7, this.f296008b, null, false, 30);
            case 15:
                wm3.a update8 = (wm3.a) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return wm3.a.a(update8, null, this.f296008b, false, 29);
            case 16:
                Intrinsics.checkNotNullParameter((MatchResult) obj2, "it");
                return this.f296008b;
            case 17:
                wph.n update9 = (wph.n) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return wph.n.a(update9, null, null, this.f296008b, null, 23);
            case 18:
                wq1.i updateState = (wq1.i) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return wq1.i.a(updateState, wq1.g.a(updateState.f299390b, this.f296008b, null, null, null, 14));
            case 19:
                wq1.i updateState2 = (wq1.i) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return wq1.i.a(updateState2, wq1.g.a(updateState2.f299390b, null, this.f296008b, null, null, 13));
            case 20:
                wq1.i updateState3 = (wq1.i) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return wq1.i.a(updateState3, wq1.g.a(updateState3.f299390b, null, null, null, this.f296008b, 7));
            case 21:
                Map allWalletsWithPockets = (Map) obj2;
                Intrinsics.checkNotNullParameter(allWalletsWithPockets, "allWalletsWithPockets");
                Iterator it10 = allWalletsWithPockets.values().iterator();
                do {
                    boolean zHasNext = it10.hasNext();
                    String str = this.f296008b;
                    if (!zHasNext) {
                        throw new IllegalStateException(a10.b.s("Wallet with id=", str, " not found"));
                    }
                    Iterator it11 = ((List) it10.next()).iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            next3 = it11.next();
                            if (Intrinsics.f(((fo3.c) ((Pair) next3).f186385a).f136801a, str)) {
                            }
                        } else {
                            next3 = null;
                        }
                    }
                    pair = (Pair) next3;
                } while (pair == null);
                return pair;
            case 22:
                Map allWalletsWithPockets2 = (Map) obj2;
                Intrinsics.checkNotNullParameter(allWalletsWithPockets2, "allWalletsWithPockets");
                Set setEntrySet = allWalletsWithPockets2.entrySet();
                ArrayList arrayList = new ArrayList();
                Iterator it12 = setEntrySet.iterator();
                while (it12.hasNext()) {
                    Iterable iterable = (Iterable) ((Map.Entry) it12.next()).getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (Intrinsics.f(((fo3.c) ((Pair) obj3).f186385a).f136805h, this.f296008b)) {
                            arrayList2.add(obj3);
                        }
                    }
                    a0.x(arrayList2, arrayList);
                }
                return arrayList;
            case 23:
                List<io3.d> pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                for (io3.d dVar : pockets) {
                    if (Intrinsics.f(dVar.getId(), this.f296008b)) {
                        return dVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 24:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                Iterator it13 = pockets2.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next4 = it13.next();
                        if (Intrinsics.f(((io3.d) next4).getId(), this.f296008b)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                return (io3.d) next4;
            case 25:
                List wallets = (List) obj2;
                Intrinsics.checkNotNullParameter(wallets, "wallets");
                Iterator it14 = wallets.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        next5 = it14.next();
                        if (Intrinsics.f(((psg.a) next5).a(), this.f296008b)) {
                        }
                    } else {
                        next5 = null;
                    }
                }
                return (psg.a) next5;
            case 26:
                List wallets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(wallets2, "wallets");
                Iterator it15 = wallets2.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next6 = it15.next();
                        if (Intrinsics.f(((psg.a) next6).a(), this.f296008b)) {
                        }
                    } else {
                        next6 = null;
                    }
                }
                return (psg.a) next6;
            case 27:
                List pockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets3, "pockets");
                Iterator it16 = pockets3.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next7 = it16.next();
                        if (Intrinsics.f(((io3.d) next7).getId(), this.f296008b)) {
                        }
                    } else {
                        next7 = null;
                    }
                }
                return (io3.d) next7;
            case 28:
                io3.d it17 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(Intrinsics.f(it17.getId(), this.f296008b));
            default:
                io3.d it18 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(it18.getId(), this.f296008b));
        }
    }

    public /* synthetic */ k(t tVar, String str, int i) {
        this.f296007a = i;
        this.f296008b = str;
    }
}

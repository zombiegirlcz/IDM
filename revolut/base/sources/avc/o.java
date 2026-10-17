package avc;

import com.revolut.data.model.Data;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import h93.f0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mlk.u;
import t73.q0;
import zhm.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f10003b;

    public /* synthetic */ o(f0 f0Var, int i) {
        this.f10002a = i;
        this.f10003b = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f10002a;
        boolean z = false;
        f0 revolutCard = this.f10003b;
        switch (i) {
            case 0:
                Intrinsics.h(revolutCard);
                ((e) obj2).getClass();
                Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
                return new e(revolutCard);
            case 1:
                g03.a update = (g03.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g03.a.a(update, null, this.f10003b, null, null, null, 29);
            case 2:
                return g03.a.a((g03.a) obj2, null, this.f10003b, null, null, null, 29);
            case 3:
                List designs = (List) obj2;
                Intrinsics.checkNotNullParameter(designs, "designs");
                Iterator it8 = designs.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        e93.d dVar = (e93.d) next;
                        if (dVar.f123827c.equals(revolutCard.f150114h.f13639a) && dVar.f123826b == u1.u(revolutCard.f150114h.f13640b, hx7.l.j())) {
                            obj = next;
                        }
                    }
                }
                return (e93.d) obj;
            case 4:
                Intrinsics.h(revolutCard);
                return j43.d.a((j43.d) obj2, revolutCard, false, 30);
            case 5:
                CardDetailsDesignConfig designConfig = (CardDetailsDesignConfig) obj2;
                Intrinsics.checkNotNullParameter(designConfig, "designConfig");
                return new Pair(revolutCard, designConfig);
            case 6:
                CardDetailsDesignConfig designConfig2 = (CardDetailsDesignConfig) obj2;
                Intrinsics.checkNotNullParameter(designConfig2, "designConfig");
                return new Pair(revolutCard, designConfig2);
            case 7:
                return lae.g.a((lae.g) obj2, zi0.c.P(revolutCard, false, null, 3), null, 2);
            case 8:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.h(revolutCard);
                return new u(revolutCard, it9.size());
            case 9:
                uce.c neverReceivedCardMode = ((qee.b) obj2).f245121b;
                Intrinsics.checkNotNullParameter(neverReceivedCardMode, "neverReceivedCardMode");
                return new qee.b(revolutCard, neverReceivedCardMode);
            case 10:
                q0 update2 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Set set = update2.f268514n;
                if (set == null) {
                    set = h0.f322473a;
                }
                return q0.a(update2, null, null, null, null, null, null, a1.m(set, revolutCard.f150110a), null, null, null, null, null, null, null, null, null, false, 33546239);
            case 11:
                q0 update3 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Set set2 = update3.o;
                if (set2 == null) {
                    set2 = h0.f322473a;
                }
                return q0.a(update3, null, null, null, null, null, null, null, a1.m(set2, revolutCard.f150110a), null, null, null, null, null, null, null, null, false, 33538047);
            case 12:
                q0 update4 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Set set3 = update4.f268515p;
                if (set3 == null) {
                    set3 = h0.f322473a;
                }
                return q0.a(update4, null, null, null, null, null, null, null, null, a1.m(set3, revolutCard.f150110a), null, null, null, null, null, null, null, false, 33521663);
            case 13:
                q0 update5 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                s63.a aVar = update5.f268517r;
                if (aVar != null && !aVar.f260105c) {
                    z = true;
                }
                od0.i.Companion.getClass();
                boolean z3 = z;
                return q0.a(update5, null, od0.h.a(revolutCard), od0.i.f224256b, null, null, null, null, null, null, null, z3 ? null : update5.f268517r, null, z3 ? null : update5.f268519t, null, null, null, false, 32899015);
            case 14:
                q0 update6 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                f0 f0Var = this.f10003b;
                return q0.a(update6, null, null, null, null, null, null, null, null, null, null, new s63.a(f0Var, 2), null, f0Var, null, null, null, false, 32899071);
            case 15:
                q0 update7 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                od0.i.Companion.getClass();
                return q0.a(update7, null, od0.h.a(revolutCard), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554423);
            case 16:
                q0 update8 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                od0.i.Companion.getClass();
                return q0.a(update8, null, od0.h.a(revolutCard), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554423);
            case 17:
                q0 update9 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                od0.i.Companion.getClass();
                return q0.a(update9, null, od0.h.a(revolutCard), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554423);
            case 18:
                q0 update10 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                od0.i.Companion.getClass();
                return q0.a(update10, null, od0.h.a(revolutCard), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554423);
            case 19:
                q0 update11 = (q0) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                od0.i.Companion.getClass();
                return q0.a(update11, null, od0.h.a(revolutCard), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554423);
            case 20:
                od0.i.Companion.getClass();
                return q0.a((q0) obj2, null, od0.h.a(revolutCard), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554423);
            case 21:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new Pair(revolutCard.f150110a, it10.getContent());
            case 22:
                ((tu2.a) obj2).getClass();
                return new tu2.a(revolutCard);
            default:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "SwitchToNew", v1.c.t(it11.size(), "CardToTerminateData ", revolutCard.f150110a, " "), null, null, 16);
                y83.e eVar = new y83.e(revolutCard, it11.size());
                od0.i.Companion.getClass();
                return od0.h.a(eVar);
        }
    }
}

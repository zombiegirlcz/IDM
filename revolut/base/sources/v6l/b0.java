package v6l;

import com.revolut.data.model.Data;
import h93.c1;
import h93.d1;
import h93.e1;
import h93.f1;
import h93.g1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286423a;

    public /* synthetic */ b0(int i) {
        this.f286423a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object f1Var;
        Object next;
        Object objA;
        LocalDate localDate;
        Object objA2;
        switch (this.f286423a) {
            case 0:
                p6l.a banner = (p6l.a) obj2;
                Intrinsics.checkNotNullParameter(banner, "banner");
                Intrinsics.checkNotNullParameter(banner, "<this>");
                return new h93.b(banner.getTitle(), banner.getDescription(), new h93.a(banner.getAction().getTitle(), banner.getAction().getDeeplink()));
            case 1:
                p6l.x it8 = (p6l.x) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter(it8, "<this>");
                return new h93.o0(it8.getTransactionIds());
            case 2:
                p6l.q it9 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return o6l.d.b(it9);
            case 3:
                p6l.q it10 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return o6l.d.b(it10);
            case 4:
                p6l.q it11 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return o6l.d.b(it11);
            case 5:
                p6l.q it12 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return o6l.d.b(it12);
            case 6:
                p6l.q it13 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return o6l.d.b(it13);
            case 7:
                p6l.q it14 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return o6l.d.b(it14);
            case 8:
                r6l.d it15 = (r6l.d) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Intrinsics.checkNotNullParameter(it15, "<this>");
                o6l.a aVar = o6l.b.Companion;
                String value = it15.getReasonCode();
                aVar.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                Iterator<E> it16 = o6l.b.a().iterator();
                while (true) {
                    if (it16.hasNext()) {
                        Object next2 = it16.next();
                        if (Intrinsics.f(((o6l.b) next2).name(), value)) {
                            obj = next2;
                        }
                    }
                }
                o6l.b bVar = (o6l.b) obj;
                if (bVar == null) {
                    bVar = o6l.b.UNKNOWN;
                }
                int i = o6l.c.f222637b[bVar.ordinal()];
                if (i == 1) {
                    return e1.f150107a;
                }
                if (i == 2) {
                    r6l.c card = it15.getCard();
                    if (card == null) {
                        String reasonCode = it15.getReasonCode();
                        gom.e.f145194a.e(new IllegalStateException(j6.a.q("card missing for reasonCode=", it15.getReasonCode())));
                        return new g1(reasonCode);
                    }
                    f1Var = new f1(new c1(new b93.b(card.getDesign()), card.getCardId(), card.getBrand()));
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String reasonCode2 = it15.getReasonCode();
                        gom.e.f145194a.e(new IllegalArgumentException(j6.a.q("Unknown reasonCode=", it15.getReasonCode())));
                        return new g1(reasonCode2);
                    }
                    r6l.c card2 = it15.getCard();
                    if (card2 == null) {
                        String reasonCode3 = it15.getReasonCode();
                        gom.e.f145194a.e(new IllegalStateException(j6.a.q("card missing for reasonCode=", it15.getReasonCode())));
                        return new g1(reasonCode3);
                    }
                    f1Var = new d1(new c1(new b93.b(card2.getDesign()), card2.getCardId(), card2.getBrand()));
                }
                return f1Var;
            case 9:
                p6l.q cardDto = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(cardDto, "cardDto");
                return o6l.d.b(cardDto);
            case 10:
                p6l.q it17 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return o6l.d.b(it17);
            case 11:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                List list = cards;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it18 = list.iterator();
                while (it18.hasNext()) {
                    arrayList.add(o6l.d.b((p6l.q) it18.next()));
                }
                return arrayList;
            case 12:
                p6l.q it19 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return o6l.d.b(it19);
            case 13:
                n6l.s it20 = (n6l.s) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                Intrinsics.checkNotNullParameter(it20, "<this>");
                c93.q qVar = c93.r.Companion;
                String value2 = it20.getState();
                qVar.getClass();
                Intrinsics.checkNotNullParameter(value2, "value");
                Iterator<E> it21 = c93.r.a().iterator();
                while (true) {
                    if (it21.hasNext()) {
                        next = it21.next();
                        String strName = ((c93.r) next).name();
                        String upperCase = value2.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        if (Intrinsics.f(strName, upperCase)) {
                        }
                    } else {
                        next = null;
                    }
                }
                c93.r rVar = (c93.r) next;
                if (rVar == null) {
                    rVar = c93.r.UNKNOWN;
                }
                c93.r rVar2 = rVar;
                jo3.a amount = it20.getAmount();
                dj0.d dVarO = amount != null ? mo3.a.o(amount) : null;
                if (it20.getActiveUntil() != null) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = LocalDate.parse(it20.getActiveUntil());
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    if (yhm.m.a(objA) != null) {
                        objA = null;
                    }
                    localDate = (LocalDate) objA;
                    break;
                } else {
                    localDate = null;
                }
                if (it20.getCoolDownUntil() != null) {
                    try {
                        m.Companion companion3 = yhm.m.INSTANCE;
                        objA2 = LocalDate.parse(it20.getCoolDownUntil());
                    } catch (Throwable th11) {
                        m.Companion companion4 = yhm.m.INSTANCE;
                        objA2 = yhm.o.a(th11);
                    }
                    obj = (LocalDate) (yhm.m.a(objA2) == null ? objA2 : null);
                    break;
                }
                return new c93.p(rVar2, dVarO, localDate, obj, it20.getWorkflowId(), it20.getWorkflowParams());
            case 14:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                return Unit.f186387a;
            case 15:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                return Unit.f186387a;
            case 16:
                Boolean success = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(success, "success");
                success.booleanValue();
                return success;
            case 17:
                Intrinsics.checkNotNullParameter((Boolean) obj2, "it");
                return Unit.f186387a;
            case 18:
                List<vd8.a> coparents = (List) obj2;
                Intrinsics.checkNotNullParameter(coparents, "coparents");
                for (vd8.a aVar2 : coparents) {
                    if (aVar2.f == vd8.d.GUARDIAN) {
                        return aVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 19:
                vd8.a it22 = (vd8.a) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return ngm.n.n(it22);
            case 20:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                do3.n nVar = (do3.n) pair.f186385a;
                List list2 = (List) pair.f186386b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it23 = list2.iterator();
                    while (true) {
                        if (it23.hasNext()) {
                            vd8.a aVar3 = (vd8.a) it23.next();
                            if (Intrinsics.f(aVar3.d, nVar.f) && aVar3.f == vd8.d.GUARDIAN) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 21:
                psg.a it24 = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.f239485b;
            case 22:
                yja.b bVar2 = (yja.b) obj2;
                int i2 = v73.p.f286551a[bVar2.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    int i3 = jli.h.f175850a;
                } else {
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected Revolut Pay product article result " + bVar2);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 24:
                List juniorAccountInfos = (List) obj2;
                Intrinsics.checkNotNullParameter(juniorAccountInfos, "juniorAccountInfos");
                return zhm.d0.P0(juniorAccountInfos, new v78.f());
            case 25:
                uj3.a it25 = (uj3.a) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Boolean.valueOf(uj3.b.q(it25));
            case 26:
                v7f.a it26 = (v7f.a) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return zi0.c.P(it26.d, false, null, 3);
            case 27:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf((data.getContent() == null && data.getError() == null) ? false : true);
            case 28:
                v7f.a it27 = (v7f.a) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return it27;
            default:
                v7f.a update = (v7f.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v7f.a.a(update, null, null, null, null, !update.e, 15);
        }
    }
}

package jwi;

import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesCell;
import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import gwi.a6;
import gwi.b6;
import gwi.e6;
import gwi.k5;
import gwi.m5;
import gwi.r5;
import gwi.s5;
import gwi.x5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import svi.s1;
import svi.t1;
import svi.u1;
import svi.v1;
import yhm.m;
import yhm.o;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {
    public static final SchemeAirportLoungesCell a(m5 m5Var) {
        e eVar;
        SchemeAirportLoungesCell.Action copyCardNumber;
        String str = m5Var.f147470a;
        String str2 = m5Var.f147471b;
        String str3 = m5Var.f147472c;
        k5 k5Var = m5Var.d;
        SchemeAirportLoungesCell.Action action = null;
        Object obj2 = null;
        if (k5Var != null) {
            String str4 = k5Var.f147443a;
            Intrinsics.checkNotNullParameter(k5Var, "<this>");
            try {
                m.Companion companion = m.INSTANCE;
                e[] eVarArrValues = e.values();
                int length = eVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        eVar = null;
                        break;
                    }
                    eVar = eVarArrValues[i];
                    if (a0.z(eVar.name(), str4, true)) {
                        break;
                    }
                    i++;
                }
                int i2 = eVar == null ? -1 : g.f179014a[eVar.ordinal()];
                if (i2 == 1) {
                    String str5 = k5Var.f147444b;
                    if (str5 == null) {
                        throw new IllegalStateException("cardId is required for COPY_CARD_NUMBER");
                    }
                    copyCardNumber = new SchemeAirportLoungesCell.Action.CopyCardNumber(str5);
                } else {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Unsupported CellAction type: " + str4);
                    }
                    String str6 = k5Var.f147445c;
                    if (str6 == null) {
                        throw new IllegalStateException("appUrl is required for GET_THE_APP");
                    }
                    copyCardNumber = new SchemeAirportLoungesCell.Action.OpenApp(str6);
                }
                action = copyCardNumber;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                Object objA = o.a(th10);
                Throwable thA = m.a(objA);
                if (thA == null) {
                    obj2 = objA;
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                }
                action = (SchemeAirportLoungesCell.Action) obj2;
            }
        }
        return new SchemeAirportLoungesCell(str, str2, str3, action);
    }

    public static final SchemeAirportLoungesFooter b(s5 s5Var) {
        f fVar;
        String str = s5Var.f147515a;
        r5 r5Var = s5Var.f147516b;
        SchemeAirportLoungesFooter.Action deeplink = null;
        Object obj2 = null;
        if (r5Var != null) {
            String str2 = r5Var.f147508a;
            Intrinsics.checkNotNullParameter(r5Var, "<this>");
            try {
                m.Companion companion = m.INSTANCE;
                f[] fVarArrValues = f.values();
                int length = fVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        fVar = null;
                        break;
                    }
                    fVar = fVarArrValues[i];
                    if (a0.z(fVar.name(), str2, true)) {
                        break;
                    }
                    i++;
                }
                int i2 = fVar == null ? -1 : g.f179015b[fVar.ordinal()];
                if (i2 == 1) {
                    deeplink = SchemeAirportLoungesFooter.Action.OrderCard.f98942a;
                } else {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Unsupported FooterAction type: " + str2);
                    }
                    String str3 = r5Var.f147509b;
                    if (str3 == null) {
                        throw new IllegalStateException("deeplink is required for DEEPLINK");
                    }
                    deeplink = new SchemeAirportLoungesFooter.Action.Deeplink(str3);
                }
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                Object objA = o.a(th10);
                Throwable thA = m.a(objA);
                if (thA == null) {
                    obj2 = objA;
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                }
                deeplink = (SchemeAirportLoungesFooter.Action) obj2;
            }
        }
        return new SchemeAirportLoungesFooter(str, deeplink);
    }

    public static final u1 c(b6 b6Var) {
        Intrinsics.checkNotNullParameter(b6Var, "<this>");
        x5 x5Var = b6Var.f147354a;
        e6 e6Var = x5Var.f147562a;
        v1 v1Var = e6Var != null ? new v1(e6Var.f147382a, e6Var.f147383b, e6Var.f147384c, e6Var.d) : null;
        String str = x5Var.f147563b;
        List list = x5Var.f147564c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((m5) it8.next()));
        }
        s5 s5Var = x5Var.d;
        s1 s1Var = new s1(v1Var, str, arrayList, s5Var != null ? b(s5Var) : null);
        a6 a6Var = b6Var.f147355b;
        String str2 = a6Var.f147342a;
        List list2 = a6Var.f147343b;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(a((m5) it9.next()));
        }
        return new u1(s1Var, new t1(str2, arrayList2, b(a6Var.f147344c)));
    }

    public static final m5 d(SchemeAirportLoungesCell schemeAirportLoungesCell) {
        k5 k5Var;
        Intrinsics.checkNotNullParameter(schemeAirportLoungesCell, "<this>");
        String str = schemeAirportLoungesCell.f98934a;
        String str2 = schemeAirportLoungesCell.f98935b;
        String str3 = schemeAirportLoungesCell.f98936c;
        SchemeAirportLoungesCell.Action action = schemeAirportLoungesCell.d;
        k5 k5Var2 = null;
        if (action != null) {
            if (action instanceof SchemeAirportLoungesCell.Action.CopyCardNumber) {
                k5Var = new k5("COPY_CARD_NUMBER", ((SchemeAirportLoungesCell.Action.CopyCardNumber) action).f98937a, null);
            } else {
                if (!(action instanceof SchemeAirportLoungesCell.Action.OpenApp)) {
                    throw new NoWhenBranchMatchedException();
                }
                k5Var = new k5("GET_THE_APP", null, ((SchemeAirportLoungesCell.Action.OpenApp) action).f98938a);
            }
            k5Var2 = k5Var;
        }
        return new m5(str, str2, str3, k5Var2);
    }

    public static final s5 e(SchemeAirportLoungesFooter schemeAirportLoungesFooter) {
        Intrinsics.checkNotNullParameter(schemeAirportLoungesFooter, "<this>");
        String str = schemeAirportLoungesFooter.f98939a;
        SchemeAirportLoungesFooter.Action action = schemeAirportLoungesFooter.f98940b;
        r5 r5Var = null;
        if (action != null) {
            if (action instanceof SchemeAirportLoungesFooter.Action.OrderCard) {
                r5Var = new r5("ORDER_CARD", null);
            } else {
                if (!(action instanceof SchemeAirportLoungesFooter.Action.Deeplink)) {
                    throw new NoWhenBranchMatchedException();
                }
                r5Var = new r5("DEEPLINK", ((SchemeAirportLoungesFooter.Action.Deeplink) action).f98941a);
            }
        }
        return new s5(str, r5Var);
    }
}

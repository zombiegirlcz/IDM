package edl;

import android.database.Cursor;
import android.view.View;
import cgc.m;
import com.revolut.feature.apm.bills.core.api.model.BillInput;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.Transition;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.store.api.model.StoreExclusivesTile;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsConfigBackground;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import do3.g;
import e93.j0;
import f2e.o1;
import ggc.c0;
import ggc.d0;
import ggc.t;
import ggc.y;
import hhc.b;
import hhc.d;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import l8a.s;
import l8a.s0;
import l9.l;
import le.u1;
import lqa.h;
import m7.j;
import org.joda.time.LocalDateTime;
import p7.q;
import qo6.f;
import qo6.i;
import qo6.o;
import rgc.k;
import so6.c;
import so6.e;
import vkm.c2;
import vkm.d2;
import vkm.t1;
import wbl.n;
import zhm.h0;
import zhm.p;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public static final c0 A(k kVar) {
        m mVar;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String str = kVar.f254102a;
        String str2 = kVar.f254103b;
        d0 d0Var = (d0) u1.v(kVar.f254104c, d.f152384a);
        if (d0Var == null) {
            d0Var = d0.UNKNOWN;
        }
        LocalDateTime localDateTime = new LocalDateTime(kVar.d);
        LocalDateTime localDateTime2 = new LocalDateTime(kVar.e);
        y yVarK = l.K(kVar.f);
        t tVarZ = z(kVar.f254105g);
        String str3 = kVar.f254106h;
        rgc.l lVar = kVar.i;
        if (lVar != null) {
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            mVar = new m(lVar.f254111a);
        } else {
            mVar = null;
        }
        String str4 = kVar.k;
        return new c0(str, str2, d0Var, localDateTime, localDateTime2, yVarK, tVarZ, str3, mVar, str4 != null ? (ggc.m) u1.v(str4, b.f152382a) : null, kVar.f254108l, kVar.f254109m, kVar.f254110n, kVar.o);
    }

    public static final nrf.d B(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String strD = hVar.getShortDescription();
        String strE = hVar.getTitle();
        String strC = hVar.getDescription();
        dj0.d dVarO = mo3.a.o(hVar.getAmount());
        jo3.a aVarB = hVar.getAmountInBaseCurrency();
        return new nrf.d(strD, strE, strC, dVarO, aVarB != null ? mo3.a.o(aVarB) : null, hVar.getType());
    }

    public static final e C(qo6.l lVar) {
        so6.d bVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        boolean z = lVar.f248063a;
        String str = lVar.f248064b;
        String str2 = lVar.f248065c;
        List<o> list = lVar.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (o oVar : list) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            String str3 = oVar.f248067a;
            String str4 = oVar.f248068b;
            i iVar = oVar.f248069c;
            so6.d dVar = null;
            if (iVar != null) {
                String str5 = iVar.f248060a;
                jo3.a aVar = iVar.f248061b;
                bVar = new c(aVar != null ? mo3.a.o(aVar) : null, str5);
            } else {
                f fVar = oVar.d;
                if (fVar != null) {
                    String str6 = fVar.f248057a;
                    String str7 = fVar.f248058b;
                    bVar = new so6.b(str6, str7 != null ? LocalDate.parse(str7) : null);
                } else {
                    arrayList.add(new so6.f(str3, str4, dVar));
                }
            }
            dVar = bVar;
            arrayList.add(new so6.f(str3, str4, dVar));
        }
        return new e(str, str2, arrayList, z);
    }

    public static final tgb.c D(qgb.i iVar) {
        g gVar;
        tgb.k kVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str = iVar.f245741a;
        g[] gVarArrValues = g.values();
        int length = gVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                gVar = null;
                break;
            }
            gVar = gVarArrValues[i];
            if (a0.z(gVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (gVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown Salary Hub V3 availability salaried user state: ", iVar.f245741a));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.c cVar = rd0.c.ERROR;
            String message = illegalArgumentException.getMessage();
            rd0.d.a(cVar, null, message != null ? message : "", illegalArgumentException, h0Var);
            throw illegalArgumentException;
        }
        List<String> list = iVar.f245742b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (String str2 : list) {
            tgb.k[] kVarArrValues = tgb.k.values();
            int length2 = kVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    kVar = null;
                    break;
                }
                kVar = kVarArrValues[i2];
                if (a0.z(kVar.name(), str2, true)) {
                    break;
                }
                i2++;
            }
            if (kVar == null) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(j6.a.q("Unknown Salary Hub V3 availability reward type: ", str2));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.c cVar2 = rd0.c.ERROR;
                String message2 = illegalArgumentException2.getMessage();
                rd0.d.a(cVar2, null, message2 != null ? message2 : "", illegalArgumentException2, h0Var2);
                throw illegalArgumentException2;
            }
            arrayList.add(kVar);
        }
        qgb.e eVar = iVar.f245743c;
        tgb.a aVar = eVar != null ? new tgb.a(eVar.f245731a) : null;
        qgb.h hVar = iVar.d;
        return new tgb.c(gVar, arrayList, aVar, hVar != null ? new tgb.b(mo3.a.o(hVar.f245740b), hVar.f245739a) : null);
    }

    public static final wbl.k E(rdl.a aVar) {
        n nVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        rdl.c state = aVar.getState();
        state.getClass();
        int i = rdl.b.f253479a[state.ordinal()];
        if (i == 1) {
            nVar = n.READY;
        } else if (i == 2) {
            nVar = n.IN_PREPARATION;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            nVar = n.UNKNOWN;
        }
        return new wbl.k(nVar, aVar.getUrl());
    }

    public static final rgc.e F(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        return new rgc.e(tVar.f143666a, tVar.f143667b, tVar.f143668c, tVar.d, tVar.e, tVar.f);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public static final k G(c0 c0Var) {
        rgc.l lVar;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        String str = c0Var.f143610a;
        String str2 = c0Var.f143611b;
        String strG = u1.g(c0Var.f143612c, d.f152384a);
        Long lValueOf = Long.valueOf(c0Var.d.toDateTime().getMillis());
        Long lValueOf2 = Long.valueOf(c0Var.e.toDateTime().getMillis());
        sgc.a aVarL = l.L(c0Var.f);
        rgc.e eVarF = F(c0Var.f143613g);
        String str3 = c0Var.f143614h;
        m mVar = c0Var.i;
        if (mVar != null) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            lVar = new rgc.l(mVar.f23921a);
        } else {
            lVar = null;
        }
        ggc.m mVar2 = c0Var.f143615j;
        return new k(str, str2, strG, lValueOf, lValueOf2, aVarL, eVarF, str3, lVar, null, mVar2 != null ? u1.h(mVar2, b.f152382a) : null, c0Var.k, c0Var.f143616l, c0Var.f143617m, c0Var.f143618n);
    }

    public static final GroupMemberSettleInfo H(st9.e eVar, do3.n currentUser) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(currentUser, "currentUser");
        return new GroupMemberSettleInfo(oi0.d.G(eVar.f265545g, currentUser) ? eVar.f : eVar.f265545g, eVar, true);
    }

    public static final org.joda.time.LocalDate I(Long l2) {
        return new org.joda.time.LocalDate(l2.longValue());
    }

    public static final slm.h0 a(Json json, String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        rlm.h hVar = json.f187948a;
        return new slm.h0(source);
    }

    public static final j0 c(j0 j0Var, dj0.d cardPrice, j0 j0Var2, dj0.d deliveryFee) {
        dj0.d dVarO;
        dj0.d dVarO2;
        dj0.d dVar;
        dj0.d dVar2;
        Intrinsics.checkNotNullParameter(cardPrice, "cardPrice");
        Intrinsics.checkNotNullParameter(deliveryFee, "deliveryFee");
        if (j0Var == null && j0Var2 == null) {
            return null;
        }
        if (j0Var != null && (dVar2 = j0Var.f123878c) != null) {
            cardPrice = dVar2;
        }
        if (j0Var2 != null && (dVar = j0Var2.f123878c) != null) {
            deliveryFee = dVar;
        }
        if (j0Var != null) {
            dVarO = pyd.c.O(j0Var.f123876a, j0Var2 != null ? j0Var2.f123876a : null);
        } else {
            if (j0Var2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dVarO = j0Var2.f123876a;
        }
        if (j0Var != null) {
            dVarO2 = pyd.c.O(j0Var.f123877b, j0Var2 != null ? j0Var2.f123877b : null);
        } else {
            if (j0Var2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dVarO2 = j0Var2.f123877b;
        }
        if (!deliveryFee.k()) {
            cardPrice = pyd.c.O(cardPrice, deliveryFee);
        }
        return new j0(dVarO, dVarO2, cardPrice);
    }

    public static final String d(fel.b bVar) {
        String str;
        String strO;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        fel.a aVar = bVar.f134650b;
        String str2 = bVar.f134649a;
        int i = b87.a.f13113a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return str2;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        xi0.b bVar2 = bVar.f134651c;
        return (bVar2 == null || (str = bVar2.f306286a) == null || (strO = com.google.android.gms.internal.mlkit_vision_face.a.o(str2, "_", str)) == null) ? str2 : strO;
    }

    public static final ArrayList e(BackendFlow backendFlow) {
        List list;
        Intrinsics.checkNotNullParameter(backendFlow, "<this>");
        List<BackendScreen> list2 = backendFlow.e;
        ArrayList arrayList = new ArrayList();
        for (BackendScreen backendScreen : list2) {
            ArrayList arrayList2 = null;
            if (backendScreen instanceof FormScreen) {
                list = ((FormScreen) backendScreen).f63470g;
            } else if (backendScreen instanceof StoriesScreen) {
                list = ((StoriesScreen) backendScreen).f63665c;
            } else if (backendScreen instanceof PromptScreen) {
                list = ((PromptScreen) backendScreen).e;
            } else if (backendScreen instanceof BottomPromptScreen) {
                list = ((BottomPromptScreen) backendScreen).f63329g;
            } else {
                if (!(backendScreen instanceof HtmlPromptScreen) && !(backendScreen instanceof DeeplinkScreen) && !(backendScreen instanceof StatusDialogScreen) && !(backendScreen instanceof SummaryScreen) && !(backendScreen instanceof TutorialScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                list = null;
            }
            if (list != null) {
                arrayList2 = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    StatusDialogScreen statusDialogScreen = ((Transition) it8.next()).e;
                    if (statusDialogScreen != null) {
                        arrayList2.add(statusDialogScreen);
                    }
                }
            }
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
        }
        return w.u(arrayList);
    }

    public static final String f(CardDetailsConfigBackground cardDetailsConfigBackground, o5l.b cardBrand, o5l.g gVar) {
        String str;
        Intrinsics.checkNotNullParameter(cardDetailsConfigBackground, "<this>");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        int i = o5l.c.f222453a[cardBrand.ordinal()];
        if (i == 1) {
            str = cardDetailsConfigBackground.f104699c;
        } else if (i == 2) {
            str = cardDetailsConfigBackground.f104698b;
        } else if (i == 3) {
            str = cardDetailsConfigBackground.f104697a;
        } else if (i == 4) {
            str = cardDetailsConfigBackground.d;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        if (str == null) {
            return null;
        }
        if ((gVar == null ? -1 : o5l.c.f222454b[gVar.ordinal()]) == -1) {
            return str;
        }
        String lowerCase = gVar.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return a0.D(str, ".png", "@" + lowerCase + ".png", false);
    }

    public static final Integer g(Cursor cursor, String columnName) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Intrinsics.checkNotNullParameter(columnName, "columnName");
        int columnIndex = cursor.getColumnIndex(columnName);
        Integer numValueOf = Integer.valueOf(columnIndex);
        if (columnIndex == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return Integer.valueOf(cursor.getInt(numValueOf.intValue()));
        }
        return null;
    }

    public static final ArrayList h(BackendFlow backendFlow) {
        Intrinsics.checkNotNullParameter(backendFlow, "<this>");
        return zhm.d0.E0(e(backendFlow), backendFlow.e);
    }

    public static final String i(Cursor cursor, String columnName) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Intrinsics.checkNotNullParameter(columnName, "columnName");
        int columnIndex = cursor.getColumnIndex(columnName);
        Integer numValueOf = Integer.valueOf(columnIndex);
        if (columnIndex == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return cursor.getString(numValueOf.intValue());
        }
        return null;
    }

    public static final String j(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        if (paymentMethod instanceof PaymentMethod.BankAccount) {
            return "Bank account";
        }
        if (paymentMethod instanceof PaymentMethod.Card) {
            return "Card";
        }
        if (paymentMethod instanceof PaymentMethod.Pocket) {
            return "Pocket";
        }
        if (paymentMethod instanceof PaymentMethod.RevolutAccount) {
            return "Revolut account";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] k(byte[] r17, byte[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: edl.a.k(byte[], byte[]):byte[]");
    }

    public static final boolean l(lk0.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        List list = gVar.f196174a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((lk0.e) it8.next()).f196173c) {
                List list2 = gVar.f196174a;
                ArrayList arrayList = new ArrayList();
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    zhm.a0.x(((lk0.e) it9.next()).f196171a, arrayList);
                }
                return !arrayList.isEmpty();
            }
        }
        return false;
    }

    public static final boolean m(org.joda.time.LocalDate localDate) {
        if (localDate != null) {
            return localDate.isEqual(org.joda.time.LocalDate.now());
        }
        return false;
    }

    public static final void n(PaymentMethod paymentMethod, String tag2) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, tag2, "Error while payment method selection. Selected type is: ".concat(j(paymentMethod)), null, h0Var);
    }

    public static j o(q7.e eVar, d7.j jVar) {
        String strX;
        eVar.f();
        m7.i iVar = null;
        l7.a aVar = null;
        l7.a aVarO = null;
        boolean zJ = false;
        while (eVar.i()) {
            strX = eVar.x();
            strX.getClass();
            switch (strX) {
                case "o":
                    aVarO = u1.o(eVar, jVar);
                    break;
                case "pt":
                    aVar = new l7.a(q.a(eVar, jVar, r7.l.c(), p7.a0.f233458a, false), 3);
                    break;
                case "inv":
                    zJ = eVar.j();
                    break;
                case "mode":
                    String strM = eVar.m();
                    strM.getClass();
                    switch (strM) {
                        case "a":
                            iVar = m7.i.MASK_MODE_ADD;
                            break;
                        case "i":
                            jVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            iVar = m7.i.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            iVar = m7.i.MASK_MODE_NONE;
                            break;
                        case "s":
                            iVar = m7.i.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            r7.c.b("Unknown mask mode " + strX + ". Defaulting to Add.");
                            iVar = m7.i.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    eVar.r();
                    break;
            }
        }
        eVar.h();
        return new j(iVar, aVar, aVarO, zJ);
    }

    public static final byte[] p(byte[] password, byte[] salt) throws Throwable {
        Throwable th10;
        byte[] bArrK;
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(salt, "salt");
        int length = salt.length;
        byte[] bArr = new byte[length + 4];
        p.j(salt, bArr, 0, 0, 0, 14);
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        bArr[length + 3] = 1;
        byte[] bArr2 = new byte[64];
        try {
            bArrK = k(password, bArr);
            try {
                p.j(bArrK, bArr2, 0, 0, 0, 14);
                int i = 0;
                while (i < 2047) {
                    byte[] bArrK2 = k(password, bArrK);
                    p.r(bArrK);
                    try {
                        Intrinsics.checkNotNullParameter(bArr2, "<this>");
                        Intrinsics.checkNotNullParameter(bArr2, "<this>");
                        vim.f it8 = new IntRange(0, 63, 1).iterator();
                        while (it8.f289625c) {
                            int iNextInt = it8.nextInt();
                            bArr2[iNextInt] = (byte) (bArr2[iNextInt] ^ bArrK2[iNextInt]);
                        }
                        i++;
                        bArrK = bArrK2;
                    } catch (Throwable th11) {
                        th10 = th11;
                        bArrK = bArrK2;
                        p.r(bArr);
                        if (bArrK != null) {
                            p.r(bArrK);
                        }
                        p.r(bArr2);
                        throw th10;
                    }
                }
                p.r(bArr);
                p.r(bArrK);
                return bArr2;
            } catch (Throwable th12) {
                th10 = th12;
            }
        } catch (Throwable th13) {
            th10 = th13;
            bArrK = null;
        }
    }

    public static final WealthAccountType q(w3f.h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        WealthAccountType accountType = h0Var.getAccountType();
        if (accountType != null) {
            return accountType;
        }
        throw new IllegalStateException("Account type is not provided");
    }

    public static final t1 r(Flow flow, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return vkm.q.M(flow, coroutineScope, c2.a(d2.Companion, 10000L, 2), 1);
    }

    public static final void s(View view, Function1 l2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(l2, "l");
        view.setOnClickListener(new e0m.i(l2));
    }

    public static final dj0.d t(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return ((GroupMemberSettleInfo) zhm.d0.b0(list)).f79504b.d;
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            if (i == 0) {
                GroupMemberSettleInfo groupMemberSettleInfo = (GroupMemberSettleInfo) obj2;
                boolean z = groupMemberSettleInfo.f79505c;
                st9.e eVar = groupMemberSettleInfo.f79504b;
                dVarO = z ? eVar.d : dj0.d.c(eVar.d, 0L, null, 2);
            } else {
                GroupMemberSettleInfo groupMemberSettleInfo2 = (GroupMemberSettleInfo) obj2;
                boolean z3 = groupMemberSettleInfo2.f79505c;
                st9.e eVar2 = groupMemberSettleInfo2.f79504b;
                dVarO = pyd.c.O(dVarO, z3 ? eVar2.d : dj0.d.c(eVar2.d, 0L, null, 2));
            }
            i = i2;
        }
        return dVarO;
    }

    public static final ArrayList u(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<n9l.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (n9l.a aVar : list2) {
            arrayList.add(new n9l.a(aVar.f213662b, aVar.f213661a, ((double) 1) / aVar.f213663c, aVar.d, aVar.e, aVar.f));
        }
        return arrayList;
    }

    public static final ArrayList v(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new BillInput((String) entry.getKey(), (String) entry.getValue(), null));
        }
        return arrayList;
    }

    public static final StoreExclusivesTile w(o1 o1Var) {
        Intrinsics.checkNotNullParameter(o1Var, "<this>");
        return new StoreExclusivesTile(o1Var.f131673a, Intrinsics.f(o1Var.f131674b, "EXCLUSIVE_STORE_PRODUCT_TILE") ? t1e.p.REGULAR : t1e.p.UNKNOWN, o1Var.f131675c, o1Var.d, d2e.i.a(o1Var.e, o1Var.f, o1Var.f131676g, o1Var.f131677h, o1Var.i));
    }

    public static final g8a.b x(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        List recurringPayments = sVar.getRecurringPayments();
        ArrayList arrayList = new ArrayList(w.t(recurringPayments, 10));
        Iterator it8 = recurringPayments.iterator();
        while (it8.hasNext()) {
            arrayList.add(y((s0) it8.next()));
        }
        return new g8a.b(arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final g8a.k y(l8a.s0 r22) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: edl.a.y(l8a.s0):g8a.k");
    }

    public static final t z(rgc.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new t(eVar.f254075a, eVar.f254076b, eVar.f254077c, eVar.d, eVar.e, eVar.f);
    }

    public abstract String b();
}

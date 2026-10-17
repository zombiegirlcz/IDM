package qpb;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.m6;
import aw0.n6;
import com.revolut.core.network.exceptions.NetworkConnectException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_transfer.impl.ui.flow.transfer.TransferToJuniorWrapperError;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreen;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import ip0.hd0;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLException;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import m1c.f1;
import pcd.s;
import retrofit2.adapter.rxjava2.HttpException;
import tof.a3;
import tof.va;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248341a;

    public /* synthetic */ i(int i) {
        this.f248341a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String strP;
        StackTraceElement stackTraceElement;
        String strP2;
        kqa.a aVar;
        switch (this.f248341a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new d((djb.a) pair.f186386b, (s) pair.f186385a);
            case 1:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new qpd.e((ie3.a) pair2.f186385a, (od0.i) pair2.f186386b);
            case 2:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 3:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return qpd.j.f248359a;
            case 4:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.TRUE;
            case 5:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (a3) d0.b0(it10);
            case 6:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.TRUE;
            case 7:
                qph.m it12 = (qph.m) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f248409c;
            case 8:
                qph.m it13 = (qph.m) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                String str = it13.f248407a;
                Data data = it13.f;
                return new Pair(str, data != null ? (List) data.getContent() : null);
            case 9:
                return qph.m.a((qph.m) obj2, null, null, f0.f322471a, null, null, null, null, 123);
            case 10:
                yja.b output = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (qpl.f.f248443a[output.ordinal()] == 1) {
                    RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("ProductArticle config not found for revolut-id-identity-documents-intro");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
                }
                return Unit.f186387a;
            case 11:
                rlm.f Json = (rlm.f) obj2;
                Lazy lazy = qq2.a.f248459a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 12:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return new qq4.b((CreditCard) hVar.f288433a, (List) hVar.f288434b, (yt8.c) hVar.f288435c, (RevPointsEarningRate) ((od0.i) hVar.d).g());
            case 13:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                od0.h hVar2 = od0.i.Companion;
                Iterator it14 = rates.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        Object next = it14.next();
                        if (((RevPointsEarningRate) next).f83975a == f1.CREDIT_CARD) {
                            obj = next;
                        }
                    }
                }
                hVar2.getClass();
                return od0.h.a(obj);
            case 14:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                lw0.h hVar3 = new lw0.h(lw0.i.TITLE_SUBTITLE);
                List listC = u.c(nb0.b(pb0.Companion, "id_credit_cards_item_loading", false, 0, false, 30));
                n6.Companion.getClass();
                return new cii.b(new aw0.e(false, null, null, m6.a(), null, null, 55), listC, hVar3);
            case 16:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new qq6.g(u.c(new hd0("FOREIGN_CURRENCIES_DETAILS_LOADING_ITEM_ID", null, 4)), false, false);
            case 17:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                fo3.c cVar = (fo3.c) pair3.f186385a;
                List list = (List) pair3.f186386b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    io3.d dVar = (io3.d) obj3;
                    if (dVar.e == io3.l.CURRENT) {
                        xi0.a aVar2 = xi0.b.Companion;
                        String str2 = dVar.f163147c;
                        aVar2.getClass();
                        if (xi0.a.a(str2).equals(cVar.d)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it17 = arrayList.iterator();
                while (it17.hasNext()) {
                    arrayList2.add(((io3.d) it17.next()).f163145a);
                }
                return new va(d0.i1(arrayList2));
            case 18:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pair4.f186385a;
                List list2 = (List) pair4.f186386b;
                Intrinsics.checkNotNullParameter(juniorBankingProfile, "<this>");
                kq8.f fVar = new kq8.f(juniorBankingProfile.f77103j, juniorBankingProfile.f77099b);
                Intrinsics.checkNotNullParameter(list2, "<this>");
                List<sq8.d> list3 = list2;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                for (sq8.d dVar2 : list3) {
                    arrayList3.add(new kq8.b(dVar2.f265028h, dVar2.i, dVar2.f265025b, dVar2.f265026c, dVar2.d, dVar2.e, dVar2.f, dVar2.f265027g));
                }
                return new Pair(fVar, arrayList3);
            case 19:
                Throwable originalThrowable = (Throwable) obj2;
                List listK = v.k(401, 422);
                if (originalThrowable instanceof HttpException) {
                    List list4 = listK;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it18 = list4.iterator();
                        while (it18.hasNext()) {
                            if (((Number) it18.next()).intValue() == ((HttpException) originalThrowable).code()) {
                                return Unit.f186387a;
                            }
                        }
                    }
                }
                p0 p0Var = o0.f186429a;
                List listK2 = v.k(p0Var.b(SocketException.class), p0Var.b(SocketTimeoutException.class), p0Var.b(UnknownHostException.class), p0Var.b(SSLException.class));
                if (originalThrowable instanceof NetworkConnectException) {
                    List list5 = listK2;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it19 = list5.iterator();
                        while (it19.hasNext()) {
                            if (((KClass) it19.next()).l(((NetworkConnectException) originalThrowable).getCause())) {
                                return Unit.f186387a;
                            }
                        }
                    }
                }
                Intrinsics.h(originalThrowable);
                Intrinsics.checkNotNullParameter(originalThrowable, "originalThrowable");
                TransferToJuniorWrapperError transferToJuniorWrapperError = new TransferToJuniorWrapperError();
                String name = originalThrowable.getClass().getName();
                String message = originalThrowable.getMessage();
                if (message == null || (strP = p.a.p(" with \"", message, "\" message")) == null) {
                    strP = "";
                }
                StackTraceElement stackTraceElement2 = new StackTraceElement(p.a.p("Original Exception: ", name, strP), "", null, -1);
                Throwable cause = originalThrowable.getCause();
                if (cause != null) {
                    String name2 = cause.getClass().getName();
                    String message2 = cause.getMessage();
                    if (message2 == null || (strP2 = p.a.p(" with \"", message2, "\" message")) == null) {
                        strP2 = "";
                    }
                    stackTraceElement = new StackTraceElement(p.a.p("Cause: ", name2, strP2), "", null, -1);
                } else {
                    stackTraceElement = null;
                }
                StackTraceElement[] elements = {transferToJuniorWrapperError.getStackTrace()[0], stackTraceElement2, stackTraceElement};
                Intrinsics.checkNotNullParameter(elements, "elements");
                transferToJuniorWrapperError.setStackTrace((StackTraceElement[]) kotlin.collections.d.L(elements).toArray(new StackTraceElement[0]));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, transferToJuniorWrapperError, h0Var2);
                return Unit.f186387a;
            case 20:
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                ArrayList arrayList4 = new ArrayList(7);
                for (int i = 0; i < 7; i++) {
                    arrayList4.add(new s7(a0.d.n("LIST_ID_LOADING_ITEM_", i), 0, 0, 0, 0, false, null, 94));
                }
                yp0.b.k(arrayList4, 0, R$attr.uikit_dp48, 0, 0, 29);
                return new qqe.i(qqe.g.f248528a, arrayList4);
            case 21:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM card_owners").step();
                    return null;
                } finally {
                }
            case 22:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM card_owners_stats");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsNumber");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "latestTransactionTimestamp");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList5.add(new sra.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3)));
                        break;
                    }
                    return arrayList5;
                } finally {
                }
            case 23:
                CellDetailsDelegate.Model it21 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new k5k.b(it21.f51832a, it21.o);
            case 24:
                RowDelegate.Model it22 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(it22, "it");
                return new k5k.b(it22.f53228a, it22.u);
            case 25:
                k5k.b it23 = (k5k.b) obj2;
                KProperty[] kPropertyArr3 = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(it23, "it");
                return Boolean.valueOf(!(it23.f181530b instanceof k5k.h0));
            case 26:
                CellDetailsActionDelegate.Model it24 = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(it24, "it");
                return new k5k.b(it24.f51781a, it24.f51787l);
            case 27:
                CellDetailsNoteDelegate.Model it25 = (CellDetailsNoteDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(it25, "it");
                return new k5k.b(it25.f51871a, it25.f51877l);
            case 28:
                ty0.a it26 = (ty0.a) obj2;
                KProperty[] kPropertyArr6 = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(it26, "it");
                return new k5k.b(it26.f275445a, it26.d);
            default:
                qsa.i it27 = (qsa.i) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                qsa.j jVar = it27.f248771c;
                if (jVar == null || (aVar = jVar.f248772a) == null) {
                    return null;
                }
                return aVar.f188358n;
        }
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f248341a = i;
    }
}

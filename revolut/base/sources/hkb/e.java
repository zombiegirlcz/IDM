package hkb;

import aw0.e8;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.remittance.models.domain.fees.CryptoWithdrawFeesBreakdownDetail;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreenContract$ModalStep;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing.JointDataSharingScreen;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.retail.core.navigation.NaviCommand;
import do3.n;
import dp5.k1;
import hkk.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import ynj.h;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152916a;

    public /* synthetic */ e(int i) {
        this.f152916a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        xi0.b bVar;
        dj0.d dVar;
        List list = null;
        switch (this.f152916a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new cii.b(null, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), new lw0.a(new TextLocalisedClause(R$string.savings_challenge_tracker_title, null, null, 14), null, null, null, false, 28));
            case 1:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(h.f315483a);
            case 2:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new i((List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null)), null);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 4:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ClientsListScreenContract$ModalStep step = (ClientsListScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof ClientsListScreenContract$ModalStep.JointDataSharing) {
                    return new JointDataSharingScreen(((ClientsListScreenContract$ModalStep.JointDataSharing) step).f72761a);
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, false, true, null));
            case 6:
                Throwable error = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                    return error;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                e8.Companion.getClass();
                return new e8(false);
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 11:
                String str = (String) obj2;
                String str2 = (String) obj3;
                if (str == null && str2 == null) {
                    return null;
                }
                return String.valueOf((str != null ? Long.parseLong(str) : 0L) + (str2 != null ? Long.parseLong(str2) : 0L));
            case 12:
                Throwable th10 = (Throwable) obj2;
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                if (th10 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
            case 13:
                Function1 defaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return (List) defaultItems.invoke(new iii.d(14, null, true, false, null));
            case 14:
                Throwable error2 = (Throwable) obj2;
                NaviCommand naviCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (naviCommand == null) {
                    return error2;
                }
                return null;
            case 15:
                Throwable error3 = (Throwable) obj2;
                NaviCommand naviCommand2 = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (naviCommand2 == null) {
                    return error3;
                }
                return null;
            case 16:
                Throwable error4 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (iVar == null) {
                    return error4;
                }
                return null;
            case 17:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 18:
                Throwable error5 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar2 == null) {
                    return error5;
                }
                return null;
            case 19:
                Throwable error6 = (Throwable) obj2;
                n nVar = (n) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (nVar == null) {
                    return error6;
                }
                return null;
            case 20:
                Function1 defaultProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultProvider, "defaultProvider");
                return (List) defaultProvider.invoke(new iii.d(14, null, true, false, null));
            case 21:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new hp4.i((List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null)));
            case 22:
                xk5.a domain = (xk5.a) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                return q.c0(domain);
            case 23:
                al5.a dto = (al5.a) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto, "dto");
                return q.b0(dto);
            case 24:
                CryptoWithdrawFeesBreakdown domain2 = (CryptoWithdrawFeesBreakdown) obj3;
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain2, "domain");
                Intrinsics.checkNotNullParameter(domain2, "<this>");
                List list2 = domain2.f;
                if (list2 != null) {
                    List<CryptoWithdrawFeesBreakdownDetail> list3 = list2;
                    ArrayList arrayList = new ArrayList(w.t(list3, 10));
                    for (CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail : list3) {
                        Intrinsics.checkNotNullParameter(cryptoWithdrawFeesBreakdownDetail, "<this>");
                        String str3 = cryptoWithdrawFeesBreakdownDetail.f70990a;
                        String str4 = cryptoWithdrawFeesBreakdownDetail.f70991b;
                        String str5 = cryptoWithdrawFeesBreakdownDetail.f70992c;
                        jo3.a aVarP = mo3.a.p(cryptoWithdrawFeesBreakdownDetail.d);
                        dj0.d dVar2 = cryptoWithdrawFeesBreakdownDetail.e;
                        arrayList.add(new dl5.a(str3, str4, str5, aVarP, dVar2 != null ? mo3.a.p(dVar2) : null));
                    }
                    list = arrayList;
                }
                if (list == null) {
                    list = f0.f322471a;
                }
                return new k1(list);
            case 25:
                k1 dto2 = (k1) obj3;
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto2, "dto");
                Intrinsics.checkNotNullParameter(dto2, "<this>");
                List list4 = dto2.f116774a;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(hx7.e.r((dl5.a) it8.next()));
                }
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    j += ((CryptoWithdrawFeesBreakdownDetail) it9.next()).d.f115082a;
                }
                CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail2 = (CryptoWithdrawFeesBreakdownDetail) d0.d0(arrayList2);
                if (cryptoWithdrawFeesBreakdownDetail2 == null || (dVar = cryptoWithdrawFeesBreakdownDetail2.d) == null || (bVar = dVar.f115083b) == null) {
                    xi0.b.Companion.getClass();
                    bVar = xi0.b.f306271c;
                }
                return new CryptoWithdrawFeesBreakdown(null, null, null, null, new dj0.d(j, bVar), arrayList2);
            case 26:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return (List) getDefaultErrorItems7.invoke(new iii.d(14, null, false, false, null));
            case 27:
                Function1 errorsItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorsItemsProvider, "errorsItemsProvider");
                return (List) errorsItemsProvider.invoke(new iii.d(14, null, true, false, null));
            case 28:
                Throwable th11 = (Throwable) obj2;
                if (((Pair) obj3) == null) {
                    return th11;
                }
                return null;
            default:
                Throwable error7 = (Throwable) obj2;
                od0.i iVar3 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (iVar3 == null) {
                    return error7;
                }
                return null;
        }
    }

    public /* synthetic */ e(f fVar) {
        this.f152916a = 0;
    }
}

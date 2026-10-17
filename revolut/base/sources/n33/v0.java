package n33;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.bank_transfer.models.PaymentVendorCorridor;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import ip0.q10;
import ip0.t10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211844a;

    public /* synthetic */ v0(int i) {
        this.f211844a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        BeneficiaryInfoState beneficiaryInfoState;
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f211844a) {
            case 0:
                ty0.a it8 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f275445a, "CRYPTO_TERMS_ID"));
            case 1:
                Boolean it9 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                it9.booleanValue();
                return it9;
            case 2:
                ty0.a it10 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f275445a, "DISCLOSURES_LINK_ID"));
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 4:
                od0.i it11 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.h hVar = od0.i.Companion;
                cl4.h hVar2 = (cl4.h) it11.f224257a;
                cl4.o oVar = hVar2 != null ? hVar2.f24943h : null;
                hVar.getClass();
                return od0.h.a(oVar);
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 6:
                od0.i it12 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (AccountId.Joint) it12.f224257a;
            case 7:
                od0.i it13 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                od0.h hVar3 = od0.i.Companion;
                cl4.h hVar4 = (cl4.h) it13.f224257a;
                cl4.o oVar2 = hVar4 != null ? hVar4.f24943h : null;
                hVar3.getClass();
                return od0.h.a(oVar2);
            case 8:
                List vaults = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults, "vaults");
                od0.h hVar5 = od0.i.Companion;
                Iterator it14 = vaults.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        next = it14.next();
                        if (((pcd.s) next).e == pcd.l0.PRO_TAX) {
                        }
                    } else {
                        next = null;
                    }
                }
                hVar5.getClass();
                return od0.h.a(next);
            case 9:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return zhm.r0.t(it15);
            case 10:
                lk0.g it16 = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(!it16.f196174a.isEmpty());
            case 11:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 12:
                lk0.e previousPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                int size = previousPage.f196171a.size();
                n3e.g gVar = (n3e.g) previousPage.f196172b;
                gVar.getClass();
                if (size < 10) {
                    return null;
                }
                return new n3e.g(gVar.f211997a + 10);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return n3e.m.b();
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return n3e.m.b();
            case 15:
                n3j.n it17 = (n3j.n) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f;
            case 16:
                n3j.n it18 = (n3j.n) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f;
            case 17:
                n3j.n it19 = (n3j.n) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                n3j.l lVar = (n3j.l) it19.f212146a.getContent();
                if (lVar == null || (beneficiaryInfoState = lVar.f212142a) == null) {
                    return null;
                }
                return beneficiaryInfoState.getF99711g();
            case 18:
                return n3j.n.a((n3j.n) obj2, null, null, 0, null, null, 47);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new n3j.s(iii.c.c(6), null, null);
            case 20:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM loan_preferences");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loanId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new o45.x1(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                t10 t10Var = new t10("LIST_ID_PERIOD_PICKER_LOADER", q10.f165912a);
                yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(t10Var);
            case 22:
                PaymentVendorCorridor corridor = (PaymentVendorCorridor) obj2;
                Intrinsics.checkNotNullParameter(corridor, "corridor");
                return com.google.android.gms.internal.mlkit_vision_face.a.t(v0.a.m("PaymentVendorCorridor(country=", corridor.f64082a.f297794a, ", currency=", corridor.f64083b.f306286a, ", default="), corridor.f64084c, ")");
            case 23:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM watchlists ORDER BY display_order");
                try {
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "watchlist_id");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_default");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "display_order");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = null;
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        }
                        arrayList2.add(new o4d.e((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), text2, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0, text));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 24:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM plain_multiple_watchlists_items WHERE watchlist_id NOT IN (SELECT watchlist_id FROM watchlists)");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 25:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM plain_multiple_watchlists_items WHERE sync_state == 'SYNCED'");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 26:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM watchlists");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 27:
                od0.i it20 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return (String) it20.f224257a;
            case 28:
                String it21 = (String) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                ogd.d dVar = (ogd.d) le.u1.v(it21, (Map) p4d.a.f232912a.getValue());
                return dVar == null ? n4d.r0.f212394n : dVar;
            default:
                Response it22 = (Response) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                s4d.k kVar = (s4d.k) it22.body();
                if (kVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(kVar, "<this>");
                Map settings = kVar.getSettings();
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : settings.entrySet()) {
                    arrayList3.add(new z3d.b(new FavouritesAssetTypeKey((String) entry.getKey()), ((s4d.l) entry.getValue()).getLimit()));
                }
                return arrayList3;
        }
    }

    public /* synthetic */ v0(cli.n nVar, int i) {
        this.f211844a = i;
    }
}

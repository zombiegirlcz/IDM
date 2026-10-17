package sx2;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreen;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.a;
import ip0.gu;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266288a;

    public /* synthetic */ g(int i) {
        this.f266288a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Long lValueOf = null;
        String text = null;
        vxb.d0 d0Var = null;
        lValueOf = null;
        Long lValueOf2 = null;
        lValueOf = null;
        switch (this.f266288a) {
            case 0:
                fo3.c it8 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.h hVar = od0.i.Companion;
                String str = it8.f136801a;
                hVar.getClass();
                return od0.h.a(str);
            case 1:
                List promotions = (List) obj2;
                Intrinsics.checkNotNullParameter(promotions, "promotions");
                return Boolean.valueOf(promotions.contains(n93.d.YOUTH_GRADUATION));
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 3:
                Pair planPair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(planPair, "planPair");
                hha.d dVar = (hha.d) planPair.f186385a;
                int i = dVar.f152294m;
                hha.d dVar2 = (hha.d) planPair.f186386b;
                return i > dVar2.f152294m ? dVar : dVar2;
            case 4:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return m72.b.x(it9, od0.i.Companion);
            case 5:
                JuniorBankingProfile it10 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it10);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 7:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT pointsTransactionId FROM rev_points_transaction WHERE state = ? ORDER BY createdDate DESC LIMIT ?");
                try {
                    sQLiteStatementPrepare.bindText(1, "PENDING");
                    sQLiteStatementPrepare.bindLong(2, 30);
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 8:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT createdDate FROM rev_points_transaction ORDER BY createdDate DESC LIMIT 1");
                try {
                    if (sQLiteStatementPrepare2.step() && !sQLiteStatementPrepare2.isNull(0)) {
                        lValueOf = Long.valueOf(sQLiteStatementPrepare2.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                }
            case 9:
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT createdDate FROM rev_points_transaction ORDER BY createdDate ASC LIMIT 1");
                try {
                    if (sQLiteStatementPrepare3.step() && !sQLiteStatementPrepare3.isNull(0)) {
                        lValueOf2 = Long.valueOf(sQLiteStatementPrepare3.getLong(0));
                        break;
                    }
                    return lValueOf2;
                } finally {
                }
            case 10:
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare("SELECT MIN(createdDate) FROM rev_points_transaction GROUP BY strftime('%Y-%m', createdDate/1000, 'unixepoch', 'localtime') ORDER BY MIN(createdDate) ASC");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare4.step()) {
                        arrayList2.add(sQLiteStatementPrepare4.isNull(0) ? null : Long.valueOf(sQLiteStatementPrepare4.getLong(0)));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 11:
                SQLiteStatement sQLiteStatementPrepare5 = ((SQLiteConnection) obj2).prepare("SELECT * FROM rev_points_transaction_metadata WHERE metadataKey = ?");
                try {
                    sQLiteStatementPrepare5.bindText(1, "isAllHistoryFetched");
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "metadataKey");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "metadataValue");
                    if (sQLiteStatementPrepare5.step()) {
                        if (!sQLiteStatementPrepare5.isNull(columnIndexOrThrow)) {
                            text = sQLiteStatementPrepare5.getText(columnIndexOrThrow);
                        }
                        if (((int) sQLiteStatementPrepare5.getLong(columnIndexOrThrow2)) == 0) {
                            z = false;
                        }
                        d0Var = new vxb.d0(text, z);
                    }
                    return d0Var;
                } finally {
                }
            case 12:
                return zhm.d0.P0(zhm.w.u((List) obj2), new sxg.d());
            case 13:
                return zhm.d0.P0(zhm.w.u((List) obj2), new sxg.e());
            case 14:
                return zhm.d0.P0((List) obj2, new sxg.g());
            case 15:
                return zhm.d0.P0((List) obj2, new sxg.i());
            case 16:
                return zhm.d0.P0((List) obj2, new sxg.j());
            case 17:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                return Boolean.FALSE;
            case 18:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new sxi.i((Data) rVar.f314201a, (Data) rVar.f314202b, (Data) rVar.f314203c);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("loadingHeaderId", R$attr.uikit_dp16, R$attr.uikit_dp0, 24);
                int i2 = R$attr.uikit_dp0;
                s7 s7Var = new s7("loadingDetailsId", i2, i2, 0, 0, false, null, SyslogConstants.LOG_CLOCK);
                List listK = zhm.v.k(gu.a(guVar, "loadingHeaderId1", R$attr.uikit_dp24, 1918), s7.a(s7Var, "loadingDetailsId1", 126), gu.a(guVar, "loadingHeaderId2", 0, 2046), s7.a(s7Var, "loadingDetailsId2", 126), gu.a(guVar, "loadingHeaderId3", 0, 2046), s7.a(s7Var, "loadingDetailsId3", 126), gu.a(guVar, "loadingHeaderId4", 0, 2046), s7.a(s7Var, "loadingDetailsId4", 126));
                yp0.b.k(listK, R$attr.uikit_dp16, 0, 0, 0, 30);
                return listK;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return a.c.f99111a;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 22:
                String id10 = (String) obj2;
                KProperty[] kPropertyArr = CameraKitCameraScreen.U;
                Intrinsics.checkNotNullParameter(id10, "id");
                int iHashCode = id10.hashCode();
                if (iHashCode != -2012553824) {
                    if (iHashCode != -1796421207) {
                        if (iHashCode == -921731696 && id10.equals("FAQ_MENU_ITEM_ID")) {
                            return sy.g.f266544a;
                        }
                    } else if (id10.equals("SCREEN_FLASH_MENU_ITEM_ID")) {
                        return sy.i.f266546a;
                    }
                } else if (id10.equals("LANGUAGE_SELECTOR_MENU_ITEM_ID")) {
                    return sy.h.f266545a;
                }
                throw new IllegalStateException("Unknown menu item: ".concat(id10).toString());
            case 23:
                sy.e update = (sy.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return new sy.c(false, null, false, gv.a.f147001a, update.f0(), update.d());
            case 24:
                sy.e update2 = (sy.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                if (update2 instanceof sy.c) {
                    return sy.c.a((sy.c) update2, false, null, false, null, null, true, 15);
                }
                if (update2 instanceof sy.d) {
                    return update2;
                }
                throw new NoWhenBranchMatchedException();
            case 25:
                sy.e update3 = (sy.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                if (update3 instanceof sy.c) {
                    return sy.c.a((sy.c) update3, false, null, false, null, null, false, 31);
                }
                if (update3 instanceof sy.d) {
                    return sy.d.a((sy.d) update3, false, 7);
                }
                throw new NoWhenBranchMatchedException();
            case 26:
                sy.e update4 = (sy.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                if (update4 instanceof sy.c) {
                    return sy.c.a((sy.c) update4, false, null, false, null, null, true, 31);
                }
                if (update4 instanceof sy.d) {
                    return sy.d.a((sy.d) update4, true, 7);
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 28:
                AmountData it11 = (AmountData) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.f76345a >= 0 && !kotlin.text.d0.W(it11.f76346b));
            default:
                szb.c it12 = (szb.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f266784a;
        }
    }

    public /* synthetic */ g(com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.b bVar) {
        this.f266288a = 19;
    }
}

package xf0;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.network.models.security.SettingDescriptionDto;
import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import com.revolut.sso.impl.ui.passcode.change_flow.ChangePasscodeFlowContract$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pcd.s;
import xgd.m;
import xge.g0;
import xnd.j0;
import y7d.l;
import yhm.r;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f304753b;

    public /* synthetic */ h(String str, int i) {
        this.f304752a = i;
        this.f304753b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        Object next;
        Object next2;
        Object next3;
        switch (this.f304752a) {
            case 0:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM light_faq WHERE language = ?");
                String str = this.f304753b;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    sQLiteStatementPrepare.step();
                    Integer numValueOf = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
                    sQLiteStatementPrepare.close();
                    return numValueOf;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 1:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj2;
                SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection2.prepare("DELETE FROM pigeon_tree_node WHERE language = ?");
                String str2 = this.f304753b;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str2);
                    }
                    sQLiteStatementPrepare2.step();
                    Integer numValueOf2 = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection2));
                    sQLiteStatementPrepare2.close();
                    return numValueOf2;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 2:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM pigeon_tree_node WHERE language = ?");
                String str3 = this.f304753b;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str3);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentKey");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hidden");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deeplink");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "language");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        int i = columnIndexOrThrow2;
                        arrayList.add(new zf0.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
                        columnIndexOrThrow2 = i;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                }
            case 3:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT EXISTS(SELECT `key` FROM pigeon_tree_node WHERE language = ? LIMIT 1)");
                String str4 = this.f304753b;
                boolean z = true;
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str4);
                    }
                    boolean z3 = false;
                    if (sQLiteStatementPrepare.step()) {
                        if (((int) sQLiteStatementPrepare.getLong(0)) == 0) {
                            z = false;
                        }
                        z3 = z;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z3);
                    sQLiteStatementPrepare.close();
                    return boolValueOf;
                } finally {
                }
            case 4:
                List mandates = (List) obj2;
                Intrinsics.checkNotNullParameter(mandates, "mandates");
                od0.h hVar = od0.i.Companion;
                Iterator it8 = mandates.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((Mandate) next).f72224a, this.f304753b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                hVar.getClass();
                return od0.h.a(next);
            case 5:
                m update = (m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return m.a(update, null, null, this.f304753b, 3);
            case 6:
                String item = (String) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return Boolean.valueOf(Intrinsics.f(g0.d(item), this.f304753b));
            case 7:
                AccountClosureStatus status = (AccountClosureStatus) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                return new whh.d(this.f304753b, status);
            case 8:
                AccountClosureStatus status2 = (AccountClosureStatus) obj2;
                Intrinsics.checkNotNullParameter(status2, "status");
                return new whh.a(this.f304753b, status2);
            case 9:
                xn6.e update2 = (xn6.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return xn6.e.a(update2, false, null, this.f304753b, 27);
            case 10:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Iterator it9 = pockets.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((io3.d) next2).f163145a, this.f304753b)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                if (next2 == null) {
                    throw new IllegalArgumentException("Could not find pocket by id for junior");
                }
                xi0.a aVar = xi0.b.Companion;
                String str5 = ((io3.d) next2).f163147c;
                aVar.getClass();
                return new rnd.c(xi0.a.a(str5));
            case 11:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                djb.a aVar2 = (djb.a) rVar.f314201a;
                s sVar = (s) rVar.f314202b;
                ynd.j jVar = (ynd.j) rVar.f314203c;
                od0.h hVar2 = od0.i.Companion;
                j0 j0Var = new j0(this.f304753b, aVar2, sVar, jVar);
                hVar2.getClass();
                return od0.h.a(j0Var);
            case 12:
                ChangePasscodeFlowContract$State update3 = (ChangePasscodeFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                String phone = this.f304753b;
                if (phone == null) {
                    phone = "";
                }
                String passcodeOnChange = update3.f106591a;
                Intrinsics.checkNotNullParameter(passcodeOnChange, "passcodeOnChange");
                Intrinsics.checkNotNullParameter(phone, "phone");
                return new ChangePasscodeFlowContract$State(passcodeOnChange, phone);
            case 13:
                xti.e update4 = (xti.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return xti.e.a(update4, this.f304753b, null, 2);
            case 14:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((jq9.k) obj3).f(this.f304753b)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 15:
                SotFlowContract$FlowState update5 = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return SotFlowContract$FlowState.a(update5, false, null, null, null, null, null, null, null, null, this.f304753b, null, null, null, false, 15871);
            case 16:
                y07.g updateState = (y07.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return y07.g.a(updateState, this.f304753b, null, null, false, 6);
            case 17:
                return TextFieldImplKt.defaultErrorSemantics$lambda$22(this.f304753b, (SemanticsPropertyReceiver) obj2);
            case 18:
                y12.d update6 = (y12.d) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                String str6 = this.f304753b;
                if (str6.length() == 0) {
                    str6 = null;
                }
                update6.getClass();
                return new y12.d(str6);
            case 19:
                List settingsListDto = (List) obj2;
                Intrinsics.checkNotNullParameter(settingsListDto, "settingsListDto");
                od0.h hVar3 = od0.i.Companion;
                Iterator it10 = settingsListDto.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next3 = it10.next();
                        if (Intrinsics.f(this.f304753b, ((SettingDescriptionDto) next3).getSettingName())) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                SettingDescriptionDto settingDescriptionDto = (SettingDescriptionDto) next3;
                Boolean boolValueOf2 = settingDescriptionDto != null ? Boolean.valueOf(settingDescriptionDto.getEnabled()) : null;
                hVar3.getClass();
                return od0.h.a(boolValueOf2);
            case 20:
                TransferNote.NewZealandNote it11 = (TransferNote.NewZealandNote) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return TransferNote.NewZealandNote.a(it11, this.f304753b, null, null, 6);
            case 21:
                TransferNote.NewZealandNote it12 = (TransferNote.NewZealandNote) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return TransferNote.NewZealandNote.a(it12, null, this.f304753b, null, 5);
            case 22:
                TransferNote.NewZealandNote it13 = (TransferNote.NewZealandNote) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return TransferNote.NewZealandNote.a(it13, null, null, this.f304753b, 3);
            case 23:
                y66.a update7 = (y66.a) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return y66.a.a(update7, null, null, null, d0.F0(this.f304753b).toString(), 7);
            case 24:
                y7a.r updateState2 = (y7a.r) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return y7a.r.a(updateState2, null, null, null, this.f304753b, false, false, false, null, 503);
            case 25:
                l updateState3 = (l) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return l.a(updateState3, this.f304753b, null, y7d.k.THINKING, null, null, null, false, false, null, 0L, 1018);
            case 26:
                return l.a((l) obj2, this.f304753b, null, null, null, null, null, false, false, null, 0L, 1022);
            case 27:
                PaymentLinksTransferData updateTransferData = (PaymentLinksTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return PaymentLinksTransferData.a(updateTransferData, 0L, null, null, null, this.f304753b, null, null, 479);
            case 28:
                r9d.b dto = (r9d.b) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return Boolean.valueOf(Intrinsics.f(dto.getId(), this.f304753b));
            default:
                InvoiceTemplate template = (InvoiceTemplate) obj2;
                Intrinsics.checkNotNullParameter(template, "template");
                return Boolean.valueOf(Intrinsics.f(template.f86397a, this.f304753b));
        }
    }

    public /* synthetic */ h(g0 g0Var, String str) {
        this.f304752a = 6;
        this.f304753b = str;
    }
}

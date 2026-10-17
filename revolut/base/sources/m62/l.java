package m62;

import aj0.m0;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus;
import ip0.ky;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m8d.v;
import m98.g;
import org.jmrtd.lds.LDSFile;
import tof.va;
import v20.d1;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202977a;

    public /* synthetic */ l(int i) {
        this.f202977a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f202977a) {
            case 0:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                IrisRegistrationStatus.NotRegistered status = update.f202968a;
                Intrinsics.checkNotNullParameter(status, "status");
                return new a(status, true);
            case 1:
                l67.a it8 = (l67.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                l67.d state = it8.getState();
                Intrinsics.checkNotNullParameter(state, "<this>");
                int i = l67.b.f192357a[state.ordinal()];
                if (i == 1) {
                    return i67.a.ENABLED;
                }
                if (i == 2) {
                    return i67.a.DISABLED;
                }
                if (i == 3) {
                    return i67.a.PENDING;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 3:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 4:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems3.invoke();
            case 5:
                hm8.f it9 = (hm8.f) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (Intrinsics.f(it9, hm8.c.f153539a)) {
                    z = false;
                } else {
                    if (!Intrinsics.f(it9, hm8.d.f153540a) && !Intrinsics.f(it9, hm8.e.f153541a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                va it10 = (va) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10;
            case 7:
                fo3.c it11 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.d;
            case 8:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new m8c.j((r7c.a) pair.f186385a, ((Boolean) pair.f186386b).booleanValue());
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m8c.l lVar = new m8c.l(null, null, null, null, f0.f322471a);
                ArrayList arrayList = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    s7 s7Var = new s7(a0.d.n("DEFERRED_PAYMENT_LIST_ID_", i2), 0, 0, 0, 0, false, null, 126);
                    yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(s7Var);
                }
                return new m8c.m(lVar, arrayList);
            case 10:
                aj0.a content = (aj0.a) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                return (m0) content;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
            case 12:
                d1 nextTicket = (d1) obj2;
                Intrinsics.checkNotNullParameter(nextTicket, "nextTicket");
                if (Intrinsics.f(nextTicket, d1.a.f285360a)) {
                    nextTicket = null;
                }
                return new m8d.n(true, nextTicket);
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new m8d.n(true, null);
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return v.f203524a;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 16:
                od0.i optional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optional, "optional");
                Boolean bool = (Boolean) optional.f224257a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 17:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM pae_incoming_payments_table");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sentDate");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(new n91.b(sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 18:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM pae_scheduled_payments_table");
                try {
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "frequency");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "iban");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reference");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sentDate");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList3.add(new n91.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.getLong(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15), sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19), sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20)));
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            case 19:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM pae_direct_debits_table");
                try {
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sentDate");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList4.add(new n91.a(sQLiteStatementPrepare.getLong(columnIndexOrThrow23), sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21), sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22), sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24), sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25), sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26), sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27), sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28), sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29)));
                        break;
                    }
                    return arrayList4;
                } finally {
                }
            case 20:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM pae_payment_required_attributes_table");
                try {
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paymentId");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = null;
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow33)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow33);
                        }
                        arrayList5.add(new n91.c(text2, text3, text4, text));
                        break;
                    }
                    return arrayList5;
                } finally {
                }
            case 21:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM pae_incoming_payments_table");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 22:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM pae_source_bank_details_table");
                try {
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text5 = null;
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow36)) {
                            text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                        }
                        arrayList6.add(new n91.e(text6, text7, text5));
                        break;
                    }
                    return arrayList6;
                } finally {
                }
            case 23:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM pae_source_bank_details_table");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new ky("ID_LOADING_ITEM_CARD_1", new ResourceImage(R$drawable.uikit_pic_602_card_placeholder, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 190), 0, 0, 60));
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarB = nb0.b(nb0Var, "ID_PROFILE_ITEM_LOADING_1", false, 0, false, 30);
                yp0.b.l(pb0VarB, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
                pb0 pb0VarB2 = nb0.b(nb0Var, "ID_PROFILE_ITEM_LOADING_2", false, 0, false, 30);
                yp0.b.l(pb0VarB2, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(pb0VarB, pb0VarB2);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return g.a.f203641a;
            case 28:
                m9a.d update2 = (m9a.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                g8a.a reason = g8a.a.USER_NOT_INTERESTED;
                update2.getClass();
                Intrinsics.checkNotNullParameter(reason, "reason");
                return new m9a.d(reason);
            default:
                m9a.d update3 = (m9a.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                g8a.a reason2 = g8a.a.USER_DOES_NOT_RECOGNISE_PAYMENT;
                update3.getClass();
                Intrinsics.checkNotNullParameter(reason2, "reason");
                return new m9a.d(reason2);
        }
    }
}

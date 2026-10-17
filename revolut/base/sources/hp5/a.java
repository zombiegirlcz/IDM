package hp5;

import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressDestinationTag;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingCheckResult;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWallet;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrder;
import ip0.v7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import qo5.j;
import qo5.n;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f154462b;

    public /* synthetic */ a(o oVar, int i) {
        this.f154461a = i;
        this.f154462b = oVar;
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        wk5.a blockchain;
        boolean z;
        Instant instant;
        CryptoAddressCounterparty cryptoAddressCounterparty;
        String str;
        wk5.g gVar;
        wk5.h hVar;
        wk5.d dVar;
        String str2;
        wk5.f fVar;
        wk5.e eVar;
        CryptoAddressCounterparty.OwnershipPayload ownershipPayload;
        wk5.e eVar2;
        wk5.f fVar2;
        wk5.d dVar2;
        wk5.h hVar2;
        wk5.g gVar2;
        ko5.b bVar;
        int i = this.f154461a;
        final int i2 = 0;
        final int i3 = 1;
        o oVar = this.f154462b;
        switch (i) {
            case 0:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                List list3 = list2;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList.add(cp5.a.b((dp5.f) it8.next(), new hie.b(1, this.f154462b, o.class, "getAddressTypeLocalised", "getAddressTypeLocalised(Lcom/revolut/feature/crypto/remittance/models/CryptoAddressType;)Ljava/lang/String;", 0, 8)));
                }
                return arrayList;
            case 1:
                dp5.f cryptoAddressDto = (dp5.f) obj2;
                Intrinsics.checkNotNullParameter(cryptoAddressDto, "cryptoAddressDto");
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                o oVar2 = this.f154462b;
                return oVar2.c(mVar).D(cp5.a.b(cryptoAddressDto, new hie.b(1, oVar2, o.class, "getAddressTypeLocalised", "getAddressTypeLocalised(Lcom/revolut/feature/crypto/remittance/models/CryptoAddressType;)Ljava/lang/String;", 0, 6)));
            case 2:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return oVar.f154485g.a(error);
            case 3:
                CryptoWithdrawLimits cryptoWithdrawLimits = ((CryptoWithdrawOrder) obj2).f71097b;
                w4l.f fVar3 = oVar.f154493r;
                xi0.b.Companion.getClass();
                fVar3.j(xi0.b.H, cryptoWithdrawLimits);
                return Unit.f186387a;
            case 4:
                CryptoWithdrawLimits cryptoWithdrawLimits2 = ((CryptoWithdrawOrder) obj2).f71097b;
                w4l.f fVar4 = oVar.f154493r;
                xi0.b.Companion.getClass();
                fVar4.j(xi0.b.H, cryptoWithdrawLimits2);
                return Unit.f186387a;
            case 5:
                ne0.j jVar = oVar.f154483b;
                e params = (e) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                if ((params.f154469a && !Intrinsics.f((Boolean) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED"), Boolean.TRUE)) || (list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES")) == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                    if (params.f154469a || !cryptoAddress.k) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 6:
                o oVar3 = this.f154462b;
                final ro5.d dVar3 = oVar3.e;
                e params2 = (e) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                List list4 = params2.f154469a ? (List) DBUtil.performBlocking(dVar3.f255882a, true, false, new Function1() { // from class: ro5.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        SQLiteStatement sQLiteStatementPrepare;
                        String text;
                        int i5;
                        int i6;
                        int i21;
                        String text2;
                        int i22;
                        int i32;
                        int i33;
                        switch (i2) {
                            case 0:
                                d dVar4 = dVar3;
                                dVar4.getClass();
                                sQLiteStatementPrepare = ((SQLiteConnection) obj4).prepare("SELECT * FROM crypto_addresses");
                                try {
                                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
                                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "destinationTag");
                                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasTransactions");
                                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blockchain");
                                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flags");
                                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
                                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientDetails");
                                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolutAddress");
                                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limits");
                                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counterparty");
                                    ArrayList arrayList3 = new ArrayList();
                                    while (sQLiteStatementPrepare.step()) {
                                        qo5.c cVar = null;
                                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                                            text = null;
                                            i6 = columnIndexOrThrow2;
                                            i5 = columnIndexOrThrow3;
                                        } else {
                                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                            i5 = columnIndexOrThrow3;
                                            i6 = columnIndexOrThrow2;
                                        }
                                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0;
                                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                        List listA = dVar4.d().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                                        boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0;
                                        j jVarA = dVar4.b().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                                        boolean z6 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12)) != 0;
                                        int i43 = columnIndexOrThrow;
                                        ep5.c cVarA = dVar4.c().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow14);
                                        int i59 = columnIndexOrThrow15;
                                        String text9 = sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59);
                                        columnIndexOrThrow15 = i59;
                                        to5.a aVarA = dVar4.a();
                                        if (text9 != null) {
                                            i21 = columnIndexOrThrow14;
                                            cVar = (qo5.c) aVarA.f272510a.b(qo5.c.Companion.serializer(), text9);
                                        } else {
                                            i21 = columnIndexOrThrow14;
                                            aVarA.getClass();
                                        }
                                        arrayList3.add(new qo5.d(text3, text4, text5, text6, text, z3, text7, text8, listA, z4, jVarA, z6, cVarA, j2, cVar));
                                        columnIndexOrThrow2 = i6;
                                        columnIndexOrThrow3 = i5;
                                        columnIndexOrThrow = i43;
                                        columnIndexOrThrow14 = i21;
                                        break;
                                    }
                                    return arrayList3;
                                } finally {
                                }
                            case 1:
                                d dVar5 = dVar3;
                                dVar5.getClass();
                                sQLiteStatementPrepare = ((SQLiteConnection) obj4).prepare("SELECT * FROM crypto_addresses WHERE isHidden = 0");
                                try {
                                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
                                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "destinationTag");
                                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasTransactions");
                                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blockchain");
                                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flags");
                                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
                                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientDetails");
                                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolutAddress");
                                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limits");
                                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counterparty");
                                    ArrayList arrayList4 = new ArrayList();
                                    while (sQLiteStatementPrepare.step()) {
                                        qo5.c cVar2 = null;
                                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16);
                                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17);
                                        String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18);
                                        String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19);
                                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow20)) {
                                            text2 = null;
                                            i32 = columnIndexOrThrow17;
                                            i22 = columnIndexOrThrow18;
                                        } else {
                                            text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow20);
                                            i22 = columnIndexOrThrow18;
                                            i32 = columnIndexOrThrow17;
                                        }
                                        boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21)) != 0;
                                        String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                        String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                        List listA2 = dVar5.d().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                        boolean z12 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow25)) != 0;
                                        j jVarA2 = dVar5.b().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                        boolean z29 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)) != 0;
                                        int i66 = columnIndexOrThrow16;
                                        ep5.c cVarA2 = dVar5.c().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28));
                                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow29);
                                        int i74 = columnIndexOrThrow30;
                                        String text16 = sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74);
                                        columnIndexOrThrow30 = i74;
                                        to5.a aVarA2 = dVar5.a();
                                        if (text16 != null) {
                                            i33 = columnIndexOrThrow29;
                                            cVar2 = (qo5.c) aVarA2.f272510a.b(qo5.c.Companion.serializer(), text16);
                                        } else {
                                            i33 = columnIndexOrThrow29;
                                            aVarA2.getClass();
                                        }
                                        arrayList4.add(new qo5.d(text10, text11, text12, text13, text2, z11, text14, text15, listA2, z12, jVarA2, z29, cVarA2, j3, cVar2));
                                        columnIndexOrThrow17 = i32;
                                        columnIndexOrThrow18 = i22;
                                        columnIndexOrThrow16 = i66;
                                        columnIndexOrThrow29 = i33;
                                        break;
                                    }
                                    return arrayList4;
                                } finally {
                                }
                            default:
                                d dVar6 = dVar3;
                                dVar6.getClass();
                                sQLiteStatementPrepare = ((SQLiteConnection) obj4).prepare("SELECT * FROM crypto_wallets");
                                try {
                                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
                                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
                                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientDetails");
                                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "linkedBeneficiaries");
                                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
                                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limits");
                                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "label");
                                    ArrayList arrayList5 = new ArrayList();
                                    while (sQLiteStatementPrepare.step()) {
                                        arrayList5.add(new n(sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31), sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32), sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33), dVar6.b().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34)), dVar6.d().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow36)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37), dVar6.c().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38)), sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39)));
                                        break;
                                    }
                                    return arrayList5;
                                } finally {
                                }
                        }
                    }
                }) : (List) DBUtil.performBlocking(dVar3.f255882a, true, false, new Function1() { // from class: ro5.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        SQLiteStatement sQLiteStatementPrepare;
                        String text;
                        int i5;
                        int i6;
                        int i21;
                        String text2;
                        int i22;
                        int i32;
                        int i33;
                        switch (i3) {
                            case 0:
                                d dVar4 = dVar3;
                                dVar4.getClass();
                                sQLiteStatementPrepare = ((SQLiteConnection) obj4).prepare("SELECT * FROM crypto_addresses");
                                try {
                                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
                                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "destinationTag");
                                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasTransactions");
                                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blockchain");
                                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flags");
                                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
                                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientDetails");
                                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolutAddress");
                                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limits");
                                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counterparty");
                                    ArrayList arrayList3 = new ArrayList();
                                    while (sQLiteStatementPrepare.step()) {
                                        qo5.c cVar = null;
                                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                                            text = null;
                                            i6 = columnIndexOrThrow2;
                                            i5 = columnIndexOrThrow3;
                                        } else {
                                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                            i5 = columnIndexOrThrow3;
                                            i6 = columnIndexOrThrow2;
                                        }
                                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0;
                                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                        List listA = dVar4.d().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                                        boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0;
                                        j jVarA = dVar4.b().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                                        boolean z6 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12)) != 0;
                                        int i43 = columnIndexOrThrow;
                                        ep5.c cVarA = dVar4.c().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow14);
                                        int i59 = columnIndexOrThrow15;
                                        String text9 = sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59);
                                        columnIndexOrThrow15 = i59;
                                        to5.a aVarA = dVar4.a();
                                        if (text9 != null) {
                                            i21 = columnIndexOrThrow14;
                                            cVar = (qo5.c) aVarA.f272510a.b(qo5.c.Companion.serializer(), text9);
                                        } else {
                                            i21 = columnIndexOrThrow14;
                                            aVarA.getClass();
                                        }
                                        arrayList3.add(new qo5.d(text3, text4, text5, text6, text, z3, text7, text8, listA, z4, jVarA, z6, cVarA, j2, cVar));
                                        columnIndexOrThrow2 = i6;
                                        columnIndexOrThrow3 = i5;
                                        columnIndexOrThrow = i43;
                                        columnIndexOrThrow14 = i21;
                                        break;
                                    }
                                    return arrayList3;
                                } finally {
                                }
                            case 1:
                                d dVar5 = dVar3;
                                dVar5.getClass();
                                sQLiteStatementPrepare = ((SQLiteConnection) obj4).prepare("SELECT * FROM crypto_addresses WHERE isHidden = 0");
                                try {
                                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
                                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "destinationTag");
                                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasTransactions");
                                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blockchain");
                                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flags");
                                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
                                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientDetails");
                                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolutAddress");
                                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limits");
                                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counterparty");
                                    ArrayList arrayList4 = new ArrayList();
                                    while (sQLiteStatementPrepare.step()) {
                                        qo5.c cVar2 = null;
                                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16);
                                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17);
                                        String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18);
                                        String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19);
                                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow20)) {
                                            text2 = null;
                                            i32 = columnIndexOrThrow17;
                                            i22 = columnIndexOrThrow18;
                                        } else {
                                            text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow20);
                                            i22 = columnIndexOrThrow18;
                                            i32 = columnIndexOrThrow17;
                                        }
                                        boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21)) != 0;
                                        String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                        String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                        List listA2 = dVar5.d().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                        boolean z12 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow25)) != 0;
                                        j jVarA2 = dVar5.b().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                        boolean z29 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)) != 0;
                                        int i66 = columnIndexOrThrow16;
                                        ep5.c cVarA2 = dVar5.c().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28));
                                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow29);
                                        int i74 = columnIndexOrThrow30;
                                        String text16 = sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74);
                                        columnIndexOrThrow30 = i74;
                                        to5.a aVarA2 = dVar5.a();
                                        if (text16 != null) {
                                            i33 = columnIndexOrThrow29;
                                            cVar2 = (qo5.c) aVarA2.f272510a.b(qo5.c.Companion.serializer(), text16);
                                        } else {
                                            i33 = columnIndexOrThrow29;
                                            aVarA2.getClass();
                                        }
                                        arrayList4.add(new qo5.d(text10, text11, text12, text13, text2, z11, text14, text15, listA2, z12, jVarA2, z29, cVarA2, j3, cVar2));
                                        columnIndexOrThrow17 = i32;
                                        columnIndexOrThrow18 = i22;
                                        columnIndexOrThrow16 = i66;
                                        columnIndexOrThrow29 = i33;
                                        break;
                                    }
                                    return arrayList4;
                                } finally {
                                }
                            default:
                                d dVar6 = dVar3;
                                dVar6.getClass();
                                sQLiteStatementPrepare = ((SQLiteConnection) obj4).prepare("SELECT * FROM crypto_wallets");
                                try {
                                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
                                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
                                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientDetails");
                                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "linkedBeneficiaries");
                                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
                                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limits");
                                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "label");
                                    ArrayList arrayList5 = new ArrayList();
                                    while (sQLiteStatementPrepare.step()) {
                                        arrayList5.add(new n(sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31), sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32), sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33), dVar6.b().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34)), dVar6.d().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow36)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37), dVar6.c().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38)), sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39)));
                                        break;
                                    }
                                    return arrayList5;
                                } finally {
                                }
                        }
                    }
                });
                ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    qo5.d dVar4 = (qo5.d) it9.next();
                    hie.b addressTypeLocalised = new hie.b(1, oVar3, o.class, "getAddressTypeLocalised", "getAddressTypeLocalised(Lcom/revolut/feature/crypto/remittance/models/CryptoAddressType;)Ljava/lang/String;", 0, 9);
                    Object obj4 = cp5.a.f107873a;
                    Intrinsics.checkNotNullParameter(dVar4, "<this>");
                    Intrinsics.checkNotNullParameter(addressTypeLocalised, "addressTypeLocalised");
                    xi0.a aVar = xi0.b.Companion;
                    String str3 = dVar4.f248028c;
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(str3);
                    String str4 = dVar4.f248030h;
                    if (str4 == null || (blockchain = (wk5.a) u1.v(str4, wk5.b.f298250a)) == null) {
                        blockchain = wk5.a.UNSPECIFIED;
                    }
                    String str5 = dVar4.f248026a;
                    String str6 = dVar4.d;
                    String str7 = dVar4.e;
                    Intrinsics.checkNotNullParameter(blockchain, "blockchain");
                    CryptoAddressDestinationTag optional = cj9.c.m(blockchain) ? new CryptoAddressDestinationTag.Optional(str7) : CryptoAddressDestinationTag.None.f71070a;
                    String str8 = dVar4.f248027b;
                    boolean z3 = dVar4.f;
                    ko5.c cVar = (ko5.c) u1.v(dVar4.f248029g, cp5.a.f107873a);
                    if (cVar == null) {
                        cVar = ko5.c.UNKNOWN;
                    }
                    ko5.c cVar2 = cVar;
                    Iterable iterable = dVar4.i;
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it10 = iterable.iterator();
                    while (it10.hasNext()) {
                        String str9 = (String) it10.next();
                        Iterator it11 = it9;
                        ko5.b[] bVarArrValues = ko5.b.values();
                        Iterator it12 = it10;
                        int length = bVarArrValues.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                ko5.b bVar2 = bVarArrValues[i5];
                                int i6 = i5;
                                int i21 = length;
                                if (a0.z(bVar2.name(), str9, true)) {
                                    bVar = bVar2;
                                } else {
                                    i5 = i6 + 1;
                                    length = i21;
                                }
                            } else {
                                bVar = null;
                            }
                        }
                        if (bVar != null) {
                            arrayList4.add(bVar);
                        }
                        it9 = it11;
                        it10 = it12;
                    }
                    Iterator it13 = it9;
                    Set setI1 = d0.i1(arrayList4);
                    boolean z4 = dVar4.f248031j;
                    qo5.j jVar2 = dVar4.k;
                    CryptoAddressRecipientDetails cryptoAddressRecipientDetailsA = jVar2 != null ? cp5.a.a(jVar2) : null;
                    boolean z6 = dVar4.f248032l;
                    ep5.c cVar3 = dVar4.f248033m;
                    CryptoWithdrawLimits cryptoWithdrawLimitsT = cVar3 != null ? v04.b.t(cVar3) : null;
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(dVar4.f248034n);
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                    qo5.c cVar4 = dVar4.o;
                    if (cVar4 != null) {
                        Intrinsics.checkNotNullParameter(cVar4, "<this>");
                        String str10 = cVar4.f248020a;
                        String str11 = cVar4.f248021b;
                        z = z4;
                        String str12 = cVar4.f248022c;
                        instant = instantOfEpochMilli;
                        if (str12 != null) {
                            wk5.g[] gVarArrValues = wk5.g.values();
                            str = str10;
                            int length2 = gVarArrValues.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length2) {
                                    gVar2 = gVarArrValues[i22];
                                    int i32 = i22;
                                    int i33 = length2;
                                    if (!a0.z(gVar2.name(), str12, true)) {
                                        i22 = i32 + 1;
                                        length2 = i33;
                                    }
                                } else {
                                    gVar2 = null;
                                }
                            }
                            gVar = gVar2;
                        } else {
                            str = str10;
                            gVar = null;
                        }
                        String str13 = cVar4.d;
                        if (str13 != null) {
                            wk5.h[] hVarArrValues = wk5.h.values();
                            int length3 = hVarArrValues.length;
                            int i43 = 0;
                            while (true) {
                                if (i43 < length3) {
                                    hVar2 = hVarArrValues[i43];
                                    int i59 = i43;
                                    int i66 = length3;
                                    if (!a0.z(hVar2.name(), str13, true)) {
                                        i43 = i59 + 1;
                                        length3 = i66;
                                    }
                                } else {
                                    hVar2 = null;
                                }
                            }
                            hVar = hVar2;
                        } else {
                            hVar = null;
                        }
                        String str14 = cVar4.e;
                        if (str14 != null) {
                            wk5.d[] dVarArrValues = wk5.d.values();
                            int length4 = dVarArrValues.length;
                            int i74 = 0;
                            while (true) {
                                if (i74 < length4) {
                                    dVar2 = dVarArrValues[i74];
                                    int i92 = i74;
                                    int i96 = length4;
                                    if (!a0.z(dVar2.name(), str14, true)) {
                                        i74 = i92 + 1;
                                        length4 = i96;
                                    }
                                } else {
                                    dVar2 = null;
                                }
                            }
                            dVar = dVar2;
                        } else {
                            dVar = null;
                        }
                        String str15 = cVar4.f;
                        qo5.j jVar3 = cVar4.f248023g;
                        CryptoAddressRecipientDetails cryptoAddressRecipientDetailsA2 = jVar3 != null ? cp5.a.a(jVar3) : null;
                        String str16 = cVar4.f248024h;
                        if (str16 != null) {
                            wk5.f[] fVarArrValues = wk5.f.values();
                            str2 = str15;
                            int length5 = fVarArrValues.length;
                            int i99 = 0;
                            while (true) {
                                if (i99 < length5) {
                                    fVar2 = fVarArrValues[i99];
                                    int i100 = length5;
                                    int i101 = i99;
                                    if (!a0.z(fVar2.name(), str16, true)) {
                                        i99 = i101 + 1;
                                        length5 = i100;
                                    }
                                } else {
                                    fVar2 = null;
                                }
                            }
                            fVar = fVar2;
                        } else {
                            str2 = str15;
                            fVar = null;
                        }
                        String str17 = cVar4.i;
                        if (str17 != null) {
                            wk5.e[] eVarArrValues = wk5.e.values();
                            int length6 = eVarArrValues.length;
                            int i102 = 0;
                            while (true) {
                                if (i102 < length6) {
                                    eVar2 = eVarArrValues[i102];
                                    int i103 = i102;
                                    int i104 = length6;
                                    if (!a0.z(eVar2.name(), str17, true)) {
                                        i102 = i103 + 1;
                                        length6 = i104;
                                    }
                                } else {
                                    eVar2 = null;
                                }
                            }
                            eVar = eVar2;
                        } else {
                            eVar = null;
                        }
                        qo5.g gVar3 = cVar4.f248025j;
                        if (gVar3 != null) {
                            Intrinsics.checkNotNullParameter(gVar3, "<this>");
                            ownershipPayload = new CryptoAddressCounterparty.OwnershipPayload(gVar3.f248036a);
                        } else {
                            ownershipPayload = null;
                        }
                        Long l2 = cVar4.k;
                        cryptoAddressCounterparty = new CryptoAddressCounterparty(str, str11, gVar, hVar, dVar, str2, cryptoAddressRecipientDetailsA2, fVar, eVar, ownershipPayload, l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null);
                    } else {
                        z = z4;
                        instant = instantOfEpochMilli;
                        cryptoAddressCounterparty = null;
                    }
                    arrayList3.add(new CryptoAddress(str5, bVarA, str6, optional, str8, z3, cVar2, blockchain, setI1, z, cryptoAddressRecipientDetailsA, z6, cryptoWithdrawLimitsT, instant, cryptoAddressCounterparty, (String) addressTypeLocalised.invoke(wk5.m.a(blockchain))));
                    it9 = it13;
                }
                return arrayList3;
            case 7:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) oVar.f154483b.get("CACHE_KEY_CRYPTO_WALLETS");
            case 8:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                final ro5.d dVar5 = oVar.e;
                final int i105 = 2;
                List<qo5.n> list5 = (List) DBUtil.performBlocking(dVar5.f255882a, true, false, new Function1() { // from class: ro5.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj42) {
                        SQLiteStatement sQLiteStatementPrepare;
                        String text;
                        int i510;
                        int i610;
                        int i212;
                        String text2;
                        int i222;
                        int i322;
                        int i332;
                        switch (i105) {
                            case 0:
                                d dVar42 = dVar5;
                                dVar42.getClass();
                                sQLiteStatementPrepare = ((SQLiteConnection) obj42).prepare("SELECT * FROM crypto_addresses");
                                try {
                                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
                                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "destinationTag");
                                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasTransactions");
                                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blockchain");
                                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flags");
                                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
                                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientDetails");
                                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolutAddress");
                                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limits");
                                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counterparty");
                                    ArrayList arrayList32 = new ArrayList();
                                    while (sQLiteStatementPrepare.step()) {
                                        qo5.c cVar5 = null;
                                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                                            text = null;
                                            i610 = columnIndexOrThrow2;
                                            i510 = columnIndexOrThrow3;
                                        } else {
                                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                            i510 = columnIndexOrThrow3;
                                            i610 = columnIndexOrThrow2;
                                        }
                                        boolean z310 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0;
                                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                        List listA = dVar42.d().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                                        boolean z49 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0;
                                        j jVarA = dVar42.b().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                                        boolean z610 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12)) != 0;
                                        int i432 = columnIndexOrThrow;
                                        ep5.c cVarA = dVar42.c().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow14);
                                        int i592 = columnIndexOrThrow15;
                                        String text9 = sQLiteStatementPrepare.isNull(i592) ? null : sQLiteStatementPrepare.getText(i592);
                                        columnIndexOrThrow15 = i592;
                                        to5.a aVarA = dVar42.a();
                                        if (text9 != null) {
                                            i212 = columnIndexOrThrow14;
                                            cVar5 = (qo5.c) aVarA.f272510a.b(qo5.c.Companion.serializer(), text9);
                                        } else {
                                            i212 = columnIndexOrThrow14;
                                            aVarA.getClass();
                                        }
                                        arrayList32.add(new qo5.d(text3, text4, text5, text6, text, z310, text7, text8, listA, z49, jVarA, z610, cVarA, j2, cVar5));
                                        columnIndexOrThrow2 = i610;
                                        columnIndexOrThrow3 = i510;
                                        columnIndexOrThrow = i432;
                                        columnIndexOrThrow14 = i212;
                                        break;
                                    }
                                    return arrayList32;
                                } finally {
                                }
                            case 1:
                                d dVar52 = dVar5;
                                dVar52.getClass();
                                sQLiteStatementPrepare = ((SQLiteConnection) obj42).prepare("SELECT * FROM crypto_addresses WHERE isHidden = 0");
                                try {
                                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
                                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "destinationTag");
                                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasTransactions");
                                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blockchain");
                                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flags");
                                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
                                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientDetails");
                                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolutAddress");
                                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limits");
                                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counterparty");
                                    ArrayList arrayList42 = new ArrayList();
                                    while (sQLiteStatementPrepare.step()) {
                                        qo5.c cVar22 = null;
                                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16);
                                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17);
                                        String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18);
                                        String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19);
                                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow20)) {
                                            text2 = null;
                                            i322 = columnIndexOrThrow17;
                                            i222 = columnIndexOrThrow18;
                                        } else {
                                            text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow20);
                                            i222 = columnIndexOrThrow18;
                                            i322 = columnIndexOrThrow17;
                                        }
                                        boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21)) != 0;
                                        String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                        String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                        List listA2 = dVar52.d().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                        boolean z12 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow25)) != 0;
                                        j jVarA2 = dVar52.b().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                        boolean z29 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)) != 0;
                                        int i662 = columnIndexOrThrow16;
                                        ep5.c cVarA2 = dVar52.c().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28));
                                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow29);
                                        int i742 = columnIndexOrThrow30;
                                        String text16 = sQLiteStatementPrepare.isNull(i742) ? null : sQLiteStatementPrepare.getText(i742);
                                        columnIndexOrThrow30 = i742;
                                        to5.a aVarA2 = dVar52.a();
                                        if (text16 != null) {
                                            i332 = columnIndexOrThrow29;
                                            cVar22 = (qo5.c) aVarA2.f272510a.b(qo5.c.Companion.serializer(), text16);
                                        } else {
                                            i332 = columnIndexOrThrow29;
                                            aVarA2.getClass();
                                        }
                                        arrayList42.add(new qo5.d(text10, text11, text12, text13, text2, z11, text14, text15, listA2, z12, jVarA2, z29, cVarA2, j3, cVar22));
                                        columnIndexOrThrow17 = i322;
                                        columnIndexOrThrow18 = i222;
                                        columnIndexOrThrow16 = i662;
                                        columnIndexOrThrow29 = i332;
                                        break;
                                    }
                                    return arrayList42;
                                } finally {
                                }
                            default:
                                d dVar6 = dVar5;
                                dVar6.getClass();
                                sQLiteStatementPrepare = ((SQLiteConnection) obj42).prepare("SELECT * FROM crypto_wallets");
                                try {
                                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
                                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
                                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientDetails");
                                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "linkedBeneficiaries");
                                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
                                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limits");
                                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "label");
                                    ArrayList arrayList5 = new ArrayList();
                                    while (sQLiteStatementPrepare.step()) {
                                        arrayList5.add(new n(sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31), sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32), sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33), dVar6.b().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34)), dVar6.d().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow36)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37), dVar6.c().a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38)), sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39)));
                                        break;
                                    }
                                    return arrayList5;
                                } finally {
                                }
                        }
                    }
                });
                ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
                for (qo5.n nVar : list5) {
                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                    String str18 = nVar.f248045a;
                    String str19 = nVar.f248046b;
                    wk5.j jVar4 = wk5.k.Companion;
                    String str20 = nVar.f248047c;
                    jVar4.getClass();
                    wk5.k kVarA = wk5.j.a(str20);
                    if (kVarA == null) {
                        kVarA = wk5.k.UNKNOWN;
                    }
                    wk5.k kVar = kVarA;
                    qo5.j jVar5 = nVar.d;
                    CryptoAddressRecipientDetails cryptoAddressRecipientDetailsA3 = jVar5 != null ? cp5.a.a(jVar5) : null;
                    List list6 = nVar.e;
                    boolean z11 = nVar.f;
                    ko5.d dVar6 = ko5.e.Companion;
                    String str21 = nVar.f248048g;
                    dVar6.getClass();
                    ko5.e eVarA = ko5.d.a(str21);
                    if (eVarA == null) {
                        eVarA = ko5.e.UNKNOWN;
                    }
                    ko5.e eVar3 = eVarA;
                    ep5.c cVar5 = nVar.f248049h;
                    arrayList5.add(new CryptoWallet(str18, str19, kVar, cryptoAddressRecipientDetailsA3, list6, z11, eVar3, cVar5 != null ? v04.b.t(cVar5) : null, nVar.i));
                }
                return arrayList5;
            case 9:
                xi0.b currency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency, "currency");
                return (CryptoWithdrawLimits) v7.r("CACHE_KEY_LIMITS_", currency.f306286a, oVar.d);
            case 10:
                xi0.b currency2 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency2, "currency");
                ep5.c cVar6 = (ep5.c) j6.a.k(ep5.c.class, oVar.f, j6.a.q("CryptoWithdraw_Limits", currency2.f306286a));
                if (cVar6 != null) {
                    return v04.b.t(cVar6);
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (wk5.n) oVar.f154484c.get("CACHE_KEY_RESTRICTION_VALIDATION");
            case 12:
                f params3 = (f) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (Map) oVar.f154483b.get("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params3.b().f306286a + params3.a());
            default:
                d params4 = (d) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                return (CryptoAddressHostingCheckResult) oVar.f154483b.get("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params4.a() + params4.b());
        }
    }
}

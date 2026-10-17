package com.revolut.feature.pix.impl.flow.qr_code_transaction;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.pix.api.model.PixQrCodeAgent;
import com.revolut.feature.pix.api.model.PixQrCodeAmount;
import com.revolut.feature.pix.api.model.PixQrCodeBill;
import com.revolut.feature.pix.api.model.PixQrCodeCreditor;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.model.PixQrCodeIdentification;
import com.revolut.feature.pix.api.model.PixQrCodeParty;
import com.revolut.feature.pix.api.navigation.PixAreaNavigation$Destination;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.PixQrCodeTransactionFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import hx7.e;
import k3k.k;
import kba.b;
import kba.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import vkm.j2;
import vkm.q;
import yji.l;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f80696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final MainScreenFeatureConfig.WithInnerConfiguration f80697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f80698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f80699s;

    public a(c inputData) {
        dj0.d dVar;
        FlowStep review;
        Long l2;
        PixQrCodeAgent pixQrCodeAgent;
        PixQrCodeParty pixQrCodeParty;
        PixQrCodeParty pixQrCodeParty2;
        PixQrCodeIdentification pixQrCodeIdentification;
        PixQrCodeParty pixQrCodeParty3;
        Boolean bool;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        j2 j2VarC = q.c(inputData.f182542b);
        this.f80696p = j2VarC;
        String str = null;
        this.f80697q = new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, u0.f(new PixAreaNavigation$Destination(0)), 2));
        this.f80698r = e.b(this, new PixQrCodeTransactionFlowContract$State((PixQrCodeDecodeData) j2VarC.getValue()));
        PixQrCodeDecodeData pixQrCodeDecodeDataI2 = I2();
        Intrinsics.checkNotNullParameter(pixQrCodeDecodeDataI2, "<this>");
        PixQrCodeAmount pixQrCodeAmount = pixQrCodeDecodeDataI2.d;
        if ((pixQrCodeAmount == null || (bool = pixQrCodeAmount.f80425b) == null) ? true : bool.booleanValue()) {
            PixQrCodeCreditor pixQrCodeCreditor = I2().e;
            String str2 = (pixQrCodeCreditor == null || (pixQrCodeParty3 = pixQrCodeCreditor.f80432a) == null) ? null : pixQrCodeParty3.f80468a;
            str2 = str2 == null ? "" : str2;
            PixQrCodeCreditor pixQrCodeCreditor2 = I2().e;
            if (pixQrCodeCreditor2 != null && (pixQrCodeParty2 = pixQrCodeCreditor2.f80432a) != null && (pixQrCodeIdentification = pixQrCodeParty2.f80469b) != null) {
                str = pixQrCodeIdentification.f80463b;
            }
            review = new PixQrCodeTransactionFlowContract$Step.Amount(str2, str != null ? str : "");
        } else {
            PixQrCodeAmount pixQrCodeAmount2 = I2().d;
            long jLongValue = 0;
            if (pixQrCodeAmount2 == null || (dVar = pixQrCodeAmount2.f80424a) == null) {
                xi0.b.Companion.getClass();
                dVar = new dj0.d(0L, xi0.b.D);
            }
            dj0.d dVar2 = dVar;
            PixQrCodeCreditor pixQrCodeCreditor3 = I2().e;
            String str3 = (pixQrCodeCreditor3 == null || (pixQrCodeParty = pixQrCodeCreditor3.f80432a) == null) ? null : pixQrCodeParty.f80468a;
            String str4 = str3 == null ? "" : str3;
            PixQrCodeCreditor pixQrCodeCreditor4 = I2().e;
            String str5 = (pixQrCodeCreditor4 == null || (pixQrCodeAgent = pixQrCodeCreditor4.f80433b) == null) ? null : pixQrCodeAgent.f80422a;
            String str6 = str5 == null ? "" : str5;
            String str7 = inputData.f182541a;
            PixQrCodeBill pixQrCodeBill = I2().f80449h;
            if (pixQrCodeBill != null && (l2 = pixQrCodeBill.e) != null) {
                jLongValue = l2.longValue();
            }
            review = new PixQrCodeTransactionFlowContract$Step.Review(str7, dVar2, "", str4, str6, new TransferScheduleData(jLongValue, (jli.c) null, 6));
        }
        this.f80699s = cp5.d.a(this, review, f0.f322471a, new k(this, 16));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f80696p, null, null, new kae.d(this, null, 3), 3);
    }

    public final PixQrCodeDecodeData I2() {
        return ((PixQrCodeTransactionFlowContract$State) ((j2) this.f80698r.f22677a).getValue()).f80686a;
    }

    @Override // qki.e
    public final d getState() {
        return this.f80698r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80699s;
    }
}

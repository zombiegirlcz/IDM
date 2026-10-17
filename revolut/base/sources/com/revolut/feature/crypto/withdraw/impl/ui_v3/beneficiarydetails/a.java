package com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails;

import aii.m;
import aii.w;
import ap5.b;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoBeneficiaryDetailsScreenContract$InputData;
import g85.f;
import g9j.q;
import ghl.c;
import gm6.j;
import gq5.e;
import gq5.g;
import gq5.i;
import gq5.n;
import gq5.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import tof.b9;
import tof.d9;
import tof.i7;
import tof.oa;
import tof.u9;
import tof.x8;
import tof.y6;
import tof.y8;
import vkm.j2;
import vkm.t0;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements g {
    public final CryptoBeneficiaryDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f71289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f71290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r10.a f71291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f71292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jo5.a f71293t;
    public final j60.a u;
    public final se5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kq5.b f71294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d2a.a f71295x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f71296y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(CryptoBeneficiaryDetailsScreenContract$InputData inputData, b cryptoWithdrawInteractor, whf.b transactionsListProvider, r10.a recipientAnalyticsInteractor, o dialogsProvider, jo5.a cryptoAddressLimitsDialogFactory, j60.a bottomExpandableDialogControllerExtension, se5.a cryptoFaqKeysProvider, kq5.b deleteBeneficiaryExtension, d2a.a wallpaperPickerControllerModelExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(transactionsListProvider, "transactionsListProvider");
        Intrinsics.checkNotNullParameter(recipientAnalyticsInteractor, "recipientAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(cryptoAddressLimitsDialogFactory, "cryptoAddressLimitsDialogFactory");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(cryptoFaqKeysProvider, "cryptoFaqKeysProvider");
        Intrinsics.checkNotNullParameter(deleteBeneficiaryExtension, "deleteBeneficiaryExtension");
        Intrinsics.checkNotNullParameter(wallpaperPickerControllerModelExtension, "wallpaperPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f71289p = cryptoWithdrawInteractor;
        this.f71290q = transactionsListProvider;
        this.f71291r = recipientAnalyticsInteractor;
        this.f71292s = dialogsProvider;
        this.f71293t = cryptoAddressLimitsDialogFactory;
        this.u = bottomExpandableDialogControllerExtension;
        this.v = cryptoFaqKeysProvider;
        this.f71294w = deleteBeneficiaryExtension;
        this.f71295x = wallpaperPickerControllerModelExtension;
        this.f71296y = d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new b6k.e(null, null)), stateMapper, null, false, 12);
        this.z = hx7.e.a(this, new c(this, 13));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, new q(rd0.e.b(this.f71289p.c(this.o.f71132a, true, ho5.a.ADDRESS_TYPE)), 15), null, null, new gq5.l(this, null, 0), 3);
        gn.a aVar = new gn.a(27);
        y yVar = this.f71296y;
        l.a1(this, vkm.q.Q(new t0(yVar.B(aVar), 1), new g6f.l(continuation, this, 14)), null, null, new gq5.l(this, null, 1), 3);
        l.a1(this, vkm.q.H(new j(this, null, 3), yVar.B(new gn.a(28))), null, null, new gq5.l(this, null, 2), 3);
        l.a1(this, new q(rd0.e.b(this.u.C()), 16), null, null, new f(this, continuation, 27), 3);
    }

    public final oa I2(CryptoAddress cryptoAddress) {
        int i = i.f145576a[this.o.f71133b.ordinal()];
        if (i == 1) {
            i7.c cVar = i7.Companion;
            u9 u9Var = new u9(false);
            y8 y8Var = new y8(cryptoAddress.f71064j);
            y6[] y6VarArr = {y6.CRYPTO_WITHDRAWAL};
            cVar.getClass();
            return i7.c.b(i7.c.a(u9Var, y8Var, i7.c.d(y6VarArr)), i7.c.a(new u9(false), new x8(cryptoAddress.f71061c)));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        i7.c cVar2 = i7.Companion;
        u9 u9Var2 = new u9(false);
        y6[] y6VarArr2 = {y6.DEFI_TRANSFER};
        cVar2.getClass();
        return i7.c.b(i7.c.a(u9Var2, i7.c.d(y6VarArr2), new b9(cryptoAddress.f71061c)), i7.c.a(new u9(false), i7.c.d(y6.DEFI_TOPUP), new d9(cryptoAddress.f71061c)));
    }

    public final CryptoAddress J2() {
        Object content = ((e) ((j2) this.f71296y.f22677a).getValue()).f145568a.getContent();
        if (content != null) {
            return (CryptoAddress) content;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f71296y;
    }

    @Override // yji.l
    public final aii.n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof kq5.a)) {
            return super.o2(event);
        }
        C2(lo5.h.f197400a);
        return w.f5295a;
    }
}

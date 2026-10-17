package com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup;

import ack.f;
import ad4.c;
import al6.b;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.PseTopupFlowContract$Step;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sri.m;
import wsg.n;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final PseTopupFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f72736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rg6.a f72737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f72738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj0.a f72739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f72740t;
    public String u;
    public final i v;

    public a(PseTopupFlowContract$InputData inputData, m navigator, rg6.a pseAppInteractor, n walletInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(pseAppInteractor, "pseAppInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f72736p = navigator;
        this.f72737q = pseAppInteractor;
        this.f72738r = walletInteractor;
        this.f72739s = idempotencyKeyHolder;
        this.v = d.a(this, new f(this, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(java.lang.String r15, java.lang.String r16, boolean r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.a.I2(java.lang.String, java.lang.String, boolean, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        this.f72739s.a("PSE_TRANSFER");
        String str = this.o.f72733c;
        if (str == null) {
            h.t2(this, this.v, PseTopupFlowContract$Step.PseEmailInput.f72735a, true, null, false, 12);
        } else {
            l2(new c(this, str, null, 29), new yi5.b(26));
        }
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        i iVar = this.v;
        if (iVar.d() != null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        iVar.n();
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}

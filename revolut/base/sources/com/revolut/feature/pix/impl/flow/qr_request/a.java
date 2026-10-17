package com.revolut.feature.pix.impl.flow.qr_request;

import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestContract$Step;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreenContract$InputData;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import u3a.p;
import vkm.j2;
import vkm.q;
import yba.d;
import yji.l;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements yba.a {

    @NotNull
    public static final d Companion = new d();
    public final qki.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f80721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f80722q;

    public a(PixQrRequestContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        qki.d dVarB = e.b(this, new PixQrRequestContract$State(inputData.f80711b, inputData.f80712c, 4));
        this.o = dVarB;
        j2 j2Var = (j2) dVarB.f22677a;
        this.f80721p = q.c(new PixQrRequestScreenContract$InputData(((PixQrRequestContract$State) j2Var.getValue()).f80713a, ((PixQrRequestContract$State) j2Var.getValue()).f80714b, ((PixQrRequestContract$State) j2Var.getValue()).f80715c));
        this.f80722q = cp5.d.a(this, inputData.f80711b == null ? PixQrRequestContract$Step.RegisterNewAlias.f80719a : PixQrRequestContract$Step.RequestViaQR.f80720a, f0.f322471a, new p(inputData, this, 26));
    }

    public static void J2(a aVar, PixKey pixKey, dj0.d dVar, String str, int i) {
        qki.d dVar2 = aVar.o;
        if ((i & 1) != 0) {
            pixKey = ((PixQrRequestContract$State) ((j2) dVar2.f22677a).getValue()).f80713a;
        }
        if ((i & 2) != 0) {
            dVar = ((PixQrRequestContract$State) ((j2) dVar2.f22677a).getValue()).f80714b;
        }
        if ((i & 4) != 0) {
            str = ((PixQrRequestContract$State) ((j2) dVar2.f22677a).getValue()).f80715c;
        }
        aVar.I2(pixKey, dVar, str);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f80721p, null, null, new y83.d(this, (Continuation) null, 9), 3);
    }

    public final void I2(PixKey pixKey, dj0.d dVar, String str) {
        j2 j2Var;
        Object value;
        String str2;
        dj0.d dVar2;
        do {
            j2Var = this.f80721p;
            value = j2Var.getValue();
            str2 = null;
            dVar2 = (dVar == null || !dVar.f(dj0.d.e)) ? null : dVar;
            if (str != null && str.length() > 0) {
                str2 = str;
            }
        } while (!j2Var.h(value, new PixQrRequestScreenContract$InputData(pixKey, dVar2, str2)));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.o;
    }

    @Override // yki.g
    public final b s() {
        return this.f80722q;
    }
}

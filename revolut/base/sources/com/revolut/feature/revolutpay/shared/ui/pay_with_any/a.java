package com.revolut.feature.revolutpay.shared.ui.pay_with_any;

import au6.a3;
import b88.o;
import bec.f0;
import bec.i;
import bec.i0;
import bec.j;
import bec.j0;
import bec.k;
import bec.k0;
import bec.m;
import bec.n;
import bec.q;
import cli.y;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dj0.d;
import h9c.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k6c.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q7c.g;
import vkm.j2;
import vkm.z1;
import yji.l;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements q {

    @NotNull
    public static final i0 Companion = new i0();
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f84724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bec.a f84725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PayWithAnyControllerDescriptor$InputData f84726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f84727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final bec.b f84728t;
    public final z1 u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84729w;

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(q7c.g r22, k6c.c r23, bec.a r24, com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData r25, h9c.b r26, bec.b r27, bec.e0 r28) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolutpay.shared.ui.pay_with_any.a.<init>(q7c.g, k6c.c, bec.a, com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData, h9c.b, bec.b, bec.e0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.revolutpay.shared.ui.pay_with_any.a r16, java.lang.String r17, gim.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolutpay.shared.ui.pay_with_any.a.I2(com.revolut.feature.revolutpay.shared.ui.pay_with_any.a, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, vkm.q.Q(this.u, new a3(continuation, this, 16)), null, null, new k0(this, continuation, 1), 3);
        l.a1(this, yoj.b.e(a.a.k(this.v.B(new bbh.a(25)), new bbh.a(26)), new o(this, 3), new b8g.a(16), new bbh.a(27)), null, null, new k0(this, continuation, 0), 3);
    }

    public final void J2() {
        PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = this.f84726r;
        h.v2(this.f84729w, new PayWithAnyContract$ModalStep.AddCard(payWithAnyControllerDescriptor$InputData.e, payWithAnyControllerDescriptor$InputData.f84433g.f84365a), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84729w;
    }

    public final void K2() {
        d dVar;
        PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = this.f84726r;
        Long l2 = payWithAnyControllerDescriptor$InputData.f84431b;
        xi0.b bVar = payWithAnyControllerDescriptor$InputData.f84432c;
        xi0.b bVar2 = null;
        if (l2 == null || bVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("To add money both inputData.amount and inputData.currency must not be null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        d dVar2 = new d(l2.longValue(), bVar);
        PaymentMethod paymentMethod = payWithAnyControllerDescriptor$InputData.d;
        PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
        if (pocket != null && (dVar = pocket.i) != null) {
            bVar2 = dVar.f115083b;
        }
        C2(new n(dVar2, bVar2));
    }

    public final void L2() {
        PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = this.f84726r;
        PaymentMethod paymentMethod = payWithAnyControllerDescriptor$InputData.d;
        Long l2 = payWithAnyControllerDescriptor$InputData.f84431b;
        xi0.b bVar = payWithAnyControllerDescriptor$InputData.f84432c;
        if (l2 != null && bVar != null) {
            C2(new bec.l(paymentMethod, new d(l2.longValue(), bVar)));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("To move money both inputData.amount and inputData.currency must not be null");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Map] */
    public final void M2() {
        Map map;
        List list;
        y yVar = this.v;
        bec.h hVar = (bec.h) ((i) ((j2) yVar.f22677a).getValue()).f14784a.getContent();
        PaymentMethod.Pocket pocket = null;
        List paymentMethods = hVar != null ? hVar.f14779a : null;
        if (paymentMethods != null) {
            bec.b bVar = this.f84728t;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : paymentMethods) {
                if (obj2 instanceof PaymentMethod.RevolutAccount) {
                    arrayList.add(obj2);
                }
            }
            PaymentMethod.RevolutAccount revolutAccount = (PaymentMethod.RevolutAccount) d0.d0(arrayList);
            PaymentMethod.RevolutAccount.Wallet wallet = revolutAccount != null ? (PaymentMethod.RevolutAccount.Wallet) revolutAccount.f84394b.get(bVar.f14761a) : null;
            if (wallet != null && (map = wallet.f84396b) != null && (list = (List) map.get(f.ACCOUNTS)) != null) {
                pocket = (PaymentMethod.Pocket) d0.d0(list);
            }
        }
        H2(yVar, new f0(pocket, 1));
    }

    public final void N2(PaymentMethod paymentMethod) {
        y yVar = this.v;
        int i = j0.f14791a[((i) ((j2) yVar.f22677a).getValue()).f14789j.ordinal()];
        if (i == 1) {
            H2(yVar, new f0(paymentMethod, 0));
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new m(paymentMethod));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }

    @Override // oki.h
    public final void onBackPressed() {
        y yVar = this.v;
        boolean z = ((i) ((j2) yVar.f22677a).getValue()).i;
        PaymentMethod paymentMethod = ((i) ((j2) yVar.f22677a).getValue()).e;
        if (z && paymentMethod != null) {
            C2(new m(paymentMethod));
        } else if (z) {
            C2(k.f14792a);
        } else {
            C2(j.f14790a);
        }
    }
}

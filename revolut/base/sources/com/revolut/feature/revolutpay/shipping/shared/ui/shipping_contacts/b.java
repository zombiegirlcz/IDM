package com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import i26.l;
import java.util.Set;
import k7c.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nec.c;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q7c.s;
import s8c.e;
import u3a.p;
import ukm.f;
import vkm.j2;
import vkm.q;
import vkm.z1;
import xec.a0;
import xec.f0;
import xec.g;
import xec.g0;
import xec.j;
import xec.w;
import xec.z;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements j {

    @NotNull
    public static final a0 Companion = new a0();
    public final s o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rec.a f84755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f84756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f84757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f84758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84759t;

    public b(ShippingContactsScreenDescriptor$InputData inputData, s shippingInteractor, rec.a dialogModelBuilder, e profileUpdateModelExtension, w stateMapper) {
        String orderToken;
        Set set;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shippingInteractor, "shippingInteractor");
        Intrinsics.checkNotNullParameter(dialogModelBuilder, "dialogModelBuilder");
        Intrinsics.checkNotNullParameter(profileUpdateModelExtension, "profileUpdateModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = shippingInteractor;
        this.f84755p = dialogModelBuilder;
        this.f84756q = profileUpdateModelExtension;
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f84757r = z1VarB;
        Data data = new Data(null, null, true, 3, null);
        String str = inputData.f84744b;
        ShippingContactsScreenDescriptor$InputData.ModeConfiguration modeConfiguration = inputData.f84743a;
        if (modeConfiguration instanceof ShippingContactsScreenDescriptor$InputData.ModeConfiguration.SelectContact) {
            orderToken = ((ShippingContactsScreenDescriptor$InputData.ModeConfiguration.SelectContact) modeConfiguration).f84746a;
        } else {
            if (!(modeConfiguration instanceof ShippingContactsScreenDescriptor$InputData.ModeConfiguration.UpdatedDefaultContact)) {
                throw new NoWhenBranchMatchedException();
            }
            orderToken = null;
        }
        if (orderToken != null) {
            y0 y0Var = shippingInteractor.f242835a;
            y0Var.getClass();
            Intrinsics.checkNotNullParameter(orderToken, "orderToken");
            set = (Set) y0Var.f182023b.get("SHIPPING_INVALID_CACHE_ID_".concat(orderToken));
            set = set == null ? h0.f322473a : set;
            if (set == null) {
            }
            Set set2 = set;
            Data data2 = new Data(null, null, true, 3, null);
            profileUpdateModelExtension.getClass();
            this.f84758s = d.b(this, new xec.e(data, str, str, modeConfiguration, xec.f.f304584a, set2, data2), stateMapper, null, false, 12);
            this.f84759t = hx7.e.a(this, new p(inputData, this, 20));
        }
        shippingInteractor.getClass();
        set = h0.f322473a;
        Set set22 = set;
        Data data22 = new Data(null, null, true, 3, null);
        profileUpdateModelExtension.getClass();
        this.f84758s = d.b(this, new xec.e(data, str, str, modeConfiguration, xec.f.f304584a, set22, data22), stateMapper, null, false, 12);
        this.f84759t = hx7.e.a(this, new p(inputData, this, 20));
    }

    public static final void I2(b bVar) {
        ShippingContact shippingContactF;
        y yVar = bVar.f84758s;
        c cVar = (c) ((xec.e) ((j2) yVar.f22677a).getValue()).f304580a.getContent();
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            shippingContactF = l.f(cVar.f214428a);
        } else {
            shippingContactF = null;
        }
        ShippingContactsScreenDescriptor$InputData.ModeConfiguration modeConfiguration = ((xec.e) ((j2) yVar.f22677a).getValue()).d;
        if (modeConfiguration instanceof ShippingContactsScreenDescriptor$InputData.ModeConfiguration.UpdatedDefaultContact) {
            bVar.H2(yVar, new z(shippingContactF, 0));
        } else {
            if (!(modeConfiguration instanceof ShippingContactsScreenDescriptor$InputData.ModeConfiguration.SelectContact)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.H2(yVar, new z(shippingContactF, 0));
            bVar.H2(yVar, new xe7.a(shippingContactF != null ? new xec.h(shippingContactF) : g.f304588a, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b r5, com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact r6, gim.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof xec.j0
            if (r0 == 0) goto L13
            r0 = r7
            xec.j0 r0 = (xec.j0) r0
            int r1 = r0.f304592x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304592x = r1
            goto L18
        L13:
            xec.j0 r0 = new xec.j0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304592x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact r6 = r0.u
            yhm.o.b(r7)
            goto L5c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            q7c.s r7 = r5.o
            java.lang.String r2 = r6.f84740a
            r0.u = r6
            r0.f304592x = r3
            k7c.y0 r7 = r7.f242835a
            r7.getClass()
            k7c.v0 r3 = new k7c.v0
            r4 = 0
            r3.<init>(r7, r2, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r3, r0)
            if (r7 != r1) goto L52
            goto L54
        L52:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L54:
            if (r7 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L59:
            if (r7 != r1) goto L5c
            return r1
        L5c:
            oec.b r7 = new oec.b
            r7.<init>(r6)
            r5.C2(r7)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b.J2(com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b, com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        f0 f0Var = new f0(continuation, this, 0);
        z1 z1Var = this.f84757r;
        yji.l.a1(this, q.Q(z1Var, f0Var), null, null, new g0(this, null), 3);
        yji.l.a1(this, q.Q(z1Var, new f0(continuation, this, 1)), null, null, new xec.h0(this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84759t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f84758s;
    }
}

package esa;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import et6.h1;
import et6.v;
import fb7.i0;
import fg8.m0;
import fg8.r;
import h93.f0;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import m1c.l0;
import mp.p;
import rp0.y;
import v30.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f128925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f128926x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f128925w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a) this.f128925w, (iy9.b) this.f128926x, continuation, 0);
            case 1:
                i iVar = new i((com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a) this.f128925w, continuation);
                iVar.f128926x = obj2;
                return iVar;
            case 2:
                return new i((v) this.f128925w, (et6.l) this.f128926x, continuation, 2);
            case 3:
                return new i((h1) this.f128925w, (xi0.b) this.f128926x, continuation, 3);
            case 4:
                return new i((h1) this.f128925w, (lr6.j) this.f128926x, continuation, 4);
            case 5:
                return new i((ev7.i) this.f128925w, (f9i.c) this.f128926x, continuation, 5);
            case 6:
                return new i((eve.b) this.f128925w, (String) this.f128926x, continuation, 6);
            case 7:
                return new i((ew1.m) this.f128925w, (Alias) this.f128926x, continuation, 7);
            case 8:
                return new i(continuation, (ewa.e) this.f128925w, (String) this.f128926x);
            case 9:
                return new i((com.revolut.feature.topup_screen.impl.flow.external_card_details.e) this.f128925w, (String) this.f128926x, continuation, 9);
            case 10:
                return new i((ey5.j) this.f128925w, (ey5.i) this.f128926x, continuation, 10);
            case 11:
                return new i((com.revolut.feature.selfserve.entity.config.shared.ui.home.b) this.f128925w, (String) this.f128926x, continuation, 11);
            case 12:
                return new i((l0) this.f128925w, (com.revolut.feature.rev_points.impl.ui.challenges.home.b) this.f128926x, continuation, 12);
            case 13:
                return new i((com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) this.f128925w, (List) this.f128926x, continuation, 13);
            case 14:
                return new i((f03.d) this.f128925w, (f0) this.f128926x, continuation, 14);
            case 15:
                return new i((com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a) this.f128925w, (m23.e) this.f128926x, continuation, 15);
            case 16:
                return new i((f30.h) this.f128925w, (c0) this.f128926x, continuation, 16);
            case 17:
                return new i((f33.h) this.f128925w, (d93.b) this.f128926x, continuation, 17);
            case 18:
                i iVar2 = new i((f5l.h) this.f128926x, continuation, 18);
                iVar2.f128925w = obj2;
                return iVar2;
            case 19:
                return new i((f9a.k) this.f128925w, (AliasRegistrationType) this.f128926x, continuation, 19);
            case 20:
                return new i((f9a.k) this.f128925w, (y) this.f128926x, continuation, 20);
            case 21:
                return new i((com.revolut.feature.junior.isa.impl.ui.child_details.a) this.f128925w, (com.revolut.feature.junior_profile.api.models.a) this.f128926x, continuation, 21);
            case 22:
                return new i((i0) this.f128925w, (Set) this.f128926x, continuation, 22);
            case 23:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c) this.f128925w, (ft3.h1) this.f128926x, continuation, 23);
            case 24:
                return new i((ff2.c) this.f128925w, (Long) this.f128926x, continuation, 24);
            case 25:
                return new i((ff2.c) this.f128925w, (String) this.f128926x, continuation, 25);
            case 26:
                i iVar3 = new i((ffk.c0) this.f128926x, continuation, 26);
                iVar3.f128925w = obj2;
                return iVar3;
            case 27:
                return new i((r) this.f128925w, (String) this.f128926x, continuation, 27);
            case 28:
                return new i((m0) this.f128925w, (String) this.f128926x, continuation, 28);
            default:
                return new i((p) this.f128925w, (String) this.f128926x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:456:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: esa.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128925w = obj2;
        this.f128926x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128926x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Continuation continuation, ewa.e eVar, String str) {
        super(2, continuation);
        this.u = 8;
        this.f128925w = eVar;
        this.f128926x = str;
    }
}

package jmc;

import com.revolut.feature.robo.impl.ui.flow.edit_goal.f;
import gim.i;
import kaf.g;
import klf.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lv4.b0;
import m1e.l;
import o97.x;
import rtl.u;
import s0l.s;
import s38.n;
import sbb.k;
import t0l.j;
import t44.p;
import t9e.w;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((f) this.v, continuation, 0);
            case 1:
                return new e((com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a) this.v, continuation, 1);
            case 2:
                return new e((g) this.v, continuation, 2);
            case 3:
                return new e((y0) this.v, continuation, 3);
            case 4:
                return new e((x) this.v, continuation, 4);
            case 5:
                return new e((b0) this.v, continuation, 5);
            case 6:
                return new e((l) this.v, continuation, 6);
            case 7:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.v, continuation, 7);
            case 8:
                return new e((com.revolut.feature.credit.card.impl.ui.statement.export.b) this.v, continuation, 8);
            case 9:
                return new e((com.revolut.feature.referrals.impl.personalized_tracking.a) this.v, continuation, 9);
            case 10:
                return new e((com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b) this.v, continuation, 10);
            case 11:
                return new e((oh4.l) this.v, continuation, 11);
            case 12:
                return new e((rmk.i) this.v, continuation, 12);
            case 13:
                return new e((rnl.g) this.v, continuation, 13);
            case 14:
                return new e((u) this.v, continuation, 14);
            case 15:
                return new e((s) this.v, continuation, 15);
            case 16:
                return new e((n) this.v, continuation, 16);
            case 17:
                return new e((k) this.v, continuation, 17);
            case 18:
                return new e((com.revolut.feature.rev_points.impl.ui.c) this.v, continuation, 18);
            case 19:
                return new e((j) this.v, continuation, 19);
            case 20:
                return new e((p) this.v, continuation, 20);
            case 21:
                return new e((w) this.v, continuation, 21);
            case 22:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.a) this.v, continuation, 22);
            case 23:
                return new e((v7e.u) this.v, continuation, 23);
            case 24:
                return new e((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) this.v, continuation, 24);
            case 25:
                return new e((ara.p) this.v, continuation, 25);
            case 26:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a) this.v, continuation, 26);
            case 27:
                return new e((xv4.p) this.v, continuation, 27);
            case 28:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a) this.v, continuation, 28);
            default:
                return new e((yra.x) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jmc.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

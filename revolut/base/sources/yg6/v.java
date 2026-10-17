package yg6;

import com.revolut.feature.payments.groups.impl.members_picker.GroupChatQrAction;
import ggk.u0;
import h93.f0;
import ip0.um0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yna.c1;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f313566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f313567x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f313566w = obj2;
        this.f313567x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v((x) this.f313567x, continuation, 0);
                vVar.f313566w = obj2;
                return vVar;
            case 1:
                return new v((com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) this.f313566w, (ArrayList) this.f313567x, continuation, 1);
            case 2:
                return new v((String) this.f313566w, (yi4.g) this.f313567x, continuation, 2);
            case 3:
                return new v((com.revolut.feature.shops.impl.ui.carousel_details.a) this.f313566w, (List) this.f313567x, continuation, 3);
            case 4:
                return new v((yjk.c) this.f313566w, (Function0) this.f313567x, continuation, 4);
            case 5:
                return new v((jf0.c) this.f313566w, (yke.h) this.f313567x, continuation, 5);
            case 6:
                return new v((ymf.k) this.f313566w, (File) this.f313567x, continuation, 6);
            case 7:
                return new v((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) this.f313566w, (u0) this.f313567x, continuation, 7);
            case 8:
                v vVar2 = new v((fti.b) this.f313567x, continuation, 8);
                vVar2.f313566w = obj2;
                return vVar2;
            case 9:
                return new v((yn9.c) this.f313566w, (String) this.f313567x, continuation, 9);
            case 10:
                v vVar3 = new v((c1) this.f313567x, continuation, 10);
                vVar3.f313566w = obj2;
                return vVar3;
            case 11:
                return new v((c1) this.f313566w, (pfm.t) this.f313567x, continuation, 11);
            case 12:
                return new v((c1) this.f313566w, (um0) this.f313567x, continuation, 12);
            case 13:
                return new v((ynb.c) this.f313566w, (do3.q) this.f313567x, continuation, 13);
            case 14:
                return new v((ynb.r) this.f313566w, (String) this.f313567x, continuation, 14);
            case 15:
                v vVar4 = new v((ynb.r) this.f313567x, continuation, 15);
                vVar4.f313566w = obj2;
                return vVar4;
            case 16:
                return new v((vkm.d) this.f313566w, (yr5.a) this.f313567x, continuation, 16);
            case 17:
                return new v((vkm.d) this.f313566w, (yr5.b) this.f313567x, continuation, 17);
            case 18:
                return new v((vkm.d) this.f313566w, (yr5.c) this.f313567x, continuation, 18);
            case 19:
                return new v((vkm.d) this.f313566w, (yr5.d) this.f313567x, continuation, 19);
            case 20:
                return new v((yr9.d) this.f313566w, (GroupChatQrAction) this.f313567x, continuation, 20);
            case 21:
                return new v((yra.x) this.f313566w, (yof.b) this.f313567x, continuation, 21);
            case 22:
                return new v((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f) this.f313566w, (String) this.f313567x, continuation, 22);
            case 23:
                return new v((yse.e) this.f313566w, (List) this.f313567x, continuation, 23);
            case 24:
                return new v((com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) this.f313566w, (String) this.f313567x, continuation, 24);
            case 25:
                return new v((yu7.k) this.f313566w, (f0) this.f313567x, continuation, 25);
            case 26:
                return new v((yu7.k) this.f313566w, (f9i.c) this.f313567x, continuation, 26);
            case 27:
                return new v((yu8.d) this.f313566w, (jf0.c) this.f313567x, continuation, 27);
            case 28:
                return new v((yuc.u) this.f313566w, (Boolean) this.f313567x, continuation, 28);
            default:
                return new v((yuc.u) this.f313566w, (f0) this.f313567x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:545:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yg6.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f313567x = obj2;
    }
}

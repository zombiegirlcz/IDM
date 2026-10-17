package pya;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;
import yhm.m;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a f240730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f240731x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240730w = aVar;
        this.f240731x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f240730w, this.f240731x, continuation, 0);
            case 1:
                return new u(this.f240730w, this.f240731x, continuation, 1);
            case 2:
                return new u(this.f240730w, this.f240731x, continuation, 2);
            default:
                return new u(this.f240731x, this.f240730w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        Object objA2;
        int i = this.u;
        com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar = this.f240730w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar = aVar.f81881r;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f240731x, null, null, this, 6);
                return objX1 == aVar2 ? aVar2 : objX1;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar2 = aVar.f81881r;
                lg0.a aVar4 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX12 = lg0.b.x1(xVar2, this.f240731x, aVar4, null, this, 4);
                return objX12 == aVar3 ? aVar3 : objX12;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar3 = aVar.f81881r;
                this.v = 1;
                Object objX13 = lg0.b.x1(xVar3, this.f240731x, null, null, this, 6);
                return objX13 == aVar5 ? aVar5 : objX13;
            default:
                InvitesDetailsContract$InputData invitesDetailsContract$InputData = aVar.o;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                try {
                    if (i6 == 0) {
                        yhm.o.b(obj2);
                        if (!Intrinsics.f(this.f240731x, "REMIND_ACTION_ITEM")) {
                            IllegalStateException illegalStateException = new IllegalStateException("Invalid id");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            return Unit.f186387a;
                        }
                        aVar.X1(new y0("REMIND_FRIEND_DIALOG_ID", new nii.c0(new TextLocalisedClause(R$string.referrals_invite_details_remind_sending_message_title, null, null, 14), null, null, false, null, false, false, null, 1918), false, 4));
                        wwa.f fVar = aVar.f81883t;
                        pwa.n d = invitesDetailsContract$InputData.getD();
                        String strI2 = com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a.I2(aVar, invitesDetailsContract$InputData);
                        this.v = 1;
                        objA = fVar.a(d, strI2, this);
                        if (objA == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            yhm.o.b(obj2);
                            objA2 = obj2;
                            aVar.s1();
                            return aVar.C1((aii.u) objA2);
                        }
                        yhm.o.b(obj2);
                        objA = ((yhm.m) obj2).f314193a;
                    }
                    m.Companion companion = yhm.m.INSTANCE;
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    List list = (List) objA;
                    if (list == null || list.isEmpty()) {
                        return aVar.X1(new y0("REMIND_FRIEND_DIALOG_ID", new nii.z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4));
                    }
                    jxa.e eVar = aVar.f81884w;
                    String str = (String) d0.b0(list);
                    this.v = 2;
                    objA2 = eVar.a(str, this);
                    if (objA2 == aVar6) {
                        return aVar6;
                    }
                    aVar.s1();
                    return aVar.C1((aii.u) objA2);
                } catch (Throwable unused) {
                    return aVar.X1(new y0("REMIND_FRIEND_DIALOG_ID", new nii.z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4));
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.f240731x = str;
        this.f240730w = aVar;
    }
}

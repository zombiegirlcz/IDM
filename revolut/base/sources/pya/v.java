package pya;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.data.model.Data;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a f240732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ActiveOrPastInviteeDetails f240733x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar, ActiveOrPastInviteeDetails activeOrPastInviteeDetails, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240732w = aVar;
        this.f240733x = activeOrPastInviteeDetails;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f240732w, this.f240733x, continuation, 0);
                vVar.v = obj2;
                return vVar;
            default:
                v vVar2 = new v(this.f240732w, this.f240733x, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        final ActiveOrPastInviteeDetails activeOrPastInviteeDetails = this.f240733x;
        final com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar = this.f240732w;
        switch (i) {
            case 0:
                final Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(data);
                cli.y yVar = aVar.G;
                if (data.getContent() != null) {
                    final int i2 = 1;
                    aVar.H2(yVar, new Function1() { // from class: pya.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i2) {
                                case 0:
                                    com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar3 = aVar;
                                    InvitesDetailsContract$InputData invitesDetailsContract$InputData = aVar3.o;
                                    e update = (e) obj3;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    boolean z = update instanceof b;
                                    ActiveOrPastInviteeDetails activeOrPastInviteeDetails2 = activeOrPastInviteeDetails;
                                    Data data2 = data;
                                    if (z) {
                                        return b.a((b) update, activeOrPastInviteeDetails2, null, null, (List) data2.getContent(), false, OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED);
                                    }
                                    return new b(activeOrPastInviteeDetails2, null, false, invitesDetailsContract$InputData.getF81872b(), f0.f322471a, invitesDetailsContract$InputData.getF81873c(), (List) data2.getContent(), aVar3.L2(activeOrPastInviteeDetails2), true);
                                default:
                                    com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar4 = aVar;
                                    InvitesDetailsContract$InputData invitesDetailsContract$InputData2 = aVar4.o;
                                    e update2 = (e) obj3;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    boolean z3 = update2 instanceof b;
                                    ActiveOrPastInviteeDetails activeOrPastInviteeDetails3 = activeOrPastInviteeDetails;
                                    Data data3 = data;
                                    if (z3) {
                                        return b.a((b) update2, activeOrPastInviteeDetails3, (owa.b) data3.getContent(), null, null, false, 508);
                                    }
                                    return new b(activeOrPastInviteeDetails3, (owa.b) data3.getContent(), false, invitesDetailsContract$InputData2.getF81872b(), f0.f322471a, invitesDetailsContract$InputData2.getF81873c(), null, aVar4.L2(activeOrPastInviteeDetails3), true);
                            }
                        }
                    });
                } else if (data.getLoading()) {
                    aVar.H2(yVar, new px0.a(22));
                } else if (data.getError() != null) {
                    aVar.H2(yVar, new px0.a(23));
                    aVar.K2();
                }
                break;
            default:
                final Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(data2);
                cli.y yVar2 = aVar.G;
                if (data2.getContent() != null) {
                    final int i3 = 0;
                    aVar.H2(yVar2, new Function1() { // from class: pya.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i3) {
                                case 0:
                                    com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar32 = aVar;
                                    InvitesDetailsContract$InputData invitesDetailsContract$InputData = aVar32.o;
                                    e update = (e) obj3;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    boolean z = update instanceof b;
                                    ActiveOrPastInviteeDetails activeOrPastInviteeDetails2 = activeOrPastInviteeDetails;
                                    Data data22 = data2;
                                    if (z) {
                                        return b.a((b) update, activeOrPastInviteeDetails2, null, null, (List) data22.getContent(), false, OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED);
                                    }
                                    return new b(activeOrPastInviteeDetails2, null, false, invitesDetailsContract$InputData.getF81872b(), f0.f322471a, invitesDetailsContract$InputData.getF81873c(), (List) data22.getContent(), aVar32.L2(activeOrPastInviteeDetails2), true);
                                default:
                                    com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar4 = aVar;
                                    InvitesDetailsContract$InputData invitesDetailsContract$InputData2 = aVar4.o;
                                    e update2 = (e) obj3;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    boolean z3 = update2 instanceof b;
                                    ActiveOrPastInviteeDetails activeOrPastInviteeDetails3 = activeOrPastInviteeDetails;
                                    Data data3 = data2;
                                    if (z3) {
                                        return b.a((b) update2, activeOrPastInviteeDetails3, (owa.b) data3.getContent(), null, null, false, 508);
                                    }
                                    return new b(activeOrPastInviteeDetails3, (owa.b) data3.getContent(), false, invitesDetailsContract$InputData2.getF81872b(), f0.f322471a, invitesDetailsContract$InputData2.getF81873c(), null, aVar4.L2(activeOrPastInviteeDetails3), true);
                            }
                        }
                    });
                } else if (data2.getLoading()) {
                    aVar.H2(yVar2, new px0.a(18));
                } else if (data2.getError() != null) {
                    aVar.H2(yVar2, new px0.a(19));
                    aVar.K2();
                }
                break;
        }
        return Unit.f186387a;
    }
}

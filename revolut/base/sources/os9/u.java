package os9;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.mappers.settings.GroupSettingsAction;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreenContract$InputData;
import er9.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ks9.f0;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends jki.g implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GroupChatMembersScreenContract$InputData f229283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f229284q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ks9.h f229285r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.feature.payments.groups.impl.mappers.settings.a f229286s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f229287t;
    public final is9.a u;
    public final j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(GroupChatMembersScreenContract$InputData inputData, c interactor, ks9.h settingsExtensions, com.revolut.feature.payments.groups.impl.mappers.settings.a memberActionsMapper, j60.a bottomExpandableDialog, is9.a groupContactChooserScreenProvider, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(settingsExtensions, "settingsExtensions");
        Intrinsics.checkNotNullParameter(memberActionsMapper, "memberActionsMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(groupContactChooserScreenProvider, "groupContactChooserScreenProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f229283p = inputData;
        this.f229284q = interactor;
        this.f229285r = settingsExtensions;
        this.f229286s = memberActionsMapper;
        this.f229287t = bottomExpandableDialog;
        this.u = groupContactChooserScreenProvider;
        this.v = new j(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        c cVar = this.f229284q;
        cVar.getClass();
        GroupChatMembersScreenContract$InputData inputData = this.f229283p;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        PaymentGroup paymentGroup = inputData.f79373a;
        mq9.f fVar = cVar.f229262a;
        String groupId = paymentGroup.f79285a;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        x xVar = (x) ((mr9.a) fVar).f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Continuation continuation = null;
        efm.r rVarE = ue0.e.E(m70.a.g(nim.a.w(xVar.f128606q.f(Unit.f186387a, xVar.o.a("RELOAD_STRATEGY_KEY_GROUPS", false)), new e2j.i(groupId, 18)), new bhi.c(paymentGroup, 21), null, 2), paymentGroup);
        efm.r rVarX = cVar.d.f(false).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r rVarSwitchMapSingle = w.l(rVarE, rVarX).switchMapSingle(new or2.e(new oqk.c(cVar, 9), 17));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMapSingle), null, null, new oli.f(this, continuation, 19), 3);
        yji.l.a1(this, ((f0) this.f229285r).f189330r, null, null, new ocb.d(this, continuation, 19), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final void y2(GroupSettingsAction parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        j60.a.v(this.f229287t, false, null, 3);
        ((f0) this.f229285r).Z2(z2().f229270a, parcel);
    }

    public final k z2() {
        Object content = ((j) t2()).f229269a.getContent();
        if (content != null) {
            return (k) content;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}

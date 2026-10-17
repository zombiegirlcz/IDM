package r8e;

import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import r7i.r;
import s6e.z;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GroupMembersScreenContract$InputData f252414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g6e.d f252415q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f252416r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l61.a f252417s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rsi.g f252418t;
    public final p8e.a u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f252419w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p stateMapper, GroupMembersScreenContract$InputData inputData, g6e.d subaccountInteractor, ang.f userInteractor, l61.a userCompanyInteractor, rsi.g memberActionExtension, p8e.a membersActionDialogFactory, j60.a dialogControllerExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(memberActionExtension, "memberActionExtension");
        Intrinsics.checkNotNullParameter(membersActionDialogFactory, "membersActionDialogFactory");
        Intrinsics.checkNotNullParameter(dialogControllerExtension, "dialogControllerExtension");
        this.f252414p = inputData;
        this.f252415q = subaccountInteractor;
        this.f252416r = userInteractor;
        this.f252417s = userCompanyInteractor;
        this.f252418t = memberActionExtension;
        this.u = membersActionDialogFactory;
        this.v = dialogControllerExtension;
        this.f252419w = new h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ((z) this.f252415q).v(this.f252414p.f89102a, SubaccountType.Group.f88960a), null, null, new m(this, null), 3);
        yji.l.a1(this, nim.a.v(u0.m(rd0.e.b(this.f252416r.k(false)), rd0.e.b(hng.g.b(((ang.b) this.f252417s).f7765a))), new r(4)), null, null, new r5e.e(this, null, 12), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f252419w;
    }
}

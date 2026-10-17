package jok;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.bottomsheet.WaitlistInvitationBottomsheetScreenContract$InputData;
import java.util.Set;
import jm4.z3;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WaitlistInvitationBottomsheetScreenContract$InputData f177159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f177160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f177161c;

    public e(c cVar, WaitlistInvitationBottomsheetScreenContract$InputData waitlistInvitationBottomsheetScreenContract$InputData) {
        this.f177159a = waitlistInvitationBottomsheetScreenContract$InputData;
        this.f177160b = e4m.b.b(new z3(cVar, this, 1, 25));
        this.f177161c = e4m.b.b(new z3(cVar, this, 0, 25));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

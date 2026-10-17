package aw8;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements dy8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f10751a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10752b = a.DISABLE;

    private c() {
    }

    @Override // dy8.a
    public final String a() {
        int i = b.f10750a[f10752b.ordinal()];
        if (i == 1) {
            return "revolut://app/kyc/govauth/embedded/close?state=state_uuid&status=true";
        }
        if (i == 2) {
            return "revolut://app/kyc/govauth/embedded/close?state=state_uuid&status=false&error=user_cancelled";
        }
        if (i == 3) {
            return "revolut://app/kyc/govauth/embedded/close?state=state_uuid&status=false&error=access_denied";
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

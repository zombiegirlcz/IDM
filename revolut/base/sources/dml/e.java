package dml;

import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentChallenge.Qr.Delegated.Details.Action f116194b;

    public e(String actionTag, ConsentChallenge.Qr.Delegated.Details.Action action) {
        Intrinsics.checkNotNullParameter(actionTag, "actionTag");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f116193a = actionTag;
        this.f116194b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f116193a, eVar.f116193a) && Intrinsics.f(this.f116194b, eVar.f116194b);
    }

    public final int hashCode() {
        return this.f116194b.hashCode() + (this.f116193a.hashCode() * 31);
    }
}

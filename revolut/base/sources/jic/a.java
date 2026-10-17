package jic;

import aii.r;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardFooterAction f174422a;

    public a(RewardFooterAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f174422a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f174422a, ((a) obj2).f174422a);
    }

    public final int hashCode() {
        return this.f174422a.hashCode();
    }
}

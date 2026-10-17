package mg7;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f205175a;

    public n(boolean z) {
        this.f205175a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f205175a == ((n) obj2).f205175a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205175a);
    }
}

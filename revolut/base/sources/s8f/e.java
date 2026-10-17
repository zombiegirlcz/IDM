package s8f;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f260984a;

    public e(int i) {
        this.f260984a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f260984a == ((e) obj2).f260984a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f260984a);
    }
}

package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f284177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementsFormat f284178b;

    public e(int i, StatementsFormat statementsFormat) {
        this.f284177a = i;
        this.f284178b = statementsFormat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f284177a == eVar.f284177a && this.f284178b == eVar.f284178b;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f284177a) * 31;
        StatementsFormat statementsFormat = this.f284178b;
        return (iHashCode + (statementsFormat == null ? 0 : statementsFormat.hashCode())) * 31;
    }
}

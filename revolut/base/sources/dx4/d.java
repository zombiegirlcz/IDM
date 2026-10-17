package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f120573a;

    public d(z amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f120573a = amountInputScreen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f120573a, ((d) obj2).f120573a);
    }

    public final int hashCode() {
        return this.f120573a.hashCode();
    }

    @Override // dx4.l
    public final String j() {
        return p.a.p("ShowAmountInputScreen(title=", this.f120573a.getTitle(), ")");
    }
}

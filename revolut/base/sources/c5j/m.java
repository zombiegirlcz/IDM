package c5j;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f21573b;

    public m(aim.e items, i buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f21572a = items;
        this.f21573b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f21572a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f21572a, mVar.f21572a) && Intrinsics.f(this.f21573b, mVar.f21573b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21573b.f21567a) + (this.f21572a.hashCode() * 31);
    }
}

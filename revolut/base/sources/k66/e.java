package k66;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f181648a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f181648a, ((e) obj2).f181648a);
    }

    public final int hashCode() {
        return this.f181648a.hashCode();
    }

    public e(i recoveryPhraseState) {
        Intrinsics.checkNotNullParameter(recoveryPhraseState, "recoveryPhraseState");
        this.f181648a = recoveryPhraseState;
    }

    public /* synthetic */ e(int i) {
        this(g.f181649a);
    }
}

package ak7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5727a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f5727a, ((d) obj2).f5727a);
    }

    public final int hashCode() {
        return this.f5727a.hashCode();
    }

    public d(String enteredText) {
        Intrinsics.checkNotNullParameter(enteredText, "enteredText");
        this.f5727a = enteredText;
    }

    public /* synthetic */ d(int i) {
        this("");
    }
}

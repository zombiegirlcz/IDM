package j3b;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f170999a;

    public b(ArrayList avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f170999a = avatars;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f170999a.equals(((b) obj2).f170999a);
    }

    public final int hashCode() {
        return this.f170999a.hashCode();
    }
}

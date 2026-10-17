package um2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f281207a;

    public l(ArrayList buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f281207a = buttons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f281207a.equals(((l) obj2).f281207a);
    }

    public final int hashCode() {
        return this.f281207a.hashCode();
    }
}

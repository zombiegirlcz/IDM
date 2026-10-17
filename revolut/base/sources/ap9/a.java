package ap9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8120a;

    public a(ArrayList participants) {
        Intrinsics.checkNotNullParameter(participants, "participants");
        this.f8120a = participants;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f8120a.equals(((a) obj2).f8120a);
    }

    public final int hashCode() {
        return this.f8120a.hashCode();
    }
}

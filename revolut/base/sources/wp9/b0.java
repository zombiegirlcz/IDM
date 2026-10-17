package wp9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f299171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ap9.b f299172b;

    public b0(ap9.b status, ArrayList participants) {
        Intrinsics.checkNotNullParameter(participants, "participants");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f299171a = participants;
        this.f299172b = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f299171a.equals(b0Var.f299171a) && this.f299172b.equals(b0Var.f299172b);
    }

    public final int hashCode() {
        return this.f299172b.hashCode() + (this.f299171a.hashCode() * 31);
    }
}

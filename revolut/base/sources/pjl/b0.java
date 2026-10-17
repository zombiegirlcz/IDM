package pjl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f236793a;

    public b0(List userDataKeys) {
        Intrinsics.checkNotNullParameter(userDataKeys, "userDataKeys");
        this.f236793a = userDataKeys;
    }

    public final String[] a() {
        return (String[]) this.f236793a.toArray(new String[0]);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f236793a, ((b0) obj2).f236793a);
    }

    public final int hashCode() {
        return this.f236793a.hashCode();
    }
}

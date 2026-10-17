package p61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f233201a;

    static {
        new b(f0.f322471a);
    }

    public b(f0 scopes) {
        Intrinsics.checkNotNullParameter("id", "id");
        Intrinsics.checkNotNullParameter("accessToken", "accessToken");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f233201a = scopes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f233201a, ((b) obj2).f233201a);
    }

    public final int hashCode() {
        this.f233201a.getClass();
        return 1 + (2039594502 * 31);
    }
}

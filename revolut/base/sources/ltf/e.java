package ltf;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f199865a;

    public e(Date createdAt) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f199865a = createdAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f199865a, ((e) obj2).f199865a);
    }

    public final int hashCode() {
        return this.f199865a.hashCode();
    }
}

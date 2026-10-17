package pjl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f236815a;

    public g0(List userDataKeysWithValues) {
        Intrinsics.checkNotNullParameter(userDataKeysWithValues, "userDataKeysWithValues");
        this.f236815a = userDataKeysWithValues;
    }

    public final List a() {
        return this.f236815a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f236815a, ((g0) obj2).f236815a);
    }

    public final int hashCode() {
        return this.f236815a.hashCode();
    }
}

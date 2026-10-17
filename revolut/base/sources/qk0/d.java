package qk0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@g(with = e.class)
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f246931a;

    public d(List entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f246931a = entries;
    }

    public final List a() {
        return this.f246931a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f246931a, ((d) obj2).f246931a);
    }

    public final int hashCode() {
        return this.f246931a.hashCode();
    }
}

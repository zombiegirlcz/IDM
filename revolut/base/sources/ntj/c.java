package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219050a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f219050a = str;
        } else {
            qlm.j1.f(a.f219042a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f219050a, ((c) obj2).f219050a);
    }

    public final int hashCode() {
        return this.f219050a.hashCode();
    }

    public c(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f219050a = description;
    }
}

package nuj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219323a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f219323a = str;
        } else {
            j1.f(a.f219322a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f219323a, ((c) obj2).f219323a);
    }

    public final int hashCode() {
        return this.f219323a.hashCode();
    }

    public c(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f219323a = type;
    }
}

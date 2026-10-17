package yfe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class j2 implements o2 {

    @NotNull
    public static final i2 Companion = new i2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313272a;

    public /* synthetic */ j2(int i, String str) {
        if (1 == (i & 1)) {
            this.f313272a = str;
        } else {
            qlm.j1.f(h2.f313265a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j2) && Intrinsics.f(this.f313272a, ((j2) obj2).f313272a);
    }

    public final int hashCode() {
        return this.f313272a.hashCode();
    }

    public j2(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f313272a = value;
    }
}

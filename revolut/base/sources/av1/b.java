package av1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String value) {
        super(value, 0);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f9870c = value;
    }

    @Override // av1.c
    public final String d() {
        return this.f9870c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f9870c, ((b) obj2).f9870c);
    }

    public final int hashCode() {
        return this.f9870c.hashCode();
    }
}

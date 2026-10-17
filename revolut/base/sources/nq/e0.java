package nq;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e0 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f218288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ArrayList mediaKeys) {
        super(mediaKeys);
        Intrinsics.checkNotNullParameter(mediaKeys, "mediaKeys");
        this.f218288b = mediaKeys;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && this.f218288b.equals(((e0) obj2).f218288b);
    }

    @Override // nq.i0
    public final List f() {
        return this.f218288b;
    }

    public final int hashCode() {
        return this.f218288b.hashCode();
    }
}

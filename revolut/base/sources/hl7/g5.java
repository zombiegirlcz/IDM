package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g5 {

    @NotNull
    public static final f5 Companion = new f5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153118a;

    public /* synthetic */ g5(int i, String str) {
        if (1 == (i & 1)) {
            this.f153118a = str;
        } else {
            qlm.j1.f(e5.f153077a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g5) && Intrinsics.f(this.f153118a, ((g5) obj2).f153118a);
    }

    public final int hashCode() {
        return this.f153118a.hashCode();
    }

    public g5(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f153118a = requestId;
    }
}

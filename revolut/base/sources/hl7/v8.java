package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v8 {

    @NotNull
    public static final u8 Companion = new u8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153342b;

    public /* synthetic */ v8(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(t8.f153317a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153341a = str;
        this.f153342b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj2;
        return Intrinsics.f(this.f153341a, v8Var.f153341a) && Intrinsics.f(this.f153342b, v8Var.f153342b);
    }

    public final int hashCode() {
        return this.f153342b.hashCode() + (this.f153341a.hashCode() * 31);
    }

    public v8(String requestId, String driverId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(driverId, "driverId");
        this.f153341a = requestId;
        this.f153342b = driverId;
    }
}

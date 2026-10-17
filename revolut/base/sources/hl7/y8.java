package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class y8 {

    @NotNull
    public static final x8 Companion = new x8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153382b;

    public /* synthetic */ y8(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(w8.f153354a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153381a = str;
        this.f153382b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y8)) {
            return false;
        }
        y8 y8Var = (y8) obj2;
        return Intrinsics.f(this.f153381a, y8Var.f153381a) && Intrinsics.f(this.f153382b, y8Var.f153382b);
    }

    public final int hashCode() {
        return this.f153382b.hashCode() + (this.f153381a.hashCode() * 31);
    }

    public y8(String applicationId, String status) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f153381a = applicationId;
        this.f153382b = status;
    }
}

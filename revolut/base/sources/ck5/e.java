package ck5;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24780a;

    public /* synthetic */ e(int i, String str) {
        if (1 == (i & 1)) {
            this.f24780a = str;
        } else {
            j1.f(c.f24779a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f24780a, ((e) obj2).f24780a);
    }

    public final int hashCode() {
        return this.f24780a.hashCode();
    }

    public e(String transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        this.f24780a = transferId;
    }
}

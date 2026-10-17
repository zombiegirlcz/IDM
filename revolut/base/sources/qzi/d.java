package qzi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class d implements qf1.d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f250651b;

    public /* synthetic */ d(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(b.f250649a.getDescriptor(), i, 3);
            throw null;
        }
        this.f250650a = str;
        this.f250651b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f250650a, dVar.f250650a) && this.f250651b == dVar.f250651b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250651b) + (this.f250650a.hashCode() * 31);
    }

    public d(String itemId, boolean z) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f250650a = itemId;
        this.f250651b = z;
    }
}

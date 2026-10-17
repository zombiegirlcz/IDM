package wvj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300525b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(g.f300523a.getDescriptor(), i, 3);
            throw null;
        }
        this.f300524a = str;
        this.f300525b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f300524a, iVar.f300524a) && Intrinsics.f(this.f300525b, iVar.f300525b);
    }

    public final int hashCode() {
        return this.f300525b.hashCode() + (this.f300524a.hashCode() * 31);
    }

    public i(String transactionId, String type) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f300524a = transactionId;
        this.f300525b = type;
    }
}

package svj;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266028b;

    public /* synthetic */ d(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(b.f266026a.getDescriptor(), i, 3);
            throw null;
        }
        this.f266027a = str;
        this.f266028b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f266027a, dVar.f266027a) && Intrinsics.f(this.f266028b, dVar.f266028b);
    }

    public final int hashCode() {
        return this.f266028b.hashCode() + (this.f266027a.hashCode() * 31);
    }

    public d(String transactionId, String type) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f266027a = transactionId;
        this.f266028b = type;
    }
}

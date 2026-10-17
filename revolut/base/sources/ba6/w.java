package ba6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements b0 {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f13959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13960b;

    public w(dj0.d amount, String pocketId) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f13959a = amount;
        this.f13960b = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f13959a, wVar.f13959a) && Intrinsics.f(this.f13960b, wVar.f13960b);
    }

    public final int hashCode() {
        return this.f13960b.hashCode() + (this.f13959a.hashCode() * 31);
    }
}

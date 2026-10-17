package ds6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f117251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f117252b;

    public w(v type, y recipient) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f117251a = type;
        this.f117252b = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f117251a == wVar.f117251a && Intrinsics.f(this.f117252b, wVar.f117252b);
    }

    public final int hashCode() {
        return this.f117252b.hashCode() + (this.f117251a.hashCode() * 31);
    }
}

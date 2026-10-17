package kf1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f183276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f183277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f183278c;

    public j(b cardReaderToggle, boolean z, f fVar) {
        Intrinsics.checkNotNullParameter(cardReaderToggle, "cardReaderToggle");
        this.f183276a = cardReaderToggle;
        this.f183277b = z;
        this.f183278c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f183276a, jVar.f183276a) && this.f183277b == jVar.f183277b && Intrinsics.f(this.f183278c, jVar.f183278c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f183276a.hashCode() * 31, 31, this.f183277b);
        f fVar = this.f183278c;
        return iC + (fVar == null ? 0 : fVar.hashCode());
    }
}

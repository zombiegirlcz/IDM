package io3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements Serializable {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f163166c = new o(n.NONE, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f163167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163168b;

    public o(n system, boolean z) {
        Intrinsics.checkNotNullParameter(system, "system");
        this.f163167a = system;
        this.f163168b = z;
    }

    public final boolean a() {
        return this.f163168b;
    }

    public final n b() {
        return this.f163167a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f163167a == oVar.f163167a && this.f163168b == oVar.f163168b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163168b) + (this.f163167a.hashCode() * 31);
    }
}

package lha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Serializable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f195200a;

    public d(b bVar) {
        this.f195200a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f195200a, ((d) obj2).f195200a);
    }

    public final int hashCode() {
        b bVar = this.f195200a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}

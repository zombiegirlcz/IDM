package zoe;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f324049b;

    public /* synthetic */ d(int i, dj0.d dVar, String str) {
        if (3 != (i & 3)) {
            j1.f(b.f324047a.getDescriptor(), i, 3);
            throw null;
        }
        this.f324048a = str;
        this.f324049b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f324048a, dVar.f324048a) && Intrinsics.f(this.f324049b, dVar.f324049b);
    }

    public final int hashCode() {
        int iHashCode = this.f324048a.hashCode() * 31;
        dj0.d dVar = this.f324049b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}

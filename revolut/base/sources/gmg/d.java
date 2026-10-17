package gmg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144823b;

    public /* synthetic */ d(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(b.f144821a.getDescriptor(), i, 3);
            throw null;
        }
        this.f144822a = str;
        this.f144823b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f144822a, dVar.f144822a) && Intrinsics.f(this.f144823b, dVar.f144823b);
    }

    public final int hashCode() {
        int iHashCode = this.f144822a.hashCode() * 31;
        String str = this.f144823b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

package lqa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199228b;

    public /* synthetic */ d(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(b.f199223a.getDescriptor(), i, 3);
            throw null;
        }
        this.f199227a = str;
        this.f199228b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f199227a, dVar.f199227a) && Intrinsics.f(this.f199228b, dVar.f199228b);
    }

    public final int hashCode() {
        return this.f199228b.hashCode() + (this.f199227a.hashCode() * 31);
    }
}

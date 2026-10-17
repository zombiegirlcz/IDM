package rwa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257868b;

    public /* synthetic */ h(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(f.f257866a.getDescriptor(), i, 3);
            throw null;
        }
        this.f257867a = str;
        this.f257868b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f257867a, hVar.f257867a) && Intrinsics.f(this.f257868b, hVar.f257868b);
    }

    public final int hashCode() {
        return this.f257868b.hashCode() + (this.f257867a.hashCode() * 31);
    }
}

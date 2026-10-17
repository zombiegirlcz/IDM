package qbd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244197b;

    public /* synthetic */ l(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(j.f244192a.getDescriptor(), i, 3);
            throw null;
        }
        this.f244196a = str;
        this.f244197b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f244196a, lVar.f244196a) && Intrinsics.f(this.f244197b, lVar.f244197b);
    }

    public final int hashCode() {
        return this.f244197b.hashCode() + (this.f244196a.hashCode() * 31);
    }

    public l(String type, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f244196a = type;
        this.f244197b = description;
    }
}

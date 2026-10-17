package wbc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f296107c;
    public final List d;
    public final int e;
    public final dj0.d f;

    public f(int i, dj0.d price, String name, String str, List modifierSets, List variants) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(modifierSets, "modifierSets");
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f296105a = name;
        this.f296106b = str;
        this.f296107c = modifierSets;
        this.d = variants;
        this.e = i;
        this.f = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f296105a, fVar.f296105a) && Intrinsics.f(this.f296106b, fVar.f296106b) && Intrinsics.f(this.f296107c, fVar.f296107c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f296105a.hashCode() * 31;
        String str = this.f296106b;
        return this.f.hashCode() + j6.a.b(this.e, p.a.d(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f296107c), 31, this.d), 31);
    }
}

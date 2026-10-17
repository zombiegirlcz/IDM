package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f145658c;

    public /* synthetic */ o(int i, String str, String str2, u uVar) {
        if (7 != (i & 7)) {
            j1.f(m.f145653a.getDescriptor(), i, 7);
            throw null;
        }
        this.f145656a = str;
        this.f145657b = str2;
        this.f145658c = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f145656a, oVar.f145656a) && Intrinsics.f(this.f145657b, oVar.f145657b) && Intrinsics.f(this.f145658c, oVar.f145658c);
    }

    public final int hashCode() {
        return this.f145658c.hashCode() + p.a.c(this.f145656a.hashCode() * 31, 31, this.f145657b);
    }

    public o(String type, String name, u identification) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identification, "identification");
        this.f145656a = type;
        this.f145657b = name;
        this.f145658c = identification;
    }
}

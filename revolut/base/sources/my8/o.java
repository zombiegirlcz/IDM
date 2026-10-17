package my8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f210392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f210393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f210394c;

    static {
        f0 f0Var = f0.f322471a;
        new o(f0Var, new z(f0Var, 0), f0Var);
    }

    public o(List documents, z scanSequences, List scanReasons) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(scanSequences, "scanSequences");
        Intrinsics.checkNotNullParameter(scanReasons, "scanReasons");
        this.f210392a = documents;
        this.f210393b = scanSequences;
        this.f210394c = scanReasons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f210392a, oVar.f210392a) && Intrinsics.f(this.f210393b, oVar.f210393b) && Intrinsics.f(this.f210394c, oVar.f210394c);
    }

    public final int hashCode() {
        return this.f210394c.hashCode() + ((this.f210393b.hashCode() + (this.f210392a.hashCode() * 31)) * 31);
    }
}

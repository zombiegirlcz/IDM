package mel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f204768b;

    public o(String description, ArrayList styledElements) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(styledElements, "styledElements");
        this.f204767a = description;
        this.f204768b = styledElements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f204767a, oVar.f204767a) && this.f204768b.equals(oVar.f204768b);
    }

    public final int hashCode() {
        return this.f204768b.hashCode() + (this.f204767a.hashCode() * 31);
    }
}

package cmf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f25227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25229c;

    public f(Flow actionsFlow, List clickHandlers, String name) {
        Intrinsics.checkNotNullParameter(actionsFlow, "actionsFlow");
        Intrinsics.checkNotNullParameter(clickHandlers, "clickHandlers");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f25227a = actionsFlow;
        this.f25228b = clickHandlers;
        this.f25229c = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f25227a, fVar.f25227a) && Intrinsics.f(this.f25228b, fVar.f25228b) && Intrinsics.f(this.f25229c, fVar.f25229c);
    }

    public final int hashCode() {
        return this.f25229c.hashCode() + p.a.d(this.f25227a.hashCode() * 31, 31, this.f25228b);
    }
}

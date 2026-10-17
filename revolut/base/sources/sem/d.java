package sem;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public static final ArrayList e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jem.b f262227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1m.e f262228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f262229c;
    public boolean d;

    public d(jem.b phase, a1m.e relation) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(relation, "relation");
        ArrayList arrayList = e;
        Intrinsics.i(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>");
        List interceptors = u0.c(arrayList);
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.f262227a = phase;
        this.f262228b = relation;
        this.f262229c = interceptors;
        this.d = true;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    public final String toString() {
        return "Phase `" + ((String) this.f262227a.f173621b) + "`, " + this.f262229c.size() + " handlers";
    }
}

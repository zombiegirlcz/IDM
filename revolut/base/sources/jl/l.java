package jl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class l {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f175551b = {new qlm.e(i.f175541a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f175552a;

    public /* synthetic */ l(int i, List list) {
        if (1 == (i & 1)) {
            this.f175552a = list;
        } else {
            qlm.j1.f(g.f175535a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f175552a, ((l) obj2).f175552a);
    }

    public final int hashCode() {
        return this.f175552a.hashCode();
    }

    public final String toString() {
        return "CompleteTaskRequest(data=" + this.f175552a + ")";
    }

    public l(ArrayList data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f175552a = data;
    }
}

package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class e4 {

    @NotNull
    public static final d4 Companion = new d4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f294823b = {yhm.j.c(yhm.k.PUBLICATION, new w56.a(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294824a;

    public /* synthetic */ e4(int i, List list) {
        if (1 == (i & 1)) {
            this.f294824a = list;
        } else {
            qlm.j1.f(c4.f294796a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e4) && Intrinsics.f(this.f294824a, ((e4) obj2).f294824a);
    }

    public final int hashCode() {
        return this.f294824a.hashCode();
    }

    public e4(ArrayList sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f294824a = sections;
    }
}

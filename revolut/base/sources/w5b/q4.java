package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class q4 {

    @NotNull
    public static final p4 Companion = new p4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f294986b = {yhm.j.c(yhm.k.PUBLICATION, new w56.a(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294987a;

    public /* synthetic */ q4(int i, List list) {
        if (1 == (i & 1)) {
            this.f294987a = list;
        } else {
            qlm.j1.f(o4.f294965a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q4) && Intrinsics.f(this.f294987a, ((q4) obj2).f294987a);
    }

    public final int hashCode() {
        return this.f294987a.hashCode();
    }

    public q4(ArrayList details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f294987a = details;
    }
}

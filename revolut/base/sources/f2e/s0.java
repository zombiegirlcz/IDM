package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f131708b = {yhm.j.c(yhm.k.PUBLICATION, new i(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131709a;

    public /* synthetic */ s0(int i, List list) {
        if (1 == (i & 1)) {
            this.f131709a = list;
        } else {
            qlm.j1.f(q0.f131693a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f131709a, ((s0) obj2).f131709a);
    }

    public final int hashCode() {
        return this.f131709a.hashCode();
    }

    public s0(ArrayList components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f131709a = components;
    }
}

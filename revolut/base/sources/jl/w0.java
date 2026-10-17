package jl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class w0 {

    @NotNull
    public static final v0 Companion = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f175575b = {new qlm.e(x0.f175579a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f175576a;

    public w0(int i, List list) {
        if ((i & 1) == 0) {
            this.f175576a = zhm.f0.f322471a;
        } else {
            this.f175576a = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && Intrinsics.f(this.f175576a, ((w0) obj2).f175576a);
    }

    public final int hashCode() {
        return this.f175576a.hashCode();
    }

    public final String toString() {
        return "MotionTaskInput(tokenItems=" + this.f175576a + ")";
    }
}

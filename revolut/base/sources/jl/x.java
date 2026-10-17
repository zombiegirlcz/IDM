package jl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class x {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f175577b = {new qlm.e(u.f175572a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f175578a;

    public /* synthetic */ x(int i, List list) {
        if (1 == (i & 1)) {
            this.f175578a = list;
        } else {
            qlm.j1.f(s.f175569a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f175578a, ((x) obj2).f175578a);
    }

    public final int hashCode() {
        return this.f175578a.hashCode();
    }

    public final String toString() {
        return "DocumentCaptureCompleteTaskRequest(medias=" + this.f175578a + ")";
    }

    public x(ArrayList medias) {
        Intrinsics.checkNotNullParameter(medias, "medias");
        this.f175578a = medias;
    }
}

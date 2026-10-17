package xga;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f305655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f305656b;

    public /* synthetic */ o(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(m.f305654a.getDescriptor(), i, 3);
            throw null;
        }
        this.f305655a = str;
        this.f305656b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f305655a, oVar.f305655a) && Intrinsics.f(this.f305656b, oVar.f305656b);
    }

    public final int hashCode() {
        return this.f305656b.hashCode() + (this.f305655a.hashCode() * 31);
    }
}

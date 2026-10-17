package sub;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265700a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f265700a = str;
        } else {
            j1.f(d.f265699a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f265700a, ((f) obj2).f265700a);
    }

    public final int hashCode() {
        String str = this.f265700a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public f(String str) {
        this.f265700a = str;
    }
}

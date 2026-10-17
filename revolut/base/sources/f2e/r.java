package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131701b;

    public /* synthetic */ r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(p.f131683a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131700a = str;
        this.f131701b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f131700a, rVar.f131700a) && Intrinsics.f(this.f131701b, rVar.f131701b);
    }

    public final int hashCode() {
        return this.f131701b.hashCode() + (this.f131700a.hashCode() * 31);
    }

    public r(String type, String text) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f131700a = type;
        this.f131701b = text;
    }
}

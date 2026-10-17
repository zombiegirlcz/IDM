package djm;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes14.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassId f115411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f115412b;

    public f(ClassId classId, List typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        this.f115411a = classId;
        this.f115412b = typeParametersCount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f115411a, fVar.f115411a) && Intrinsics.f(this.f115412b, fVar.f115412b);
    }

    public final int hashCode() {
        return this.f115412b.hashCode() + (this.f115411a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ClassRequest(classId=");
        sb6.append(this.f115411a);
        sb6.append(", typeParametersCount=");
        return m72.b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f115412b, sb6);
    }
}

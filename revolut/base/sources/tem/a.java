package tem;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes23.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f270126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KType f270127b;

    public a(KClass type, KType kType) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f270126a = type;
        this.f270127b = kType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        KType kType = this.f270127b;
        if (kType == null) {
            a aVar = (a) obj2;
            if (aVar.f270127b == null) {
                return Intrinsics.f(this.f270126a, aVar.f270126a);
            }
        }
        return Intrinsics.f(kType, ((a) obj2).f270127b);
    }

    public final int hashCode() {
        KType kType = this.f270127b;
        return kType != null ? kType.hashCode() : this.f270126a.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("TypeInfo(");
        Object obj2 = this.f270127b;
        if (obj2 == null) {
            obj2 = this.f270126a;
        }
        sb6.append(obj2);
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }
}

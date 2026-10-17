package yhm;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000 \u0004*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0005\u0006\u0088\u0001\u0007\u0092\u0001\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lyhm/m;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "a", "yhm/n", "value", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m<T> implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f314193a;

    /* JADX INFO: renamed from: yhm.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyhm/m$a;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ m(Object obj2) {
        this.f314193a = obj2;
    }

    public static final Throwable a(Object obj2) {
        if (obj2 instanceof n) {
            return ((n) obj2).f314194a;
        }
        return null;
    }

    public static String b(Object obj2) {
        if (obj2 instanceof n) {
            return ((n) obj2).toString();
        }
        return "Success(" + obj2 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof m) {
            return Intrinsics.f(this.f314193a, ((m) obj2).f314193a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj2 = this.f314193a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }

    public final String toString() {
        return b(this.f314193a);
    }
}

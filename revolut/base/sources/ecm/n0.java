package ecm;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public final class n0 {
    public static final AtomicLong d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f124847c;

    public n0(String str, String str2, long j2) {
        Preconditions.checkNotNull(str, "typeName");
        Preconditions.checkArgument(!str.isEmpty(), "empty type");
        this.f124845a = str;
        this.f124846b = str2;
        this.f124847c = j2;
    }

    public static n0 a(Class cls, String str) {
        String simpleName = ((Class) Preconditions.checkNotNull(cls, "type")).getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new n0(simpleName, str, d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f124845a + "<" + this.f124847c + ">");
        String str = this.f124846b;
        if (str != null) {
            sb6.append(": (");
            sb6.append(str);
            sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return sb6.toString();
    }
}

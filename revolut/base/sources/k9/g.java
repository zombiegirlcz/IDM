package k9;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f182182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f182184c = -1;
    public String d;

    public g(Object obj2, String str) {
        this.f182182a = obj2;
        if (str == null) {
            throw new NullPointerException("Cannot pass null fieldName");
        }
        this.f182183b = str;
    }

    public final String toString() {
        if (this.d == null) {
            StringBuilder sb6 = new StringBuilder();
            Object obj2 = this.f182182a;
            if (obj2 != null) {
                Class<?> componentType = obj2 instanceof Class ? (Class) obj2 : obj2.getClass();
                int i = 0;
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                    i++;
                }
                sb6.append(componentType.getName());
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    sb6.append("[]");
                }
            } else {
                sb6.append("UNKNOWN");
            }
            sb6.append('[');
            String str = this.f182183b;
            if (str != null) {
                sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                sb6.append(str);
                sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else {
                int i2 = this.f182184c;
                if (i2 >= 0) {
                    sb6.append(i2);
                } else {
                    sb6.append('?');
                }
            }
            sb6.append(']');
            this.d = sb6.toString();
        }
        return this.d;
    }
}

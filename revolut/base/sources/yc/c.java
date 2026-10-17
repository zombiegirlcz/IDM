package yc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f312402c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f312403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f312404b;

    static {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap());
        if (mapUnmodifiableMap == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        f312402c = new c(null, mapUnmodifiableMap);
    }

    public c(Integer num, Map map) {
        this.f312403a = num;
        this.f312404b = map;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof c) {
            c cVar = (c) obj2;
            Integer num = cVar.f312403a;
            Integer num2 = this.f312403a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f312404b.equals(cVar.f312404b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f312403a;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f312404b.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.f312403a + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f312404b) + "}";
    }
}

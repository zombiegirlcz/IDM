package i8;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class o implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f159389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f159390c;

    public o(Map map) {
        this.f159389b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f159389b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb6 = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((n) list.get(i)).f159388a;
                if (!TextUtils.isEmpty(str)) {
                    sb6.append(str);
                    if (i != list.size() - 1) {
                        sb6.append(CoreConstants.COMMA_CHAR);
                    }
                }
            }
            String string = sb6.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof o) {
            return this.f159389b.equals(((o) obj2).f159389b);
        }
        return false;
    }

    @Override // i8.l
    public final Map getHeaders() {
        if (this.f159390c == null) {
            synchronized (this) {
                try {
                    if (this.f159390c == null) {
                        this.f159390c = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f159390c;
    }

    public final int hashCode() {
        return this.f159389b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f159389b + CoreConstants.CURLY_RIGHT;
    }
}

package i8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class m {
    public static final Map d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f159385a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f159386b = d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f159387c = true;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb6 = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb6.append(cCharAt);
                } else {
                    sb6.append('?');
                }
            }
            property = sb6.toString();
        }
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put("User-Agent", Collections.singletonList(new n(property)));
        }
        d = Collections.unmodifiableMap(map);
    }

    public final void a() {
        if (this.f159385a) {
            this.f159385a = false;
            HashMap map = new HashMap(this.f159386b.size());
            for (Map.Entry entry : this.f159386b.entrySet()) {
                map.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.f159386b = map;
        }
    }
}

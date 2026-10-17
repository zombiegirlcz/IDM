package f1m;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class e extends a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f131309b;

    @Override // f1m.a
    public final Map a() {
        HashMap map = new HashMap();
        Integer num = this.f131309b;
        if (num != null) {
            map.put("foregroundIndex", Integer.valueOf(num.intValue()));
        }
        return map;
    }

    @Override // f1m.a
    public final String b() {
        return "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0";
    }
}

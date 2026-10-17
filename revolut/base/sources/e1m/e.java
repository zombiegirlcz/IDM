package e1m;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class e extends h1m.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f122002b;

    public e(boolean z) {
        super("iglu:com.snowplowanalytics.mobile/application_lifecycle/jsonschema/1-0-0");
        HashMap map = new HashMap();
        this.f122002b = map;
        map.put("isVisible", Boolean.valueOf(z));
        a(map);
    }
}

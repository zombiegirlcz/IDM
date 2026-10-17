package f1m;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class h extends a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131311c;
    public String d;
    public String e;
    public String f;

    public h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.f131310b = name;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        this.f131311c = string;
    }

    @Override // f1m.a
    public final Map a() {
        HashMap map = new HashMap();
        map.put("id", this.f131311c);
        map.put("name", this.f131310b);
        String str = this.d;
        if (str != null) {
            map.put("type", str);
        }
        return map;
    }

    @Override // f1m.a
    public final String b() {
        return "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0";
    }
}

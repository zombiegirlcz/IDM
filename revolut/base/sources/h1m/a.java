package h1m;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f148610a;

    public a(b data) {
        Intrinsics.checkNotNullParameter("iglu:com.snowplowanalytics.mobile/screen/jsonschema/1-0-0", "schema");
        Intrinsics.checkNotNullParameter(data, "data");
        HashMap map = new HashMap();
        this.f148610a = map;
        b("iglu:com.snowplowanalytics.mobile/screen/jsonschema/1-0-0");
        map.put("data", data.f148612b);
    }

    public final void a(Object obj2) {
        if (obj2 != null) {
            this.f148610a.put("data", obj2);
        }
    }

    public final void b(String schema) {
        Intrinsics.checkNotNullParameter(schema, "schema");
        if (schema.length() <= 0) {
            throw new IllegalArgumentException("schema cannot be empty");
        }
        this.f148610a.put("schema", schema);
    }

    public final String toString() {
        String string = new JSONObject(this.f148610a).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(payload).toString()");
        return string;
    }

    public a(String schema, Object data) {
        Intrinsics.checkNotNullParameter(schema, "schema");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f148610a = new HashMap();
        b(schema);
        a(data);
    }

    public a(String schema) {
        Intrinsics.checkNotNullParameter(schema, "schema");
        this.f148610a = new HashMap();
        b(schema);
        a(new HashMap());
    }
}

package ag;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Date f4688h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f4689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f4690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f4691c;
    public final JSONArray d;
    public final JSONObject e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JSONArray f4692g;

    public g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j2, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j2);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f4690b = jSONObject;
        this.f4691c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = j2;
        this.f4692g = jSONArray2;
        this.f4689a = jSONObject3;
    }

    public static g a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static f c() {
        f fVar = new f();
        fVar.f4685a = new JSONObject();
        fVar.f4686b = f4688h;
        fVar.f4687c = new JSONArray();
        fVar.d = new JSONObject();
        fVar.e = 0L;
        fVar.f = new JSONArray();
        return fVar;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f4692g;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string3 = jSONArray2.getString(i2);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof g) {
            return this.f4689a.toString().equals(((g) obj2).f4689a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f4689a.hashCode();
    }

    public final String toString() {
        return this.f4689a.toString();
    }
}

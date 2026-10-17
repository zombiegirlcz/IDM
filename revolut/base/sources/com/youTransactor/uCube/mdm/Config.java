package com.youTransactor.uCube.mdm;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class Config {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f107596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f107597c;
    public String d;
    public String e;

    public Config() {
    }

    public static List<Config> fromJson(JSONObject jSONObject) throws Exception {
        if (!"ok".equals(jSONObject.getString("status"))) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            Config config = new Config();
            config.f107595a = jSONObjectOptJSONObject.getInt("type");
            config.f107597c = jSONObjectOptJSONObject.getBoolean("ciphered");
            if (jSONObjectOptJSONObject.has("label")) {
                config.f107596b = jSONObjectOptJSONObject.getString("label");
            }
            if (jSONObjectOptJSONObject.has("min_version")) {
                config.d = jSONObjectOptJSONObject.getString("min_version");
                if (config.getType() == 12) {
                    String str = config.d;
                    config.d = str.substring(0, str.lastIndexOf("."));
                }
            }
            if (jSONObjectOptJSONObject.has("current_version")) {
                config.e = jSONObjectOptJSONObject.getString("current_version");
                if (config.getType() == 12) {
                    String str2 = config.e;
                    config.e = str2.substring(0, str2.lastIndexOf("."));
                }
            }
            arrayList.add(config);
        }
        return arrayList;
    }

    public String getCurrentVersion() {
        return this.e;
    }

    public String getLabel() {
        return this.f107596b;
    }

    public String getMinVersion() {
        return this.d;
    }

    public int getType() {
        return this.f107595a;
    }

    public boolean isCiphered() {
        return this.f107597c;
    }

    public void setLabel(String str) {
        this.f107596b = str;
    }

    public void setType(int i) {
        this.f107595a = i;
    }

    public Config(int i, String str, boolean z, String str2, String str3) {
        this.f107595a = i;
        this.f107596b = str;
        this.f107597c = z;
        this.d = str2;
        this.e = str3;
    }
}

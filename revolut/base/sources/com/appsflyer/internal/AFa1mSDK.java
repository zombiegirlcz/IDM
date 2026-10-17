package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1mSDK {
    public static Map<String, Object> AFInAppEventParameterName(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objAFInAppEventParameterName = jSONObject.get(next);
            if (objAFInAppEventParameterName instanceof JSONArray) {
                objAFInAppEventParameterName = AFInAppEventParameterName((JSONArray) objAFInAppEventParameterName);
            } else if (objAFInAppEventParameterName instanceof JSONObject) {
                objAFInAppEventParameterName = AFInAppEventParameterName((JSONObject) objAFInAppEventParameterName);
            }
            map.put(next, objAFInAppEventParameterName);
        }
        return map;
    }

    public static JSONObject valueOf(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), valueOf(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject valueOf(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Object valueOf(Object obj2) {
        if (obj2 == null) {
            return JSONObject.NULL;
        }
        if ((obj2 instanceof JSONArray) || (obj2 instanceof JSONObject) || obj2.equals(JSONObject.NULL)) {
            return obj2;
        }
        try {
            if (obj2 instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it8 = ((Collection) obj2).iterator();
                while (it8.hasNext()) {
                    jSONArray.put(valueOf(it8.next()));
                }
                return jSONArray;
            }
            if (obj2.getClass().isArray()) {
                int length = Array.getLength(obj2);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(valueOf(Array.get(obj2, i)));
                }
                return jSONArray2;
            }
            if (obj2 instanceof Map) {
                return valueOf((Map<String, ?>) obj2);
            }
            return ((obj2 instanceof Boolean) || (obj2 instanceof Byte) || (obj2 instanceof Character) || (obj2 instanceof Double) || (obj2 instanceof Float) || (obj2 instanceof Integer) || (obj2 instanceof Long) || (obj2 instanceof Short) || (obj2 instanceof String)) ? obj2 : obj2.toString();
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    private static List<Object> AFInAppEventParameterName(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objAFInAppEventParameterName = jSONArray.get(i);
            if (objAFInAppEventParameterName instanceof JSONArray) {
                objAFInAppEventParameterName = AFInAppEventParameterName((JSONArray) objAFInAppEventParameterName);
            } else if (objAFInAppEventParameterName instanceof JSONObject) {
                objAFInAppEventParameterName = AFInAppEventParameterName((JSONObject) objAFInAppEventParameterName);
            }
            arrayList.add(objAFInAppEventParameterName);
        }
        return arrayList;
    }

    public static AFh1uSDK valueOf(Context context) {
        if (context instanceof Activity) {
            return AFh1uSDK.activity;
        }
        if (context instanceof Application) {
            return AFh1uSDK.application;
        }
        return AFh1uSDK.other;
    }
}

package com.google.android.gms.common.util;

import a0.d;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb6, @NonNull HashMap<String, String> map) {
        sb6.append("{");
        boolean z = true;
        for (String str : map.keySet()) {
            if (!z) {
                sb6.append(",");
            }
            String str2 = map.get(str);
            d.C(sb6, "\"", str, "\":");
            if (str2 == null) {
                sb6.append("null");
            } else {
                d.C(sb6, "\"", str2, "\"");
            }
            z = false;
        }
        sb6.append("}");
    }
}

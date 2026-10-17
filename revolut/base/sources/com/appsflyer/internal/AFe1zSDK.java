package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class AFe1zSDK {
    @NotNull
    public static final JSONArray AFInAppEventParameterName(@NotNull List<AFd1jSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<AFd1jSDK> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator<T> it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((AFd1jSDK) it8.next()).values());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean AFInAppEventType(@NotNull HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}

package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f26094a;

    public g(String str, Map map) {
        Map map2;
        if (map.containsKey(str)) {
            map2 = (Map) map.get(str);
        } else {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            map.put(str, concurrentHashMap);
            map2 = concurrentHashMap;
        }
        this.f26094a = map2;
    }

    public g(bh.d dVar) {
        this.f26094a = Collections.unmodifiableMap(new HashMap(dVar.f15223a));
    }

    public g(Map currenciesInfo) {
        Intrinsics.checkNotNullParameter(currenciesInfo, "currenciesInfo");
        this.f26094a = currenciesInfo;
    }
}

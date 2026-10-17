package com.fourthline.orca.internal;

import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f27248a;

    static {
        String[] elements = {"application/pdf", "image/jpeg", "video/mp4"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f27248a = kotlin.collections.d.y0(elements);
    }

    public static final Map a() {
        return a("application/json");
    }

    public static final Map b() {
        return a("application/pdf");
    }

    public static final Map c(Map map, String hash) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(hash, "hash");
        map.put("If-None-Match", hash);
        return map;
    }

    public static final Map d() {
        return zhm.r0.n(new Pair("content-type", "image/jpeg"));
    }

    public static final Map e() {
        return zhm.r0.n(new Pair("content-type", "application/json"));
    }

    public static final Map f() {
        return zhm.r0.n(new Pair("content-type", "video/mp4"));
    }

    public static final Map g() {
        return zhm.r0.n(new Pair("content-type", "multipart/form-data"));
    }

    public static final Map h() {
        return zhm.r0.n(new Pair("x-fl", "cdn"));
    }

    public static final Map a(Map map, String fileName) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        map.put("content-disposition", "filename=" + fileName);
        return map;
    }

    public static final Map b(Map map, String type) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        map.put("X-DeviceDataType", type);
        return map;
    }

    public static final boolean c(String str) {
        if (str != null) {
            return kotlin.text.d0.J(str, "application/json", true);
        }
        return false;
    }

    public static final String a(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return (String) map.get("content-type");
    }

    public static final boolean b(String str) {
        return zhm.d0.T(f27248a, str);
    }

    public static final Map c() {
        return zhm.r0.n(new Pair("content-type", "multipart/octet-stream"));
    }

    public static final Map a(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return zhm.r0.n(new Pair("accept", type));
    }
}

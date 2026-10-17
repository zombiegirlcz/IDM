package com.fourthline.orca.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jr0 f30017a = new jr0();

    private jr0() {
    }

    public static /* synthetic */ void a(jr0 jr0Var, String str, Map map, int i, Object obj2) {
        if ((i & 2) != 0) {
            map = zhm.r0.g();
        }
        jr0Var.a(str, map);
    }

    public static /* synthetic */ void b(jr0 jr0Var, String str, Map map, int i, Object obj2) {
        if ((i & 2) != 0) {
            map = zhm.r0.g();
        }
        jr0Var.b(str, map);
    }

    public static /* synthetic */ void c(jr0 jr0Var, String str, Map map, int i, Object obj2) {
        if ((i & 2) != 0) {
            map = zhm.r0.g();
        }
        jr0Var.c(str, map);
    }

    public static /* synthetic */ void a(jr0 jr0Var, String str, Throwable th10, Map map, int i, Object obj2) {
        if ((i & 2) != 0) {
            th10 = null;
        }
        if ((i & 4) != 0) {
            map = zhm.r0.g();
        }
        jr0Var.b(str, th10, map);
    }

    public final void b(String message, Throwable th10, Map attributes) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        ib.h hVar = hb.a.f150532a;
        Map attributes2 = a(attributes);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(attributes2, "attributes");
        hb.a.d(ib.e.INFO, message, attributes2, th10);
    }

    public final void c(String screen, Map attributes) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        a(this, "orca_screen_start", null, zhm.r0.q(attributes, new Pair(ib.b.Screen, screen)), 2, null);
    }

    public final void a(String message, Throwable th10, Map attributes) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        ib.h hVar = hb.a.f150532a;
        hb.a.a(message, th10, a(attributes));
    }

    private final Map a(Map map) {
        if (Intrinsics.f(map.get("isPublic"), Boolean.FALSE)) {
            return map;
        }
        LinkedHashMap linkedHashMapZ = zhm.r0.z(map);
        linkedHashMapZ.put("isPublic", Boolean.TRUE);
        return linkedHashMapZ;
    }

    public final void b(String screen, Map attributes) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        a(this, "orca_screen_forward", null, zhm.r0.q(attributes, new Pair(ib.b.Screen, screen)), 2, null);
    }

    public final void a(String screen, Map attributes) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        a(this, "orca_screen_backward", null, zhm.r0.q(attributes, new Pair(ib.b.Screen, screen)), 2, null);
    }
}

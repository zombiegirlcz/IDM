package vdm;

import aem.i0;
import aem.q;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oem.k;

/* JADX INFO: loaded from: classes23.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f288088a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f288089b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f288090c = new LinkedHashMap();
    public boolean d = true;
    public boolean e = true;

    public e() {
        int i = k.f224671a;
    }

    public final void a(i0 plugin, Function1 configure) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(configure, "configure");
        oem.a key = plugin.getKey();
        LinkedHashMap linkedHashMap = this.f288089b;
        linkedHashMap.put(plugin.getKey(), new c((Function1) linkedHashMap.get(key), configure, 0));
        oem.a key2 = plugin.getKey();
        LinkedHashMap linkedHashMap2 = this.f288088a;
        if (linkedHashMap2.containsKey(key2)) {
            return;
        }
        linkedHashMap2.put(plugin.getKey(), new q(plugin, 13));
    }
}

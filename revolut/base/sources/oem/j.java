package oem;

import io.ktor.utils.io.h0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f224668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f224669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f224670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Function1 supplier, Function1 close) {
        super(10, 0.75f, true);
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        Intrinsics.checkNotNullParameter(close, "close");
        this.f224668a = supplier;
        this.f224669b = close;
        this.f224670c = 10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj2) {
        if (this.f224670c == 0) {
            return ((h0) this.f224668a).invoke(obj2);
        }
        synchronized (this) {
            Object obj3 = super.get(obj2);
            if (obj3 != null) {
                return obj3;
            }
            Object objInvoke = ((h0) this.f224668a).invoke(obj2);
            put(obj2, objInvoke);
            return objInvoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry eldest) {
        Intrinsics.checkNotNullParameter(eldest, "eldest");
        boolean z = super.size() > this.f224670c;
        if (z) {
            ((nb.e) this.f224669b).invoke(eldest.getValue());
        }
        return z;
    }
}

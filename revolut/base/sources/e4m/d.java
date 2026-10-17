package e4m;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements d4m.a, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f122677a;

    public d(LinkedHashMap linkedHashMap) {
        this.f122677a = Collections.unmodifiableMap(linkedHashMap);
    }

    @Override // d4m.a, phm.a
    public final Object get() {
        return this.f122677a;
    }
}

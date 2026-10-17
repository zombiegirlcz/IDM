package mcm;

import com.google.common.collect.ForwardingMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends ForwardingMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f204404a = new HashMap();

    public final double d() {
        HashMap map = this.f204404a;
        if (map.isEmpty()) {
            return 0.0d;
        }
        Iterator it8 = map.values().iterator();
        int i = 0;
        int i2 = 0;
        while (it8.hasNext()) {
            i2++;
            if (((n) it8.next()).d()) {
                i++;
            }
        }
        return (((double) i) / ((double) i2)) * 100.0d;
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final Object delegate() {
        return this.f204404a;
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final Map delegate() {
        return this.f204404a;
    }
}

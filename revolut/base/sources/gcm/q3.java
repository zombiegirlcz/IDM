package gcm;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3 f142836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f142837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f142838c;
    public final n5 d;
    public final Object e;
    public final Map f;

    public q3(o3 o3Var, HashMap map, HashMap map2, n5 n5Var, Object obj2, Map map3) {
        this.f142836a = o3Var;
        this.f142837b = v0.a.r(map);
        this.f142838c = v0.a.r(map2);
        this.d = n5Var;
        this.e = obj2;
        this.f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static q3 a(Map map, boolean z, int i, int i2, Object obj2) {
        n5 n5Var;
        Map mapG;
        n5 n5Var2;
        if (z) {
            if (map == null || (mapG = k2.g("retryThrottling", map)) == null) {
                n5Var2 = null;
            } else {
                float fFloatValue = k2.e("maxTokens", mapG).floatValue();
                float fFloatValue2 = k2.e("tokenRatio", mapG).floatValue();
                Preconditions.checkState(fFloatValue > BitmapDescriptorFactory.HUE_RED, "maxToken should be greater than zero");
                Preconditions.checkState(fFloatValue2 > BitmapDescriptorFactory.HUE_RED, "tokenRatio should be greater than zero");
                n5Var2 = new n5(fFloatValue, fFloatValue2);
            }
            n5Var = n5Var2;
        } else {
            n5Var = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapG2 = map == null ? null : k2.g("healthCheckConfig", map);
        List<Map> listC = k2.c("methodConfig", map);
        if (listC == null) {
            listC = null;
        } else {
            k2.a(listC);
        }
        if (listC == null) {
            return new q3(null, map2, map3, n5Var, obj2, mapG2);
        }
        o3 o3Var = null;
        for (Map map4 : listC) {
            o3 o3Var2 = new o3(map4, i, i2, z);
            List<Map> listC2 = k2.c("name", map4);
            if (listC2 == null) {
                listC2 = null;
            } else {
                k2.a(listC2);
            }
            if (listC2 != null && !listC2.isEmpty()) {
                for (Map map5 : listC2) {
                    String strH = k2.h("service", map5);
                    String strH2 = k2.h("method", map5);
                    if (Strings.isNullOrEmpty(strH)) {
                        Preconditions.checkArgument(Strings.isNullOrEmpty(strH2), "missing service name for method %s", strH2);
                        Preconditions.checkArgument(o3Var == null, "Duplicate default method config in service config %s", map);
                        o3Var = o3Var2;
                    } else if (Strings.isNullOrEmpty(strH2)) {
                        Preconditions.checkArgument(!map3.containsKey(strH), "Duplicate service %s", strH);
                        map3.put(strH, o3Var2);
                    } else {
                        String strA = ecm.p1.a(strH, strH2);
                        Preconditions.checkArgument(!map2.containsKey(strA), "Duplicate method name %s", strA);
                        map2.put(strA, o3Var2);
                    }
                }
            }
        }
        return new q3(o3Var, map2, map3, n5Var, obj2, mapG2);
    }

    public final p3 b() {
        if (this.f142838c.isEmpty() && this.f142837b.isEmpty() && this.f142836a == null) {
            return null;
        }
        return new p3(this);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && q3.class == obj2.getClass()) {
            q3 q3Var = (q3) obj2;
            if (Objects.equal(this.f142836a, q3Var.f142836a) && Objects.equal(this.f142837b, q3Var.f142837b) && Objects.equal(this.f142838c, q3Var.f142838c) && Objects.equal(this.d, q3Var.d) && Objects.equal(this.e, q3Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f142836a, this.f142837b, this.f142838c, this.d, this.e);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("defaultMethodConfig", this.f142836a).add("serviceMethodMap", this.f142837b).add("serviceMap", this.f142838c).add("retryThrottling", this.d).add("loadBalancingConfig", this.e).toString();
    }
}

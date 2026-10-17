package bih;

import com.revolut.core.ui_kit.models.AnimationRequest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f15496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15498c;
    public final Map d;
    public final String e;
    public final AnimationRequest f;

    public h(Map accountItemsCollapsed, List accountItemsOrder, Map accountAssetsCollapsed, Map map, String str, AnimationRequest animationRequest) {
        Intrinsics.checkNotNullParameter(accountItemsCollapsed, "accountItemsCollapsed");
        Intrinsics.checkNotNullParameter(accountItemsOrder, "accountItemsOrder");
        Intrinsics.checkNotNullParameter(accountAssetsCollapsed, "accountAssetsCollapsed");
        this.f15496a = accountItemsCollapsed;
        this.f15497b = accountItemsOrder;
        this.f15498c = accountAssetsCollapsed;
        this.d = map;
        this.e = str;
        this.f = animationRequest;
    }

    public static h a(h hVar, Map map, List list, LinkedHashMap linkedHashMap, Map map2, String str, int i) {
        if ((i & 1) != 0) {
            map = hVar.f15496a;
        }
        Map accountItemsCollapsed = map;
        if ((i & 2) != 0) {
            list = hVar.f15497b;
        }
        List accountItemsOrder = list;
        Map map3 = linkedHashMap;
        if ((i & 4) != 0) {
            map3 = hVar.f15498c;
        }
        Map accountAssetsCollapsed = map3;
        if ((i & 8) != 0) {
            map2 = hVar.d;
        }
        Map map4 = map2;
        if ((i & 16) != 0) {
            str = hVar.e;
        }
        AnimationRequest animationRequest = hVar.f;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(accountItemsCollapsed, "accountItemsCollapsed");
        Intrinsics.checkNotNullParameter(accountItemsOrder, "accountItemsOrder");
        Intrinsics.checkNotNullParameter(accountAssetsCollapsed, "accountAssetsCollapsed");
        return new h(accountItemsCollapsed, accountItemsOrder, accountAssetsCollapsed, map4, str, animationRequest);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f15496a, hVar.f15496a) && Intrinsics.f(this.f15497b, hVar.f15497b) && Intrinsics.f(this.f15498c, hVar.f15498c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iE = p.a.e(p.a.d(this.f15496a.hashCode() * 31, 31, this.f15497b), 31, this.f15498c);
        Map map = this.d;
        int iHashCode = (iE + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnimationRequest animationRequest = this.f;
        return iHashCode2 + (animationRequest != null ? animationRequest.hashCode() : 0);
    }
}

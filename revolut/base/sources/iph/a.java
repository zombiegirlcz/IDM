package iph;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import toh.g;
import zel.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f167748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f167749b;

    public a(g editableMetricsProvider) {
        Intrinsics.checkNotNullParameter(editableMetricsProvider, "editableMetricsProvider");
        this.f167748a = editableMetricsProvider;
        this.f167749b = new ConcurrentHashMap();
    }

    public final int a(zel.g metric, f group) {
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(group, "group");
        ConcurrentHashMap concurrentHashMap = this.f167749b;
        Object objA = concurrentHashMap.get(group);
        if (objA == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(group, (objA = this.f167748a.a(group)))) != null) {
            objA = objPutIfAbsent;
        }
        int iIndexOf = ((List) objA).indexOf(metric);
        Integer numValueOf = Integer.valueOf(iIndexOf);
        if (iIndexOf == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }
}

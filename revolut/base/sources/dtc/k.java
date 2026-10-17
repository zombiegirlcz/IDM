package dtc;

import bnf.r;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends atc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.m f117419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile SoftReference f117420b;

    public k(thf.m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f117419a = transactionTextResourcesMapper;
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        SoftReference softReference = this.f117420b;
        Map concurrentHashMap = softReference != null ? (Map) softReference.get() : null;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
            this.f117420b = new SoftReference(concurrentHashMap);
        }
        Object objL = concurrentHashMap.get(instance);
        if (objL == null) {
            objL = ((r) this.f117419a).l(instance);
            concurrentHashMap.put(instance, objL);
        }
        targetCollection.add((String) objL);
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f117419a, ((k) obj2).f117419a);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f117419a.hashCode();
    }
}

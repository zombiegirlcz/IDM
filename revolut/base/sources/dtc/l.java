package dtc;

import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends atc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.m f117421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f117422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile SoftReference f117423c;

    public l(thf.m transactionTextResourcesMapper, q extraData) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f117421a = transactionTextResourcesMapper;
        this.f117422b = extraData;
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        SoftReference softReference = this.f117423c;
        Map concurrentHashMap = softReference != null ? (Map) softReference.get() : null;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
            this.f117423c = new SoftReference(concurrentHashMap);
        }
        Object objA = concurrentHashMap.get(instance);
        if (objA == null) {
            thf.m mVar = this.f117421a;
            q qVar = this.f117422b;
            objA = thf.m.a(mVar, instance, qVar.f181795b, qVar.d, qVar.e, qVar.f181799j, null, null, BERTags.FLAGS);
            concurrentHashMap.put(instance, objA);
        }
        targetCollection.add((String) objA);
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f117421a, lVar.f117421a) && Intrinsics.f(this.f117422b, lVar.f117422b);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f117422b.hashCode() + (this.f117421a.hashCode() * 31);
    }
}

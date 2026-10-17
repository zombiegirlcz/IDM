package sr;

import com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource;
import go.g;
import gr.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k25.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import lkf.v;
import lr.l;
import rd0.e;
import vkm.c2;
import vkm.d2;
import vkm.q;
import vkm.t1;
import vkm.v1;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lal.a f265100a;

    public a(lal.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f265100a = repository;
    }

    public final Flow a(List resources) {
        lal.a aVar;
        Flow vVar;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (resources.isEmpty()) {
            vVar = new g(s.f145794a, 2);
        } else {
            List list = resources;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (true) {
                boolean zHasNext = it8.hasNext();
                aVar = this.f265100a;
                if (!zHasNext) {
                    break;
                }
                BiometricVerificationVisionRemoteResource biometricVerificationVisionRemoteResource = (BiometricVerificationVisionRemoteResource) it8.next();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVar.e;
                String f50444a = biometricVerificationVisionRemoteResource.getF50444a();
                Object obj2 = concurrentHashMap.get(f50444a);
                if (obj2 == null) {
                    t1 t1VarM = q.M(com.google.crypto.tink.shaded.protobuf.t1.E(e.e(new v1(new l(aVar, biometricVerificationVisionRemoteResource, (Continuation) null, 2)), h0.f322473a, new o(aVar, biometricVerificationVisionRemoteResource, (Continuation) null))), (CoroutineScope) aVar.f193426b, c2.a(d2.Companion, 1000L, 2), 1);
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(f50444a, t1VarM);
                    obj2 = objPutIfAbsent == null ? t1VarM : objPutIfAbsent;
                }
                arrayList.add((Flow) obj2);
            }
            vVar = new v((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), aVar, 7);
        }
        return q.q(vVar);
    }
}

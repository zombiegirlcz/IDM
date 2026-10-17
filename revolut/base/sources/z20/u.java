package z20;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f318939a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap.KeySetView f318940b = ConcurrentHashMap.newKeySet();

    public final MutableStateFlow a(UUID correlationId) {
        Intrinsics.checkNotNullParameter(correlationId, "correlationId");
        ConcurrentHashMap concurrentHashMap = this.f318939a;
        Object objC = concurrentHashMap.get(correlationId);
        if (objC == null) {
            objC = vkm.q.c(this.f318940b.contains(correlationId) ? null : Float.valueOf(BitmapDescriptorFactory.HUE_RED));
            concurrentHashMap.putIfAbsent(correlationId, objC);
        }
        return (MutableStateFlow) objC;
    }

    public final void b(UUID correlationId, float f) {
        Object value;
        Intrinsics.checkNotNullParameter(correlationId, "correlationId");
        MutableStateFlow mutableStateFlowA = a(correlationId);
        do {
            value = mutableStateFlowA.getValue();
        } while (!mutableStateFlowA.h(value, Float.valueOf(f)));
    }
}

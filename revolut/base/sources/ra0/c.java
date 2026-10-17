package ra0;

import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f252763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f252764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.backend_flow.impl.repository.a f252765c;
    public final /* synthetic */ LinkedHashMap d;

    public /* synthetic */ c(long j2, long j3, com.revolut.core.backend_flow.impl.repository.a aVar, LinkedHashMap linkedHashMap) {
        this.f252763a = j2;
        this.f252764b = j3;
        this.f252765c = aVar;
        this.d = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        UUID sessionId = (UUID) obj2;
        Long lastModified = (Long) obj3;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        if (this.f252763a - lastModified.longValue() >= this.f252764b) {
            this.f252765c.f51255a.I0("BACKEND_FORM_" + sessionId);
            this.d.remove(sessionId);
        }
        return Unit.f186387a;
    }
}

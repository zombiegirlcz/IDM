package j50;

import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import vkm.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f171453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f171454b;

    public p() {
        j2 j2VarC = q.c(r0.g());
        this.f171453a = j2VarC;
        this.f171454b = q.h(j2VarC);
    }

    public final void a(UUID key, k50.d dVar) {
        j2 j2Var;
        Object value;
        Map map;
        Intrinsics.checkNotNullParameter(key, "key");
        do {
            j2Var = this.f171453a;
            value = j2Var.getValue();
            map = (Map) value;
        } while (!j2Var.h(value, dVar != null ? r0.q(map, new Pair(key, dVar)) : r0.l(key, map)));
    }
}

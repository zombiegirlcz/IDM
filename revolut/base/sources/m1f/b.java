package m1f;

import j1f.j0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import m18.n;
import rlm.o;
import ue0.e;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f201492a = e.b(Json.d, new n(5));

    public final List a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        o oVar = this.f201492a;
        oVar.getClass();
        return (List) oVar.b(new qlm.e(j0.Companion.serializer()), value);
    }
}

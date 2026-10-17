package m1f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import m18.n;
import qlm.v1;
import rlm.o;
import ue0.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f201491a = e.b(Json.d, new n(4));

    public final List a(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        o oVar = this.f201491a;
        oVar.getClass();
        return (List) oVar.b(new qlm.e(v1.f247718a), string);
    }
}

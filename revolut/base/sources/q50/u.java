package q50;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends y50.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f242282m = yhm.j.b(new pyc.a(this, 17));

    @Override // y50.d
    public final y50.a Z2() {
        return new pak.h(this);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f242282m.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Json jsonA = af0.b.a();
        jsonA.getClass();
        l0 l0Var = (l0) jsonA.b(l0.Companion.serializer(), rawData);
        if (l0Var.f242241b.isEmpty()) {
            throw new IllegalArgumentException("Line chart widget requires at least one point");
        }
        return l0Var;
    }
}

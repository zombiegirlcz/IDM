package q50;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends y50.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f242206m = yhm.j.b(new pyc.a(this, 14));

    @Override // y50.d
    public final y50.a Z2() {
        return new om4.d0(this);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f242206m.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return (j20.l) jsonA.b(j20.l.Companion.serializer(), rawData);
    }
}

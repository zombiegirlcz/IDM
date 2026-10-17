package zr5;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends y50.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f324603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f324604n;

    public r(q mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f324603m = mapper;
        this.f324604n = yhm.j.b(new zh0.b(this, 17));
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new n(this);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f324604n.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return (j) jsonA.b(j.Companion.serializer(), rawData);
    }
}

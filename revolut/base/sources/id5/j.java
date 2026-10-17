package id5;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends y50.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f160428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f160429n;

    public j(i mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f160428m = mapper;
        this.f160429n = yhm.j.b(new hq1.f(this, 29));
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new g();
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f160429n.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return (f) jsonA.b(f.Companion.serializer(), rawData);
    }
}

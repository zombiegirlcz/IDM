package t8g;

import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import os2.g;
import q06.l;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends y50.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f268895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f268896n;

    public e(l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.f268895m = deeplinkRouter;
        this.f268896n = j.b(new sii.a(this, 25));
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new g(this);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f268896n.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Object objC = new o().c(rawData, b.class);
        Intrinsics.checkNotNullExpressionValue(objC, "fromJson(...)");
        return (b) objC;
    }
}

package v8g;

import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import q06.l;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends y50.d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f286769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l80.e f286770n;
    public final Lazy o;

    public h(l deeplinkRouter, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f286769m = deeplinkRouter;
        this.f286770n = dateProvider;
        this.o = j.b(new ur2.a(this, 25));
    }

    public static String g3(String str, boolean z) {
        return str + (d0.J(str, "?", false) ? "&" : "?") + "expired=" + z;
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new tul.b(this);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.o.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Object objC = new o().c(rawData, b.class);
        Intrinsics.checkNotNullExpressionValue(objC, "fromJson(...)");
        return (b) objC;
    }
}

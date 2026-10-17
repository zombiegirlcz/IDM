package ei6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.f;
import u80.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f126441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.b f126442b;

    public b(m moneyFormatter, t70.b currencyLocalization) {
        Intrinsics.checkNotNullParameter(moneyFormatter, "moneyFormatter");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        this.f126441a = moneyFormatter;
        this.f126442b = currencyLocalization;
    }

    public final String a(io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        long j2 = pocket.i;
        xi0.a aVar = xi0.b.Companion;
        String str = pocket.f163147c;
        aVar.getClass();
        return this.f126441a.a(new f(new dj0.d(j2, xi0.a.a(str)), null, true, false, null, false, false, false, null, 4086)).toString();
    }
}

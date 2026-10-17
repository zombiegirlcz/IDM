package fem;

import kem.k0;
import kem.s;
import kem.w;
import kem.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.c2;
import skm.e0;
import zhm.d0;

/* JADX INFO: loaded from: classes23.dex */
public final class d implements w {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f134657a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f134658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f134659c;
    public Object d;
    public c2 e;
    public final oem.e f;

    public d() {
        y.Companion.getClass();
        this.f134658b = y.f183240b;
        this.f134659c = new s();
        this.d = iem.b.f160833a;
        this.e = e0.e();
        this.f = new oem.e();
    }

    public final void a(tem.a aVar) {
        oem.e eVar = this.f;
        if (aVar != null) {
            eVar.e(j.f134675a, aVar);
            return;
        }
        oem.a key = j.f134675a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        eVar.c().remove(key);
    }

    public final void b(d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.e = builder.e;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f134658b = builder.f134658b;
        this.d = builder.d;
        oem.e other = builder.f;
        a((tem.a) other.d(j.f134675a));
        k0 k0Var = builder.f134657a;
        k0 k0Var2 = this.f134657a;
        a1m.e.M(k0Var2, k0Var);
        k0Var2.e(k0Var2.f183209h);
        a1m.e.f(this.f134659c, builder.f134659c);
        oem.e eVar = this.f;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        for (oem.a aVar : d0.d1(other.c().keySet())) {
            Intrinsics.i(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            eVar.e(aVar, other.b(aVar));
        }
    }

    @Override // kem.w
    public final s getHeaders() {
        return this.f134659c;
    }
}

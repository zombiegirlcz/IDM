package b4h;

import elm.f;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import nel.z;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import sy6.j;
import tnb.k;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f12378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final IllegalArgumentException f12379c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3h.e f12380a;

    static {
        z[] elements = {z.ADR, z.ETF, z.ETC, z.ETN, z.EQUITY, z.WARRANT, z.SPAC, z.CFD};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f12378b = kotlin.collections.d.y0(elements);
        f12379c = new IllegalArgumentException("Unsupported instrument type");
    }

    public e(t3h.e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f12380a = repository;
    }

    public final k a() {
        return ue0.e.R(this.f12380a.f267784a, "CHART_PERIOD_KEY", wim.z.d(o0.b(eel.c.class)));
    }

    public final Object b(eel.c cVar, i iVar) throws Throwable {
        j jVar = new j(this.f12380a, cVar, null, 12);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, jVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}

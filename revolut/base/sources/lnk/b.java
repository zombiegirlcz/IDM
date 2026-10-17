package lnk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dnk.l f197287a;

    public b(dnk.l planPageIconMapper) {
        Intrinsics.checkNotNullParameter(planPageIconMapper, "planPageIconMapper");
        this.f197287a = planPageIconMapper;
    }

    public static dj0.d a(qha.a aVar) {
        dj0.d dVarH;
        dj0.d dVar = aVar.e;
        if (dVar != null) {
            return dVar;
        }
        qha.b bVarA = aVar.a();
        if (bVarA == null) {
            throw new IllegalArgumentException("Yearly fee must not be null on switch to annual screen");
        }
        dj0.d dVar2 = bVarA.f246575b;
        hha.o oVarB = aVar.b();
        return (oVarB == null || (dVarH = pyd.c.H(dVar2, oVarB.f152326a)) == null) ? dVar2 : dVarH;
    }
}

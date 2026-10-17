package ly;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f200621a = new l();

    private l() {
    }

    @Override // ly.o
    public final my.a a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        mz.a aVar = new mz.a();
        l70.e eVarF = px.b.f(context);
        eVarF.getClass();
        aVar.f210560h = eVarF;
        px.g gVarD = px.b.d(context);
        gVarD.getClass();
        aVar.f210559g = gVarD;
        gx.c cVarA = px.b.a(context);
        cVarA.getClass();
        aVar.i = cVarA;
        u00.d dVarE = px.b.e(context);
        dVarE.getClass();
        aVar.f210561j = dVarE;
        nv.a aVarC = px.b.c(context);
        aVarC.getClass();
        aVar.k = aVarC;
        return aVar;
    }
}

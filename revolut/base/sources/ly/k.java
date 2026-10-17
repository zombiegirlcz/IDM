package ly;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f200620a = new k();

    private k() {
    }

    @Override // ly.o
    public final my.a a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ey.a aVar = new ey.a();
        l70.e eVarF = px.b.f(context);
        eVarF.getClass();
        aVar.f130473g = eVarF;
        px.g gVarD = px.b.d(context);
        gVarD.getClass();
        aVar.f130474h = gVarD;
        k81.a aVarB = px.b.b(context);
        aVarB.getClass();
        aVar.i = aVarB;
        gx.c cVarA = px.b.a(context);
        cVarA.getClass();
        aVar.f130475j = cVarA;
        u00.d dVarE = px.b.e(context);
        dVarE.getClass();
        aVar.k = dVarE;
        nv.a aVarC = px.b.c(context);
        aVarC.getClass();
        aVar.f130476l = aVarC;
        return aVar;
    }
}

package ly;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class j implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f200619a = new j();

    private j() {
    }

    @Override // ly.o
    public final my.a a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        qx.c cVar = new qx.c();
        l70.e eVarF = px.b.f(context);
        eVarF.getClass();
        cVar.f249968h = eVarF;
        px.g gVarD = px.b.d(context);
        gVarD.getClass();
        cVar.f249967g = gVarD;
        k81.a aVarB = px.b.b(context);
        aVarB.getClass();
        cVar.i = aVarB;
        gx.c cVarA = px.b.a(context);
        cVarA.getClass();
        cVar.f249969j = cVarA;
        u00.d dVarE = px.b.e(context);
        dVarE.getClass();
        cVar.k = dVarE;
        nv.a aVarC = px.b.c(context);
        aVarC.getClass();
        cVar.f249970l = aVarC;
        return cVar;
    }
}

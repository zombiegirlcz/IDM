package ly;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f200622a = new m();

    private m() {
    }

    @Override // ly.o
    public final my.a a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        oz.a aVar = new oz.a();
        l70.e eVarF = px.b.f(context);
        eVarF.getClass();
        aVar.f231069h = eVarF;
        px.g gVarD = px.b.d(context);
        gVarD.getClass();
        aVar.f231068g = gVarD;
        k81.a aVarB = px.b.b(context);
        aVarB.getClass();
        aVar.i = aVarB;
        gx.c cVarA = px.b.a(context);
        cVarA.getClass();
        aVar.f231070j = cVarA;
        u00.d dVarE = px.b.e(context);
        dVarE.getClass();
        aVar.k = dVarE;
        nv.a aVarC = px.b.c(context);
        aVarC.getClass();
        aVar.f231071l = aVarC;
        return aVar;
    }
}

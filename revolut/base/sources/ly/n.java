package ly;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f200623a = new n();

    private n() {
    }

    @Override // ly.o
    public final my.a a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        oz.b bVar = new oz.b();
        l70.e eVarF = px.b.f(context);
        eVarF.getClass();
        bVar.f231076h = eVarF;
        px.g gVarD = px.b.d(context);
        gVarD.getClass();
        bVar.f231075g = gVarD;
        k81.a aVarB = px.b.b(context);
        aVarB.getClass();
        bVar.i = aVarB;
        gx.c cVarA = px.b.a(context);
        cVarA.getClass();
        bVar.f231077j = cVarA;
        u00.d dVarE = px.b.e(context);
        dVarE.getClass();
        bVar.k = dVarE;
        nv.a aVarC = px.b.c(context);
        aVarC.getClass();
        bVar.f231078l = aVarC;
        return bVar;
    }
}

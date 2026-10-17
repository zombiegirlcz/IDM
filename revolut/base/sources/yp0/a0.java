package yp0;

import android.content.Context;
import com.revolut.core.ui_kit_resources.R$attr;
import cs0.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a0 {
    public static final cs0.a a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iS = kli.a.q(context) ? kli.a.s(R$attr.uikit_colorWhite_10, context) : kli.a.s(R$attr.uikit_colorGrey50_10, context);
        a.d dVar = cs0.a.Companion;
        a.c cVar = new a.c();
        cs0.a aVar = cVar.f108423a;
        aVar.e = 0;
        aVar.d = iS;
        cVar.k(cs0.b.MASKED);
        cVar.d(cs0.d.LEFT_TO_RIGHT);
        cVar.f(1000L);
        aVar.o = 1;
        aVar.f108416m = true;
        return cVar.a();
    }

    public static final c9.e b() {
        c9.e eVarC = ((c9.b) ((c9.b) ((c9.b) ((c9.b) new c9.b().i(true)).k(1000L)).j(0.4f)).l(0.8f)).c();
        Intrinsics.checkNotNullExpressionValue(eVarC, "build(...)");
        return eVarC;
    }
}

package olf;

import cmf.g;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.y6;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function3 {
    public /* synthetic */ cmf.g u;
    public /* synthetic */ a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f226396w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(3, continuation);
        this.f226396w = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        m mVar = new m(this.f226396w, (Continuation) obj4);
        mVar.u = (cmf.g) obj2;
        mVar.v = (a3) obj3;
        return mVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        cmf.g gVar = this.u;
        a3 a3Var = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!(gVar instanceof cmf.h)) {
            if (Intrinsics.f(gVar, g.b.f25230a)) {
                return gVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        cmf.h hVar = (cmf.h) gVar;
        this.f226396w.getClass();
        Set set = k71.k.f181789a;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Image imageJ = (a3Var.e == y6.TAX && Intrinsics.f(a3Var.f272611s, "stamp_duty_over_loan")) ? LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_coins, new Color.Solid(R$attr.uikit_colorWhite), new Color.Solid(R$attr.uikit_colorLightGreen)) : null;
        if (imageJ == null) {
            imageJ = hVar.d;
        }
        return cmf.h.a(hVar, null, null, null, imageJ, null, false, false, null, null, null, 2039);
    }
}

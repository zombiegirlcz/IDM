package olf;

import cmf.g;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements Function3 {
    public /* synthetic */ cmf.g u;
    public /* synthetic */ a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kbb.c f226381w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kbb.c cVar, Continuation continuation) {
        super(3, continuation);
        this.f226381w = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a aVar = new a(this.f226381w, (Continuation) obj4);
        aVar.u = (cmf.g) obj2;
        aVar.v = (a3) obj3;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Image contactImage;
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
        kbb.c cVar = this.f226381w;
        cVar.getClass();
        tof.k kVar = a3Var.T0;
        if (kVar != null) {
            String str = kVar.f272870c;
            String str2 = kVar.f;
            if (str2 == null) {
                str2 = kVar.e;
            }
            contactImage = new ContactImage((String) null, (String) null, (String) null, str, (String) null, str2, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4055);
        } else {
            contactImage = null;
        }
        CircleBadgeModel circleBadgeModelC = ((bnf.j) cVar.d).c(null, r0.g(), a3Var, false);
        cmf.h hVar = (cmf.h) gVar;
        if (contactImage == null) {
            contactImage = hVar.d;
        }
        Image image = contactImage;
        if (circleBadgeModelC == null) {
            circleBadgeModelC = hVar.e;
        }
        return cmf.h.a(hVar, null, null, null, image, circleBadgeModelC, false, false, null, null, null, 2023);
    }
}

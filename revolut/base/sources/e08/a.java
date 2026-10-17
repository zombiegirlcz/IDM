package e08;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedGenderClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import dz7.l;
import efm.d0;
import fx7.f;
import hx7.p;
import ix7.x;
import java.util.List;
import jx7.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kx7.n0;
import kx7.y0;
import le.u1;
import pfm.m;
import ufm.i;
import uz7.r;
import wp5.y;
import zhm.u;
import zhm.v;
import zw7.s0;
import zw7.w;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f121457b;

    public /* synthetic */ a(c cVar, int i) {
        this.f121456a = i;
        this.f121457b = cVar;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f121456a;
        int i2 = 1;
        c cVar = this.f121457b;
        switch (i) {
            case 0:
                d action = (d) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                f fVar = cVar.f121459b;
                String quoteId = action.f121461a;
                w paymentFrequency = action.f121462b;
                Intrinsics.checkNotNullParameter(quoteId, "quoteId");
                Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
                y0 y0Var = (y0) fVar.f138760a;
                y0Var.getClass();
                Intrinsics.checkNotNullParameter(quoteId, "quoteId");
                Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
                d0<x> d0VarCreatePolicy = y0Var.f190501a.createPolicy(new e(y.u(y0Var.d, "toString(...)"), quoteId, u1.g(paymentFrequency, p.f156409c)));
                ksb.a aVar = new ksb.a(new n0(y0Var, 7), 20);
                d0VarCreatePolicy.getClass();
                i iVar = new i(d0VarCreatePolicy, aVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                pfm.a aVar2 = new pfm.a(te0.w.i0(iVar), new l(new a(cVar, i2), 15), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            default:
                s0 it8 = (s0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                uz7.a aVar3 = cVar.f121460c;
                String str = (String) ((r) ((uz7.p) aVar3).e).y0().get();
                uz7.p pVar = (uz7.p) aVar3;
                z zVar = (z) ((r) pVar.e).w0().get();
                pVar.d.getClass();
                m mVar = m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                pfm.a aVarV = ue0.e.v(mVar);
                g3l.a aVar4 = cVar.f121458a;
                TextLocalisedGenderClause textLocalisedGenderClause = new TextLocalisedGenderClause(zVar.b(), R$string.pets_onboarding_success_title_male, u.c(str));
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_onboarding_success_add_another_pet_button_title, null, null, 14);
                List listK = v.k(new ImageClause(R$drawable.uikit_icn_24_camera, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.pets_onboarding_success_set_pet_picture_button_title, null, null, 14));
                m70.a.t(t0.f186434a);
                return aVarV.e(aVar4.c0(new StatusViewConfiguration.Success("SUCCESS_STATUS_DIALOG_ID", textLocalisedGenderClause, null, null, new SuccessType.ResultAction(textLocalisedClause, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), 1916)));
        }
    }
}

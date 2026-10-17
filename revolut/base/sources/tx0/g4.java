package tx0;

import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import aw0.x8;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.ScrollerNavBarContentView;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.SecondaryDescription;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.edit.review.PetEditReviewChangesActivity;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreenContract$InputData;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oec.a;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g4 extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 26;
        int i2 = 11;
        int i3 = 10;
        Continuation continuation = null;
        switch (this.f) {
            case 0:
                x8 p0 = (x8) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ScrollerNavBarContentView scrollerNavBarContentView = (ScrollerNavBarContentView) this.receiver;
                ScrollerNavBarContentView.Companion aVar = ScrollerNavBarContentView.INSTANCE;
                scrollerNavBarContentView.b(p0);
                return Unit.f186387a;
            case 1:
                List p03 = (List) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((ihm.f) this.receiver).onNext(p03);
                return Unit.f186387a;
            case 2:
                int iIntValue = ((Number) obj2).intValue();
                PetEditReviewChangesActivity petEditReviewChangesActivity = (PetEditReviewChangesActivity) ((ty7.e) this.receiver);
                RecyclerView recyclerViewZ0 = petEditReviewChangesActivity.Z0();
                recyclerViewZ0.setPadding(recyclerViewZ0.getPaddingLeft(), recyclerViewZ0.getPaddingTop(), recyclerViewZ0.getPaddingRight(), iIntValue);
                petEditReviewChangesActivity.Z0().setClipToPadding(false);
                return Unit.f186387a;
            case 3:
                NaviCommand p010 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                return ((u2i.s) this.receiver).a(p010);
            case 4:
                zm3.a p011 = (zm3.a) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                return ((u3a.r) this.receiver).a(p011);
            case 5:
                zm3.a p012 = (zm3.a) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                return ((u3a.r) this.receiver).a(p012);
            case 6:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((Data) obj2);
            case 7:
                r9a.g p013 = (r9a.g) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar2 = (com.revolut.feature.pix.impl.flow.automatico.screens.details.a) this.receiver;
                aVar2.getClass();
                aVar2.l2(new u2i.g(aVar2, p013, continuation, 6), new yi5.b(i));
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar3 = (com.revolut.feature.pix.impl.flow.automatico.screens.details.a) this.receiver;
                aVar3.getClass();
                aVar3.X1(new nii.y0("ERROR_DIALOG_ID", new nii.z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4));
                return Boolean.FALSE;
            case 9:
                xx4.b p014 = (xx4.b) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                return (CreditPostTerminationPlanDetails) ((xx4.d) this.receiver).a(p014);
            case 10:
                wi0.b p015 = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                OccupationChooserScreenContract$InputData occupationChooserScreenContract$InputData = ((ubi.l) this.receiver).o;
                return !occupationChooserScreenContract$InputData.f97704c.isEmpty() ? occupationChooserScreenContract$InputData.f97704c : rbi.a.a(p015);
            case 11:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((SecondaryDescription) obj2);
            case 12:
                xda.u p016 = (xda.u) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                ((uda.a) this.receiver).getClass();
                return uda.a.a(p016);
            case 13:
                oec.a p017 = (oec.a) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                vkm.z1 z1Var = ((uec.e) this.receiver).f279339n;
                if (p017 instanceof oec.c) {
                    z1Var.k(new pec.j(((oec.c) p017).f224578a));
                } else if (p017 instanceof a.C1251a) {
                    z1Var.k(pec.g.f235366a);
                } else {
                    if (!(p017 instanceof oec.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                ((com.revolut.feature.apm.aani.impl.ui.c) this.receiver).K2();
                return Boolean.TRUE;
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                ((com.revolut.feature.apm.aani.impl.ui.c) this.receiver).K2();
                return Boolean.TRUE;
            case 16:
                ((TwinHorizontalButton) this.receiver).setPrimaryButtonVisible(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 17:
                ((TwinHorizontalButton) this.receiver).setPrimaryButtonEnabled(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 18:
                ((TwinHorizontalButton) this.receiver).setPrimaryButtonText((Clause) obj2);
                return Unit.f186387a;
            case 19:
                ((TwinHorizontalButton) this.receiver).setSecondaryButtonVisible(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 20:
                ((TwinHorizontalButton) this.receiver).setSecondaryButtonEnabled(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 21:
                ((TwinHorizontalButton) this.receiver).setSecondaryButtonText((Clause) obj2);
                return Unit.f186387a;
            case 22:
                Throwable p018 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                uo7.m mVar = (uo7.m) this.receiver;
                mVar.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.ERROR, null, "request failed", p018, null, 18);
                ServerError serverErrorA = mVar.f281584r.a(p018);
                Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                if (numValueOf != null && numValueOf.intValue() == 4519) {
                    yji.l.a1(mVar, mVar.X1(vl7.a.d(uo7.m.y2(R$string.car_insurance_car_search_not_in_db_title, ((uo7.e) mVar.t2()).f281572a), null, new TextLocalisedClause(R$string.car_insurance_no_matching_vehicle_primary_action_button_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_no_matching_vehicle_secondary_action_button_title, null, null, 14), 2)), null, null, new uf0.d(mVar, continuation, i), 3);
                } else if (numValueOf != null && numValueOf.intValue() == 4518) {
                    yji.l.a1(mVar, mVar.X1(vl7.a.a(10, uo7.m.y2(R$string.car_insurance_car_search_unsupported_vehicle_title, ((uo7.e) mVar.t2()).f281572a), null, new TextLocalisedClause(R$string.car_insurance_no_matching_vehicle_secondary_action_button_title, null, null, 14))), null, null, null, 7);
                } else {
                    Intrinsics.checkNotNullParameter(p018, "<this>");
                    if ((p018 instanceof HttpException) && ((HttpException) p018).code() == 404) {
                        yji.l.a1(mVar, mVar.X1(vl7.a.f(uo7.m.y2(R$string.car_insurance_car_search_not_found_title, ((uo7.e) mVar.t2()).f281572a), new TextLocalisedClause(R$string.car_insurance_car_search_not_found_subtitle, null, null, 14), new TextLocalisedClause(R$string.car_insurance_no_matching_vehicle_primary_action_button_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_no_matching_vehicle_secondary_action_button_title, null, null, 14))), null, null, new uo7.l(mVar, null), 3);
                    } else {
                        mVar.X1(vl7.a.a(15, null, null, null));
                    }
                }
                return Boolean.TRUE;
            case 23:
                h01.c p019 = (h01.c) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                ((up0.d0) this.receiver).c(p019);
                return Unit.f186387a;
            case 24:
                eq5.q p020 = (eq5.q) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                up5.a0 a0Var = (up5.a0) this.receiver;
                efm.d0 d0VarFirstOrError = te0.w.l(a0Var.A3(), te0.w.a0(a0Var.f281865w, new up5.h(22))).firstOrError();
                up5.j jVar = new up5.j(new uif.d(p020, a0Var, i2), 20);
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, jVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b.I2((com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) this.receiver);
                return Boolean.TRUE;
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b.I2((com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) this.receiver);
                return Boolean.TRUE;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                uv1.d0 d0Var = (uv1.d0) this.receiver;
                d0Var.A.getClass();
                d0Var.X1(sv1.d.a());
                return Boolean.TRUE;
            case 28:
                ms0.h3 p021 = (ms0.h3) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ux0.w0 w0Var = (ux0.w0) this.receiver;
                ux0.b1 b1Var = w0Var.k;
                ActionsView actionsView = w0Var.f;
                boolean z = b1Var instanceof b;
                actionsView.setVisibility((!z || ((b) b1Var).a() <= 0) ? 8 : 0);
                w0Var.f283832g.setVisibility(8);
                if (p021 instanceof ms0.d3) {
                    OneShotPreDrawListener oneShotPreDrawListener = w0Var.o;
                    if (oneShotPreDrawListener != null) {
                        oneShotPreDrawListener.removeListener();
                    }
                    w0Var.o = null;
                    w0Var.f283837n = null;
                    actionsView.g();
                    if (((ms0.d3) p021).f208225b != null) {
                        ProductIntroView productIntroView = w0Var.f283831b;
                        ms0.s2 s2Var = productIntroView.v;
                        if (s2Var == null) {
                            Intrinsics.r("currentVariant");
                            throw null;
                        }
                        lal.a aVarI0 = productIntroView.i0(s2Var, productIntroView.f56311w);
                        ((ix0.h2) aVarI0.d).d(false);
                        ((ix0.h2) aVarI0.f193427c).d(true);
                        ((ix0.h2) aVarI0.e).d(false);
                    }
                } else if (p021 instanceof ms0.f3) {
                    if (z) {
                        actionsView.m(((b) b1Var).a(), false);
                    }
                } else if (p021 instanceof ms0.g3) {
                    ms0.g3 g3Var = (ms0.g3) p021;
                    if (g3Var.f208262c) {
                        ux0.b1 b1Var2 = w0Var.k;
                        if (b1Var2 instanceof ux0.x0) {
                            ux0.x0 x0Var = (ux0.x0) b1Var2;
                            List list = x0Var.f283842b;
                            List list2 = x0Var.f283843c;
                            ms0.o2 o2Var = g3Var.f208260a;
                            ms0.r2 story = g3Var.f208261b;
                            o2Var.getClass();
                            Intrinsics.checkNotNullParameter(story, "story");
                            Set set = ((NavBarProductIntro$StoryV1) list2.get(o2Var.f208351a.indexOf(story))).d;
                            List<ActionsView.Item> list3 = list;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                            for (ActionsView.Item itemE : list3) {
                                if (!set.contains(itemE.f58316a)) {
                                    ms0.e4 e4Var = itemE.d;
                                    ms0.e4 e4Var2 = ms0.e4.DisabledNonClickable;
                                    if (e4Var != e4Var2) {
                                        itemE = ActionsView.Item.e(itemE, null, e4Var2, 32759);
                                    }
                                }
                                arrayList.add(itemE);
                            }
                            actionsView.j(zhm.u.c(arrayList), false);
                            mx0.p moreActionState = actionsView.getMoreActionState();
                            mx0.p pVarA = mx0.p.a(moreActionState, null, set.contains(moreActionState.f209895a) ? ms0.e4.EnabledClickable : ms0.e4.DisabledNonClickable, 11);
                            if (!Intrinsics.f(actionsView.getMoreActionState(), pVarA)) {
                                actionsView.moreActionState = pVarA;
                                actionsView.f();
                            }
                            OneShotPreDrawListener oneShotPreDrawListener2 = w0Var.o;
                            if (oneShotPreDrawListener2 != null) {
                                oneShotPreDrawListener2.removeListener();
                            }
                            w0Var.o = OneShotPreDrawListener.add(actionsView, new et0.w(actionsView, i3, w0Var, set));
                        }
                    }
                } else if (!(p021 instanceof ms0.e3) && !(p021 instanceof ms0.c3)) {
                    throw new NoWhenBranchMatchedException();
                }
                w0Var.i0();
                return Unit.f186387a;
            default:
                List p022 = (List) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                ((ux7.d) this.receiver).setItems(p022);
                return Unit.f186387a;
        }
    }
}

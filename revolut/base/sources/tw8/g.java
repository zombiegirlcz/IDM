package tw8;

import aw0.o9;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.a0;
import com.revolut.core.ui_kit.views.navbar.x;
import com.revolut.core.ui_kit.views.navbar.z;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlowContract$Step;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import od0.i;
import tx0.d1;
import tx0.w;
import tzd.p;
import u1a.k;
import u2i.j;
import u37.m;
import u37.v;
import u4e.n;
import zhm.f0;
import zw7.r;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274951a;

    public /* synthetic */ g(int i) {
        this.f274951a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f274951a) {
            case 0:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                OnDemandFeatureInstallFlowContract$Step step = (OnDemandFeatureInstallFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, OnDemandFeatureInstallFlowContract$Step.Intro.f77841a)) {
                    return new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.kyc_on_demand_feature_intro_title, null, null, 14), new TextLocalisedClause(R$string.kyc_on_demand_feature_intro_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D362", null, null, null, 30), null, null, null, null, null, null, null, null, null, null, null, 65496));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                Throwable error = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 2:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof w);
            case 3:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof d1);
            case 4:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof x);
            case 5:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof z);
            case 6:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 7:
                Boolean isQvikEnabled = (Boolean) obj2;
                Boolean isQvikSecondaryIdEnabled = (Boolean) data;
                Intrinsics.checkNotNullParameter(isQvikEnabled, "isQvikEnabled");
                Intrinsics.checkNotNullParameter(isQvikSecondaryIdEnabled, "isQvikSecondaryIdEnabled");
                return Boolean.valueOf(isQvikEnabled.booleanValue() || isQvikSecondaryIdEnabled.booleanValue());
            case 8:
                Function1 defaultErrorItem = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return (List) defaultErrorItem.invoke(new iii.d(14, null, false, false, null));
            case 9:
                Throwable error2 = (Throwable) obj2;
                r rVar = (r) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (rVar != null) {
                    return error2;
                }
                return null;
            case 10:
                Throwable error3 = (Throwable) obj2;
                Pair pair = (Pair) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (pair == null) {
                    return error3;
                }
                return null;
            case 11:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 12:
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                return Unit.f186387a;
            case 13:
                Throwable error4 = (Throwable) obj2;
                p pVar = (p) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (pVar == null) {
                    return error4;
                }
                return null;
            case 14:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 15:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14);
                m70.a.c(t0.f186434a);
                return new k(new ProfileCardModel.Error(textLocalisedClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new a0(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_action, null, null, 14), null, null, 14)), (List) null, 6);
            case 16:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 18:
                Throwable error5 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list2 == null) {
                    return error5;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new u2a.e(iii.c.b(null, null, 6, false), null);
            case 20:
                Function1 defaultErrorItemsProvider = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return new u2e.h((List) defaultErrorItemsProvider.invoke(new iii.d(8, null, true, true, "STORE_BRAND_DETAIL_MSI_ERROR_STATE_ID")));
            case 21:
                Throwable error6 = (Throwable) obj2;
                i iVar = (i) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (iVar == null) {
                    return error6;
                }
                return null;
            case 22:
                Throwable error7 = (Throwable) obj2;
                j jVar = (j) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (jVar == null) {
                    return error7;
                }
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 24:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 25:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new m(v.a(), (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null)));
            case 26:
                Function1 defaultError = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultError, "defaultError");
                return (List) defaultError.invoke(new iii.d(12, null, false, true, null));
            case 27:
                Throwable th10 = (Throwable) obj2;
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new u3c.h(false, th10 == null ? f0.f322471a : (List) getDefaultErrorItems5.invoke(new iii.d(8, null, true, true, "ERROR_USER_CART_LIST_ID")));
            case 28:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            default:
                n.a aVar = n.Companion;
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f274951a = i;
    }
}

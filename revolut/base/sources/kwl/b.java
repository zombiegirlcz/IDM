package kwl;

import android.os.Handler;
import android.os.Parcelable;
import aw0.o9;
import com.orhanobut.dialogplus.DialogPlus;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorParams;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.onboarding.api.verify_account.flow.VerifyAccountPromptDestination;
import com.revolut.feature.onboarding.api.verify_account.flow.VerifyAccountPromptFlowInputData;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.operation_status.screen.OperationStatusFlowContract$Configuration;
import com.revolut.revolut.feature_fourthline_impl.R;
import cwl.g;
import e9b.c;
import e9b.d;
import e9b.f;
import grl.k9;
import io3.i;
import io3.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l3l.e;
import nii.t0;
import nii.y;
import nii.y0;
import nii.z;
import sri.m;
import szl.b;
import u80.j;
import u80.k;
import wsg.n;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w49.a f190372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f190373b;

    public b(w49.a commandView, n walletInteractor) {
        Intrinsics.checkNotNullParameter(commandView, "commandView");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f190372a = commandView;
        this.f190373b = walletInteractor;
    }

    public final boolean a(f event) {
        String string;
        TextClause textClause;
        String k;
        String f51375j;
        String i;
        String f51374h;
        String f51373g;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zEquals = event.equals(e9b.a.f123938a);
        w49.a aVar = this.f190372a;
        if (zEquals) {
            g gVar = (g) aVar;
            gVar.getClass();
            k9 k9Var = k9.Onboarding;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            FeatureCommand featureCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new VerifyAccountPromptDestination(new VerifyAccountPromptFlowInputData(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var))), false, (Integer) null, 335577088, 45));
            m mVarA = gVar.a();
            if (mVarA != null) {
                mVarA.c(featureCommand);
                return true;
            }
        } else if (event instanceof e9b.b) {
            ServerError serverError = ((e9b.b) event).a();
            g gVar2 = (g) aVar;
            gVar2.getClass();
            Intrinsics.checkNotNullParameter(serverError, "serverError");
            ServerErrorParams f51364c = serverError.getF51364c();
            String f51375j2 = f51364c != null ? f51364c.getF51375j() : null;
            NaviCommand naviCommandC = (f51375j2 == null || f51375j2.length() == 0) ? com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP))) : new FinishCommand(null, null, null, 7);
            m mVarA2 = gVar2.a();
            if (mVarA2 != null) {
                e.Companion.getClass();
                ExplicitActivityDestination explicitActivityDestinationA = l3l.a.a();
                OperationStatusFlowContract$Configuration.Companion aVar2 = OperationStatusFlowContract$Configuration.INSTANCE;
                ServerErrorParams f51364c2 = serverError.getF51364c();
                Clause textLocalisedClause = (f51364c2 == null || (f51373g = f51364c2.getF51373g()) == null) ? new TextLocalisedClause(R$string.sow_home_info_section_v2_initial_limited_title, null, null, 14) : new TextClause(f51373g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                ServerErrorParams f51364c3 = serverError.getF51364c();
                if (f51364c3 == null || (f51374h = f51364c3.getF51374h()) == null) {
                    String f51363b = serverError.getF51363b();
                    szl.b.Companion.getClass();
                    b.a.a();
                    Unit unit = Unit.f186387a;
                    if (f51363b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    textClause = new TextClause(f51363b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                } else {
                    textClause = new TextClause(f51374h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                ServerErrorParams f51364c4 = serverError.getF51364c();
                Clause textLocalisedClause2 = (f51364c4 == null || (i = f51364c4.getI()) == null) ? new TextLocalisedClause(R.string.common_action_review, null, null, 14) : new TextClause(i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                ServerErrorParams f51364c5 = serverError.getF51364c();
                String strL = (f51364c5 == null || (f51375j = f51364c5.getF51375j()) == null) ? null : m70.a.l(f51375j);
                ServerErrorParams f51364c6 = serverError.getF51364c();
                mVarA2.c(new ActivityNavigateCommand(explicitActivityDestinationA, OperationStatusFlowContract$Configuration.Companion.a(aVar2, textLocalisedClause, textClause, textLocalisedClause2, naviCommandC, strL, (f51364c6 == null || (k = f51364c6.getK()) == null) ? com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D029", null, null, null, 30) : new UrlImage(k, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)), null, null, 0, null, null, null, null, false, 1020));
                return true;
            }
        } else {
            boolean z = false;
            if (!(event instanceof c)) {
                if (event.equals(d.f123942a)) {
                    return false;
                }
                if (!(event instanceof e9b.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                e9b.e eVar = (e9b.e) event;
                final Clause title = eVar.d();
                final Clause clauseA = eVar.a();
                final String strC = eVar.c();
                final Integer numB = eVar.b();
                final g gVar3 = (g) aVar;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                final String str = "RetailServerErrorHandler.showErrorMessage";
                Intrinsics.checkNotNullParameter("RetailServerErrorHandler.showErrorMessage", "dialogBreadcrumb");
                final Clause clause = null;
                ((Handler) gVar3.i.getValue()).post(new Runnable() { // from class: cwl.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        g gVar4 = gVar3;
                        t0 t0Var = gVar4.f109870j;
                        if (t0Var == null) {
                            BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) gVar4.f109869h.get();
                            if (baseDelegatesActivity != null) {
                                t0 t0Var2 = new t0(baseDelegatesActivity);
                                gVar4.f109870j = t0Var2;
                                t0Var = t0Var2;
                            } else {
                                t0Var = null;
                            }
                        }
                        if (t0Var != null) {
                            t0Var.h(new y0(null, new z(title, clause, clauseA, null, null, null, false, null, null, null, null, new y(strC, numB), str, 8180), false, 5));
                        }
                    }
                });
                return true;
            }
            c cVar = (c) event;
            AccountId.Personal personal = AccountId.Personal.f51414a;
            n nVar = this.f190373b;
            xi0.b bVarA = nVar.D(personal).a();
            List listH = osg.b.h(nVar, l.CURRENT, i.INTERNAL, 26);
            if (!(listH instanceof Collection) || !listH.isEmpty()) {
                Iterator it8 = listH.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    io3.d dVar = (io3.d) it8.next();
                    if (!Intrinsics.f(dVar.getCurrency(), bVarA.f306286a) && dVar.d() > 0) {
                        z = true;
                        break;
                    }
                }
            }
            dj0.d notEnough = cVar.a();
            isi.a source = cVar.b();
            g gVar4 = (g) aVar;
            t70.g gVar5 = gVar4.d;
            Intrinsics.checkNotNullParameter(notEnough, "notEnough");
            Intrinsics.checkNotNullParameter(source, "source");
            BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) gVar4.f109869h.get();
            if (baseDelegatesActivity != null) {
                int i2 = cwl.d.f109858a[source.ordinal()];
                if (i2 == 1) {
                    j jVar = k.Companion;
                    qd0.b bVar = gVar4.f;
                    jVar.getClass();
                    k kVarA = j.a(bVar);
                    kVarA.v(notEnough);
                    kVarA.e();
                    StringBuilder sb6 = new StringBuilder(gVar5.i(R.string.card_delivery_lacking_amount_error, kVarA.a()));
                    sb6.append("\n\n");
                    if (z) {
                        sb6.append(gVar5.i(R.string.common_error_lacking_amount_top_up_or_exchange, notEnough.f115083b));
                    } else {
                        sb6.append(gVar5.i(R.string.common_error_lacking_amount_top_up, notEnough.f115083b));
                    }
                    string = sb6.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = gVar5.getString(R.string.insufficient_funds_alert_message);
                }
                DialogPlus dialogPlusA = x2l.c.a(baseDelegatesActivity, gVar5.i(R.string.insufficient_funds_alert_title, notEnough.f115083b.f306286a), string, z, new cwl.f(gVar4, notEnough));
                Intrinsics.checkNotNullExpressionValue(dialogPlusA, "newInstance(...)");
                ((Handler) gVar4.i.getValue()).postDelayed(new a0.a(dialogPlusA, 20), 50L);
                return true;
            }
        }
        return true;
    }
}

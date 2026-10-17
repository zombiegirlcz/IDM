package epc;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import gim.i;
import grl.k9;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.h0;
import nii.j0;
import nii.u1;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ TransferSubjectId A;
    public final /* synthetic */ dj0.d B;
    public dj0.d u;
    public TradingAccount.Robo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public nmc.a f128148w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f128149x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f128150y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, TransferSubjectId transferSubjectId, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.z = hVar;
        this.A = transferSubjectId;
        this.B = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.z, this.A, this.B, continuation);
        fVar.f128150y = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((TradingAccount.Robo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Clause textClause;
        Object objZ;
        TradingAccount.Robo robo;
        nmc.a aVar;
        dj0.d dVar;
        Object next;
        TradingAccount.Robo robo2 = (TradingAccount.Robo) this.f128150y;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f128149x;
        h hVar = this.z;
        if (i == 0) {
            o.b(obj2);
            if (robo2 == null) {
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                hVar.getClass();
                k9 k9Var = k9.RoboAdvisor;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new j0(textClause, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4030);
            }
            nmc.a aVar3 = hVar.f128155c;
            String f95657a = this.A.getF95657a();
            this.f128150y = null;
            dj0.d dVar2 = this.B;
            this.u = dVar2;
            this.v = robo2;
            this.f128148w = aVar3;
            this.f128149x = 1;
            objZ = q.z(mo3.a.g(glc.a.a(hVar.f128154b, f95657a), null, null, 3), this);
            if (objZ == aVar2) {
                return aVar2;
            }
            robo = robo2;
            aVar = aVar3;
            dVar = dVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.f128148w;
            robo = this.v;
            dVar = this.u;
            o.b(obj2);
            objZ = obj2;
        }
        RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) objZ;
        if (roboPortfolioInfo == null) {
            throw new IllegalStateException("portfolio not found but mapRecurringDepositCreateSuccessDialog called");
        }
        Iterator it8 = robo.c0().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (com.revolut.shared.feature.wealth.models.trading_accounts.e.a((TradingProduct) next)) {
                break;
            }
        }
        TradingProduct tradingProduct = (TradingProduct) next;
        textClause = aVar.b(roboPortfolioInfo, dVar, tradingProduct != null ? tradingProduct.f105281b : null);
        hVar.getClass();
        k9 k9Var2 = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        return new j0(textClause, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4030);
    }
}

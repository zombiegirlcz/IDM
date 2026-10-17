package com.onfido.android.sdk.capture.ui.userconsent;

import ck7.j;
import com.google.android.gms.tasks.OnSuccessListener;
import com.onfido.api.client.data.ErrorData;
import com.onfido.api.client.exception.GeoblockedException;
import com.onfido.api.client.exception.HttpParsedException;
import com.onfido.api.client.exception.RequestEntityTooLargeException;
import com.onfido.api.client.exception.TokenExpiredException;
import com.onfido.api.client.n;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.ChallengesOverviewDetailsScreen;
import com.revolut.feature.transfer.core.impl.ui.additional_information.AdditionalInformationScreen;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance.DocumentAcceptanceScreen;
import com.revolut.network.NetworkChangedReceiver;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsActivity;
import cqf.h;
import csj.i;
import csk.k;
import efm.h0;
import efm.w;
import fgm.q;
import igm.o;
import io.reactivex.rxjava3.core.Single;
import kfm.g;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import retrofit2.HttpException;
import zp0.x;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements q, o, g, kfm.o, p, OnSuccessListener, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50095b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f50094a = i;
        this.f50095b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f50094a;
        Object obj3 = this.f50095b;
        switch (i) {
            case 2:
                ((com.revolut.feature.restricted_access.d) obj3).invoke(obj2);
                break;
            case 3:
                ((com.revolut.feature.restricted_access.d) obj3).invoke(obj2);
                break;
            case 4:
                ((com.revolut.network.a) obj3).invoke(obj2);
                break;
            case 5:
                ((com.revolut.feature.alipay_plus.mpm.webcontainer.a) obj3).invoke(obj2);
                break;
            case 10:
                ((cp0.a) obj3).invoke(obj2);
                break;
            case 11:
                ((cp0.a) obj3).invoke(obj2);
                break;
            case 12:
                ((cp0.a) obj3).invoke(obj2);
                break;
            case 22:
                BottomExpandableDialogView.Companion aVar = BottomExpandableDialogView.INSTANCE;
                ((cr0.d) obj3).invoke(obj2);
                break;
            default:
                ((k) obj3).invoke(obj2);
                break;
        }
    }

    @Override // igm.o
    public Object apply(Object p0) {
        int i = this.f50094a;
        Object obj2 = this.f50095b;
        switch (i) {
            case 1:
                n nVar = (n) obj2;
                Throwable requestEntityTooLargeException = (Throwable) p0;
                if (requestEntityTooLargeException instanceof HttpException) {
                    HttpException httpException = (HttpException) requestEntityTooLargeException;
                    ErrorData errorDataA = nVar.f50140a.a(httpException.response());
                    requestEntityTooLargeException = (errorDataA == null || errorDataA.getError() == null || !("expired_token".equals(errorDataA.getError().getType()) || "authorization_error".equals(errorDataA.getError().getType()))) ? (errorDataA == null || errorDataA.getError() == null || httpException.code() != 403 || !errorDataA.getError().getType().equals("geoblocked_request")) ? (httpException.code() == 413 && httpException.message().equals("Request Entity Too Large")) ? new RequestEntityTooLargeException() : new HttpParsedException(errorDataA) : new GeoblockedException() : new TokenExpiredException();
                }
                return Single.e(requestEntityTooLargeException);
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17:
            case 18:
            case 20:
            case 22:
            case 23:
            case 27:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((csl.a) obj2).invoke(p0);
            case 6:
                return NetworkChangedReceiver.runLocationUpdatesIfNeeded$lambda$1((cma.b) obj2, p0);
            case 7:
                return NetworkChangedReceiver.runLocationUpdatesIfNeeded$lambda$3((com.revolut.feature.alipay_plus.mpm.webcontainer.a) obj2, p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((com.revolut.feature.alipay_plus.mpm.webcontainer.a) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((com.revolut.feature.alipay_plus.mpm.webcontainer.a) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((com.revolut.feature.alipay_plus.mpm.webcontainer.a) obj2).invoke(p0);
            case 19:
                int i2 = ChallengesOverviewDetailsScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.revolut.feature.alipay_plus.mpm.webcontainer.a) obj2).invoke(p0);
                return cq8.d.f108026a;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (cqi.g) ((com.revolut.feature.alipay_plus.mpm.webcontainer.a) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((csj.p) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((csj.p) obj2).invoke(p0);
            case 26:
                KProperty[] kPropertyArr = StockFinancialsStatementsActivity.A0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (esk.b) ((cs.a) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (esk.b) ((cs.a) obj2).invoke(p0);
        }
    }

    @Override // fgm.q
    public void c(tgm.a aVar) {
        UserConsentRepository.getUserConsentPage$lambda$0((UserConsentRepository) this.f50095b, aVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.x
    public void e(String str, String text, String str2, boolean z) {
        AdditionalInformationScreen additionalInformationScreen = (AdditionalInformationScreen) this.f50095b;
        KProperty[] kPropertyArr = AdditionalInformationScreen.f92183b0;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(text, "extractedValue");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        h hVar = (h) additionalInformationScreen.f92184a0.getValue();
        hVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        hVar.l2(new j(hVar, text, null, 14), new yi5.b(26));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f50094a) {
            case 17:
                ((cq.c) this.f50095b).invoke(obj2);
                break;
            default:
                ((cq.c) this.f50095b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f50094a;
        com.revolut.feature.alipay_plus.mpm.webcontainer.a aVar = (com.revolut.feature.alipay_plus.mpm.webcontainer.a) this.f50095b;
        switch (i) {
            case 8:
                break;
            case 9:
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                KProperty[] kPropertyArr = DocumentAcceptanceScreen.i0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }
}

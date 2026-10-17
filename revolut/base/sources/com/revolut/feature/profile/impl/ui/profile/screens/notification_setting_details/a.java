package com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details;

import cli.y;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.api.notifications.CreditCollectionNotificationSettingsValidationException;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings;
import com.revolut.feature.profile.impl.R$string;
import e31.i;
import eub.k;
import fgj.g;
import fk4.r;
import foa.b;
import foa.c;
import foa.f;
import foa.j;
import foa.w;
import foa.z;
import hx7.e;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import oki.h;
import vkm.j2;
import yji.l;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements c {
    public final NotificationSettingDetailsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f81468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mre.c f81469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r10.w f81470r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r10.a f81471s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f81472t;
    public final l61.a u;
    public final y08.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f81473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f81474x;

    public a(NotificationSettingDetailsContract$InputData inputData, b stateMapper, w errorHandler, mre.c termsNavigationFactory, r10.w interactor, r10.a marketAlertSettingsInteractor, k revPointsPersonalisationAvailabilityInteractor, l61.a userCompanyInteractor, gte.a toggleInteractor, y08.a compliancePopupModelExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(marketAlertSettingsInteractor, "marketAlertSettingsInteractor");
        Intrinsics.checkNotNullParameter(revPointsPersonalisationAvailabilityInteractor, "revPointsPersonalisationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(toggleInteractor, "toggleInteractor");
        Intrinsics.checkNotNullParameter(compliancePopupModelExtension, "compliancePopupModelExtension");
        this.o = inputData;
        this.f81468p = errorHandler;
        this.f81469q = termsNavigationFactory;
        this.f81470r = interactor;
        this.f81471s = marketAlertSettingsInteractor;
        this.f81472t = revPointsPersonalisationAvailabilityInteractor;
        this.u = userCompanyInteractor;
        this.v = compliancePopupModelExtension;
        d dVar = (d) toggleInteractor;
        this.f81473w = mra.d.b(this, new foa.a(inputData.f81460a, null, null, dVar.c(ChatApi$Toggles.MoneyAssistant.f50984c), dVar.c(ChatApi$Toggles.AssistantBranding.f50967c)), stateMapper, null, false, 12);
        this.f81474x = e.a(this, new g(this, 19));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f81474x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        boolean zC;
        Flow gVar;
        a59.b type = ifk.b.G(this.o.f81460a.f81462a);
        Continuation continuation = null;
        if (type != null) {
            r10.a aVar = this.f81471s;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            int i = f59.a.f132287a[type.ordinal()];
            if (i == 1) {
                zC = true;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zC = ((d) ((gte.a) aVar.f250812b)).c(InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings.f76418c);
            }
            if (zC) {
                h59.c cVar = (h59.c) aVar.f250811a;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                gVar = nim.a.v(cVar.d.b(Unit.f186387a, loadingStrategy), new f0m.c(type, 9));
            } else {
                gVar = new go.g(new Data(null, null, false, 7, null), 2);
            }
            l.b1(this, mo3.a.g(gVar, null, new r(26), 1), null, new j(this, continuation, 0), 3);
        }
        l.b1(this, mo3.a.g(rd0.e.b(hng.g.b(((ang.b) this.u).f7765a)), null, new r(27), 1), null, new j(this, continuation, 1), 3);
        n2(new f(this, continuation, 1), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f81473w;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        z notificationType = ((foa.a) ((j2) this.f81473w.f22677a).getValue()).f136860a.f81462a;
        w wVar = this.f81468p;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(notificationType, "notificationType");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (notificationType != z.CREDIT_COLLECTION || !(throwable instanceof CreditCollectionNotificationSettingsValidationException)) {
            return false;
        }
        n.j2(wVar, wVar.L2(new y0(null, new nii.z(new TextLocalisedClause(R$string.profile_notification_settings_credit_collection_validation_error_title, null, null, 14), new TextLocalisedClause(R$string.profile_notification_settings_credit_collection_validation_error_description, null, null, 14), new TextLocalisedClause(R$string.profile_notification_settings_credit_collection_validation_error_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, new i(2, 11, null), 3);
        return true;
    }
}

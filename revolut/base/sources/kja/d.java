package kja;

import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions.UnrecognisedContractException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import nii.y;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kvh.h f184347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yp.b f184348m;

    public d(kvh.h serverErrorHelper, yp.b appStoreNavigationFactory) {
        Intrinsics.checkNotNullParameter(serverErrorHelper, "serverErrorHelper");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        this.f184347l = serverErrorHelper;
        this.f184348m = appStoreNavigationFactory;
    }

    public static boolean b3(Throwable th10) {
        Throwable cause = th10.getCause();
        if (cause == null) {
            return false;
        }
        if (cause instanceof UnrecognisedContractException) {
            return true;
        }
        return b3(cause);
    }

    @Override // kja.b
    public final void Z2(Throwable error, Function0 retryAction, g unauthorizedAction, k8e.a dismissAction) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(retryAction, "retryAction");
        Intrinsics.checkNotNullParameter(unauthorizedAction, "unauthorizedAction");
        Intrinsics.checkNotNullParameter(dismissAction, "dismissAction");
        kvh.h hVar = this.f184347l;
        if (hVar.a(error)) {
            unauthorizedAction.invoke();
            return;
        }
        if ((error instanceof UnrecognisedContractException) || b3(error)) {
            kvh.g.c(kvh.h.Companion, "Handled an unexpected product lifecycle response", error, null, 12);
            c3(retryAction, dismissAction);
        } else {
            if (error instanceof HandledNetworkException) {
                return;
            }
            TextLocalisedClause textLocalisedClauseB = hVar.b(error);
            if (textLocalisedClauseB == null) {
                c3(retryAction, dismissAction);
                return;
            }
            yji.n.j2(this, L2(new y0("ERROR_DIALOG_ID", new z(textLocalisedClauseB, null, new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, new y(2, com.google.android.gms.internal.mlkit_vision_face.a.o(o0.f186429a.b(error.getClass()).m(), ": ", error.getMessage()), null), null, 24310), false, 4)), null, new im9.h(retryAction, dismissAction, (Continuation) null, 15), 3);
        }
    }

    public final void c3(Function0 function0, k8e.a aVar) {
        yji.n.j2(this, L2(new y0("UPDATE_APP_DIALOG_ID", new z(new TextLocalisedClause(R$string.product_eligibility_status_error_or_app_update_title, null, null, 14), new TextLocalisedClause(R$string.product_eligibility_status_error_or_app_update_description, null, null, 14), new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), new TextLocalisedClause(R$string.product_eligibility_status_app_update_button, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 4)), null, new a9h.a(function0, this, aVar, (Continuation) null, 15), 3);
    }
}

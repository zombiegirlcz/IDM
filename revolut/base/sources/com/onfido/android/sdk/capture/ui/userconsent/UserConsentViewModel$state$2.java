package com.onfido.android.sdk.capture.ui.userconsent;

import com.onfido.android.sdk.capture.ui.userconsent.UserConsentViewModel;
import com.onfido.android.sdk.capture.utils.OnfidoConfigExtensionsKt;
import igm.i;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$ViewState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class UserConsentViewModel$state$2 extends u implements Function0<Observable> {
    final /* synthetic */ UserConsentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserConsentViewModel$state$2(UserConsentViewModel userConsentViewModel) {
        super(0);
        this.this$0 = userConsentViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Observable invoke() {
        BehaviorSubject behaviorSubject = this.this$0.isLoading;
        BehaviorSubject behaviorSubject2 = this.this$0.userConsentPage;
        BehaviorSubject behaviorSubject3 = this.this$0.errorMessage;
        Observable uiEvents = this.this$0.uiEventsManager.getUiEvents();
        final UserConsentViewModel userConsentViewModel = this.this$0;
        Observable observableDistinctUntilChanged = Observable.combineLatest(behaviorSubject, behaviorSubject2, behaviorSubject3, uiEvents, new i() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentViewModel$state$2.1
            @Override // igm.i
            @NotNull
            public final UserConsentViewModel.ViewState apply(UserConsentViewModel.LoadingState loadingState, String str, String str2, @NotNull List<? extends UserConsentViewModel.UserConsentUIEvent> uiEvents2) {
                Intrinsics.checkNotNullParameter(uiEvents2, "uiEvents");
                Intrinsics.h(loadingState);
                return new UserConsentViewModel.ViewState(loadingState, !d0.W(str) ? str : null, !d0.W(str2) ? str2 : null, uiEvents2, userConsentViewModel.remoteConfig.isStudioUserFlowExitEnabled() && OnfidoConfigExtensionsKt.inWorkflowMode(userConsentViewModel.onfidoConfig));
            }
        }).distinctUntilChanged();
        this.this$0.loadUserConsentPage();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "also(...)");
        return observableDistinctUntilChanged;
    }
}

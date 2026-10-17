package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission;

import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState;", "kotlin.jvm.PlatformType", "invoke", "()Lio/reactivex/rxjava3/core/Observable;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class PoaDocumentSubmissionViewModel$viewState$2 extends u implements Function0<Observable> {
    final /* synthetic */ PoaDocumentSubmissionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoaDocumentSubmissionViewModel$viewState$2(PoaDocumentSubmissionViewModel poaDocumentSubmissionViewModel) {
        super(0);
        this.this$0 = poaDocumentSubmissionViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Observable invoke() {
        return this.this$0.uploadResultSubject.distinctUntilChanged();
    }
}

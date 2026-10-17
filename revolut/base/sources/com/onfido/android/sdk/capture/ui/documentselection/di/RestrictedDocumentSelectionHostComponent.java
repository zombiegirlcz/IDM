package com.onfido.android.sdk.capture.ui.documentselection.di;

import com.onfido.android.sdk.capture.common.di.FragmentScope;
import com.onfido.android.sdk.capture.ui.documentselection.DocumentTypeSelectionFragment;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@FragmentScope
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/di/RestrictedDocumentSelectionHostComponent;", "", "inject", "", "fragment", "Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentTypeSelectionFragment;", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment;", "Factory", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RestrictedDocumentSelectionHostComponent {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/di/RestrictedDocumentSelectionHostComponent$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/ui/documentselection/di/RestrictedDocumentSelectionHostComponent;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        RestrictedDocumentSelectionHostComponent create();
    }

    void inject(@NotNull DocumentTypeSelectionFragment fragment);

    void inject(@NotNull DocumentSelectionHostFragment fragment);
}

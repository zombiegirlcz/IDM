package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission;

import com.onfido.android.sdk.capture.ui.proofOfAddress.PoaUtils;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaDocumentSubmissionFragment_MembersInjector implements MembersInjector {
    private final Provider imageUtilsProvider;
    private final Provider poaUtilsProvider;
    private final Provider poaViewModelFactoryProvider;

    public PoaDocumentSubmissionFragment_MembersInjector(Provider provider, Provider provider2, Provider provider3) {
        this.imageUtilsProvider = provider;
        this.poaViewModelFactoryProvider = provider2;
        this.poaUtilsProvider = provider3;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3) {
        return new PoaDocumentSubmissionFragment_MembersInjector(provider, provider2, provider3);
    }

    public static void injectImageUtils(PoaDocumentSubmissionFragment poaDocumentSubmissionFragment, ImageUtils imageUtils) {
        poaDocumentSubmissionFragment.imageUtils = imageUtils;
    }

    public static void injectPoaUtils(PoaDocumentSubmissionFragment poaDocumentSubmissionFragment, PoaUtils poaUtils) {
        poaDocumentSubmissionFragment.poaUtils = poaUtils;
    }

    public static void injectPoaViewModelFactory(PoaDocumentSubmissionFragment poaDocumentSubmissionFragment, Provider provider) {
        poaDocumentSubmissionFragment.poaViewModelFactory = provider;
    }

    public void injectMembers(PoaDocumentSubmissionFragment poaDocumentSubmissionFragment) {
        injectImageUtils(poaDocumentSubmissionFragment, (ImageUtils) this.imageUtilsProvider.get());
        injectPoaViewModelFactory(poaDocumentSubmissionFragment, this.poaViewModelFactoryProvider);
        injectPoaUtils(poaDocumentSubmissionFragment, (PoaUtils) this.poaUtilsProvider.get());
    }
}

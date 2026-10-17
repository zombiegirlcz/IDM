package com.onfido.android.sdk.capture.ui.proofOfAddress.host;

import androidx.lifecycle.SavedStateHandle;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.proofOfAddress.network.PoaRepository;
import com.onfido.android.sdk.capture.utils.RawResourceReader;
import com.onfido.javax.inject.Provider;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2151PoaHostViewModel_Factory {
    private final Provider jsonParserProvider;
    private final Provider poaRepositoryProvider;
    private final Provider resourceReaderProvider;
    private final Provider schedulersProvider;

    public C2151PoaHostViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.poaRepositoryProvider = provider;
        this.schedulersProvider = provider2;
        this.resourceReaderProvider = provider3;
        this.jsonParserProvider = provider4;
    }

    public static C2151PoaHostViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C2151PoaHostViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static PoaHostViewModel newInstance(PoaRepository poaRepository, SchedulersProvider schedulersProvider, RawResourceReader rawResourceReader, Json json, SavedStateHandle savedStateHandle) {
        return new PoaHostViewModel(poaRepository, schedulersProvider, rawResourceReader, json, savedStateHandle);
    }

    public PoaHostViewModel get(SavedStateHandle savedStateHandle) {
        return newInstance((PoaRepository) this.poaRepositoryProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (RawResourceReader) this.resourceReaderProvider.get(), (Json) this.jsonParserProvider.get(), savedStateHandle);
    }
}

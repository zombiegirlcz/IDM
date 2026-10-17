package com.onfido.android.sdk.capture.ui.camera.liveness.challenges;

import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.api.client.data.LiveVideoChallenges;
import igm.o;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.g;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesRepository;", "", "onfidoAPI", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "livenessChallengesTransformer", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesTransformer;", "(Lcom/onfido/android/sdk/capture/network/OnfidoApiService;Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesTransformer;)V", "get", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LivenessChallengesRepository {

    @NotNull
    private final LivenessChallengesTransformer livenessChallengesTransformer;

    @NotNull
    private final OnfidoApiService onfidoAPI;

    public LivenessChallengesRepository(@NotNull OnfidoApiService onfidoAPI, @NotNull LivenessChallengesTransformer livenessChallengesTransformer) {
        Intrinsics.checkNotNullParameter(onfidoAPI, "onfidoAPI");
        Intrinsics.checkNotNullParameter(livenessChallengesTransformer, "livenessChallengesTransformer");
        this.onfidoAPI = onfidoAPI;
        this.livenessChallengesTransformer = livenessChallengesTransformer;
    }

    @NotNull
    public Single<LivenessChallengesViewModel> get() {
        g gVarG = this.onfidoAPI.liveVideoChallenges$onfido_capture_sdk_core_release().g(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesRepository.get.1
            @Override // igm.o
            @NotNull
            public final LivenessChallengesViewModel apply(@NotNull LiveVideoChallenges it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return LivenessChallengesRepository.this.livenessChallengesTransformer.transform(it8);
            }
        });
        Intrinsics.checkNotNullExpressionValue(gVarG, "map(...)");
        return gVarG;
    }
}

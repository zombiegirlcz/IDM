package com.onfido.android.sdk.capture.ui.camera.liveness.intro;

import com.onfido.android.sdk.capture.internal.util.FileCache;
import igm.o;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import tgm.g;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoRepository;", "", "urlProvider", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoUrlProvider;", "cache", "Lcom/onfido/android/sdk/capture/internal/util/FileCache;", "api", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoApi;", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoUrlProvider;Lcom/onfido/android/sdk/capture/internal/util/FileCache;Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoApi;)V", "get", "Lio/reactivex/rxjava3/core/Single;", "Ljava/io/File;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LivenessIntroVideoRepository {

    @NotNull
    private final LivenessIntroVideoApi api;

    @NotNull
    private final FileCache cache;

    @NotNull
    private final LivenessIntroVideoUrlProvider urlProvider;

    public LivenessIntroVideoRepository(@NotNull LivenessIntroVideoUrlProvider urlProvider, @NotNull FileCache cache, @NotNull LivenessIntroVideoApi api2) {
        Intrinsics.checkNotNullParameter(urlProvider, "urlProvider");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(api2, "api");
        this.urlProvider = urlProvider;
        this.cache = cache;
        this.api = api2;
    }

    @NotNull
    public Single<File> get() {
        this.cache.setFilePath("ONFIDO_LIVENESS_INTRO.mp4");
        Single<FileCache.CacheContents> single = this.cache.get();
        o oVar = new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.intro.LivenessIntroVideoRepository.get.1
            @Override // igm.o
            @NotNull
            public final SingleSource apply(@NotNull FileCache.CacheContents content) {
                Intrinsics.checkNotNullParameter(content, "content");
                if (content instanceof FileCache.CacheContents.CachedFile) {
                    return Single.f(((FileCache.CacheContents.CachedFile) content).getFile());
                }
                if (!(content instanceof FileCache.CacheContents.EmptyCache)) {
                    throw new NoWhenBranchMatchedException();
                }
                Single<String> indexUrl = LivenessIntroVideoRepository.this.urlProvider.getIndexUrl();
                final LivenessIntroVideoRepository livenessIntroVideoRepository = LivenessIntroVideoRepository.this;
                o oVar2 = new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.intro.LivenessIntroVideoRepository.get.1.1
                    @Override // igm.o
                    @NotNull
                    public final SingleSource apply(@NotNull String it8) {
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return livenessIntroVideoRepository.api.getLivenessIntroVideoPaths(it8);
                    }
                };
                indexUrl.getClass();
                int i = 0;
                g gVar = new g(indexUrl, oVar2, i);
                final LivenessIntroVideoRepository livenessIntroVideoRepository2 = LivenessIntroVideoRepository.this;
                g gVar2 = new g(gVar, new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.intro.LivenessIntroVideoRepository.get.1.2
                    @Override // igm.o
                    @NotNull
                    public final SingleSource apply(@NotNull LivenessIntroVideoIndexResponse it8) {
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return livenessIntroVideoRepository2.urlProvider.getVideoUrl(it8.getPaths());
                    }
                }, i);
                final LivenessIntroVideoRepository livenessIntroVideoRepository3 = LivenessIntroVideoRepository.this;
                g gVar3 = new g(gVar2, new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.intro.LivenessIntroVideoRepository.get.1.3
                    @Override // igm.o
                    @NotNull
                    public final SingleSource apply(@NotNull String it8) {
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return livenessIntroVideoRepository3.api.getLivenessVideo(it8);
                    }
                }, i);
                final LivenessIntroVideoRepository livenessIntroVideoRepository4 = LivenessIntroVideoRepository.this;
                return new g(gVar3, new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.intro.LivenessIntroVideoRepository.get.1.4
                    @Override // igm.o
                    @NotNull
                    public final SingleSource apply(@NotNull ResponseBody it8) {
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return livenessIntroVideoRepository4.cache.put(it8);
                    }
                }, i);
            }
        };
        single.getClass();
        g gVar = new g(single, oVar, 0);
        Intrinsics.checkNotNullExpressionValue(gVar, "flatMap(...)");
        return gVar;
    }
}

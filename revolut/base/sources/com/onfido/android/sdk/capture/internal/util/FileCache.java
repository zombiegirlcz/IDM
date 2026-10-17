package com.onfido.android.sdk.capture.internal.util;

import android.content.Context;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.utils.NetworkExtensionsKt;
import io.reactivex.rxjava3.core.Single;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import tgm.b;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/FileCache;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cachedFile", "Ljava/io/File;", "getCachedFile", "()Ljava/io/File;", "cachedFile$delegate", "Lkotlin/Lazy;", "filePath", "", "get", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/internal/util/FileCache$CacheContents;", "put", "responseBody", "Lokhttp3/ResponseBody;", "setFilePath", "", "path", "CacheContents", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FileCache {

    /* JADX INFO: renamed from: cachedFile$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cachedFile;

    @NotNull
    private final Context context;
    private String filePath;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/FileCache$CacheContents;", "", "CachedFile", "EmptyCache", "Lcom/onfido/android/sdk/capture/internal/util/FileCache$CacheContents$CachedFile;", "Lcom/onfido/android/sdk/capture/internal/util/FileCache$CacheContents$EmptyCache;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InternalOnfidoApi
    public interface CacheContents {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/FileCache$CacheContents$CachedFile;", "Lcom/onfido/android/sdk/capture/internal/util/FileCache$CacheContents;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CachedFile implements CacheContents {

            @NotNull
            private final File file;

            public CachedFile(@NotNull File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                this.file = file;
            }

            @NotNull
            public final File getFile() {
                return this.file;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/FileCache$CacheContents$EmptyCache;", "Lcom/onfido/android/sdk/capture/internal/util/FileCache$CacheContents;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EmptyCache implements CacheContents {

            @NotNull
            public static final EmptyCache INSTANCE = new EmptyCache();

            private EmptyCache() {
            }
        }
    }

    public FileCache(@ApplicationContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.cachedFile = j.b(new FileCache$cachedFile$2(this));
    }

    private final File getCachedFile() {
        return (File) this.cachedFile.getValue();
    }

    @NotNull
    public final Single<CacheContents> get() {
        b bVarF = Single.f(getCachedFile().exists() ? new CacheContents.CachedFile(getCachedFile()) : CacheContents.EmptyCache.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(bVarF, "just(...)");
        return bVarF;
    }

    @NotNull
    public final Single<File> put(@NotNull ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        return NetworkExtensionsKt.saveFile(responseBody, getCachedFile());
    }

    public final void setFilePath(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.filePath = path;
    }
}

package com.onfido.android.sdk.capture.component.active.video.capture.data.repository;

import android.content.Context;
import cmc.d;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.common.result.FailureReason;
import com.onfido.android.sdk.capture.component.active.video.capture.data.remote.model.AVCUploadResponse;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.model.ActiveVideoCaptureResult;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.repository.ActiveVideoCaptureRepository;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifactKt;
import com.onfido.android.sdk.capture.utils.mapper.Mapper;
import igm.o;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ogm.e;
import org.jetbrains.annotations.NotNull;
import tgm.g;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/data/repository/ActiveVideoCaptureRepositoryImpl;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/repository/ActiveVideoCaptureRepository;", "motionDataSource", "Lcom/onfido/android/sdk/capture/component/active/video/capture/data/repository/MotionDataSource;", "errorMapper", "Lcom/onfido/android/sdk/capture/utils/mapper/Mapper;", "", "Lcom/onfido/android/sdk/capture/common/result/FailureReason;", "context", "Landroid/content/Context;", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/data/repository/MotionDataSource;Lcom/onfido/android/sdk/capture/utils/mapper/Mapper;Landroid/content/Context;)V", "deleteVideoFiles", "Lio/reactivex/rxjava3/core/Completable;", "uploadActiveVideoCapture", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/model/ActiveVideoCaptureResult;", "videoFile", "Ljava/io/File;", "isAudioEnabled", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ActiveVideoCaptureRepositoryImpl implements ActiveVideoCaptureRepository {

    @NotNull
    private final Context context;

    @NotNull
    private final Mapper<Throwable, FailureReason> errorMapper;

    @NotNull
    private final MotionDataSource motionDataSource;

    public ActiveVideoCaptureRepositoryImpl(@NotNull MotionDataSource motionDataSource, @NotNull Mapper<Throwable, FailureReason> errorMapper, @ApplicationContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(motionDataSource, "motionDataSource");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(context, "context");
        this.motionDataSource = motionDataSource;
        this.errorMapper = errorMapper;
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteVideoFiles$lambda$3(ActiveVideoCaptureRepositoryImpl this$0) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        File cacheDir = this$0.context.getCacheDir();
        if (cacheDir == null || (fileArrListFiles = cacheDir.listFiles(new a(0))) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteVideoFiles$lambda$3$lambda$1(File file, String str) {
        Intrinsics.h(str);
        return a0.H(str, "ONFIDO_AVC_VID", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveVideoCaptureResult uploadActiveVideoCapture$lambda$0(ActiveVideoCaptureRepositoryImpl this$0, Throwable t2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(t2, "t");
        return new ActiveVideoCaptureResult.Error(this$0.errorMapper.map(t2));
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.domain.repository.ActiveVideoCaptureRepository
    @NotNull
    public Completable deleteVideoFiles() {
        e eVar = new e(new b(this, 0), 2);
        Intrinsics.checkNotNullExpressionValue(eVar, "fromAction(...)");
        return eVar;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.domain.repository.ActiveVideoCaptureRepository
    @NotNull
    public Single<ActiveVideoCaptureResult> uploadActiveVideoCapture(@NotNull File videoFile, boolean isAudioEnabled) {
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        g gVar = new g(this.motionDataSource.uploadMotionCapture(videoFile, isAudioEnabled).g(new o() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.data.repository.ActiveVideoCaptureRepositoryImpl.uploadActiveVideoCapture.1
            @Override // igm.o
            @NotNull
            public final ActiveVideoCaptureResult apply(@NotNull AVCUploadResponse avcUploadResponse) {
                Intrinsics.checkNotNullParameter(avcUploadResponse, "avcUploadResponse");
                return new ActiveVideoCaptureResult.Success(UploadedArtifactKt.toUploadedArtifact(avcUploadResponse));
            }
        }), new d(this, 13), 2);
        Intrinsics.checkNotNullExpressionValue(gVar, "onErrorReturn(...)");
        return gVar;
    }
}

package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RecorderWrapperCommon$outputFile$2 extends u implements Function0<File> {
    final /* synthetic */ RecorderWrapperCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecorderWrapperCommon$outputFile$2(RecorderWrapperCommon recorderWrapperCommon) {
        super(0);
        this.this$0 = recorderWrapperCommon;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final File invoke() {
        return this.this$0.createFile();
    }
}

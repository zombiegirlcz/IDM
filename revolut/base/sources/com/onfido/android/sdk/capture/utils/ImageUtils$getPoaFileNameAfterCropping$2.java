package com.onfido.android.sdk.capture.utils;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import gim.d;
import gim.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.utils.ImageUtils$getPoaFileNameAfterCropping$2", f = "ImageUtils.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ImageUtils$getPoaFileNameAfterCropping$2 extends i implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ File $capturedFilesDir;
    final /* synthetic */ DocumentDetectionFrame $frame;
    final /* synthetic */ byte[] $jpegData;
    final /* synthetic */ String $poaImageFileName;
    int label;
    final /* synthetic */ ImageUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageUtils$getPoaFileNameAfterCropping$2(ImageUtils imageUtils, byte[] bArr, DocumentDetectionFrame documentDetectionFrame, File file, String str, Continuation<? super ImageUtils$getPoaFileNameAfterCropping$2> continuation) {
        super(2, continuation);
        this.this$0 = imageUtils;
        this.$jpegData = bArr;
        this.$frame = documentDetectionFrame;
        this.$capturedFilesDir = file;
        this.$poaImageFileName = str;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new ImageUtils$getPoaFileNameAfterCropping$2(this.this$0, this.$jpegData, this.$frame, this.$capturedFilesDir, this.$poaImageFileName, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        byte[] imageContent = this.this$0.cropImageForScreenShowOnly$onfido_capture_sdk_core_release(this.$jpegData, this.$frame).getImageContent();
        File file = new File(this.$capturedFilesDir, this.$poaImageFileName);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
            fileOutputStream.write(imageContent);
            fileOutputStream.close();
            return file.getPath();
        } catch (IOException e) {
            Timber.INSTANCE.e(e, "POA_Debug: Failed saving image", new Object[0]);
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((ImageUtils$getPoaFileNameAfterCropping$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}

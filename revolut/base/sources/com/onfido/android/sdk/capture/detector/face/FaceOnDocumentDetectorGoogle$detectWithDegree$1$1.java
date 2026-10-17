package com.onfido.android.sdk.capture.detector.face;

import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lmh/a;", "faces", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class FaceOnDocumentDetectorGoogle$detectWithDegree$1$1 extends u implements Function1<List<? extends mh.a>, Unit> {
    final /* synthetic */ SingleEmitter $emitter;
    final /* synthetic */ FaceOnDocumentDetectorGoogle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceOnDocumentDetectorGoogle$detectWithDegree$1$1(FaceOnDocumentDetectorGoogle faceOnDocumentDetectorGoogle, SingleEmitter singleEmitter) {
        super(1);
        this.this$0 = faceOnDocumentDetectorGoogle;
        this.$emitter = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((List<? extends mh.a>) obj2);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull List<? extends mh.a> faces) {
        Intrinsics.checkNotNullParameter(faces, "faces");
        this.this$0.isRealtimeProcessingOngoing = false;
        this.this$0.onSuccessIfNotDisposed(this.$emitter, this.this$0.toFaceDetectionResult(faces));
    }
}

package com.onfido.android.sdk.capture.ui.camera.document;

import com.onfido.android.sdk.capture.validation.Validation;
import gim.d;
import gim.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$uploadDocumentMedia$1", f = "DocumentCaptureViewModel.kt", l = {873, 874}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureViewModel$uploadDocumentMedia$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ byte[] $jpegData;
    final /* synthetic */ List<Validation> $validations;
    int label;
    final /* synthetic */ DocumentCaptureViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentCaptureViewModel$uploadDocumentMedia$1(DocumentCaptureViewModel documentCaptureViewModel, byte[] bArr, List<Validation> list, Continuation<? super DocumentCaptureViewModel$uploadDocumentMedia$1> continuation) {
        super(2, continuation);
        this.this$0 = documentCaptureViewModel;
        this.$jpegData = bArr;
        this.$validations = list;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new DocumentCaptureViewModel$uploadDocumentMedia$1(this.this$0, this.$jpegData, this.$validations, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|47|(1:(1:(5:6|7|31|38|39)(2:10|11))(1:12))(11:14|45|15|(1:17)|18|19|(1:21)|22|23|(1:25)|30)|26|27|48|28|(2:(0)|(1:44))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r13 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        r0 = th;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$uploadDocumentMedia$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DocumentCaptureViewModel$uploadDocumentMedia$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}

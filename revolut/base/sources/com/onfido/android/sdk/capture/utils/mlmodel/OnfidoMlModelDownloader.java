package com.onfido.android.sdk.capture.utils.mlmodel;

import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.c2;
import skm.e0;
import skm.k0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/mlmodel/OnfidoMlModelDownloader;", "Lcom/onfido/android/sdk/capture/utils/mlmodel/OnfidoMlModelDownloaderInternal;", "()V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "onCreate", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoMlModelDownloader extends OnfidoMlModelDownloaderInternal {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long DELAY_BEFORE_DOWNLOADING_MODELS_IN_MS = 10000;

    @NotNull
    private final CoroutineScope coroutineScope;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/mlmodel/OnfidoMlModelDownloader$Companion;", "", "()V", "DELAY_BEFORE_DOWNLOADING_MODELS_IN_MS", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.mlmodel.OnfidoMlModelDownloader$onCreate$1, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.utils.mlmodel.OnfidoMlModelDownloader$onCreate$1", f = "OnfidoMlModelDownloader.kt", l = {16}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return OnfidoMlModelDownloader.this.new AnonymousClass1(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                this.label = 1;
                if (k0.b(10000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            OnfidoMlModelDownloader.super.onCreate();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public OnfidoMlModelDownloader() {
        c2 c2VarE = e0.e();
        p0 p0Var = p0.f264001a;
        this.coroutineScope = new zkm.d(e.d(c2VarE, zkm.o.f323119a));
    }

    @Override // com.onfido.android.sdk.capture.utils.mlmodel.OnfidoMlModelDownloaderInternal, android.content.ContentProvider
    public boolean onCreate() {
        e0.C(this.coroutineScope, null, null, new AnonymousClass1(null), 3);
        return true;
    }
}

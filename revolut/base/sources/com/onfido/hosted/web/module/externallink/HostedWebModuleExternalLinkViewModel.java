package com.onfido.hosted.web.module.externallink;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import gim.i;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import vkm.j2;
import vkm.q;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkRepository;", "(Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkRepository;)V", "_result", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkResult;", "result", "Lkotlinx/coroutines/flow/StateFlow;", "getResult$onfido_capture_sdk_core_release", "()Lkotlinx/coroutines/flow/StateFlow;", "onExternalLinkReceived", "", "url", "Ljava/net/URL;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleExternalLinkViewModel extends ViewModel {

    @NotNull
    private final MutableStateFlow _result;

    @NotNull
    private final HostedWebModuleExternalLinkRepository repository;

    @NotNull
    private final StateFlow result;

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkViewModel$onExternalLinkReceived$1, reason: invalid class name */
    @gim.d(c = "com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkViewModel$onExternalLinkReceived$1", f = "HostedWebModuleExternalLinkViewModel.kt", l = {23}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ URL $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(URL url2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$url = url2;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return HostedWebModuleExternalLinkViewModel.this.new AnonymousClass1(this.$url, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            Object objMo3744fetchExternalLinkgIAlus;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    o.b(obj2);
                    HostedWebModuleExternalLinkRepository hostedWebModuleExternalLinkRepository = HostedWebModuleExternalLinkViewModel.this.repository;
                    URL url2 = this.$url;
                    this.label = 1;
                    objMo3744fetchExternalLinkgIAlus = hostedWebModuleExternalLinkRepository.mo3744fetchExternalLinkgIAlus(url2, this);
                    if (objMo3744fetchExternalLinkgIAlus == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objMo3744fetchExternalLinkgIAlus = ((m) obj2).f314193a;
                }
                MutableStateFlow mutableStateFlow = HostedWebModuleExternalLinkViewModel.this._result;
                o.b(objMo3744fetchExternalLinkgIAlus);
                mutableStateFlow.setValue(objMo3744fetchExternalLinkgIAlus);
            } catch (Exception unused) {
                HostedWebModuleExternalLinkViewModel.this._result.setValue(Failed.INSTANCE);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public HostedWebModuleExternalLinkViewModel(@NotNull HostedWebModuleExternalLinkRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        j2 j2VarC = q.c(Loading.INSTANCE);
        this._result = j2VarC;
        this.result = q.h(j2VarC);
    }

    @NotNull
    /* JADX INFO: renamed from: getResult$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getResult() {
        return this.result;
    }

    public final void onExternalLinkReceived(@NotNull URL url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        e0.C(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(url2, null), 3);
    }
}

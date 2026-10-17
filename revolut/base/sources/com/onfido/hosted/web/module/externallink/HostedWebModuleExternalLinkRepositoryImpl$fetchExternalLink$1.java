package com.onfido.hosted.web.module.externallink;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes17.dex */
@gim.d(c = "com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl", f = "HostedWebModuleExternalLinkRepositoryImpl.kt", l = {55}, m = "fetchExternalLink-gIAlu-s")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$1 extends gim.c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HostedWebModuleExternalLinkRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$1(HostedWebModuleExternalLinkRepositoryImpl hostedWebModuleExternalLinkRepositoryImpl, Continuation<? super HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$1> continuation) {
        super(continuation);
        this.this$0 = hostedWebModuleExternalLinkRepositoryImpl;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        Object objMo3744fetchExternalLinkgIAlus = this.this$0.mo3744fetchExternalLinkgIAlus(null, this);
        return objMo3744fetchExternalLinkgIAlus == fim.a.COROUTINE_SUSPENDED ? objMo3744fetchExternalLinkgIAlus : new m(objMo3744fetchExternalLinkgIAlus);
    }
}

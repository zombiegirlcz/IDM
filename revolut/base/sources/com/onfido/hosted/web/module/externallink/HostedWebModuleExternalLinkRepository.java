package com.onfido.hosted.web.module.externallink;

import java.net.URL;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkRepository;", "", "Ljava/net/URL;", "url", "Lyhm/m;", "Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkResult;", "fetchExternalLink-gIAlu-s", "(Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchExternalLink", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface HostedWebModuleExternalLinkRepository {
    /* JADX INFO: renamed from: fetchExternalLink-gIAlu-s, reason: not valid java name */
    Object mo3744fetchExternalLinkgIAlus(@NotNull URL url2, @NotNull Continuation<? super m<? extends HostedWebModuleExternalLinkResult>> continuation);
}

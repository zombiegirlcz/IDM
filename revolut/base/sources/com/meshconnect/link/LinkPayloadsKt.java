package com.meshconnect.link;

import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import vkm.q;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"payloads", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/meshconnect/link/entity/LinkPayload;", "LinkPayloads", "Lkotlinx/coroutines/flow/SharedFlow;", "getLinkPayloads", "()Lkotlinx/coroutines/flow/SharedFlow;", "link_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LinkPayloadsKt {

    @NotNull
    private static final MutableSharedFlow payloads = q.b(0, 7, null);

    @NotNull
    public static final SharedFlow getLinkPayloads() {
        return q.g(payloads);
    }
}

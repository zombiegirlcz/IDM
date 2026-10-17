package com.meshconnect.link;

import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import vkm.q;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001e\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"!\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "", "LinkEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getLinkEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "link_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LinkEventsKt {

    @NotNull
    private static final MutableSharedFlow events = q.b(0, 7, null);

    @NotNull
    public static final SharedFlow getLinkEvents() {
        return q.g(events);
    }
}

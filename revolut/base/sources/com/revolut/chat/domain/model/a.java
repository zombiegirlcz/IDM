package com.revolut.chat.domain.model;

import com.revolut.chat.domain.model.ChatFeed;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import v30.c0;
import v30.l;
import v30.y;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {
    public static final ChatFeed a(y detailedFeed) {
        Intrinsics.checkNotNullParameter(detailedFeed, "detailedFeed");
        c0 c0Var = detailedFeed.f285834b;
        UUID uuid = detailedFeed.f285833a;
        int i = l.f285804a[c0Var.ordinal()];
        if (i == 1) {
            return new ChatFeed.Support(null, uuid, null, 5);
        }
        if (i == 2) {
            return new ChatFeed.Assistant(uuid, null, false, 6);
        }
        if (i == 3) {
            return new ChatFeed.PrivateBanking(uuid);
        }
        throw new NoWhenBranchMatchedException();
    }
}

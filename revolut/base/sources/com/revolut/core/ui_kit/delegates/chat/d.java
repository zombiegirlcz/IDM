package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends ChatBubbleDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53961a;

    public d(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f53961a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f53961a, ((d) obj2).f53961a);
    }

    public final int hashCode() {
        return this.f53961a.hashCode();
    }
}

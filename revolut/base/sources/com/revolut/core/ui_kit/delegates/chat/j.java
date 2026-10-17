package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import kotlin.jvm.internal.Intrinsics;
import kp0.p0;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatBubbleDelegate.a f53977a;

    public j(ChatBubbleDelegate.a image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f53977a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f53977a, ((j) obj2).f53977a);
    }

    public final int hashCode() {
        return this.f53977a.hashCode();
    }
}

package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends ChatBubbleDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f53960a;

    public c(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f53960a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f53960a, ((c) obj2).f53960a);
    }

    public final int hashCode() {
        return this.f53960a.hashCode();
    }
}

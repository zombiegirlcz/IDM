package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentGridBubbleDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatAttachmentGridBubbleDelegate.Model f53958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53959b;

    public b(ChatAttachmentGridBubbleDelegate.Model model, int i) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f53958a = model;
        this.f53959b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f53958a, bVar.f53958a) && this.f53959b == bVar.f53959b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53959b) + (this.f53958a.hashCode() * 31);
    }
}

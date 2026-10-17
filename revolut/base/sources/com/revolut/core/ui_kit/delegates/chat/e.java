package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleTitleStyle;
import com.revolut.core.ui_kit_resources.R$attr;
import ms0.h4;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends ChatBubbleDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53963b;

    public e(int i, int i2) {
        this.f53962a = i;
        this.f53963b = i2;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
    public final int a() {
        return R$attr.uikit_colorGreyTone20;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
    public final int b() {
        return R$attr.uikit_colorAccentNeutral;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
    public final ChatBubbleStyle c() {
        return new ChatBubbleStyle.Gradient(this.f53962a, this.f53963b);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
    public final ChatBubbleTitleStyle d() {
        return ChatBubbleTitleStyle.Foreground.f56816a;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
    public final h4 e() {
        return h4.ACCENT;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f53962a == eVar.f53962a && this.f53963b == eVar.f53963b;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
    public final h4 f() {
        return h4.SEMIACCENT;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
    public final int g() {
        return R$attr.uikit_colorForeground;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53963b) + (Integer.hashCode(this.f53962a) * 31);
    }
}

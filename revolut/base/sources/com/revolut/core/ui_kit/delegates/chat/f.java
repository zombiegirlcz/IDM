package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.delegates.chat.ChatMessageActionsPanelDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends ChatMessageActionsPanelDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f53965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f53966c;

    public f(int i, ResourceImage icon, ResourceImage alternateIcon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(alternateIcon, "alternateIcon");
        this.f53964a = i;
        this.f53965b = icon;
        this.f53966c = alternateIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f53964a == fVar.f53964a && this.f53965b.equals(fVar.f53965b) && this.f53966c.equals(fVar.f53966c);
    }

    public final int hashCode() {
        return org.bouncycastle.jcajce.provider.digest.a.b(this.f53966c, org.bouncycastle.jcajce.provider.digest.a.b(this.f53965b, Integer.hashCode(this.f53964a) * 31, 31), 31);
    }
}

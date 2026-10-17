package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.delegates.chat.ChatMessageActionsPanelDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends ChatMessageActionsPanelDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f53968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f53969c;
    public final boolean d;
    public final LottieImage e;

    public g(int i, ResourceImage unselectedIcon, ResourceImage selectedIcon, boolean z, LottieImage lottieImage) {
        Intrinsics.checkNotNullParameter(unselectedIcon, "unselectedIcon");
        Intrinsics.checkNotNullParameter(selectedIcon, "selectedIcon");
        this.f53967a = i;
        this.f53968b = unselectedIcon;
        this.f53969c = selectedIcon;
        this.d = z;
        this.e = lottieImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f53967a == gVar.f53967a && this.f53968b.equals(gVar.f53968b) && this.f53969c.equals(gVar.f53969c) && this.d == gVar.d && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(org.bouncycastle.jcajce.provider.digest.a.b(this.f53969c, org.bouncycastle.jcajce.provider.digest.a.b(this.f53968b, Integer.hashCode(this.f53967a) * 31, 31), 31), 31, this.d);
        LottieImage lottieImage = this.e;
        return iC + (lottieImage == null ? 0 : lottieImage.hashCode());
    }
}

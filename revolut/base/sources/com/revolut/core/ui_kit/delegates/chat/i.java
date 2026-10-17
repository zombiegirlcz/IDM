package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.delegates.chat.ChatMessageActionsPanelDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;
import kp0.m0;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f53975c;
    public final ResourceImage d;
    public final boolean e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LottieImage f53976g;

    public i(String listId, int i, ResourceImage unselectedIcon, ResourceImage selectedIcon, boolean z, v20.n nVar, LottieImage lottieImage) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(unselectedIcon, "unselectedIcon");
        Intrinsics.checkNotNullParameter(selectedIcon, "selectedIcon");
        this.f53973a = listId;
        this.f53974b = i;
        this.f53975c = unselectedIcon;
        this.d = selectedIcon;
        this.e = z;
        this.f = nVar;
        this.f53976g = lottieImage;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ChatMessageActionsPanelDelegate.ToggleableActionDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53853a() {
        return this.f53973a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f53973a, iVar.f53973a) && this.f53974b == iVar.f53974b && this.f53975c.equals(iVar.f53975c) && this.d.equals(iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f53976g, iVar.f53976g);
    }

    public final int hashCode() {
        int iC = j6.a.c(org.bouncycastle.jcajce.provider.digest.a.b(this.d, org.bouncycastle.jcajce.provider.digest.a.b(this.f53975c, j6.a.b(this.f53974b, this.f53973a.hashCode() * 31, 31), 31), 31), 31, this.e);
        Object obj2 = this.f;
        int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        LottieImage lottieImage = this.f53976g;
        return iHashCode + (lottieImage != null ? lottieImage.hashCode() : 0);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof i)) {
            return null;
        }
        i iVar = (i) oldItem;
        return new m0((iVar.f53975c.equals(this.f53975c) && iVar.d.equals(this.d)) ? false : true, iVar.e != this.e);
    }
}

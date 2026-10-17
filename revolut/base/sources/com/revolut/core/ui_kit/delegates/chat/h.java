package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.delegates.chat.ChatMessageActionsPanelDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;
import kp0.k0;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f53972c;
    public final ResourceImage d;
    public final Object e;

    public h(String listId, int i, ResourceImage icon, ResourceImage alternateIcon, v20.n nVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(alternateIcon, "alternateIcon");
        this.f53970a = listId;
        this.f53971b = i;
        this.f53972c = icon;
        this.d = alternateIcon;
        this.e = nVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ChatMessageActionsPanelDelegate.OneShotActionDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53853a() {
        return this.f53970a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f53970a, hVar.f53970a) && this.f53971b == hVar.f53971b && this.f53972c.equals(hVar.f53972c) && this.d.equals(hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iB = org.bouncycastle.jcajce.provider.digest.a.b(this.d, org.bouncycastle.jcajce.provider.digest.a.b(this.f53972c, j6.a.b(this.f53971b, this.f53970a.hashCode() * 31, 31), 31), 31);
        Object obj2 = this.e;
        return (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem instanceof h) {
            return new k0(!((h) oldItem).f53972c.equals(this.f53972c));
        }
        return null;
    }
}

package com.revolut.core.ui_kit.internal.views.reactionskeyboard;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f57504c;

    public a(String id10, b tabDetails) {
        int i = R$attr.uikit_colorGreyTone50;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(tabDetails, "tabDetails");
        this.f57502a = id10;
        this.f57503b = i;
        this.f57504c = tabDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f57502a.equals(aVar.f57502a) && this.f57503b == aVar.f57503b && this.f57504c.equals(aVar.f57504c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f57504c.hashCode() + j6.a.b(this.f57503b, this.f57502a.hashCode() * 31, 31)) * 31);
    }
}

package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends BasicNavBar.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f59522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59524c;

    public d(Iterable items, String str, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f59522a = items;
        this.f59523b = str;
        this.f59524c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f59522a, dVar.f59522a) && Intrinsics.f(this.f59523b, dVar.f59523b) && this.f59524c == dVar.f59524c;
    }

    public final int hashCode() {
        int iHashCode = this.f59522a.hashCode() * 31;
        String str = this.f59523b;
        return Boolean.hashCode(this.f59524c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}

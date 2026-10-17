package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.WalletWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletWidgetDelegate.Model f54351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Parcelable f54353c;

    public jj(WalletWidgetDelegate.Model model, int i, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f54351a = model;
        this.f54352b = i;
        this.f54353c = parcelable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj2;
        return Intrinsics.f(this.f54351a, jjVar.f54351a) && this.f54352b == jjVar.f54352b && Intrinsics.f(this.f54353c, jjVar.f54353c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f54352b, this.f54351a.hashCode() * 31, 31);
        Parcelable parcelable = this.f54353c;
        return iB + (parcelable == null ? 0 : parcelable.hashCode());
    }
}

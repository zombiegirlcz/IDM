package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v9 extends NewsDelegate.Model.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54862c;
    public final int d;
    public final int e;

    public v9(Clause subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f54860a = subtitle;
        int i = R$attr.uikit_dp12;
        this.f54861b = i;
        this.f54862c = i;
        this.d = R$attr.uikit_dp16;
        this.e = R$attr.uikit_dp8;
    }

    @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
    public final int a() {
        return this.f54862c;
    }

    @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
    public final int b() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
    public final int c() {
        return this.f54861b;
    }

    @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
    public final int d() {
        return this.e;
    }

    @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v9) && this.f54860a.equals(((v9) obj2).f54860a);
    }

    public final int hashCode() {
        return this.f54860a.hashCode();
    }
}

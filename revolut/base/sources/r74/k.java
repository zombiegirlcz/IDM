package r74;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht3.d f251991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ht3.a f251992b;

    public k(ht3.d buttonType, ht3.a action) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f251991a = buttonType;
        this.f251992b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f251991a == kVar.f251991a && Intrinsics.f(this.f251992b, kVar.f251992b);
    }

    public final int hashCode() {
        return this.f251992b.hashCode() + (this.f251991a.hashCode() * 31);
    }
}

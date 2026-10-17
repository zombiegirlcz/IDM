package s74;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht3.d f260515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ht3.a f260516b;

    public m(ht3.d buttonType, ht3.a action) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f260515a = buttonType;
        this.f260516b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f260515a == mVar.f260515a && Intrinsics.f(this.f260516b, mVar.f260516b);
    }

    public final int hashCode() {
        return this.f260516b.hashCode() + (this.f260515a.hashCode() * 31);
    }
}

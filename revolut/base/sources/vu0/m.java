package vu0;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeToActionDelegate.SwipeAction f292172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f292173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f292174c;
    public final boolean d;

    public m(SwipeToActionDelegate.SwipeAction action, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f292172a = action;
        this.f292173b = i;
        this.f292174c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f292172a, mVar.f292172a) && this.f292173b == mVar.f292173b && this.f292174c == mVar.f292174c && this.d == mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.b(this.f292174c, j6.a.b(this.f292173b, this.f292172a.hashCode() * 31, 31), 31);
    }
}

package hpi;

import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154556a;

    public e() {
        this((Object) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f154556a == ((e) obj2).f154556a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154556a);
    }

    public e(int i) {
        this.f154556a = i;
    }

    public /* synthetic */ e(Object obj2) {
        this(R$attr.uikit_windowBackground);
    }
}

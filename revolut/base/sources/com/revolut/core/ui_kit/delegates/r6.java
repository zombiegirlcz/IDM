package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r6 extends GridSingleChoiceDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f54660a;

    public r6(Set set) {
        Intrinsics.checkNotNullParameter(set, "set");
        this.f54660a = set;
    }

    @Override // com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate.a
    public final boolean a(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return !this.f54660a.contains(data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r6) && Intrinsics.f(this.f54660a, ((r6) obj2).f54660a);
    }

    public final int hashCode() {
        return this.f54660a.hashCode();
    }
}

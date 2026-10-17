package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import ip0.jm0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ji extends TrendViewDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm0 f54349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hw0.q f54350b;

    public ji(jm0 data, hw0.q limitType) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        this.f54349a = data;
        this.f54350b = limitType;
    }

    @Override // com.revolut.core.ui_kit.delegates.TrendViewDelegate.a
    public final jm0 a() {
        return this.f54349a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ji)) {
            return false;
        }
        ji jiVar = (ji) obj2;
        return Intrinsics.f(this.f54349a, jiVar.f54349a) && this.f54350b == jiVar.f54350b;
    }

    public final int hashCode() {
        return this.f54350b.hashCode() + (this.f54349a.hashCode() * 31);
    }
}

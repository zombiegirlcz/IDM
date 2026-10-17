package com.revolut.core.ui_kit.views.pin;

import com.revolut.core.ui_kit.views.pin.PinCodeView;
import kotlin.jvm.internal.Intrinsics;
import yx0.e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends PinCodeView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f59612a;

    public a(e type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f59612a = type;
    }

    @Override // com.revolut.core.ui_kit.views.pin.PinCodeView.a
    public final e a() {
        return this.f59612a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f59612a == ((a) obj2).f59612a;
    }

    public final int hashCode() {
        return this.f59612a.hashCode();
    }
}

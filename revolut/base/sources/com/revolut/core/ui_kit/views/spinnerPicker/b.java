package com.revolut.core.ui_kit.views.spinnerPicker;

import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import ey0.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpinnerPickerView.b f59709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f59710c;

    public b(f horizontalContentAlignment, int i) {
        SpinnerPickerView.b heightMode = (i & 4) != 0 ? SpinnerPickerView.b.C0446b.f59704a : SpinnerPickerView.b.a.f59703a;
        horizontalContentAlignment = (i & 8) != 0 ? f.START : horizontalContentAlignment;
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(horizontalContentAlignment, "horizontalContentAlignment");
        this.f59708a = true;
        this.f59709b = heightMode;
        this.f59710c = horizontalContentAlignment;
    }

    @Override // com.revolut.core.ui_kit.views.spinnerPicker.c
    public final SpinnerPickerView.b a() {
        return this.f59709b;
    }

    @Override // com.revolut.core.ui_kit.views.spinnerPicker.c
    public final f b() {
        return this.f59710c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f59708a == bVar.f59708a && Intrinsics.f(this.f59709b, bVar.f59709b) && this.f59710c == bVar.f59710c;
    }

    public final int hashCode() {
        return this.f59710c.hashCode() + ((this.f59709b.hashCode() + j6.a.c(Boolean.hashCode(this.f59708a) * 31, 31, false)) * 31);
    }
}

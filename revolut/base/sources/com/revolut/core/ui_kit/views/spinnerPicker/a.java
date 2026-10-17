package com.revolut.core.ui_kit.views.spinnerPicker;

import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import ey0.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f59705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f59706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f59707c;
    public final SpinnerPickerView.b d;
    public final f e;

    public a(ArrayList firstColumnOptions, ArrayList secondColumnOptions, ArrayList thirdColumnOptions, SpinnerPickerView.b heightMode, f horizontalContentAlignment) {
        Intrinsics.checkNotNullParameter(firstColumnOptions, "firstColumnOptions");
        Intrinsics.checkNotNullParameter(secondColumnOptions, "secondColumnOptions");
        Intrinsics.checkNotNullParameter(thirdColumnOptions, "thirdColumnOptions");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(horizontalContentAlignment, "horizontalContentAlignment");
        this.f59705a = firstColumnOptions;
        this.f59706b = secondColumnOptions;
        this.f59707c = thirdColumnOptions;
        this.d = heightMode;
        this.e = horizontalContentAlignment;
    }

    @Override // com.revolut.core.ui_kit.views.spinnerPicker.c
    public final SpinnerPickerView.b a() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.views.spinnerPicker.c
    public final f b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f59705a.equals(aVar.f59705a) && this.f59706b.equals(aVar.f59706b) && this.f59707c.equals(aVar.f59707c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f59707c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f59706b, this.f59705a.hashCode() * 31, 31), 31)) * 31);
    }
}

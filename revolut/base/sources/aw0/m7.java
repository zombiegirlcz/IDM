package aw0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m7 extends n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f10425b;

    public m7(float f, MoneyClause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f10424a = f;
        this.f10425b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj2;
        return Float.compare(this.f10424a, m7Var.f10424a) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && this.f10425b.equals(m7Var.f10425b);
    }

    public final int hashCode() {
        return this.f10425b.hashCode() + m72.b.b(BitmapDescriptorFactory.HUE_RED, Float.hashCode(this.f10424a) * 31, 31);
    }
}

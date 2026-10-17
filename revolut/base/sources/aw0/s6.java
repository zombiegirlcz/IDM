package aw0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes19.dex */
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10526c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10528h;

    public s6(float f, float f4, float f5, int i, int i2, int i3, boolean z, int i5) {
        f4 = (i5 & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f4;
        i = (i5 & 8) != 0 ? R$attr.uikit_colorBlue : i;
        i2 = (i5 & 16) != 0 ? R$attr.uikit_colorGreyTone50 : i2;
        i3 = (i5 & 32) != 0 ? R$attr.uikit_colorPink : i3;
        int i6 = R$attr.uikit_colorGreyTone10;
        z = (i5 & 128) != 0 ? true : z;
        this.f10524a = f;
        this.f10525b = f4;
        this.f10526c = f5;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f10527g = i6;
        this.f10528h = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj2;
        return Float.compare(this.f10524a, s6Var.f10524a) == 0 && Float.compare(this.f10525b, s6Var.f10525b) == 0 && Float.compare(this.f10526c, s6Var.f10526c) == 0 && this.d == s6Var.d && this.e == s6Var.e && this.f == s6Var.f && this.f10527g == s6Var.f10527g && this.f10528h == s6Var.f10528h;
    }

    public final int hashCode() {
        return Long.hashCode(800L) + j6.a.c(j6.a.b(this.f10527g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, m72.b.b(this.f10526c, m72.b.b(this.f10525b, Float.hashCode(this.f10524a) * 31, 31), 31), 31), 31), 31), 31), 31, this.f10528h);
    }
}

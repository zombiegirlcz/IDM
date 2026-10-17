package aw0;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class cb {

    @NotNull
    public static final bb Companion;
    public static final cb e;
    public static final cb f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cb f10264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cb f10265h;
    public static final cb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final cb f10266j;
    public static final cb k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final cb f10267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ArrayList f10268m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10271c;
    public final boolean d;

    static {
        bb bbVar = new bb();
        Companion = bbVar;
        int i2 = 0;
        int i3 = 14;
        cb cbVar = new cb(R$attr.uikit_colorPerformancePositive, i2, i3);
        e = cbVar;
        int i5 = R$attr.uikit_colorPerformanceNegative;
        cb cbVar2 = new cb(i5, i2, i3);
        f = cbVar2;
        int i6 = R$attr.uikit_colorForeground;
        int i21 = 12;
        cb cbVar3 = new cb(i6, i5, i21);
        f10264g = cbVar3;
        cb cbVar4 = new cb(R$attr.uikit_colorGreyTone20, i6, i21);
        f10265h = cbVar4;
        i = bb.a(bbVar, cbVar);
        f10266j = bb.a(bbVar, cbVar2);
        k = bb.a(bbVar, cbVar3);
        f10267l = bb.a(bbVar, cbVar4);
        List listK = zhm.v.k(Integer.valueOf(R$attr.uikit_colorInfograph1), Integer.valueOf(R$attr.uikit_colorInfograph2), Integer.valueOf(R$attr.uikit_colorInfograph3), Integer.valueOf(R$attr.uikit_colorInfograph4), Integer.valueOf(R$attr.uikit_colorInfograph5), Integer.valueOf(R$attr.uikit_colorInfograph6), Integer.valueOf(R$attr.uikit_colorInfograph7), Integer.valueOf(R$attr.uikit_colorInfograph8), Integer.valueOf(R$attr.uikit_colorInfograph9));
        ArrayList arrayList = new ArrayList(listK.size());
        int size = listK.size();
        for (int i22 = 0; i22 < size; i22++) {
            arrayList.add(new cb(((Number) listK.get(i22)).intValue(), i2, 6));
        }
        f10268m = arrayList;
    }

    public cb(int i2, int i3, int i5, boolean z) {
        this.f10269a = i2;
        this.f10270b = i3;
        this.f10271c = i5;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj2;
        return this.f10269a == cbVar.f10269a && this.f10270b == cbVar.f10270b && this.f10271c == cbVar.f10271c && this.d == cbVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.b(this.f10271c, j6.a.b(this.f10270b, Integer.hashCode(this.f10269a) * 31, 31), 31);
    }

    public /* synthetic */ cb(int i2, int i3, int i5) {
        this(i2, (i5 & 2) != 0 ? i2 : i3, R$attr.uikit_colorGrey10, (i5 & 8) == 0);
    }
}

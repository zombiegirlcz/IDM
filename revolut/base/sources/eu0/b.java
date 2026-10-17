package eu0;

import aw0.p8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f129450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f129451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f129452c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f129453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f129454h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f129455j;
    public final LinkedHashMap k;

    public b(List list, List list2, float f, float f4) {
        this.f129450a = list;
        this.f129451b = list2;
        this.f129452c = f;
        this.d = f4;
        p8 p8Var = (p8) d0.d0(list);
        float f5 = BitmapDescriptorFactory.HUE_RED;
        this.e = p8Var != null ? p8Var.f10471a : 0.0f;
        p8 p8Var2 = (p8) d0.o0(list);
        this.f = p8Var2 != null ? p8Var2.f10471a : 0.0f;
        p8 p8Var3 = (p8) d0.o0(list2);
        this.f129453g = p8Var3 != null ? p8Var3.f10471a : 0.0f;
        p8 p8Var4 = (p8) d0.d0(list2);
        this.f129454h = p8Var4 != null ? p8Var4.f10471a : 0.0f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.k = linkedHashMap;
        qk.d.b(linkedHashMap, list);
        qk.d.b(linkedHashMap, list2);
        Float f6 = (Float) linkedHashMap.get(d0.d0(list));
        float fFloatValue = f6 != null ? f6.floatValue() : 0.0f;
        Float f32 = (Float) linkedHashMap.get(d0.d0(list2));
        this.i = Math.min(fFloatValue, f32 != null ? f32.floatValue() : 0.0f);
        Float f35 = (Float) linkedHashMap.get(d0.o0(list));
        float fFloatValue2 = f35 != null ? f35.floatValue() : 0.0f;
        Float f36 = (Float) linkedHashMap.get(d0.o0(list2));
        this.f129455j = Math.max(fFloatValue2, f36 != null ? f36.floatValue() : f5);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f129450a, bVar.f129450a) && Intrinsics.f(this.f129451b, bVar.f129451b) && Float.compare(this.f129452c, bVar.f129452c) == 0 && Float.compare(this.d, bVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f129452c, p.a.d(this.f129450a.hashCode() * 31, 31, this.f129451b), 31);
    }
}

package aw0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f10594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10596c;
    public final LinkedHashMap d;
    public final t5 e;

    public x2(y2 header, ArrayList items, String str, LinkedHashMap itemHeaders, t5 t5Var) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemHeaders, "itemHeaders");
        this.f10594a = header;
        this.f10595b = items;
        this.f10596c = str;
        this.d = itemHeaders;
        this.e = t5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return this.f10594a.equals(x2Var.f10594a) && this.f10595b.equals(x2Var.f10595b) && Intrinsics.f(this.f10596c, x2Var.f10596c) && this.d.equals(x2Var.d) && this.e.equals(x2Var.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f10595b, this.f10594a.hashCode() * 31, 31);
        String str = this.f10596c;
        return this.e.f10541a.hashCode() + r6.b.e(this.d, (iB + (str == null ? 0 : str.hashCode())) * 31, 961);
    }
}

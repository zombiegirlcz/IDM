package t5e;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f268063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f268064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268065c;

    public f(e eVar, ArrayList tabs, String selectedPagerItemId) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        this.f268063a = eVar;
        this.f268064b = tabs;
        this.f268065c = selectedPagerItemId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f268063a, fVar.f268063a) && this.f268064b.equals(fVar.f268064b) && Intrinsics.f(this.f268065c, fVar.f268065c);
    }

    public final int hashCode() {
        e eVar = this.f268063a;
        return this.f268065c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f268064b, (eVar == null ? 0 : eVar.hashCode()) * 31, 31);
    }
}

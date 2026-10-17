package mxl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f210266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f210267c;

    public e(String groupId, String selectedDesignId, ArrayList designs) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(designs, "designs");
        Intrinsics.checkNotNullParameter(selectedDesignId, "selectedDesignId");
        this.f210265a = groupId;
        this.f210266b = designs;
        this.f210267c = selectedDesignId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f210265a, eVar.f210265a) && this.f210266b.equals(eVar.f210266b) && Intrinsics.f(this.f210267c, eVar.f210267c);
    }

    public final int hashCode() {
        return this.f210267c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f210266b, this.f210265a.hashCode() * 31, 31);
    }
}

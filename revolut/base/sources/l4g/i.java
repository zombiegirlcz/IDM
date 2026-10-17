package l4g;

import cli.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f192116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f192117c;

    public i(String selectedTabId, ArrayList bottomBarItems, List menuItems) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(bottomBarItems, "bottomBarItems");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f192115a = selectedTabId;
        this.f192116b = bottomBarItems;
        this.f192117c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f192115a, iVar.f192115a) && this.f192116b.equals(iVar.f192116b) && Intrinsics.f(this.f192117c, iVar.f192117c);
    }

    public final int hashCode() {
        return this.f192117c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f192116b, this.f192115a.hashCode() * 31, 31);
    }
}

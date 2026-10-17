package qgf;

import aw0.e4;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f245807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f245808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f245809c;
    public final String d;
    public final e4 e;

    public m(l navBarModel, boolean z, ArrayList monthTabs, String str, e4 manualFilterState) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(monthTabs, "monthTabs");
        Intrinsics.checkNotNullParameter(manualFilterState, "manualFilterState");
        this.f245807a = navBarModel;
        this.f245808b = z;
        this.f245809c = monthTabs;
        this.d = str;
        this.e = manualFilterState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f245807a.equals(mVar.f245807a) && this.f245808b == mVar.f245808b && this.f245809c.equals(mVar.f245809c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f245809c, j6.a.c(this.f245807a.hashCode() * 31, 31, this.f245808b), 31);
        String str = this.d;
        return this.e.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}

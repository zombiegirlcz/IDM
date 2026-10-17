package qgf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f245804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f245805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f245806c;
    public final boolean d;
    public final k e;

    public l(Clause title, Clause clause, Image image, boolean z, k titleMode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleMode, "titleMode");
        this.f245804a = title;
        this.f245805b = clause;
        this.f245806c = image;
        this.d = z;
        this.e = titleMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f245804a, lVar.f245804a) && Intrinsics.f(this.f245805b, lVar.f245805b) && Intrinsics.f(this.f245806c, lVar.f245806c) && this.d == lVar.d && this.e == lVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f245804a.hashCode() * 31;
        Clause clause = this.f245805b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f245806c;
        return this.e.hashCode() + j6.a.c((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31, 31, this.d);
    }
}

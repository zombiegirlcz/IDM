package bx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f19425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f19426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f19427c;

    public m(Clause startLabel, Clause endLabel, Image startIcon) {
        Intrinsics.checkNotNullParameter(startIcon, "startIcon");
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        this.f19425a = startIcon;
        this.f19426b = startLabel;
        this.f19427c = endLabel;
    }

    public final Clause a() {
        return this.f19427c;
    }

    public final Image b() {
        return this.f19425a;
    }

    public final Clause c() {
        return this.f19426b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f19425a, mVar.f19425a) && Intrinsics.f(this.f19426b, mVar.f19426b) && Intrinsics.f(this.f19427c, mVar.f19427c);
    }

    public final int hashCode() {
        return this.f19427c.hashCode() + p.a.a(this.f19425a.hashCode() * 31, 31, this.f19426b);
    }
}

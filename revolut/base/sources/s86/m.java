package s86;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f260916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayeredImage f260917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f260918c;
    public final Clause d;

    public m(Clause title, LayeredImage layeredImage, List actions, Clause secondaryDescription) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(secondaryDescription, "secondaryDescription");
        this.f260916a = title;
        this.f260917b = layeredImage;
        this.f260918c = actions;
        this.d = secondaryDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f260916a.equals(mVar.f260916a) && this.f260917b.equals(mVar.f260917b) && Intrinsics.f(this.f260918c, mVar.f260918c) && this.d.equals(mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(h30.l.e(this.f260917b, this.f260916a.hashCode() * 31, 31), 31, this.f260918c);
    }
}

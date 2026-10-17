package bw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f19188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f19189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f19190c;
    public final boolean d;
    public final Object e;

    public m(Clause clause, l type, Image image, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f19188a = clause;
        this.f19189b = type;
        this.f19190c = image;
        this.d = z;
        this.e = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f19188a, mVar.f19188a) && this.f19189b == mVar.f19189b && Intrinsics.f(this.f19190c, mVar.f19190c) && this.d == mVar.d && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f19188a;
        int iHashCode = (this.f19189b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31)) * 31;
        Image image = this.f19190c;
        int iC = j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.d);
        Object obj2 = this.e;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }

    public /* synthetic */ m(Clause clause, l lVar, ResourceImage resourceImage, boolean z, Object obj2, int i) {
        this((i & 1) != 0 ? null : clause, lVar, (i & 4) != 0 ? null : resourceImage, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : obj2);
    }
}

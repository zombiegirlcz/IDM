package lc0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f193765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f193766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f193767c;
    public final Image d;
    public final boolean e;
    public final boolean f;

    public q() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f193765a, qVar.f193765a) && Intrinsics.f(this.f193766b, qVar.f193766b) && Intrinsics.f(this.f193767c, qVar.f193767c) && Intrinsics.f(this.d, qVar.d) && this.e == qVar.e && this.f == qVar.f;
    }

    public final int hashCode() {
        Clause clause = this.f193765a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f193766b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f193767c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iHashCode3 + (image2 != null ? image2.hashCode() : 0)) * 31, 31, this.e);
    }

    public /* synthetic */ q(int i) {
        this(null, null, null, null, false, false);
    }

    public q(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, ResourceImage resourceImage, ResourceImage resourceImage2, boolean z, boolean z3) {
        this.f193765a = textLocalisedClause;
        this.f193766b = textLocalisedClause2;
        this.f193767c = resourceImage;
        this.d = resourceImage2;
        this.e = z;
        this.f = z3;
    }
}

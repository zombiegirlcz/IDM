package xd1;

import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f304212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NumberClause f304213b;

    public f(ResourceImage icon, NumberClause numberClause) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f304212a = icon;
        this.f304213b = numberClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f304212a.equals(fVar.f304212a) && Intrinsics.f(this.f304213b, fVar.f304213b);
    }

    public final int hashCode() {
        int iB = org.bouncycastle.jcajce.provider.digest.a.b(this.f304212a, Boolean.hashCode(true) * 31, 31);
        NumberClause numberClause = this.f304213b;
        return iB + (numberClause == null ? 0 : numberClause.hashCode());
    }
}

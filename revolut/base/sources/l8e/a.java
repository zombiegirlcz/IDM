package l8e;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;
import pcd.v;
import pcd.x;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f192957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f192958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f192959c;
    public final wi0.b d;
    public final boolean e;

    public a(v vaultInvite, x currentMember, LayeredImage image, wi0.b currentMemberCountry, boolean z) {
        Intrinsics.checkNotNullParameter(vaultInvite, "vaultInvite");
        Intrinsics.checkNotNullParameter(currentMember, "currentMember");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(currentMemberCountry, "currentMemberCountry");
        this.f192957a = vaultInvite;
        this.f192958b = currentMember;
        this.f192959c = image;
        this.d = currentMemberCountry;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f192957a, aVar.f192957a) && Intrinsics.f(this.f192958b, aVar.f192958b) && this.f192959c.equals(aVar.f192959c) && this.d.equals(aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(h30.l.e(this.f192959c, (this.f192958b.hashCode() + (this.f192957a.hashCode() * 31)) * 31, 31), 31, this.d.f297794a);
    }
}

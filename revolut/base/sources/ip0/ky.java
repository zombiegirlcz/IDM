package ip0;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ky implements koi.j, qv0.o, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f165095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165096c;
    public int d;
    public final int e;
    public final int f;

    public ky(String listId, ResourceImage bgImage, int i, int i2, int i3) {
        i = (i3 & 4) != 0 ? R$attr.uikit_dp0 : i;
        i2 = (i3 & 8) != 0 ? R$attr.uikit_dp0 : i2;
        int i5 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        this.f165094a = listId;
        this.f165095b = bgImage;
        this.f165096c = i;
        this.d = i2;
        this.e = i5;
        this.f = i5;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getE() {
        return this.f165094a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ky)) {
            return false;
        }
        ky kyVar = (ky) obj2;
        return this.f165094a.equals(kyVar.f165094a) && this.f165095b.equals(kyVar.f165095b) && this.f165096c == kyVar.f165096c && this.d == kyVar.d && this.e == kyVar.e && this.f == kyVar.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51602s() {
        return this.f165096c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165096c = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f165096c, org.bouncycastle.jcajce.provider.digest.a.b(this.f165095b, this.f165094a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51603t() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getV() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getU() {
        return this.e;
    }
}

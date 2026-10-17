package ip0;

import com.revolut.core.ui_kit.delegates.BackgroundSelectionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h2 implements koi.j, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f164493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f164494c;
    public final j2 d;

    public h2(String listId, ResourceImage icon, TextLocalisedClause title, j2 sizeMode) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sizeMode, "sizeMode");
        this.f164492a = listId;
        this.f164493b = icon;
        this.f164494c = title;
        this.d = sizeMode;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new BackgroundSelectionButtonDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52406p() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52397a() {
        return this.f164492a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return this.f164492a.equals(h2Var.f164492a) && this.f164493b.equals(h2Var.f164493b) && this.f164494c.equals(h2Var.f164494c) && this.d == h2Var.d;
    }

    public final int hashCode() {
        return (this.d.hashCode() + t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f164493b, this.f164492a.hashCode() * 31, 31), 31, this.f164494c)) * 31;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof h2 ? (h2) oldItem : null) == null) {
            return null;
        }
        return new i2(!r6.f164493b.equals(this.f164493b), !r6.f164494c.equals(this.f164494c), ((h2) oldItem).d != this.d);
    }
}

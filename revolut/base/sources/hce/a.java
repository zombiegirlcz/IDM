package hce;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f150879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f150880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f150881c;
    public final Image d;
    public final Image e;
    public final AvatarModel.Border f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f150882g;

    public a(Clause title, Clause description, Clause clause, Image icon, Image image, AvatarModel.Border.StaticGradient staticGradient, Object obj2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f150879a = title;
        this.f150880b = description;
        this.f150881c = clause;
        this.d = icon;
        this.e = image;
        this.f = staticGradient;
        this.f150882g = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f150879a, aVar.f150879a) && Intrinsics.f(this.f150880b, aVar.f150880b) && Intrinsics.f(this.f150881c, aVar.f150881c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f150882g, aVar.f150882g);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f150879a.hashCode() * 31, 31, this.f150880b);
        Clause clause = this.f150881c;
        int iC = a10.b.c(this.d, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Image image = this.e;
        int iHashCode = (iC + (image == null ? 0 : image.hashCode())) * 31;
        AvatarModel.Border border = this.f;
        int iHashCode2 = (iHashCode + (border == null ? 0 : border.hashCode())) * 31;
        Object obj2 = this.f150882g;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public /* synthetic */ a(Clause clause, Clause clause2, Clause clause3, Image image, Image image2, Serializable serializable, int i) {
        this(clause, clause2, clause3, image, (i & 16) != 0 ? null : image2, (AvatarModel.Border.StaticGradient) null, (i & 64) != 0 ? null : serializable);
    }
}

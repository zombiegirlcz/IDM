package d0d;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f110340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f110341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f110342c;
    public final Integer d;
    public final aw0.k e;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f110340a, bVar.f110340a) && Intrinsics.f(this.f110341b, bVar.f110341b) && Intrinsics.f(this.f110342c, bVar.f110342c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f110340a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f110341b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f110342c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        aw0.k kVar = this.e;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }

    public b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, CdnImage cdnImage, Integer num, aw0.k kVar) {
        this.f110340a = textLocalisedClause;
        this.f110341b = textLocalisedClause2;
        this.f110342c = cdnImage;
        this.d = num;
        this.e = kVar;
    }

    public /* synthetic */ b(int i) {
        this(null, null, null, Integer.valueOf(R$drawable.uikit_icn_24_back), null);
    }
}

package zyc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f326411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f326412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f326413c;
    public final Integer d;
    public final aw0.k e;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f326411a, cVar.f326411a) && Intrinsics.f(this.f326412b, cVar.f326412b) && Intrinsics.f(this.f326413c, cVar.f326413c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f326411a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f326412b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f326413c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        aw0.k kVar = this.e;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }

    public c(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, CdnImage cdnImage, Integer num, aw0.k kVar) {
        this.f326411a = textLocalisedClause;
        this.f326412b = textLocalisedClause2;
        this.f326413c = cdnImage;
        this.d = num;
        this.e = kVar;
    }

    public /* synthetic */ c(int i) {
        this(null, null, null, Integer.valueOf(R$drawable.uikit_icn_24_back), null);
    }
}

package ip0;

import com.revolut.core.ui_kit.R$color;
import com.revolut.core.ui_kit.delegates.DropDownLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class gf implements tw0.y, qv0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f164403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f164404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f164405c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164407h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f164408j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f164409l;

    public gf(TextLocalisedClause textLocalisedClause) {
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, Integer.valueOf(R$color.internal_color_input_dropdown), (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_FC_SPEED_MODE);
        Intrinsics.checkNotNullParameter("LOADING_ITEM_ID", "listId");
        int i = R$attr.uikit_dp0;
        this.f164403a = textLocalisedClause;
        this.f164404b = resourceImage;
        this.f164405c = "LOADING_ITEM_ID";
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f164406g = null;
        this.f164407h = null;
        this.i = i;
        this.f164408j = i;
        this.k = i;
        this.f164409l = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new DropDownLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53150a() {
        return this.f164405c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gf)) {
            return false;
        }
        gf gfVar = (gf) obj2;
        return Intrinsics.f(this.f164403a, gfVar.f164403a) && Intrinsics.f(this.f164404b, gfVar.f164404b) && Intrinsics.f(this.f164405c, gfVar.f164405c) && Intrinsics.f(this.d, gfVar.d) && Intrinsics.f(this.e, gfVar.e) && Intrinsics.f(this.f, gfVar.f) && Intrinsics.f(this.f164406g, gfVar.f164406g) && Intrinsics.f(this.f164407h, gfVar.f164407h) && this.i == gfVar.i && this.f164408j == gfVar.f164408j && this.k == gfVar.k && this.f164409l == gfVar.f164409l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53157m() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        TextLocalisedClause textLocalisedClause = this.f164403a;
        int iHashCode = (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode()) * 31;
        ResourceImage resourceImage = this.f164404b;
        int i = h30.l.i(this.d, p.a.c((iHashCode + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31, 31, this.f164405c), 31);
        p31.c cVar = this.e;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164406g;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164407h;
        return Integer.hashCode(this.f164409l) + j6.a.b(this.k, j6.a.b(this.f164408j, j6.a.b(this.i, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f164407h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53155j() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53158n() {
        return this.f164408j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53159p() {
        return this.f164409l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164408j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53154h() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53156l() {
        return this.f164406g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164407h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164406g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof gf ? (gf) oldItem : null) == null) {
            return null;
        }
        gf gfVar = (gf) oldItem;
        return new hf(!Intrinsics.f(gfVar.f164403a, this.f164403a), !Intrinsics.f(gfVar.f164404b, this.f164404b), !Intrinsics.f(gfVar.d, this.d));
    }
}

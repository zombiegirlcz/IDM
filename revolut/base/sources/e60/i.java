package e60;

import com.revolut.controller_extension_media_picker.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import ip0.u00;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f122849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f122850c;
    public final boolean d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f122851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f122852h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u00 f122853j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f122854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f122855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final oli.m f122856n;

    public i() {
        this(null, null, null, false, 0, 0, null, null, false, null, null, 16383);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f122848a, iVar.f122848a) && Intrinsics.f(this.f122849b, iVar.f122849b) && Intrinsics.f(this.f122850c, iVar.f122850c) && this.d == iVar.d && this.e == iVar.e && this.f == iVar.f && Intrinsics.f(this.f122851g, iVar.f122851g) && Intrinsics.f(this.f122852h, iVar.f122852h) && this.i == iVar.i && this.f122853j == iVar.f122853j && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f122854l, iVar.f122854l) && this.f122855m == iVar.f122855m && this.f122856n == iVar.f122856n;
    }

    public final int hashCode() {
        String str = this.f122848a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Clause clause = this.f122849b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f122850c;
        int iC = j6.a.c(p.a.d(p.a.d(j6.a.b(this.f, j6.a.b(this.e, j6.a.c((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.d), 31), 31), 31, this.f122851g), 31, this.f122852h), 31, this.i);
        u00 u00Var = this.f122853j;
        return this.f122856n.hashCode() + j6.a.c((this.f122854l.f122865a.hashCode() + p.a.d((iC + (u00Var != null ? u00Var.hashCode() : 0)) * 31, 31, this.k)) * 31, 31, this.f122855m);
    }

    public i(String str, Clause clause, Clause clause2, boolean z, int i, int i2, List documentFileTypes, List imageFileTypes, boolean z3, u00 u00Var, List customItems, n denialExplanations, boolean z4, oli.m cameraHandlerType) {
        Intrinsics.checkNotNullParameter(documentFileTypes, "documentFileTypes");
        Intrinsics.checkNotNullParameter(imageFileTypes, "imageFileTypes");
        Intrinsics.checkNotNullParameter(customItems, "customItems");
        Intrinsics.checkNotNullParameter(denialExplanations, "denialExplanations");
        Intrinsics.checkNotNullParameter(cameraHandlerType, "cameraHandlerType");
        this.f122848a = str;
        this.f122849b = clause;
        this.f122850c = clause2;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.f122851g = documentFileTypes;
        this.f122852h = imageFileTypes;
        this.i = z3;
        this.f122853j = u00Var;
        this.k = customItems;
        this.f122854l = denialExplanations;
        this.f122855m = z4;
        this.f122856n = cameraHandlerType;
    }

    public i(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z, int i, int i2, List list, aim.e eVar, boolean z3, u00 u00Var, oli.m mVar, int i3) {
        List list2;
        List list3;
        String str2;
        oli.m mVar2;
        String str3 = (i3 & 1) != 0 ? null : str;
        TextLocalisedClause textLocalisedClause3 = (i3 & 2) != 0 ? null : textLocalisedClause;
        TextLocalisedClause textLocalisedClause4 = (i3 & 4) != 0 ? null : textLocalisedClause2;
        boolean z4 = (i3 & 8) != 0 ? false : z;
        int i5 = (i3 & 16) != 0 ? R$string.media_picker_dialog_action_upload_document : i;
        int i6 = (i3 & 32) != 0 ? R$drawable.uikit_icn_24_document : i2;
        if ((i3 & 64) != 0) {
            o.Companion.getClass();
            list2 = b.f122838c;
        } else {
            list2 = list;
        }
        if ((i3 & 128) != 0) {
            o.Companion.getClass();
            list3 = b.f122837b;
        } else {
            list3 = eVar;
        }
        boolean z6 = (i3 & 256) != 0 ? false : z3;
        u00 u00Var2 = (i3 & 512) != 0 ? u00.FRONT : u00Var;
        f0 f0Var = f0.f322471a;
        String str4 = str3;
        n nVar = new n(new PermissionsFlowContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.media_picker_permission_camera_explanation_title, null, null, 14), new TextLocalisedClause(R$string.media_picker_permission_camera_explanation_message, null, null, 14), new TextLocalisedClause(R$string.media_picker_permission_any_explanation_action, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30), (TextClause) null, 48));
        boolean z11 = (i3 & 4096) == 0;
        if ((i3 & 8192) != 0) {
            str2 = str4;
            mVar2 = oli.m.DEFAULT;
        } else {
            str2 = str4;
            mVar2 = mVar;
        }
        this(str2, textLocalisedClause3, textLocalisedClause4, z4, i5, i6, list2, list3, z6, u00Var2, f0Var, nVar, z11, mVar2);
    }
}

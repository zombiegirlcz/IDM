package lc0;

import android.graphics.Bitmap;
import com.revolut.core.backend_flow.photo.R$string;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreenContract$InputData;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission;
import ip0.yt;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.v1;
import vkm.z1;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 extends oki.h implements o {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CardPhotoScreenContract$InputData f193739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jc0.d f193740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hc0.b f193741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f193742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y80.a f193743t;
    public final cli.y u;
    public final z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1 f193744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f193745x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f193746y;

    public b0(k stateMapper, CardPhotoScreenContract$InputData inputData, jc0.d selfieWithCardRepository, hc0.b selfieFileRepository, j60.a bottomExpandableDialogControllerExtension, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(selfieWithCardRepository, "selfieWithCardRepository");
        Intrinsics.checkNotNullParameter(selfieFileRepository, "selfieFileRepository");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.o = stateMapper;
        this.f193739p = inputData;
        this.f193740q = selfieWithCardRepository;
        this.f193741r = selfieFileRepository;
        this.f193742s = bottomExpandableDialogControllerExtension;
        this.f193743t = permissionProvider;
        this.u = mra.d.b(this, new j(l.HIDDEN, 64), stateMapper, null, false, 12);
        this.v = vkm.q.b(1, 5, null);
        this.f193744w = vkm.q.b(1, 5, null);
        this.f193745x = vkm.q.b(1, 4, null);
        this.f193746y = vkm.q.b(1, 5, null);
    }

    @Override // yji.l
    public final void I1() {
        if (this.f193743t.c("android.permission.CAMERA")) {
            J2();
        } else {
            yji.l.i2(this, new PermissionsFlow(zhm.u.c(new PermissionsFlowContract$Permission("android.permission.CAMERA", null, 6))), null, new w(this, 2), 1);
        }
    }

    public final h I2(Bitmap bitmap, Bitmap bitmap2, boolean z, l numberCoverMode) {
        Intrinsics.checkNotNullParameter(numberCoverMode, "numberCoverMode");
        n nVar = this.f193739p.f51306c;
        if (bitmap2 != null) {
            int i = x.f193776a[nVar.ordinal()];
            if (i == 1) {
                return new g(bitmap2, true, false, numberCoverMode);
            }
            if (i == 2) {
                return new g(bitmap2, true, true, numberCoverMode);
            }
            if (i == 3) {
                return new g(bitmap2, bitmap != null, bitmap == null, numberCoverMode);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (bitmap != null && !z) {
            return new g(bitmap, nVar == n.SELFIE_WITH_CARD, true, numberCoverMode);
        }
        int i2 = x.f193776a[nVar.ordinal()];
        if (i2 == 1) {
            return new f(true, false);
        }
        if (i2 == 2) {
            return new f(true, true);
        }
        if (i2 == 3) {
            return new f(bitmap != null, bitmap == null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void J2() {
        this.f193745x.k(Unit.f186387a);
        if (this.f193739p.f51306c == n.SELFIE_WITH_CARD) {
            ((c0) this.o).getClass();
            List listK = zhm.v.k(new Pair(Integer.valueOf(R$string.cnp_selfie_instructions_items_name), Integer.valueOf(R$drawable.uikit_icn_24_paragraph)), new Pair(Integer.valueOf(R$string.cnp_selfie_instructions_items_card_last_digits), Integer.valueOf(R$drawable.uikit_icn_24_card)), new Pair(Integer.valueOf(R$string.cnp_selfie_instructions_items_card_first_digits), Integer.valueOf(R$drawable.uikit_icn_24_scan_card)), new Pair(Integer.valueOf(R$string.cnp_selfie_instructions_items_face), Integer.valueOf(R$drawable.uikit_icn_24_profile)));
            ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
            int i = 0;
            for (Object obj2 : listK) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                Pair pair = (Pair) obj2;
                arrayList.add(new ListCellDelegate.Model(a0.d.n("ACTION_DIALOG_ITEM_LIST_ID", i), new j8(new ResourceImage(((Number) pair.f186386b).intValue(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), yt.TOP), new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), null, false, null, null, i == 0 ? R$attr.uikit_dp32 : R$attr.uikit_dp16, 0, 0, 0, 3832));
                i = i2;
            }
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cnp_selfie_instructions_footer_button, null, null, 14);
            int i3 = R$attr.uikit_dp16;
            int i5 = R$attr.uikit_dp32;
            this.f193742s.x(new rp0.y(zhm.d0.F0(new LargeActionButtonDelegate.Model("ACTION_DIALOG_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i5, i5, i3, i3, 496), arrayList), new rp0.t(new TextLocalisedClause(R$string.instructions_title, null, null, 14), new TextLocalisedClause(R$string.instructions_caption, null, null, 14), null, 28), null, null, null, null, 1020));
        }
    }

    public final void K2() {
        int i = x.f193776a[this.f193739p.f51306c.ordinal()];
        Continuation continuation = null;
        if (i != 1) {
            if (i == 2) {
                yji.l.b1(this, new v1(new lb0.b0(this, continuation, 2)), null, new l1g.e(this, continuation, 20), 3);
                return;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (((j) ((j2) this.u.f22677a).getValue()).f193758b != null) {
            yji.l.b1(this, new v1(new lb0.b0(this, continuation, 2)), null, new l1g.e(this, continuation, 20), 3);
        } else {
            L2(new lbh.a(6));
        }
    }

    public final void L2(Function1 function1) {
        H2(this.u, new l9k.v(function1, this, 8));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, vkm.q.J(vkm.q.P(this.f193745x, 1), vkm.q.P(this.f193746y, 1)), null, new a0(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}

package com.revolut.feature.subaccount.impl.ui.qr_link;

import aw0.o9;
import aw0.t2;
import aw0.u2;
import aw0.v2;
import aw0.w2;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import f01.c;
import hx7.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mii.f;
import oki.h;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import sqd.h0;
import t8e.b;
import t8e.d;
import tqi.g;
import vkm.j2;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final g6e.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f89114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f89115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f89116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SubaccountQRLinkScreenContract$InputData f89117s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f89118t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(g6e.b subaccountBackgroundInteractor, g shareNaviCommandFactory, c70.a clipboard, c uiKitResources, SubaccountQRLinkScreenContract$InputData inputData, t8e.g stateMapper) {
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = subaccountBackgroundInteractor;
        this.f89114p = shareNaviCommandFactory;
        this.f89115q = clipboard;
        this.f89116r = uiKitResources;
        this.f89117s = inputData;
        this.f89118t = mra.d.b(this, new t8e.a(inputData.f89103a, inputData.f89104b, ShimmerImage.f60002a), stateMapper, null, false, 12);
        this.u = e.a(this, new suf.a(this, 25));
    }

    @Override // yji.l
    public final void I1() {
        l2(new h0(this, null, 17), new yi5.b(26));
    }

    public final void I2() {
        X1(new f("ACTION_POCKET_UPDATED_ID", new TextLocalisedClause(R$string.pocket_link_qr_action_success, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_16_check_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // fpa.e
    public final void O(ActionsView.Item action) {
        Intrinsics.checkNotNullParameter(action, "action");
        y yVar = this.f89118t;
        SubaccountQRLinkScreenContract$SubaccountInfo subaccountQRLinkScreenContract$SubaccountInfo = ((t8e.a) ((j2) yVar.f22677a).getValue()).f268879a;
        String str = action.f58316a;
        int iHashCode = str.hashCode();
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.u;
        if (iHashCode == -725439928) {
            if (str.equals("CHANGE_SUBACCOUNT_WALLPAPER_BUTTON_ID")) {
                h.v2(aVar, new SubaccountQRLinkScreenContract$ModalStep.ChangeWallpaper(subaccountQRLinkScreenContract$SubaccountInfo.f89111a, subaccountQRLinkScreenContract$SubaccountInfo.d, subaccountQRLinkScreenContract$SubaccountInfo.f89112b), popup);
            }
        } else if (iHashCode == -621783759) {
            if (str.equals("EDIT_SUBACCOUNT_NAME_BUTTON_ID")) {
                h.v2(aVar, new SubaccountQRLinkScreenContract$ModalStep.ChangeName(subaccountQRLinkScreenContract$SubaccountInfo.f89111a, subaccountQRLinkScreenContract$SubaccountInfo.f89113c, subaccountQRLinkScreenContract$SubaccountInfo.d), popup);
            }
        } else if (iHashCode == 2038650197 && str.equals("SHARE_SUBACCOUNT_LINK_BUTTON_ID")) {
            tqi.c cVar = new tqi.c(null, this.f89116r.b(new TextLocalisedClause(R$string.pocket_link_qr_action_share_link_content, u.c(new TextClause(((t8e.a) ((j2) yVar.f22677a).getValue()).f268880b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)).toString(), null, null, 91);
            m70.a.c(t0.f186434a);
            C1(u0.b(this.f89114p.g(cVar, "")));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f89118t;
    }

    @Override // fpa.e
    public final void t0(w2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        if (Intrinsics.f(click, t2.f10539a)) {
            this.f89115q.c(null, ((t8e.a) ((j2) this.f89118t.f22677a).getValue()).f268880b, false, new sii.a(this, 24));
        } else if (!Intrinsics.f(click, u2.f10554a) && !Intrinsics.f(click, v2.f10570a)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}

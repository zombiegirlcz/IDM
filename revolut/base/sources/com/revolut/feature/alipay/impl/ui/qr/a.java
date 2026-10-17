package com.revolut.feature.alipay.impl.ui.qr;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.alipay.api.R$string;
import com.revolut.feature.alipay.impl.ui.qr.AlipayPlusQrFlowContract$Page;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qk1.f;
import vb2.r;
import vk1.c;
import vk1.e;
import vk1.g;
import vk1.i;
import vk1.m;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements g {

    @NotNull
    public static final m Companion = new m();
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f61073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ali.b f61074q;

    public a(n stateMapper, f alipayPlusSdkInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(alipayPlusSdkInteractor, "alipayPlusSdkInteractor");
        this.o = alipayPlusSdkInteractor;
        this.f61073p = d.b(this, new vk1.h(v.k(AlipayPlusQrFlowContract$Page.Scanner.f61071a, AlipayPlusQrFlowContract$Page.ShowCode.f61072a), "SHOW_CODE", new TextLocalisedClause(R$string.alipay_plus_scan_qr_tab_scan, null, null, 14), new TextLocalisedClause(R$string.alipay_plus_scan_qr_tab_show, null, null, 14), u.c(new IconNavBarMenuItem("MENU_ITEM_INFO", new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.alipay_plus_scan_qr_button_info_accessibility_label, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION))), stateMapper, null, false, 12);
        this.f61074q = s.b(this, new vh9.b(this, 6));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f61074q;
    }

    @Override // yji.l
    public final void I1() {
        this.o.a();
    }

    public final void I2(vk1.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof c) {
            C2(i.f289853a);
            return;
        }
        if (event instanceof vk1.b) {
            B2();
            return;
        }
        boolean z = event instanceof vk1.d;
        y yVar = this.f61073p;
        if (z) {
            H2(yVar, new r(((vk1.d) event).f289848a.getF94249a(), 11));
        } else {
            if (!(event instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new r(((e) event).f289849a, 11));
        }
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f61073p;
    }
}

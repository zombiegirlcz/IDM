package ald;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocuments;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.sensitive_data_appearance_ui.R$string;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.n8;
import q35.z;
import rp0.b1;
import rp0.e1;
import rp0.f1;
import rp0.g1;
import rp0.k1;
import rp0.t;
import rp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object p0) {
        switch (this.f) {
            case 0:
                SlotContext p03 = (SlotContext) p0;
                Intrinsics.checkNotNullParameter(p03, "p0");
                r rVar = (r) this.receiver;
                return (tkd.l) rVar.f6245c.get(rVar.b(p03));
            case 1:
                String p010 = (String) p0;
                Intrinsics.checkNotNullParameter(p010, "p0");
                return ((atg.h) this.receiver).d(p010);
            case 2:
                String p011 = (String) p0;
                Intrinsics.checkNotNullParameter(p011, "p0");
                return ((atg.h) this.receiver).e(p011);
            case 3:
                Data p012 = (Data) p0;
                Intrinsics.checkNotNullParameter(p012, "p0");
                ((ihm.f) this.receiver).onNext(p012);
                return Unit.f186387a;
            case 4:
                ty0.a p013 = (ty0.a) p0;
                Intrinsics.checkNotNullParameter(p013, "p0");
                ((ihm.f) this.receiver).onNext(p013);
                return Unit.f186387a;
            case 5:
                h01.e p014 = (h01.e) p0;
                Intrinsics.checkNotNullParameter(p014, "p0");
                l5l.e eVar = (l5l.e) this.receiver;
                rp0.m mVar = eVar.k;
                Lazy lazy = eVar.f192341n;
                eqi.c cVar = eVar.i;
                h01.c cVarA = p014.a();
                if (p014.b() == h01.d.GESTURE) {
                    int i = l5l.c.f192336a[cVarA.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((k1) ((g1) lazy.getValue())).d(new ShotDialogDisplayer$Configuration("SHOT_ID", new TextLocalisedClause(R$string.blur_balances_tooltip_shown, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye_show, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.blur_balances_tooltip_action_undo, null, null, 14), null, f1.ABOVE_ANCHOR_VIEW, null, 208));
                        if (!cVar.f128469a.f137264a.getBoolean("skip_balance_hiding_dialog", false)) {
                            mVar.b(false);
                        }
                    } else if (cVar.f128469a.f137264a.getBoolean("skip_balance_hiding_dialog", false)) {
                        ((k1) ((g1) lazy.getValue())).d(new ShotDialogDisplayer$Configuration("SHOT_ID", new TextLocalisedClause(R$string.blur_balances_tooltip_hidden, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.blur_balances_tooltip_action_undo, null, null, 14), null, f1.ABOVE_ANCHOR_VIEW, null, 208));
                    } else {
                        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.dialog_balances_hide_button_primary, null, null, 14), false, null, null, null, null, 1000);
                        yp0.b.r(model, R$attr.uikit_dp24, 0, 0, 0, 14);
                        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("DONT_SHOW_AGAIN", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.dialog_balances_hide_button_secondary, null, null, 14), false, null, null, null, null, 1000);
                        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
                        mVar.k(new y(v.k(model, model2), new t(new TextLocalisedClause(R$string.dialog_balances_hide_title, null, null, 14), new TextLocalisedClause(R$string.dialog_balances_hide_subtitle, null, null, 14), null, 28), null, null, null, null, 1020));
                    }
                }
                return Unit.f186387a;
            case 6:
                e1 p015 = (e1) p0;
                Intrinsics.checkNotNullParameter(p015, "p0");
                l5l.e eVar2 = (l5l.e) this.receiver;
                eVar2.getClass();
                if ((p015 instanceof b1) && Intrinsics.f(((b1) p015).a().getF55716a(), "SHOT_ID")) {
                    eVar2.f192337h.b();
                    ((k1) ((g1) eVar2.f192341n.getValue())).c();
                }
                return Unit.f186387a;
            case 7:
                xx4.b p016 = (xx4.b) p0;
                Intrinsics.checkNotNullParameter(p016, "p0");
                return (LoanDetails) ((xx4.d) this.receiver).a(p016);
            case 8:
                xx4.b p017 = (xx4.b) p0;
                Intrinsics.checkNotNullParameter(p017, "p0");
                return (List) ((xx4.d) this.receiver).a(p017);
            case 9:
                xx4.b p018 = (xx4.b) p0;
                Intrinsics.checkNotNullParameter(p018, "p0");
                return (z) ((xx4.d) this.receiver).a(p018);
            case 10:
                xx4.b p019 = (xx4.b) p0;
                Intrinsics.checkNotNullParameter(p019, "p0");
                return (List) ((xx4.d) this.receiver).a(p019);
            case 11:
                xx4.b p020 = (xx4.b) p0;
                Intrinsics.checkNotNullParameter(p020, "p0");
                return (List) ((xx4.d) this.receiver).a(p020);
            case 12:
                xx4.b p021 = (xx4.b) p0;
                Intrinsics.checkNotNullParameter(p021, "p0");
                return (ux4.b) ((xx4.d) this.receiver).a(p021);
            case 13:
                xx4.b p022 = (xx4.b) p0;
                Intrinsics.checkNotNullParameter(p022, "p0");
                return (ux4.b) ((xx4.d) this.receiver).a(p022);
            case 14:
                xx4.b p023 = (xx4.b) p0;
                Intrinsics.checkNotNullParameter(p023, "p0");
                return (LoanDocuments) ((xx4.d) this.receiver).a(p023);
            case 15:
                xx4.b p024 = (xx4.b) p0;
                Intrinsics.checkNotNullParameter(p024, "p0");
                return (List) ((xx4.d) this.receiver).a(p024);
            case 16:
                Unit p025 = (Unit) p0;
                Intrinsics.checkNotNullParameter(p025, "p0");
                ((ihm.f) this.receiver).onNext(p025);
                return Unit.f186387a;
            case 17:
                String p026 = (String) p0;
                Intrinsics.checkNotNullParameter(p026, "p0");
                PinCodeView pinCodeView = (PinCodeView) this.receiver;
                PinCodeView.Companion companion = PinCodeView.INSTANCE;
                pinCodeView.A0(p026);
                return Unit.f186387a;
            case 18:
                String p027 = (String) p0;
                Intrinsics.checkNotNullParameter(p027, "p0");
                PinCodeView.n0((PinCodeView) this.receiver, p027);
                return Unit.f186387a;
            case 19:
                n8 p028 = (n8) p0;
                Intrinsics.checkNotNullParameter(p028, "p0");
                ((ihm.f) this.receiver).onNext(p028);
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((ConcurrentHashMap) this.receiver).get(p0);
        }
    }
}

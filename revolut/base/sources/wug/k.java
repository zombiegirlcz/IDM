package wug;

import cli.n;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card.view_pin.api.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import md6.s;
import uvg.b0;
import uvg.d0;
import uvg.p;
import wvg.b2;
import wvg.d1;
import wvg.f1;
import wxe.e0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300144a;

    public /* synthetic */ k(int i) {
        this.f300144a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f300144a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new f(null, null, null, (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null)));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return wuk.l.f300200a;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new ResourceImage(R$drawable.uikit_icn_circle_background, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone5), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 4:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, false, false, null));
            case 5:
                Function1 defaultFactory2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory2, "defaultFactory");
                return (List) defaultFactory2.invoke(new iii.d(14, null, false, false, null));
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "defaultFactory");
                return f0.f322471a;
            case 7:
                Function1 defaultFactory3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory3, "defaultFactory");
                return (List) defaultFactory3.invoke(new iii.d(14, null, false, false, null));
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new wv2.g(4, new TextLocalisedClause(R$string.card_view_pin_title, null, null, 14), (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null)));
            case 9:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new wv4.h((List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null)), null);
            case 10:
                uvg.m dto = (uvg.m) obj3;
                Intrinsics.checkNotNullParameter((wvg.l) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto, "dto");
                uvg.l chart = dto.getChart();
                if (chart != null) {
                    return w0.w(chart, dto.getLastModified());
                }
                return null;
            case 11:
                p dto2 = (p) obj3;
                Intrinsics.checkNotNullParameter((wvg.p) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto2, "dto");
                return ksj.b.F(dto2.getChart(), dto2.getLastModified());
            case 12:
                d0 dto3 = (d0) obj3;
                Intrinsics.checkNotNullParameter((wvg.e) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto3, "dto");
                b0 chart2 = dto3.getChart();
                if (chart2 != null) {
                    return s.s(chart2);
                }
                return null;
            case 13:
                uvg.m dto4 = (uvg.m) obj3;
                Intrinsics.checkNotNullParameter((d1) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto4, "dto");
                uvg.l chart3 = dto4.getChart();
                if (chart3 != null) {
                    return w0.w(chart3, dto4.getLastModified());
                }
                return null;
            case 14:
                p dto5 = (p) obj3;
                Intrinsics.checkNotNullParameter((f1) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto5, "dto");
                return ksj.b.F(dto5.getChart(), dto5.getLastModified());
            case 15:
                d0 dto6 = (d0) obj3;
                Intrinsics.checkNotNullParameter((b2) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto6, "dto");
                b0 chart4 = dto6.getChart();
                if (chart4 != null) {
                    return s.s(chart4);
                }
                return null;
            case 16:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, false, true, null));
            case 17:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_poa_confirm_address_button, null, null, 14);
                return new ww8.j(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_poa_confirm_address_new_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_poa_confirm_address_new_title, null, null, 14), textLocalisedClause, list, false);
            case 18:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, true, null));
            case 19:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return (List) getDefaultErrorItems7.invoke(new iii.d(12, null, true, true, null));
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                Function1 getDefaultErrorItems8 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return (List) getDefaultErrorItems8.invoke(new iii.d(12, null, true, true, null));
            case 22:
                Function1 getDefaultErrorItems9 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems9, "getDefaultErrorItems");
                return new e0(wxe.b0.f300898a, (List) getDefaultErrorItems9.invoke(new iii.d(14, null, false, false, null)));
            case 23:
                Throwable error = (Throwable) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (tradingLegalEntityInformation == null) {
                    return error;
                }
                return null;
            case 24:
                Throwable th10 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th10;
                }
                return null;
            case 25:
                Throwable th11 = (Throwable) obj2;
                if (((TradingLegalEntityInformation) obj3) == null) {
                    return th11;
                }
                return null;
            case 26:
                ((Boolean) obj2).booleanValue();
                return h0.f322473a;
            case 27:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var);
                return null;
            case 28:
                Function1 getDefaultErrorItems10 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems10, "getDefaultErrorItems");
                return (List) getDefaultErrorItems10.invoke(new iii.d(14, null, false, false, null));
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
        }
    }

    public /* synthetic */ k(n nVar, int i) {
        this.f300144a = i;
    }
}

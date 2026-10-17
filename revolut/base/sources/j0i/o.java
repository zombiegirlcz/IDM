package j0i;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature_crypto_picker.api.CryptoPickerDestination;
import com.revolut.feature_crypto_picker.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ieg.z;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ny5.e f170052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoPickerDestination.CryptoPickerInputData f170053b;

    public o(ny5.e rateTilesMapper, CryptoPickerDestination.CryptoPickerInputData inputData) {
        Intrinsics.checkNotNullParameter(rateTilesMapper, "rateTilesMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f170052a = rateTilesMapper;
        this.f170053b = inputData;
    }

    public final ArrayList a(cw5.a aVar, a aVar2) {
        CompositeClause compositeClause;
        CompositeClause compositeClause2;
        int i;
        CryptoPickerDestination.CryptoPickerConfig cryptoPickerConfig = this.f170053b.d;
        if (cryptoPickerConfig.f96803b) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_picker_header_title, null, null, 14);
            m70.a.a(t0.f186434a);
            compositeClause = new CompositeClause(v.k(textLocalisedClause, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(String.valueOf(aVar.f109531a.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
        } else {
            compositeClause = null;
        }
        if (cryptoPickerConfig.f96803b) {
            c cVar = aVar2.f170040b;
            Float fValueOf = Float.valueOf(16.0f);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_picker_header_label, null, null, 14);
            int i2 = n.f170051a[cVar.ordinal()];
            if (i2 == 1) {
                i = R$drawable.uikit_icn_24_arrow_thin_up;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_arrow_thin_down;
            }
            compositeClause2 = new CompositeClause(v.k(textLocalisedClause2, new ImageClause(i, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16)), null, null, null, 14);
        } else {
            compositeClause2 = null;
        }
        return gw5.b.a(this.f170052a, compositeClause, compositeClause2, aVar, cryptoPickerConfig.f96802a == g0i.b.SINGLE ? gw5.a.ROWS : gw5.a.SELECTABLE_ROWS, R$attr.uikit_dp16, null, "CRYPTO_PICKER_SUBHEADER", d0.d1(aVar2.i), new iwk.b(25), null, null, 7168);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Data data;
        List listC;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f170039a;
        List list = domainState.f;
        if (str.length() <= 0 || !list.isEmpty()) {
            Data data2 = domainState.f170042g;
            Data data3 = domainState.f170043h;
            List list2 = (List) data2.getContent();
            List list3 = (List) data3.getContent();
            if (list2 == null && list3 == null) {
                data = data2.getError() != null ? new Data(null, data2.getError(), false, 5, null) : data3.getError() != null ? new Data(null, data3.getError(), false, 5, null) : new Data(null, null, true, 3, null);
            } else {
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                if (list3 == null) {
                    list3 = f0.f322471a;
                }
                data = new Data(new cw5.a(list, list2, list3), null, false, 6, null);
            }
            listC = (List) iii.c.f(data, new iyi.i(this, 3), new fb.c(domainState, this, 21), new z(this, domainState, 13));
        } else {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("NO_SEARCH_ITEM_ID", new TextLocalisedClause(R$string.crypto_picker_no_results_title, null, null, 14), new TextLocalisedClause(R$string.crypto_picker_no_results_description, u.c(domainState.f170039a), null, 12), new ComplexImage.Regular(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_search, R$attr.uikit_colorForeground, R$attr.uikit_colorTransparent)), new l6(12, new TextLocalisedClause(R.string.common_action_clear, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model);
        }
        return new d(domainState.f170044j.f263435a, listC, this.f170053b.d.f96802a == g0i.b.MULTI && !domainState.i.isEmpty());
    }
}

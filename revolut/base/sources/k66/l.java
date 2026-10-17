package k66;

import android.os.Parcelable;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ComparisonCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.c4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.defi.settings.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.hb;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import ms0.e4;
import ms0.h4;
import ms0.j4;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(ArrayList arrayList) {
        int size = (arrayList.size() + 1) / 2;
        IntRange intRangeO = kotlin.ranges.f.o(0, size);
        ArrayList arrayList2 = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            int i = iNextInt + size;
            arrayList2.add(new ComparisonCellDelegate.Model(a0.d.n("DEFI_RECOVERY_PHRASE_WORD_ROW_", iNextInt), b(iNextInt + 1, (String) arrayList.get(iNextInt)), b(i + 1, (String) ((i < 0 || i >= arrayList.size()) ? "" : arrayList.get(i))), null, R$attr.uikit_dp8, 760));
        }
        return arrayList2;
    }

    public static c4 b(int i, String str) {
        return new c4(new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_word_pattern, v.k(String.valueOf(i), str), null, 12), hb.START, 2);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        ArrayList arrayListA;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        i iVar = domainState.f181648a;
        if (iVar instanceof g) {
            ArrayList arrayList = new ArrayList(12);
            for (int i = 0; i < 12; i++) {
                arrayList.add("seed");
            }
            arrayListA = a(arrayList);
            yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        } else {
            if (!(iVar instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            c66.e eVar = ((h) iVar).f181650a;
            int size = eVar.f21683a.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(new String((byte[]) eVar.f21683a.get(i2), Charsets.d));
            }
            ArrayList arrayListA2 = a(arrayList2);
            yp0.b.k(arrayListA2, 0, 0, 0, 0, 31);
            arrayListA = arrayListA2;
        }
        eVarB.addAll(arrayListA);
        boolean z = domainState.f181648a instanceof g;
        SmallActionButtonDelegate.Model model = new SmallActionButtonDelegate.Model("DEFI_RECOVERY_PHRASE_COPY_BUTTON_LIST_ID", h4.FLAT, !z ? new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, null, new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_copy_button_title, null, z ? new Custom(null, false, null, true, null, Constants.TAG_BLE_FIRMWARE_VERSION) : null, 10), z ? e4.DisabledNonClickable : e4.EnabledClickable, j4.f208300a, null, null, 0, 0, 0, 0, 32536);
        int i3 = R$attr.uikit_dp8;
        int i5 = R$attr.uikit_dp16;
        yp0.b.p(model, i3, i5, i5, i5);
        eVarB.add(model);
        eVarB.add(new ListSubheaderDelegate.Model("DEFI_RECOVERY_PHRASE_INFORMATION_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_information_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        List listK = v.k(new RowDelegate.Model("DEFI_RECOVERY_PHRASE_MASTER_KEY_INFO_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_information_master_key_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_information_master_key_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("DEFI_RECOVERY_PHRASE_NEVER_SHARE_INFO_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_information_never_share_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_information_never_share_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new j(u.a(eVarB));
    }
}

package jgh;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final int a(p pVar, int i) {
        List listK = v.k(Integer.valueOf(R$attr.uikit_colorTeal_80), Integer.valueOf(R$attr.uikit_colorLightBlue_80), Integer.valueOf(R$attr.uikit_colorIndigo_80), Integer.valueOf(R$attr.uikit_colorDeepPurple_80), Integer.valueOf(R$attr.uikit_colorPurple_80));
        return ((Number) listK.get(i % listK.size())).intValue();
    }
}

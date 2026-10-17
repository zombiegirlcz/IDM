package jgh;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f174050a;

    public i(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f174050a = uiKitResources;
    }

    public static final int a(i iVar, int i) {
        List listK = v.k(Integer.valueOf(R$attr.uikit_colorTeal_80), Integer.valueOf(R$attr.uikit_colorLightBlue_80), Integer.valueOf(R$attr.uikit_colorIndigo_80), Integer.valueOf(R$attr.uikit_colorPurple_80), Integer.valueOf(R$attr.uikit_colorTerracotta_80));
        return ((Number) listK.get(i % listK.size())).intValue();
    }
}

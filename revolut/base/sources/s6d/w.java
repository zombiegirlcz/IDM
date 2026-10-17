package s6d;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.branding.impl.R$string;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mc4.h f260258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ks0.n f260259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f260260c;
    public final LinkedHashMap d;

    public w(mc4.h colorMapper, c90.a colorProvider, ks0.n settingsUrlHelper, uh1.a addressPrinter) {
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        Intrinsics.checkNotNullParameter(colorProvider, "colorProvider");
        Intrinsics.checkNotNullParameter(settingsUrlHelper, "settingsUrlHelper");
        Intrinsics.checkNotNullParameter(addressPrinter, "addressPrinter");
        this.f260258a = colorMapper;
        this.f260259b = settingsUrlHelper;
        n.Companion.getClass();
        List list = i.f260239b;
        int iB = q0.b(zhm.w.t(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : list) {
            linkedHashMap.put(this.f260258a.a(((Number) obj2).intValue()), obj2);
        }
        this.f260260c = linkedHashMap;
        n.Companion.getClass();
        List list2 = i.f260239b;
        int iB2 = q0.b(zhm.w.t(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (Object obj3 : list2) {
            int iIntValue = ((Number) obj3).intValue();
            linkedHashMap2.put(obj3, Integer.valueOf(iIntValue == R$attr.uikit_colorBlue ? R$string.merchant_profile_branding_colors_default : iIntValue == R$attr.uikit_colorDeepPurple ? R$string.merchant_profile_branding_colors_purple : iIntValue == R$attr.uikit_colorPink ? R$string.merchant_profile_branding_colors_pink : iIntValue == R$attr.uikit_colorTeal ? R$string.merchant_profile_branding_colors_teal : R$string.merchant_profile_branding_colors_default));
        }
        this.d = linkedHashMap2;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Integer numA = c90.a.a("#".concat(domainState.e()));
        Data data = domainState.f260240a;
        boolean z = false;
        boolean z3 = data.getContent() != null;
        List list = (List) iii.c.f(data, new s65.r(8), new r(1), new lk7.p(this, 28, domainState, numA));
        if (z3 && domainState.d != null && numA != null) {
            z = true;
        }
        return new m(list, z3, z);
    }
}

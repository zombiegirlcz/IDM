package h2j;

import com.revolut.core.ui_kit_core.displayers.image.transformation.HexagonalTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2j.l f148853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.j f148854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageTransformations f148855c;

    public w(o2j.l itemsMapper, u1j.c countryProfileTabsMapper, zjh.j legalEntityDisclaimerMapper, DualChooserContract$InputData inputData) {
        ImageTransformations imageTransformations;
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(countryProfileTabsMapper, "countryProfileTabsMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f148853a = itemsMapper;
        this.f148854b = legalEntityDisclaimerMapper;
        Set set = inputData.f99495j;
        if ((set instanceof Collection) && set.isEmpty()) {
            imageTransformations = null;
        } else {
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                if (((DualChooserContract$ExtraConfiguration) it8.next()) instanceof DualChooserContract$ExtraConfiguration.DeFiCurrencies) {
                    imageTransformations = new ImageTransformations(null, HexagonalTransformation.f60062a, null, null, null, null, null, ISO781611.SMT_TAG);
                    break;
                }
            }
            imageTransformations = null;
        }
        this.f148855c = imageTransformations;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f148830a, new gwe.d(domainState, 21), new h1c.c(domainState, 3), new fyg.b(domainState, this, 25));
    }
}

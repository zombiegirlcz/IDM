package z40;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.EmojiImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.d80;
import ip0.d90;
import ip0.h90;
import ip0.i90;
import ip0.j90;
import ip0.k90;
import ip0.n80;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import z30.d;
import z30.e;
import z30.f;
import z30.g;
import z30.h;
import z30.i;
import z30.j;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f319304a;

    public c(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f319304a = uiKitResources;
    }

    public static d80 a(z30.b bVar) {
        return new d80(new UrlImage(bVar.f319102b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, new CustomColors(1, null, new Color.Solid(R$attr.uikit_colorAccentNeutral)), gz0.b.FitCenter, null, null, null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG), null, null, false, false, 507902));
    }

    public static n80 b(z30.b bVar) {
        return new n80(new TextClause(bVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), a(bVar));
    }

    public final d90 c(j ratingOptions) {
        Image imageD;
        Intrinsics.checkNotNullParameter(ratingOptions, "ratingOptions");
        if (!(ratingOptions instanceof f) && !(ratingOptions instanceof g) && !(ratingOptions instanceof h)) {
            if (!(ratingOptions instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList<d> arrayList = ((i) ratingOptions).f319116a;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (d dVar : arrayList) {
                String str = dVar.d;
                String str2 = dVar.f319108b;
                gz0.b bVar = gz0.b.FitCenter;
                arrayList2.add(new i90(str, d(str2, bVar), d(dVar.f319109c, bVar)));
            }
            return new h90(arrayList2, null);
        }
        List<e> listA = ratingOptions.a();
        ArrayList arrayList3 = new ArrayList(w.t(listA, 10));
        for (e eVar : listA) {
            String strA = eVar.a();
            if (eVar instanceof z30.b) {
                imageD = new UrlImage(((z30.b) eVar).f319102b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            } else if (eVar instanceof z30.a) {
                imageD = d(((z30.a) eVar).f319099b, null);
            } else if (eVar instanceof z30.c) {
                imageD = new EmojiImage(((z30.c) eVar).f319105b, 14, 16);
            } else {
                if (!(eVar instanceof d)) {
                    throw new NoWhenBranchMatchedException();
                }
                imageD = d(((d) eVar).f319108b, null);
            }
            arrayList3.add(new k90(new TextClause(eVar.e(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), imageD, strA));
        }
        return new j90(arrayList3, null);
    }

    public final ResourceImage d(String str, gz0.b bVar) {
        int iA = this.f319304a.a(str);
        return bVar == null ? new ResourceImage(iA, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : new ResourceImage(iA, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, bVar, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 190);
    }
}

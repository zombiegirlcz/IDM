package taa;

import aw0.o9;
import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixKeyStatus;
import com.revolut.feature.pix.api.model.PixKeys;
import com.revolut.feature.pix.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8a.a f269303a;

    public m(j8a.a pixKeyFormatter) {
        Intrinsics.checkNotNullParameter(pixKeyFormatter, "pixKeyFormatter");
        this.f269303a = pixKeyFormatter;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.pix_my_alias_prompt_title, null, null, 14), null, null, domainState.f269296b ? new lw0.j("list_id_new_key", new fw0.b(new TextLocalisedClause(R$string.pix_my_alias_prompt_new_accessibility_identifier, null, null, 14))) : null, false, 22);
        PixKeys pixKeys = domainState.f269295a;
        List list = pixKeys.f80417b;
        ArrayList<PixKey> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.f(((PixKey) obj2).getF80406b(), PixKeyStatus.Active.f80407a)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (PixKey pixKey : arrayList) {
            String f80405a = pixKey.getF80405a();
            PixKey pixKeyA = pixKeys.a();
            boolean zF = Intrinsics.f(f80405a, pixKeyA != null ? pixKeyA.getF80405a() : null);
            String strQ = j6.a.q("list_id_key", pixKey.getF80405a());
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            arrayList2.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(companion.i(c6d.b.j(pixKey), R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), zF ? LayeredImage.Companion.f(companion, R$drawable.uikit_icn_16_check, R$attr.uikit_colorAccent, R$attr.uikit_colorBackground, null, 2.0f, BitmapDescriptorFactory.HUE_RED, null, 104) : null, null, false, 28), new TextClause(((vca.f) this.f269303a).a(pixKey), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 0, new TextLocalisedClause(c6d.b.k(pixKey), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, null, !zF, null, false, null, null, null, null, null, null, pixKey, null, 0, 0, 0, 0, 532674520));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new i(arrayList2, aVar);
    }
}

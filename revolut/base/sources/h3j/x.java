package h3j;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3j.j f149170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f149171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Click f149172c;
    public final LayeredImage d;

    public x(m3j.j beneficiaryAvatarMapper, a0 bankBeneficiaryScreenItemsProvider) {
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(bankBeneficiaryScreenItemsProvider, "bankBeneficiaryScreenItemsProvider");
        this.f149170a = beneficiaryAvatarMapper;
        this.f149171b = bankBeneficiaryScreenItemsProvider;
        this.f149172c = new Click(30, (Integer) null, (Object) null, "LABEL_CLICK_ID", false);
        this.d = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorGreyTone50), R$attr.uikit_colorGreyTone10, 11.2f, Float.valueOf(34.0f), null, 32);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f149143a, new h3d.a(2), new gug.c(27), new fyg.b(this, domainState, 26));
        f5j.a aVar = (f5j.a) domainState.f149143a.getContent();
        f fVar = null;
        if (aVar != null) {
            String str = aVar.A;
            Clause textClause = str != null ? new TextClause(str, (Style) this.f149172c, (Integer) null, false, (o9) null, (List) null, 124) : new TextLocalisedClause(R$string.beneficiary_label_add_title, null, this.f149172c, 10);
            TextClause textClause2 = new TextClause(n61.j.c(aVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Image imageA = this.f149170a.a(aVar);
            if (imageA == null) {
                imageA = this.d;
            }
            fVar = new f(textClause2, textClause, imageA);
        }
        return new h(list, fVar);
    }
}

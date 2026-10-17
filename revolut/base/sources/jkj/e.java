package jkj;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import dej.o2;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f175197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f175198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f175199c;
    public final Lazy d;
    public final Lazy e;

    public e(qd0.b languageProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f175197a = languageProvider;
        this.f175198b = dateProvider;
        final int i = 0;
        this.f175199c = j.b(new Function0(this) { // from class: jkj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f175196b;

            {
                this.f175196b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new SimpleDateFormat("dd MMM YYYY", ((s80.b) this.f175196b.f175197a).b());
                    default:
                        return Integer.valueOf(((f) this.f175196b.f175198b).j());
                }
            }
        });
        this.d = j.b(new jj9.b(9));
        final int i2 = 1;
        this.e = j.b(new Function0(this) { // from class: jkj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f175196b;

            {
                this.f175196b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new SimpleDateFormat("dd MMM YYYY", ((s80.b) this.f175196b.f175197a).b());
                    default:
                        return Integer.valueOf(((f) this.f175196b.f175198b).j());
                }
            }
        });
    }

    public final RowDelegate.Model a(int i, int i2, o2 o2Var) {
        String strG = a0.d.g(i, i2, "ID_INVOICE_ITEM_", "_");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_receipt, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60);
        String str = ((SimpleDateFormat) this.f175199c.getValue()).format(Long.valueOf(o2Var.f113612b.toEpochMilli()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new RowDelegate.Model(strG, image40, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(o2Var.f113613c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, o2Var.f113611a, null, 0, 0, 0, 0, 532675576);
    }
}

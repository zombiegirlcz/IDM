package mzd;

import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.feature.statements.R$plurals;
import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.api.models.ProductSelection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f210758a;

    public b(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f210758a = uiKitResources;
    }

    public static TextLocalisedQuantityClause c(Product product, ProductSelection productSelection) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(productSelection, "productSelection");
        Set<String> set = productSelection.getSelectedElements().get(product.getType());
        int size = set != null ? set.size() : 0;
        if (size == 0) {
            return null;
        }
        return new TextLocalisedQuantityClause(R$plurals.consolidated_statement_filters_accounts_count, Integer.valueOf(size), (List) null, (Style) null, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aim.e a(com.revolut.feature.statements.api.models.Product r41, boolean r42, com.revolut.feature.statements.api.models.ProductSelection r43) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mzd.b.a(com.revolut.feature.statements.api.models.Product, boolean, com.revolut.feature.statements.api.models.ProductSelection):aim.e");
    }

    public final GlyphImage b(Product product) {
        Intrinsics.checkNotNullParameter(product, "product");
        String icon = product.getIcon();
        if (icon != null) {
            int iA = this.f210758a.a(icon);
            Integer numValueOf = Integer.valueOf(iA);
            if (iA == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return new GlyphImage(numValueOf.intValue(), null, null, 6);
            }
        }
        return null;
    }
}

package com.revolut.feature.address.models;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import wi0.a;
import wi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0007H\u0002\u001a\u0018\u0010\b\u001a\u00020\t*\u00020\u00032\n\u0010\n\u001a\u00060\u0001j\u0002`\u0002H\u0002¨\u0006\u000b"}, d2 = {"format", "Lcom/revolut/core/ui_kit/models/Clause;", "Lcom/revolut/core/ui_kit/models/UIKitClause;", "Lcom/revolut/feature/address/models/Address;", "formatInline", "toTextClauseIfNotBlank", "Lcom/revolut/core/ui_kit/models/TextClause;", "", "join", "Lcom/revolut/core/ui_kit/models/CompositeClause;", "separator", "feature_address_models_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AddressExtKt {
    @NotNull
    public static final Clause format(@NotNull Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        return join(address, new TextClause(",\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    @NotNull
    public static final Clause formatInline(@NotNull Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        return join(address, new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    private static final CompositeClause join(Address address, Clause clause) {
        TextClause textClauseIfNotBlank = toTextClauseIfNotBlank(address.getStreetLine1());
        TextClause textClauseIfNotBlank2 = toTextClauseIfNotBlank(address.getStreetLine2());
        TextClause textClauseIfNotBlank3 = toTextClauseIfNotBlank(address.getNeighborhood());
        TextClause textClauseIfNotBlank4 = toTextClauseIfNotBlank(address.getPostcode());
        TextClause textClauseIfNotBlank5 = toTextClauseIfNotBlank(address.getCity());
        a aVar = b.Companion;
        String country = address.getCountry();
        aVar.getClass();
        Object[] elements = {textClauseIfNotBlank5, new CountryClause(a.a(country), null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] elements2 = {textClauseIfNotBlank, textClauseIfNotBlank2, textClauseIfNotBlank3, textClauseIfNotBlank4, new CompositeClause(d.L(elements), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new CompositeClause(d.L(elements2), clause, null, null, 12);
    }

    private static final TextClause toTextClauseIfNotBlank(String str) {
        if (str != null) {
            String str2 = !d0.W(str) ? str : null;
            if (str2 != null) {
                return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
        }
        return null;
    }
}

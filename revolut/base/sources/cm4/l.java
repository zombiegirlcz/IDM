package cm4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public interface l {

    @NotNull
    public static final k Companion = k.f25129a;

    static /* synthetic */ List a(l lVar, TextLocalisedClause textLocalisedClause, TextLocalisedQuantityClause textLocalisedQuantityClause, int i, ArrayList arrayList, List list, int i2) {
        if ((i2 & 16) != 0) {
            list = v.k(3, 6, 9, 12);
        }
        return ((vt4.h) lVar).b(textLocalisedClause, textLocalisedQuantityClause, i, arrayList, list, 5);
    }
}

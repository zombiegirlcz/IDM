package u90;

import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.f3;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d extends c {
    public d(z0 validationMapper) {
        Intrinsics.checkNotNullParameter(validationMapper, "validationMapper");
    }

    public final SelectionItem.CustomOption c(f3 option) {
        Intrinsics.checkNotNullParameter(option, "option");
        String id10 = option.getId();
        String hint = option.getHint();
        List validations = option.getValidations();
        List listA = validations != null ? z0.a(validations) : null;
        if (listA == null) {
            listA = zhm.f0.f322471a;
        }
        return new SelectionItem.CustomOption(id10, hint, listA);
    }
}

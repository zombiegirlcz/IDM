package ed0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.backend_flow.domain.models.BackendItemValue;
import com.revolut.feature.backend_flow.domain.models.MinAmountValidation;
import com.revolut.feature.backend_flow.domain.models.StringValue;
import com.revolut.feature.backend_flow.domain.models.TextValidation;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import java.util.List;
import kotlin.text.z;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements b {
    @Override // ed0.b
    public final Object a(a aVar, BackendItemValue backendItemValue, TextValidation textValidation, dd0.a aVar2) {
        MinAmountValidation minAmountValidation = (MinAmountValidation) textValidation;
        Long lN = z.n(((StringValue) backendItemValue).f63666a);
        return (lN == null || lN.longValue() >= minAmountValidation.f63525b) ? ValidationResult.Valid.f63719a : new ValidationResult.Error(new TextClause(minAmountValidation.f63526c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }
}

package ed0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.backend_flow.domain.models.BackendItemValue;
import com.revolut.feature.backend_flow.domain.models.MaxAmountValidation;
import com.revolut.feature.backend_flow.domain.models.StringValue;
import com.revolut.feature.backend_flow.domain.models.TextValidation;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import java.util.List;
import kotlin.text.z;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements b {
    @Override // ed0.b
    public final Object a(a aVar, BackendItemValue backendItemValue, TextValidation textValidation, dd0.a aVar2) {
        MaxAmountValidation maxAmountValidation = (MaxAmountValidation) textValidation;
        Long lN = z.n(((StringValue) backendItemValue).f63666a);
        return (lN == null || lN.longValue() <= maxAmountValidation.f63520b) ? ValidationResult.Valid.f63719a : new ValidationResult.Error(new TextClause(maxAmountValidation.f63521c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }
}

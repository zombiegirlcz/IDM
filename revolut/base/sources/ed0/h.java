package ed0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.backend_flow.domain.models.BackendItemValue;
import com.revolut.feature.backend_flow.domain.models.MinLengthValidation;
import com.revolut.feature.backend_flow.domain.models.StringValue;
import com.revolut.feature.backend_flow.domain.models.TextValidation;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import java.util.List;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements b {
    @Override // ed0.b
    public final Object a(a aVar, BackendItemValue backendItemValue, TextValidation textValidation, dd0.a aVar2) {
        MinLengthValidation minLengthValidation = (MinLengthValidation) textValidation;
        String str = ((StringValue) backendItemValue).f63666a;
        return (d0.W(str) || str.length() < minLengthValidation.f63527a) ? new ValidationResult.Error(new TextClause(minLengthValidation.f63528b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)) : ValidationResult.Valid.f63719a;
    }
}

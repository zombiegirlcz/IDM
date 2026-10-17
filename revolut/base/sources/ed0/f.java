package ed0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.backend_flow.domain.models.BackendItemValue;
import com.revolut.feature.backend_flow.domain.models.MaxLengthValidation;
import com.revolut.feature.backend_flow.domain.models.StringValue;
import com.revolut.feature.backend_flow.domain.models.TextValidation;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import java.util.List;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements b {
    @Override // ed0.b
    public final Object a(a aVar, BackendItemValue backendItemValue, TextValidation textValidation, dd0.a aVar2) {
        MaxLengthValidation maxLengthValidation = (MaxLengthValidation) textValidation;
        String str = ((StringValue) backendItemValue).f63666a;
        return (d0.W(str) || str.length() > maxLengthValidation.f63522a) ? new ValidationResult.Error(new TextClause(maxLengthValidation.f63523b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)) : ValidationResult.Valid.f63719a;
    }
}

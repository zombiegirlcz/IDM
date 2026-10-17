package ed0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.backend_flow.domain.models.BackendItemValue;
import com.revolut.feature.backend_flow.domain.models.RegexValidation;
import com.revolut.feature.backend_flow.domain.models.StringValue;
import com.revolut.feature.backend_flow.domain.models.TextValidation;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f124910a;

    public i(zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f124910a = regexMatcher;
    }

    @Override // ed0.b
    public final Object a(a aVar, BackendItemValue backendItemValue, TextValidation textValidation, dd0.a aVar2) {
        RegexValidation regexValidation = (RegexValidation) textValidation;
        return ((zzl.c) this.f124910a).a(regexValidation.f63598a, ((StringValue) backendItemValue).f63666a) ? ValidationResult.Valid.f63719a : new ValidationResult.Error(new TextClause(regexValidation.f63599b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }
}

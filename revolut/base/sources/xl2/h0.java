package xl2;

import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface h0 extends t {
    ValidationResult a();

    default Object c() {
        return getValue();
    }

    String getValue();

    List z();
}

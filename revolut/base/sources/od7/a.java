package od7;

import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import java.io.IOException;
import kg.l0;
import kotlin.jvm.internal.Intrinsics;
import qg.b;
import qg.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends l0 {
    @Override // kg.l0
    public final Object c(qg.a jsonReader) throws IOException {
        String value;
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        if (jsonReader.A() == b.NULL) {
            jsonReader.w();
            value = null;
        } else {
            value = jsonReader.y();
            Intrinsics.checkNotNullExpressionValue(value, "nextString(...)");
            Intrinsics.checkNotNullParameter(value, "value");
        }
        if (value != null) {
            return new RegisteredIdentityId(value);
        }
        return null;
    }

    @Override // kg.l0
    public final void d(c out, Object obj2) throws IOException {
        RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) obj2;
        String str = registeredIdentityId != null ? registeredIdentityId.f74764a : null;
        Intrinsics.checkNotNullParameter(out, "out");
        if (str == null) {
            out.m();
        } else {
            out.s(str);
        }
    }
}

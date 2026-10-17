package kem;

import ch.qos.logback.core.CoreConstants;
import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s extends oem.o {
    @Override // oem.o
    public final void h(String headerName) {
        Intrinsics.checkNotNullParameter(headerName, "name");
        super.h(headerName);
        List list = u.f183239a;
        Intrinsics.checkNotNullParameter(headerName, "name");
        int i = 0;
        int i2 = 0;
        while (i < headerName.length()) {
            char cCharAt = headerName.charAt(i);
            int i3 = i2 + 1;
            if (Intrinsics.k(cCharAt, 32) <= 0 || kotlin.text.d0.K("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                Intrinsics.checkNotNullParameter(headerName, "headerName");
                throw new IllegalHeaderNameException("Header name '" + headerName + "' contains illegal character '" + headerName.charAt(i2) + "' (code " + (headerName.charAt(i2) & 255) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            i++;
            i2 = i3;
        }
    }

    @Override // oem.o
    public final void i(String headerValue) {
        Intrinsics.checkNotNullParameter(headerValue, "value");
        super.i(headerValue);
        List list = u.f183239a;
        Intrinsics.checkNotNullParameter(headerValue, "value");
        int i = 0;
        int i2 = 0;
        while (i < headerValue.length()) {
            char cCharAt = headerValue.charAt(i);
            int i3 = i2 + 1;
            if (Intrinsics.k(cCharAt, 32) < 0 && cCharAt != '\t') {
                Intrinsics.checkNotNullParameter(headerValue, "headerValue");
                throw new IllegalHeaderValueException("Header value '" + headerValue + "' contains illegal character '" + headerValue.charAt(i2) + "' (code " + (headerValue.charAt(i2) & 255) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            i++;
            i2 = i3;
        }
    }

    public final t j() {
        Map values = (Map) this.f224673a;
        Intrinsics.checkNotNullParameter(values, "values");
        return new t(true, values);
    }
}

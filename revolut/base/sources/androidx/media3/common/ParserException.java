package androidx.media3.common;

import j6.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(String str, Throwable th10, boolean z, int i) {
        super(str, th10);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    public static ParserException createForMalformedContainer(String str, Throwable th10) {
        return new ParserException(str, th10, true, 1);
    }

    public static ParserException createForMalformedDataOfUnknownType(String str, Throwable th10) {
        return new ParserException(str, th10, true, 0);
    }

    public static ParserException createForMalformedManifest(String str, Throwable th10) {
        return new ParserException(str, th10, true, 4);
    }

    public static ParserException createForUnsupportedContainerFeature(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(message != null ? message.concat(" ") : "");
        sb6.append("{contentIsMalformed=");
        sb6.append(this.contentIsMalformed);
        sb6.append(", dataType=");
        return a.v(sb6, "}", this.dataType);
    }
}

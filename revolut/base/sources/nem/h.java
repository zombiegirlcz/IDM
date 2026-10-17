package nem;

import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import kem.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes23.dex */
public final class h extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f214647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f214648c;

    public h(String text, i contentType) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f214646a = text;
        this.f214647b = contentType;
        Charset charsetK = a1m.e.k(contentType);
        this.f214648c = a1m.e.O(text, charsetK == null ? Charsets.UTF_8 : charsetK);
    }

    @Override // nem.c
    public final Long a() {
        return Long.valueOf(this.f214648c.length);
    }

    @Override // nem.c
    public final i b() {
        return this.f214647b;
    }

    @Override // nem.b
    public final byte[] d() {
        return this.f214648c;
    }

    public final String toString() {
        return "TextContent[" + this.f214647b + "] \"" + f0.U0(30, this.f214646a) + CoreConstants.DOUBLE_QUOTE_CHAR;
    }
}

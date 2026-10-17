package lim;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends ByteArrayOutputStream {
    public a() {
        super(8193);
    }

    public final byte[] d() {
        byte[] buf2 = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf2, "buf");
        return buf2;
    }
}

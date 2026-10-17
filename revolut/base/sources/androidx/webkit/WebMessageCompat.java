package androidx.webkit;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class WebMessageCompat {
    private final byte[] mArrayBuffer;
    private final WebMessagePortCompat[] mPorts;
    private final String mString;
    private final int mType;

    public WebMessageCompat(String str, WebMessagePortCompat[] webMessagePortCompatArr) {
        this.mString = str;
        this.mArrayBuffer = null;
        this.mPorts = webMessagePortCompatArr;
        this.mType = 0;
    }

    private void checkType(int i) {
        if (i == this.mType) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + typeToString(this.mType) + " expected, but got " + typeToString(i));
    }

    private String typeToString(int i) {
        return i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public String getData() {
        checkType(0);
        return this.mString;
    }

    public WebMessageCompat(byte[] bArr, WebMessagePortCompat[] webMessagePortCompatArr) {
        Objects.requireNonNull(bArr);
        this.mArrayBuffer = bArr;
        this.mString = null;
        this.mPorts = webMessagePortCompatArr;
        this.mType = 1;
    }
}

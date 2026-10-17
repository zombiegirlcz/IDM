package com.fasterxml.jackson.core;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26177c;
    public final f9.c d;
    public transient String e;

    public i(f9.c cVar, long j2, long j3, int i) {
        this.d = cVar;
        this.f26175a = j2;
        this.f26176b = j3;
        this.f26177c = i;
    }

    public final String a() {
        String str;
        if (this.e == null) {
            StringBuilder sb6 = new StringBuilder(200);
            f9.c cVar = this.d;
            int length = cVar.f132794c;
            Object obj2 = cVar.f132792a;
            if (obj2 == null) {
                sb6.append("UNKNOWN");
            } else {
                Class<?> cls = obj2 instanceof Class ? (Class) obj2 : obj2.getClass();
                String name = cls.getName();
                if (name.startsWith("java.")) {
                    name = cls.getSimpleName();
                } else if (obj2 instanceof byte[]) {
                    name = "byte[]";
                } else if (obj2 instanceof char[]) {
                    name = "char[]";
                }
                sb6.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                sb6.append(name);
                sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                if (cVar.d) {
                    int[] iArr = {cVar.f132793b, length};
                    String str2 = " chars";
                    if (obj2 instanceof CharSequence) {
                        CharSequence charSequence = (CharSequence) obj2;
                        f9.c.a(charSequence.length(), iArr);
                        int i = iArr[0];
                        str = charSequence.subSequence(i, Math.min(iArr[1], 500) + i).toString();
                    } else if (obj2 instanceof char[]) {
                        char[] cArr = (char[]) obj2;
                        f9.c.a(cArr.length, iArr);
                        str = new String(cArr, iArr[0], Math.min(iArr[1], 500));
                    } else if (obj2 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj2;
                        f9.c.a(bArr.length, iArr);
                        str2 = " bytes";
                        str = new String(bArr, iArr[0], Math.min(iArr[1], 500), Charset.forName("UTF-8"));
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                        int length2 = str.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            char cCharAt = str.charAt(i2);
                            if (!Character.isISOControl(cCharAt) || cCharAt == '\r' || cCharAt == '\n') {
                                sb6.append(cCharAt);
                            } else {
                                sb6.append("\\u");
                                char[] cArr2 = f9.b.f132789a;
                                sb6.append(cArr2[(cCharAt >> '\f') & 15]);
                                sb6.append(cArr2[(cCharAt >> '\b') & 15]);
                                sb6.append(cArr2[(cCharAt >> 4) & 15]);
                                sb6.append(cArr2[cCharAt & 15]);
                            }
                        }
                        sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                        if (iArr[1] > 500) {
                            sb6.append("[truncated ");
                            sb6.append(iArr[1] - 500);
                            sb6.append(str2);
                            sb6.append(']');
                        }
                    }
                } else if (obj2 instanceof byte[]) {
                    if (length < 0) {
                        length = ((byte[]) obj2).length;
                    }
                    sb6.append('[');
                    sb6.append(length);
                    sb6.append(" bytes]");
                }
            }
            this.e = sb6.toString();
        }
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || !(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.d.equals(iVar.d) && this.f26177c == iVar.f26177c && this.f26176b == iVar.f26176b && this.f26175a == iVar.f26175a;
    }

    public final int hashCode() {
        return (((2 ^ (-1)) + this.f26177c) ^ ((int) this.f26176b)) + ((int) this.f26175a);
    }

    public final String toString() {
        String strA = a();
        StringBuilder sb6 = new StringBuilder(strA.length() + 40);
        a0.d.C(sb6, "[Source: ", strA, "; ");
        if (this.d.d) {
            a0.d.C(sb6, "line: ", "UNKNOWN", ", column: ");
            int i = this.f26177c;
            if (i >= 0) {
                sb6.append(i);
            } else {
                sb6.append("UNKNOWN");
            }
        } else {
            sb6.append("byte offset: #");
            long j2 = this.f26175a;
            if (j2 >= 0) {
                sb6.append(j2);
            } else {
                sb6.append("UNKNOWN");
            }
        }
        sb6.append(']');
        return sb6.toString();
    }
}

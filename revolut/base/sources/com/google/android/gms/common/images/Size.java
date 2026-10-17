package com.google.android.gms.common.images;

import androidx.annotation.NonNull;
import ch.qos.logback.core.net.SyslogConstants;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
public final class Size {
    private final int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final int f38001zab;

    public Size(int i, int i2) {
        this.zaa = i;
        this.f38001zab = i2;
    }

    @NonNull
    public static Size parseSize(@NonNull String str) throws NumberFormatException {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(SyslogConstants.LOG_CLOCK);
        }
        if (iIndexOf < 0) {
            throw zaa(str);
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            throw zaa(str);
        }
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException(a.p("Invalid Size: \"", str, "\""));
    }

    public boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof Size) {
            Size size = (Size) obj2;
            if (this.zaa == size.zaa && this.f38001zab == size.f38001zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f38001zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i = this.zaa;
        return ((i >>> 16) | (i << 16)) ^ this.f38001zab;
    }

    @NonNull
    public String toString() {
        return this.zaa + "x" + this.f38001zab;
    }
}

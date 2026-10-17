package com.fourthline.orca.internal;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
class d30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27635b;

    public d30(long j2, int i) {
        this.f27635b = j2;
        this.f27634a = i;
    }

    public int a() {
        return this.f27634a;
    }

    public int b() {
        return (int) this.f27635b;
    }

    public static d30 a(String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return null;
        }
        boolean z3 = false;
        if (z) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '+') {
                i++;
            } else if (cCharAt == '-') {
                z3 = true;
                i++;
            }
        }
        long j2 = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            long j3 = j2 * 10;
            long j5 = cCharAt2 - '0';
            if (z3) {
                j2 = j3 - j5;
                if (j2 < -2147483648L) {
                    return null;
                }
            } else {
                j2 = j3 + j5;
                if (j2 > 2147483647L) {
                    return null;
                }
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new d30(j2, i3);
    }

    public static d30 a(String str, int i, int i2) {
        long j2;
        int i3;
        if (i >= i2) {
            return null;
        }
        long j3 = 0;
        int i5 = i;
        while (i5 < i2) {
            char cCharAt = str.charAt(i5);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt >= 'A' && cCharAt <= 'F') {
                    j2 = j3 * 16;
                    i3 = cCharAt - 'A';
                } else {
                    if (cCharAt < 'a' || cCharAt > 'f') {
                        break;
                    }
                    j2 = j3 * 16;
                    i3 = cCharAt - 'a';
                }
                j3 = j2 + ((long) i3) + 10;
            } else {
                j3 = (j3 * 16) + ((long) (cCharAt - '0'));
            }
            if (j3 > BodyPartID.bodyIdMax) {
                return null;
            }
            i5++;
        }
        if (i5 == i) {
            return null;
        }
        return new d30(j3, i5);
    }
}

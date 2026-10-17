package com.fasterxml.jackson.core;

import ch.qos.logback.core.CoreConstants;
import ip0.yj0;

/* JADX INFO: loaded from: classes16.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26180c;

    public abstract String a();

    public abstract yj0 b();

    public boolean c() {
        return this.f26179b == 1;
    }

    public String d() {
        int i = this.f26179b;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    public String toString() {
        switch (this.f26178a) {
            case 0:
                StringBuilder sb6 = new StringBuilder(64);
                int i = this.f26179b;
                if (i == 0) {
                    sb6.append("/");
                } else if (i != 1) {
                    sb6.append(CoreConstants.CURLY_LEFT);
                    String strA = a();
                    if (strA != null) {
                        sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                        f9.b.a(strA, sb6);
                        sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    } else {
                        sb6.append('?');
                    }
                    sb6.append(CoreConstants.CURLY_RIGHT);
                } else {
                    sb6.append('[');
                    int i2 = this.f26180c;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    sb6.append(i2);
                    sb6.append(']');
                }
                return sb6.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(int i, int i2, int i3) {
        this.f26178a = i3;
        this.f26179b = i;
        this.f26180c = i2;
    }
}

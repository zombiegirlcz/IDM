package com.fourthline.orca.internal;

import com.fourthline.orca.internal.lz0;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class e81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f28018a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f28020c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f28019b = 0;
    private final fg0 d = new fg0();

    public e81(String str) {
        String strTrim = str.trim();
        this.f28018a = strTrim;
        this.f28020c = strTrim.length();
    }

    public boolean a(int i) {
        return i == 10 || i == 13;
    }

    public boolean b(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public boolean c() {
        return this.f28019b == this.f28020c;
    }

    public boolean d() {
        int i = this.f28019b;
        if (i == this.f28020c) {
            return false;
        }
        char cCharAt = this.f28018a.charAt(i);
        if (cCharAt < 'a' || cCharAt > 'z') {
            return cCharAt >= 'A' && cCharAt <= 'Z';
        }
        return true;
    }

    public Integer e() {
        int i = this.f28019b;
        if (i == this.f28020c) {
            return null;
        }
        String str = this.f28018a;
        this.f28019b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public Boolean f() {
        int i = this.f28019b;
        if (i == this.f28020c) {
            return null;
        }
        char cCharAt = this.f28018a.charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f28019b++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public float g() {
        float fA = this.d.a(this.f28018a, this.f28019b, this.f28020c);
        if (!Float.isNaN(fA)) {
            this.f28019b = this.d.a();
        }
        return fA;
    }

    public String h() {
        if (c()) {
            return null;
        }
        int i = this.f28019b;
        int iCharAt = this.f28018a.charAt(i);
        while (true) {
            if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                break;
            }
            iCharAt = a();
        }
        int i2 = this.f28019b;
        while (b(iCharAt)) {
            iCharAt = a();
        }
        if (iCharAt == 40) {
            this.f28019b++;
            return this.f28018a.substring(i, i2);
        }
        this.f28019b = i;
        return null;
    }

    public lz0.q i() {
        float fG = g();
        if (Float.isNaN(fG)) {
            return null;
        }
        lz0.d1 d1VarL = l();
        return d1VarL == null ? new lz0.q(fG, lz0.d1.px) : new lz0.q(fG, d1VarL);
    }

    public String j() {
        if (c()) {
            return null;
        }
        int i = this.f28019b;
        char cCharAt = this.f28018a.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iA = a();
        while (iA != -1 && iA != cCharAt) {
            iA = a();
        }
        if (iA == -1) {
            this.f28019b = i;
            return null;
        }
        int i2 = this.f28019b;
        this.f28019b = i2 + 1;
        return this.f28018a.substring(i + 1, i2);
    }

    public String k() {
        return a(zsc.p.SPACE_CHAR, false);
    }

    public lz0.d1 l() {
        if (c()) {
            return null;
        }
        if (this.f28018a.charAt(this.f28019b) == '%') {
            this.f28019b++;
            return lz0.d1.percent;
        }
        int i = this.f28019b;
        if (i > this.f28020c - 2) {
            return null;
        }
        try {
            lz0.d1 d1VarValueOf = lz0.d1.valueOf(this.f28018a.substring(i, i + 2).toLowerCase(Locale.US));
            this.f28019b += 2;
            return d1VarValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String m() {
        if (c()) {
            return null;
        }
        int i = this.f28019b;
        char cCharAt = this.f28018a.charAt(i);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            this.f28019b = i;
            return null;
        }
        int iA = a();
        while (true) {
            if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                break;
            }
            iA = a();
        }
        return this.f28018a.substring(i, this.f28019b);
    }

    public float n() {
        p();
        float fA = this.d.a(this.f28018a, this.f28019b, this.f28020c);
        if (!Float.isNaN(fA)) {
            this.f28019b = this.d.a();
        }
        return fA;
    }

    public String o() {
        if (c()) {
            return null;
        }
        int i = this.f28019b;
        this.f28019b = this.f28020c;
        return this.f28018a.substring(i);
    }

    public boolean p() {
        q();
        int i = this.f28019b;
        if (i == this.f28020c || this.f28018a.charAt(i) != ',') {
            return false;
        }
        this.f28019b++;
        q();
        return true;
    }

    public void q() {
        while (true) {
            int i = this.f28019b;
            if (i >= this.f28020c || !b((int) this.f28018a.charAt(i))) {
                return;
            } else {
                this.f28019b++;
            }
        }
    }

    public float a(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        p();
        return g();
    }

    public String b(char c2) {
        return a(c2, false);
    }

    public String c(char c2) {
        return a(c2, true);
    }

    public String b() {
        int i = this.f28019b;
        while (!c() && !b((int) this.f28018a.charAt(this.f28019b))) {
            this.f28019b++;
        }
        String strSubstring = this.f28018a.substring(i, this.f28019b);
        this.f28019b = i;
        return strSubstring;
    }

    public float a(Boolean bool) {
        if (bool == null) {
            return Float.NaN;
        }
        p();
        return g();
    }

    public Integer a(boolean z) {
        d30 d30VarA = d30.a(this.f28018a, this.f28019b, this.f28020c, z);
        if (d30VarA == null) {
            return null;
        }
        this.f28019b = d30VarA.a();
        return Integer.valueOf(d30VarA.b());
    }

    public Boolean a(Object obj2) {
        if (obj2 == null) {
            return null;
        }
        p();
        return f();
    }

    public boolean a(char c2) {
        int i = this.f28019b;
        boolean z = i < this.f28020c && this.f28018a.charAt(i) == c2;
        if (z) {
            this.f28019b++;
        }
        return z;
    }

    public boolean a(String str) {
        int length = str.length();
        int i = this.f28019b;
        boolean z = i <= this.f28020c - length && this.f28018a.substring(i, i + length).equals(str);
        if (z) {
            this.f28019b += length;
        }
        return z;
    }

    public int a() {
        int i = this.f28019b;
        int i2 = this.f28020c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.f28019b = i3;
        if (i3 < i2) {
            return this.f28018a.charAt(i3);
        }
        return -1;
    }

    public String a(char c2, boolean z) {
        if (c()) {
            return null;
        }
        char cCharAt = this.f28018a.charAt(this.f28019b);
        if ((!z && b((int) cCharAt)) || cCharAt == c2) {
            return null;
        }
        int i = this.f28019b;
        int iA = a();
        while (iA != -1 && iA != c2 && (z || !b(iA))) {
            iA = a();
        }
        return this.f28018a.substring(i, this.f28019b);
    }
}

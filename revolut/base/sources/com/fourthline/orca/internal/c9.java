package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class c9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Float f27412b = Float.valueOf(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Float f27413c = Float.valueOf(-14.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f27414a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f27415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Float f27416b;

        public a(String str, Float f) {
            this.f27415a = str;
            this.f27416b = f;
        }
    }

    public c9() {
        this.f27414a = new HashMap();
    }

    public void a(String str, float f) {
        this.f27414a.put(str, Float.valueOf(f));
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        for (Map.Entry entry : this.f27414a.entrySet()) {
            if (sb6.length() > 0) {
                sb6.append(CoreConstants.COMMA_CHAR);
            }
            sb6.append("'");
            sb6.append((String) entry.getKey());
            sb6.append("' ");
            sb6.append(new DecimalFormat("#.##").format(entry.getValue()));
        }
        return sb6.toString();
    }

    public void a(c9 c9Var) {
        if (c9Var == null) {
            return;
        }
        this.f27414a.putAll(c9Var.f27414a);
    }

    public c9(c9 c9Var) {
        this.f27414a = new HashMap(c9Var.f27414a);
    }

    public static c9 a(String str) {
        c9 c9Var = new c9();
        e81 e81Var = new e81(str);
        e81Var.q();
        if (e81Var.a("normal")) {
            return null;
        }
        while (!e81Var.c()) {
            a aVarA = a(e81Var);
            if (aVarA == null) {
                return null;
            }
            c9Var.f27414a.put(aVarA.f27415a, aVarA.f27416b);
            e81Var.p();
        }
        return c9Var;
    }

    private static a a(e81 e81Var) {
        e81Var.q();
        String strJ = e81Var.j();
        if (strJ == null || strJ.length() != 4) {
            return null;
        }
        e81Var.q();
        if (e81Var.c()) {
            return null;
        }
        return new a(strJ, Float.valueOf(e81Var.g()));
    }
}

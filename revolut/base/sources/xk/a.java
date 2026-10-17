package xk;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f306591a;

    static {
        Charset.forName("ISO-8859-1");
        Charset.forName("US-ASCII");
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        f306591a = Charset.forName("UTF-8");
    }
}

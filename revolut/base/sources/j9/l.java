package j9;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public abstract class l {
    static {
        Pattern.compile("[-_./;:]");
    }

    public static final void a() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}

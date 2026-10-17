package e0m;

import kotlin.text.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f121750a = new g();

    private g() {
    }

    public static final boolean a(String str) {
        return str != null && !d0.W(str) && ch.qos.logback.core.util.a.x("\\A(?:[^\\x00-\\x20\\x22\\x28\\x29\\x2c\\x2e\\x3a-\\x3c\\x3e\\x40\\x5b-\\x5d\\x7f-\\u00ff]+|\\x22(?:[^\\x0d\\x22\\x5c\\u0080-\\u00ff]|\\x5c[\\x00-\\x7f])*\\x22)(?:\\x2e(?:[^\\x00-\\x20\\x22\\x28\\x29\\x2c\\x2e\\x3a-\\x3c\\x3e\\x40\\x5b-\\x5d\\x7f-\\u00ff]+|\\x22(?:[^\\x0d\\x22\\x5c\\u0080-\\u00ff]|\\x5c[\\x00-\\x7f])*\\x22))*\\x40(?:(?:(?:[a-zA-Z\\d](?:[-a-zA-Z\\d]*[a-zA-Z\\d])?)\\.)*(?:[a-zA-Z](?:[-a-zA-Z\\d]*[a-zA-Z\\d])?)\\.?)?[^\\x00-\\x20\\x22\\x28\\x29\\x2c\\x2e\\x3a-\\x3c\\x3e\\x40\\x5b-\\x5d\\x7f-\\u00ff]+\\z", str) && ch.qos.logback.core.util.a.x("..*@..*\\...*", str);
    }
}

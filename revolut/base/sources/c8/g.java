package c8;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public interface g {
    public static final Charset f = Charset.forName("UTF-8");

    boolean equals(Object obj2);

    int hashCode();

    void updateDiskCacheKey(MessageDigest messageDigest);
}

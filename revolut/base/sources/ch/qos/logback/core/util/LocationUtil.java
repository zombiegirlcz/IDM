package ch.qos.logback.core.util;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes16.dex */
public class LocationUtil {
    public static final String CLASSPATH_SCHEME = "classpath:";
    public static final String SCHEME_PATTERN = "^\\p{Alpha}[\\p{Alnum}+.-]*:.*$";

    public static URL urlForResource(String str) throws MalformedURLException, FileNotFoundException {
        URL url2;
        if (str == null) {
            throw new NullPointerException("location is required");
        }
        if (!str.matches("^\\p{Alpha}[\\p{Alnum}+.-]*:.*$")) {
            url2 = Loader.getResourceBySelfClassLoader(str);
        } else if (str.startsWith("classpath:")) {
            String strSubstring = str.substring(10);
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            if (strSubstring.length() == 0) {
                throw new MalformedURLException("path is required");
            }
            url2 = Loader.getResourceBySelfClassLoader(strSubstring);
        } else {
            url2 = new URL(str);
        }
        if (url2 != null) {
            return url2;
        }
        throw new FileNotFoundException(str);
    }
}

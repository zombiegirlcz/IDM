package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes14.dex */
class StreamUtil {
    static final String MAX_LIMIT = "org.bouncycastle.asn1.max_limit";

    public static int findLimit(InputStream inputStream) {
        if (inputStream instanceof LimitedInputStream) {
            return ((LimitedInputStream) inputStream).getLimit();
        }
        if (inputStream instanceof ASN1InputStream) {
            return ((ASN1InputStream) inputStream).getLimit();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        String propertyValue = Properties.getPropertyValue("org.bouncycastle.asn1.max_limit");
        if (propertyValue == null) {
            return getMaxMemory();
        }
        char cCharAt = propertyValue.charAt(propertyValue.length() - 1);
        return cCharAt != 'g' ? cCharAt != 'k' ? cCharAt != 'm' ? Integer.parseInt(propertyValue) : Integer.parseInt(propertyValue.substring(0, propertyValue.length() - 1)) * PKIFailureInfo.badCertTemplate : Integer.parseInt(propertyValue.substring(0, propertyValue.length() - 1)) * 1024 : Integer.parseInt(propertyValue.substring(0, propertyValue.length() - 1)) * 1073741824;
    }

    private static int getMaxMemory() {
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        if (jMaxMemory > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jMaxMemory;
    }
}

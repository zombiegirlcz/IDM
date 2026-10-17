package org.slf4j;

import java.io.Closeable;
import java.util.Deque;
import java.util.Map;
import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.helpers.Reporter;
import org.slf4j.helpers.SubstituteServiceProvider;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

/* JADX INFO: loaded from: classes13.dex */
public class MDC {
    static MDCAdapter MDC_ADAPTER;
    static final String NO_STATIC_MDC_BINDER_URL = "http://www.slf4j.org/codes.html#no_static_mdc_binder";
    static final String NULL_MDCA_URL = "http://www.slf4j.org/codes.html#null_MDCA";
    private static final String MDC_APAPTER_CANNOT_BE_NULL_MESSAGE = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA";

    /* JADX INFO: loaded from: classes14.dex */
    public static class MDCCloseable implements Closeable {
        private final String key;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            MDC.remove(this.key);
        }

        private MDCCloseable(String str) {
            this.key = str;
        }
    }

    private MDC() {
    }

    public static void clear() {
        if (getMDCAdapter() == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getMDCAdapter().clear();
    }

    private static void emitTemporaryMDCAdapterWarningIfNeeded(SLF4JServiceProvider sLF4JServiceProvider) {
        if (sLF4JServiceProvider instanceof SubstituteServiceProvider) {
            Reporter.info("Temporary mdcAdapter given by SubstituteServiceProvider.");
            Reporter.info("This mdcAdapter will be replaced after backend initialization has completed.");
        }
    }

    public static String get(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        if (getMDCAdapter() != null) {
            return getMDCAdapter().get(str);
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static Map<String, String> getCopyOfContextMap() {
        if (getMDCAdapter() != null) {
            return getMDCAdapter().getCopyOfContextMap();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static MDCAdapter getMDCAdapter() {
        if (MDC_ADAPTER == null) {
            MDC_ADAPTER = getMDCAdapterGivenByProvider();
        }
        return MDC_ADAPTER;
    }

    private static MDCAdapter getMDCAdapterGivenByProvider() {
        SLF4JServiceProvider provider = LoggerFactory.getProvider();
        if (provider != null) {
            MDCAdapter mDCAdapter = provider.getMDCAdapter();
            emitTemporaryMDCAdapterWarningIfNeeded(provider);
            return mDCAdapter;
        }
        Reporter.error("Failed to find provider.");
        Reporter.error("Defaulting to no-operation MDCAdapter implementation.");
        return new NOPMDCAdapter();
    }

    public static String popByKey(String str) {
        if (getMDCAdapter() != null) {
            return getMDCAdapter().popByKey(str);
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static void pushByKey(String str, String str2) {
        if (getMDCAdapter() == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getMDCAdapter().pushByKey(str, str2);
    }

    public static void put(String str, String str2) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        if (getMDCAdapter() == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getMDCAdapter().put(str, str2);
    }

    public static MDCCloseable putCloseable(String str, String str2) throws IllegalArgumentException {
        put(str, str2);
        return new MDCCloseable(str);
    }

    public static void remove(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        if (getMDCAdapter() == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getMDCAdapter().remove(str);
    }

    public static void setContextMap(Map<String, String> map) {
        if (getMDCAdapter() == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getMDCAdapter().setContextMap(map);
    }

    public static void setMDCAdapter(MDCAdapter mDCAdapter) {
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        MDC_ADAPTER = mDCAdapter;
    }

    public Deque<String> getCopyOfDequeByKey(String str) {
        if (getMDCAdapter() != null) {
            return getMDCAdapter().getCopyOfDequeByKey(str);
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }
}

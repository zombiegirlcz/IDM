package androidx.media3.common.util;

import android.text.TextUtils;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public abstract class Log {
    private static int logLevel = 0;
    private static boolean logStackTraces = true;
    private static final Object lock = new Object();
    private static Logger logger = Logger.DEFAULT;

    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: androidx.media3.common.util.Log.Logger.1
            @Override // androidx.media3.common.util.Log.Logger
            public void d(String str, String str2, Throwable th10) {
                Log.appendThrowableString(str2, th10);
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void e(String str, String str2, Throwable th10) {
                Log.appendThrowableString(str2, th10);
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void i(String str, String str2, Throwable th10) {
                Log.appendThrowableString(str2, th10);
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void w(String str, String str2, Throwable th10) {
                Log.appendThrowableString(str2, th10);
            }
        };

        void d(String str, String str2, Throwable th10);

        void e(String str, String str2, Throwable th10);

        void i(String str, String str2, Throwable th10);

        void w(String str, String str2, Throwable th10);
    }

    public static String appendThrowableString(String str, Throwable th10) {
        String throwableString = getThrowableString(th10);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        StringBuilder sbL = v0.a.l(str, "\n  ");
        sbL.append(throwableString.replace("\n", "\n  "));
        sbL.append('\n');
        return sbL.toString();
    }

    public static void d(String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel == 0) {
                    logger.d(str, str2, null);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static void e(String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.e(str, str2, null);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static String getThrowableString(Throwable th10) {
        if (th10 == null) {
            return null;
        }
        synchronized (lock) {
            try {
                if (isCausedByUnknownHostException(th10)) {
                    return "UnknownHostException (no network)";
                }
                if (logStackTraces) {
                    return android.util.Log.getStackTraceString(th10).trim().replace("\t", "    ");
                }
                return th10.getMessage();
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    public static void i(String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 1) {
                    logger.i(str, str2, null);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private static boolean isCausedByUnknownHostException(Throwable th10) {
        while (th10 != null) {
            if (th10 instanceof UnknownHostException) {
                return true;
            }
            th10 = th10.getCause();
        }
        return false;
    }

    public static void w(String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.w(str, str2, null);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static void e(String str, String str2, Throwable th10) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.e(str, str2, th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    public static void w(String str, String str2, Throwable th10) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.w(str, str2, th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }
}

package com.youTransactor.uCube.log;

import a10.b;
import nd.n;
import v0.a;

/* JADX INFO: loaded from: classes17.dex */
public class LogManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ILogger f107586a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f107587b = true;
    public static ILogListener d;
    public static final String LOG_FILENAME_PREFIX = "LOG_";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LogLevel f107588c = LogLevel.API;

    public enum LogLevel {
        SYSTEM("SYSTEM", 5),
        CONNEXION("CONNEXION", 4),
        RPC("RPC", 3),
        PAYMENT("PAYMENT", 2),
        MDM("MDM", 1),
        API("API", 0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f107590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f107591b;

        LogLevel(String str, int i) {
            this.f107591b = str;
            this.f107590a = i;
        }

        public int getCode() {
            return this.f107590a;
        }

        public String getLabel() {
            return this.f107591b;
        }

        public static LogLevel valueOf(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? API : SYSTEM : CONNEXION : RPC : PAYMENT : MDM : API;
        }
    }

    public static void d(String str) {
        if (f107587b) {
            ILogger iLogger = f107586a;
            if (iLogger != null) {
                iLogger.d("4.0.9.4-release", str);
            }
            ILogListener iLogListener = d;
            if (iLogListener != null) {
                iLogListener.onDebugLogged("4.0.9.4-release", str);
            }
        }
    }

    public static void e(String str) {
        if (f107587b) {
            ILogger iLogger = f107586a;
            if (iLogger != null) {
                iLogger.e("4.0.9.4-release", str, null);
            }
            ILogListener iLogListener = d;
            if (iLogListener != null) {
                iLogListener.onErrorLogged("4.0.9.4-release", str);
            }
        }
    }

    public static void enableLogs(boolean z) {
        d("Log enabled : " + z);
        f107587b = z;
    }

    public static LogLevel getLogLevel() {
        return f107588c;
    }

    public static ILogger getLogger() {
        return f107586a;
    }

    public static boolean isEnabled() {
        return f107587b;
    }

    public static void registerLogListener(ILogListener iLogListener) {
        d("Log listener registered");
        d = iLogListener;
    }

    public static void setLogLevel(LogLevel logLevel) {
        f107588c = logLevel;
    }

    public static void setLogger(ILogger iLogger) {
        if (iLogger == null) {
            iLogger = new n(19);
        }
        f107586a = iLogger;
    }

    public static void w(String str) {
        if (f107587b) {
            ILogger iLogger = f107586a;
            if (iLogger != null) {
                iLogger.w("4.0.9.4-release", str);
            }
            ILogListener iLogListener = d;
            if (iLogListener != null) {
                iLogListener.onWarningLogged("4.0.9.4-release", str);
            }
        }
    }

    public static void d(String str, String str2) {
        if (f107587b) {
            ILogger iLogger = f107586a;
            if (iLogger == null) {
                String str3 = "4.0.9.4-release-" + str;
            } else {
                iLogger.d("4.0.9.4-release-" + str, str2);
            }
            ILogListener iLogListener = d;
            if (iLogListener != null) {
                iLogListener.onDebugLogged(str, str2);
            }
        }
    }

    public static void e(String str, Exception exc2) {
        if (f107587b) {
            ILogger iLogger = f107586a;
            if (iLogger != null) {
                iLogger.e("4.0.9.4-release", str, exc2);
            }
            if (exc2 != null) {
                String strR = b.r(exc2, a.l(str, "\n exception: "));
                ILogListener iLogListener = d;
                if (iLogListener != null) {
                    iLogListener.onErrorLogged("4.0.9.4-release", strR);
                    return;
                }
                return;
            }
            ILogListener iLogListener2 = d;
            if (iLogListener2 != null) {
                iLogListener2.onErrorLogged("4.0.9.4-release", str);
            }
        }
    }

    public static void w(String str, String str2) {
        if (f107587b) {
            ILogger iLogger = f107586a;
            if (iLogger == null) {
                String str3 = "4.0.9.4-release-" + str;
            } else {
                iLogger.w("4.0.9.4-release-" + str, str2);
            }
            ILogListener iLogListener = d;
            if (iLogListener != null) {
                iLogListener.onWarningLogged(str, str2);
            }
        }
    }

    public static void e(String str, String str2, Exception exc2) {
        if (f107587b) {
            ILogger iLogger = f107586a;
            if (iLogger == null) {
                String str3 = "4.0.9.4-release-" + str;
            } else {
                iLogger.e("4.0.9.4-release-" + str, str2, exc2);
            }
            if (exc2 != null) {
                String strQ = j6.a.q("4.0.9.4-release-", str);
                String strR = b.r(exc2, a.l(str2, "\n exception: "));
                ILogListener iLogListener = d;
                if (iLogListener != null) {
                    iLogListener.onErrorLogged(strQ, strR);
                    return;
                }
                return;
            }
            String strQ2 = j6.a.q("4.0.9.4-release-", str);
            ILogListener iLogListener2 = d;
            if (iLogListener2 != null) {
                iLogListener2.onErrorLogged(strQ2, str2);
            }
        }
    }

    public static void e(String str, String str2) {
        if (f107587b) {
            ILogger iLogger = f107586a;
            if (iLogger == null) {
                String str3 = "4.0.9.4-release-" + str;
            } else {
                iLogger.e("4.0.9.4-release-" + str, str2, null);
            }
            String strQ = j6.a.q("4.0.9.4-release-", str);
            ILogListener iLogListener = d;
            if (iLogListener != null) {
                iLogListener.onErrorLogged(strQ, str2);
            }
        }
    }
}

package l8;

import android.os.Build;
import android.util.Log;
import ch.qos.logback.classic.Level;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final boolean e;
    public static final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final File f192752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile v f192753h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f192755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f192756c = true;
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192754a = Level.INFO_INT;

    static {
        e = Build.VERSION.SDK_INT < 29;
        f = true;
        f192752g = new File("/proc/self/fd");
    }

    public static v a() {
        if (f192753h == null) {
            synchronized (v.class) {
                try {
                    if (f192753h == null) {
                        f192753h = new v();
                    }
                } finally {
                }
            }
        }
        return f192753h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it8 = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it8.hasNext()) {
                if (Build.MODEL.startsWith((String) it8.next())) {
                    return 500;
                }
            }
        }
        return this.f192754a;
    }

    public final boolean c(int i, int i2, boolean z, boolean z3) {
        boolean z4;
        if (z) {
            if (f) {
                if (!e || this.d.get()) {
                    if (z3) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            return false;
                        }
                    } else if (i >= 0 && i2 >= 0) {
                        synchronized (this) {
                            try {
                                int i3 = this.f192755b + 1;
                                this.f192755b = i3;
                                if (i3 >= 50) {
                                    this.f192755b = 0;
                                    int length = f192752g.list().length;
                                    long jB = b();
                                    boolean z6 = ((long) length) < jB;
                                    this.f192756c = z6;
                                    if (!z6 && Log.isLoggable("Downsampler", 5)) {
                                        String str = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jB;
                                    }
                                }
                                z4 = this.f192756c;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        if (z4) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            return false;
        }
        return false;
    }
}

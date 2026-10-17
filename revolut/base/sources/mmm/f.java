package mmm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class f extends v0 {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a80.e f207258h = new a80.e(4, (byte) 0);
    public static f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f207259j;
    public static final Condition k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f207260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f207261m;
    public int e;
    public int f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f207262g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f207259j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f207260l = millis;
        f207261m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void j() {
        long j2 = this.f207311c;
        boolean z = this.f207309a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = f207259j;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                c.a(Companion, this);
                Unit unit = Unit.f186387a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean k() {
        ReentrantLock reentrantLock = f207259j;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            f207258h.o(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void l() {
    }
}

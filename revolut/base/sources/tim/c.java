package tim;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltim/c;", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f271589b;

    /* JADX INFO: renamed from: tim.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltim/c$a;", "Ltim/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "defaultRandom", "Ltim/c;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion extends c implements Serializable {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Override // tim.c
        public final int a(int i) {
            return c.f271589b.a(i);
        }

        @Override // tim.c
        public final float b() {
            throw null;
        }

        @Override // tim.c
        public final int c() {
            return c.f271589b.c();
        }

        @Override // tim.c
        public final int d(int i) {
            return c.f271589b.d(i);
        }

        @Override // tim.c
        public final int e(int i, int i2) {
            return c.f271589b.e(i, i2);
        }

        @Override // tim.c
        public final long f() {
            return c.f271589b.f();
        }
    }

    static {
        f271589b = kim.a.c(34) ? new uim.a() : new b();
    }

    public abstract int a(int i);

    public float b() {
        return a(24) / 1.6777216E7f;
    }

    public int c() {
        return a(32);
    }

    public int d(int i) {
        return e(0, i);
    }

    public int e(int i, int i2) {
        int iC;
        int i3;
        int iA;
        czi.c.h(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                iA = a(czi.c.i(i5));
            } else {
                do {
                    iC = c() >>> 1;
                    i3 = iC % i5;
                } while ((i5 - 1) + (iC - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iC2 = c();
            if (i <= iC2 && iC2 < i2) {
                return iC2;
            }
        }
    }

    public long f() {
        return (((long) c()) << 32) + ((long) c());
    }
}

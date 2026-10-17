package jbm;

import com.google.common.collect.k;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Predicate f172658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f172659b = h.f172671s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class[] f172660c;
    public final Class[] d;
    public final float e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f172661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f172662h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f172663j;
    public mbm.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f172664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f172665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Duration f172666n;
    public final Duration o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte f172667p;

    public f() {
        TimeUnit timeUnit = h.f172672t;
        this.f172660c = new Class[0];
        this.d = new Class[0];
        this.e = 50.0f;
        this.f = 100;
        this.f172661g = true;
        this.f172662h = 10;
        this.i = 100;
        this.f172663j = h.u;
        this.k = mbm.c.a(Duration.ofSeconds(60L).toMillis());
        this.f172664l = h.f172668p;
        this.f172665m = 100.0f;
        this.f172666n = Duration.ofSeconds(60L);
        this.o = Duration.ofSeconds(0L);
        this.f172667p = (byte) 0;
    }

    public final h a() {
        h hVar = new h();
        hVar.f172673a = h.f172669q;
        hVar.f172674b = h.f172670r;
        k kVar = h.f172671s;
        g gVar = h.f172668p;
        hVar.f172675c = h.u;
        final int i = 0;
        hVar.d = new Class[0];
        hVar.e = new Class[0];
        hVar.f = 50.0f;
        hVar.f172676g = 10;
        hVar.f172677h = 100;
        hVar.i = h.f172668p;
        hVar.f172678j = 100;
        final int i2 = 1;
        hVar.k = true;
        hVar.f172679l = mbm.c.a(Duration.ofSeconds(60L).toMillis());
        hVar.f172680m = 100.0f;
        hVar.f172681n = Duration.ofSeconds(60L);
        hVar.o = Duration.ofSeconds(0L);
        if (this.f172667p > 1) {
            throw new IllegalStateException("The waitIntervalFunction was configured multiple times which could result in an undesired state. Please verify that waitIntervalFunctionInOpenState and waitDurationInOpenState are not used together.");
        }
        hVar.f172679l = this.k;
        hVar.i = this.f172664l;
        hVar.f172681n = this.f172666n;
        hVar.o = this.o;
        hVar.f172680m = this.f172665m;
        hVar.f = this.e;
        hVar.f172677h = this.i;
        hVar.f172678j = this.f;
        hVar.f172676g = this.f172662h;
        Class[] clsArr = this.f172660c;
        hVar.d = clsArr;
        Class[] clsArr2 = this.d;
        hVar.e = clsArr2;
        hVar.k = this.f172661g;
        hVar.f172673a = (Predicate) Arrays.stream(clsArr).distinct().map(new k(2)).reduce(new obm.a()).map(new Function(this) { // from class: jbm.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f172656b;

            {
                this.f172656b = this;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Predicate predicate = (Predicate) obj2;
                switch (i) {
                    case 0:
                        Predicate predicate2 = this.f172656b.f172658a;
                        return predicate2 != null ? predicate.or(predicate2) : predicate;
                    default:
                        this.f172656b.getClass();
                        return predicate;
                }
            }
        }).orElseGet(new Supplier() { // from class: jbm.e
            @Override // java.util.function.Supplier
            public final Object get() {
                Predicate predicate = this.f172657a.f172658a;
                return predicate != null ? predicate : h.f172669q;
            }
        });
        hVar.f172674b = (Predicate) Arrays.stream(clsArr2).distinct().map(new k(2)).reduce(new obm.a()).map(new Function(this) { // from class: jbm.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f172656b;

            {
                this.f172656b = this;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Predicate predicate = (Predicate) obj2;
                switch (i2) {
                    case 0:
                        Predicate predicate2 = this.f172656b.f172658a;
                        return predicate2 != null ? predicate.or(predicate2) : predicate;
                    default:
                        this.f172656b.getClass();
                        return predicate;
                }
            }
        }).orElseGet(new com.google.common.collect.f(this));
        hVar.f172675c = this.f172663j;
        return hVar;
    }

    public final void b(Duration duration) {
        long millis = duration.toMillis();
        if (millis < 1) {
            throw new IllegalArgumentException("waitDurationInOpenState must be at least 1[ms]");
        }
        this.k = mbm.c.a(millis);
        this.f172667p = (byte) (this.f172667p + 1);
    }
}

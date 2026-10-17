package s80;

import android.content.Context;
import e8.r;
import java.util.Locale;
import jh.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public final class b implements qd0.b {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f260872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f260873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f260874c;
    public final r d;
    public final r e;

    static {
        h0 h0Var = new h0(b.class, "displayLanguage", "getDisplayLanguage()Ljava/util/Locale;", 0);
        p0 p0Var = o0.f186429a;
        f = new KProperty[]{p0Var.j(h0Var), p.a.y(b.class, "currentLocale", "getCurrentLocale()Ljava/util/Locale;", 0, p0Var)};
    }

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f260872a = context;
        final int i = 0;
        r rVar = new r(new Function0(this) { // from class: s80.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f260871b;

            {
                this.f260871b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return d.e(this.f260871b.f260872a);
                    default:
                        return d.d(this.f260871b.f260872a);
                }
            }
        });
        this.f260873b = rVar;
        final int i2 = 1;
        r rVar2 = new r(new Function0(this) { // from class: s80.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f260871b;

            {
                this.f260871b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return d.e(this.f260871b.f260872a);
                    default:
                        return d.d(this.f260871b.f260872a);
                }
            }
        });
        this.f260874c = rVar2;
        this.d = rVar;
        this.e = rVar2;
    }

    public final Locale a() {
        return (Locale) this.e.b(f[1]);
    }

    public final Locale b() {
        return (Locale) this.d.b(f[0]);
    }
}

package tv0;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import ht0.b0;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t70.x;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f274678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sv0.a f274679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sv0.a f274680c;
    public final sv0.a d;
    public final b0 e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f274681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f274682h;
    public Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f274683j;
    public final x k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f274684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f274685m;

    public n(View decorView, sv0.a restingInsetPx, sv0.a isSlideRunning, sv0.a hideSystemKeyboard, b0 releaseCustomKeyboard) {
        Intrinsics.checkNotNullParameter(decorView, "decorView");
        Intrinsics.checkNotNullParameter(restingInsetPx, "restingInsetPx");
        Intrinsics.checkNotNullParameter(isSlideRunning, "isSlideRunning");
        Intrinsics.checkNotNullParameter(hideSystemKeyboard, "hideSystemKeyboard");
        Intrinsics.checkNotNullParameter(releaseCustomKeyboard, "releaseCustomKeyboard");
        this.f274678a = decorView;
        this.f274679b = restingInsetPx;
        this.f274680c = isSlideRunning;
        this.d = hideSystemKeyboard;
        this.e = releaseCustomKeyboard;
        this.f274683j = j.f274675a;
        this.k = new x(this, 6);
        final int i = 0;
        this.f274684l = yhm.j.b(new Function0(this) { // from class: tv0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f274673b;

            {
                this.f274673b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new m(this.f274673b, 1);
                    default:
                        return new m(this.f274673b, 0);
                }
            }
        });
        final int i2 = 1;
        this.f274685m = yhm.j.b(new Function0(this) { // from class: tv0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f274673b;

            {
                this.f274673b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new m(this.f274673b, 1);
                    default:
                        return new m(this.f274673b, 0);
                }
            }
        });
    }

    public static final boolean a(n nVar, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        return (windowInsetsAnimationCompat.getTypeMask() & WindowInsetsCompat.Type.ime()) != 0;
    }

    public final void b() {
        if (!this.f274683j.equals(j.f274675a) && this.f <= 0) {
            l lVar = this.f274683j;
            k kVar = k.f274676a;
            if (lVar.equals(kVar) || this.f274682h > 0) {
                if (((Boolean) this.f274680c.invoke()).booleanValue()) {
                    this.f274683j = kVar;
                } else {
                    c();
                    this.e.invoke();
                }
            }
        }
    }

    public final boolean c() {
        l lVar = this.f274683j;
        j jVar = j.f274675a;
        boolean zEquals = lVar.equals(jVar);
        this.f274683j = jVar;
        if (zEquals) {
            return false;
        }
        this.f274678a.removeCallbacks(this.k);
        return true;
    }

    public final void d() {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        ViewCompat.setWindowInsetsAnimationCallback(this.f274678a, this.f274681g ? (m) this.f274685m.getValue() : (m) this.f274684l.getValue());
    }
}

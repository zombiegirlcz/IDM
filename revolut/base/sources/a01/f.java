package a01;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.b1;
import skm.e0;
import vkm.j2;
import vkm.q;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements b {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Drawable f103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f105c;
    public final Lazy d;
    public volatile int e;
    public volatile a2 f;

    public f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f105c = q.c(0);
        this.d = j.b(new c(context, 0));
    }

    public final void a() {
        Continuation continuation = null;
        this.f103a = null;
        this.e = 1;
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = e0.C(b1.f263958a, null, null, new e(this, continuation, 0), 3);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void b() {
        this.e = 0;
        this.f103a = null;
        j2 j2Var = this.f105c;
        Integer numValueOf = Integer.valueOf(((Number) j2Var.getValue()).intValue() + 1);
        j2Var.getClass();
        j2Var.g(null, numValueOf);
    }
}

package xr0;

import android.view.View;
import ix0.h1;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f308195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f308196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f308197c;
    public final Function0 d;
    public g e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f308198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a70.b f308199h;

    public i(View itemView, Function1 onShowPreview, Function1 onPlayVideo, ie7.a aVar) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onShowPreview, "onShowPreview");
        Intrinsics.checkNotNullParameter(onPlayVideo, "onPlayVideo");
        this.f308195a = itemView;
        this.f308196b = onShowPreview;
        this.f308197c = onPlayVideo;
        this.d = aVar;
        this.e = f.f308193a;
        this.f308198g = new h(this);
        this.f308199h = new a70.b(this, 2);
        itemView.addOnAttachStateChangeListener(new a(this));
    }

    public final void a(Object obj2, Object obj3) {
        b();
        this.e = obj3 != null ? new c(obj3) : f.f308193a;
        this.f308196b.invoke(obj2);
        if (this.f) {
            c();
        }
    }

    public final void b() {
        g cVar = this.e;
        if (!(cVar instanceof f) && !(cVar instanceof c)) {
            if (cVar instanceof e) {
                Lazy lazy = h1.f169241a;
                e eVar = (e) cVar;
                h1.e(eVar.f308192b);
                cVar = new c(eVar.f308191a);
            } else if (!(cVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.e = cVar;
    }

    public final void c() {
        g gVar = this.e;
        if ((gVar instanceof f) || (gVar instanceof e) || (gVar instanceof d)) {
            return;
        }
        if (!(gVar instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj2 = ((c) gVar).f308189a;
        uk.a aVar = new uk.a(this, obj2, 6);
        this.e = new e(obj2, aVar);
        h1.d(100L, aVar);
    }
}

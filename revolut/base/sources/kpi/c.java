package kpi;

import android.content.Intent;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v60.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends fsi.c {

    @NotNull
    public static final a Companion = new a();
    public static final fsi.b i = new fsi.b("ACTIVITY_RESULT_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f188251h;

    public static final class a {
        private a() {
        }
    }

    public c() {
        super(i);
        this.f188251h = new i();
    }

    public final r N(int... requestCodes) {
        Intrinsics.checkNotNullParameter(requestCodes, "requestCodes");
        r rVarFilter = this.f188251h.filter(new km2.b(20, new b(requestCodes, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        return rVarFilter;
    }

    @Override // fsi.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        this.f188251h.onNext(new kpi.a(i2, i3, intent));
    }
}

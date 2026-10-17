package pt2;

import android.app.Activity;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends h implements dli.b {
    public final Activity o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ryc.a f239597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f239598q;

    public f(Activity activity, ryc.a inlineInstaller, g stateMapper) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inlineInstaller, "inlineInstaller");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = activity;
        this.f239597p = inlineInstaller;
        this.f239598q = mra.d.b(this, d.f239595a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f239598q;
    }
}

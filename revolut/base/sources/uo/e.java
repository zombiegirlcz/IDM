package uo;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f281471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f281472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f281473c;

    public e(Context context, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f281471a = context;
        this.f281472b = yhm.j.b(new ulm.p0(this, 2));
        this.f281473c = yhm.j.b(new bmm.t(languageProvider, this, 13));
    }
}

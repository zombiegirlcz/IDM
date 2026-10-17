package vp0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f290998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f290999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final js0.b f291000c;
    public final js0.b d;

    public a(View viewToRemove, h parameters, js0.b onViewBecomeInvisibleCallback, js0.b onFinishCallback) {
        Intrinsics.checkNotNullParameter(viewToRemove, "viewToRemove");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(onViewBecomeInvisibleCallback, "onViewBecomeInvisibleCallback");
        Intrinsics.checkNotNullParameter(onFinishCallback, "onFinishCallback");
        this.f290998a = viewToRemove;
        this.f290999b = parameters;
        this.f291000c = onViewBecomeInvisibleCallback;
        this.d = onFinishCallback;
    }
}

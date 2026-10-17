package tll;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Job f272120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Job f272121b;

    public final void a(Function0 onStart, Function0 startTicker) {
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(startTicker, "startTicker");
        Job job2 = this.f272120a;
        if (job2 == null || !job2.d()) {
            onStart.invoke();
            this.f272120a = (Job) startTicker.invoke();
        }
    }
}

package e0m;

import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements View.OnClickListener {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f121751c = ViewConfiguration.getDoubleTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f121752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f121753b;

    public i(Function1 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        this.f121752a = click;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (System.currentTimeMillis() - this.f121753b > f121751c) {
            this.f121753b = System.currentTimeMillis();
            this.f121752a.invoke(v);
        }
    }
}

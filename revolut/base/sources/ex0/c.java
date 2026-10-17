package ex0;

import an0.e;
import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DefaultLifecycleObserver {

    @NotNull
    public static final a Companion = new a();
    public static final IntentFilter d;
    public static final ee.b e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f130331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f130332b = j6.a.h("create(...)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f130333c = new b(this, 0);

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        d = intentFilter;
        e = new ee.b(new e(14));
    }

    public c(Context context) {
        this.f130331a = context;
        h80.e.f149935b.addObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        ContextCompat.registerReceiver(this.f130331a, this.f130333c, d, 4);
        this.f130332b.onNext(Unit.f186387a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        this.f130331a.unregisterReceiver(this.f130333c);
    }
}

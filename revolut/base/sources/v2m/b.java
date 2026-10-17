package v2m;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$RequestPermission;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v20.t;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements DefaultLifecycleObserver {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fragment f285753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f285754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f285755c;
    public Function0 d;
    public final ActivityResultLauncher e;

    public b(Fragment fragment, Function0 function0, Function0 function02, Function0 function03) {
        this.f285753a = fragment;
        this.f285754b = function0;
        this.f285755c = function02;
        this.d = function03;
        this.e = fragment.registerForActivityResult(new ActivityResultContracts$RequestPermission(), new t(this, 20));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f285753a = null;
        this.f285754b = null;
        this.f285755c = null;
        this.d = null;
    }
}

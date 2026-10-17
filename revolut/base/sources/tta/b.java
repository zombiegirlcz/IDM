package tta;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import elm.f;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mii.k;
import nii.j0;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import ru0.d;
import skm.e0;
import skm.p0;
import tji.l;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements DefaultLifecycleObserver {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f274296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f274297b;

    public b(d successScreenTrackerInteractor, d coroutineScope) {
        Intrinsics.checkNotNullParameter(successScreenTrackerInteractor, "successScreenTrackerInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f274296a = successScreenTrackerInteractor;
        this.f274297b = coroutineScope;
    }

    public final void a(l dialogModel) {
        boolean z;
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        if (dialogModel instanceof mii.l) {
            z = dialogModel instanceof k;
        } else if (dialogModel instanceof y0) {
            z = ((y0) dialogModel).f216244b instanceof j0;
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(c.DEBUG, "AppRatingKompotSuccessDialogCallbacks", "Dialog model '" + dialogModel + "' ignored", null, null, 16);
            z = false;
        }
        if (z) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f274297b.invoke();
            p0 p0Var = p0.f264001a;
            e0.C(coroutineScope, f.f127540b, null, new tjf.p0(this, null, 11), 2);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        z1 z1Var = nhi.k.f215504a;
        Intrinsics.checkNotNullParameter(this, "listener");
        nhi.k.d.add(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        z1 z1Var = nhi.k.f215504a;
        Intrinsics.checkNotNullParameter(this, "listener");
        nhi.k.d.remove(this);
    }
}

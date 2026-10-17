package t3l;

import android.os.Parcelable;
import com.google.android.material.snackbar.Snackbar;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends Snackbar.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f267823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f267824b;

    public f(h hVar, Parcelable parcelable) {
        this.f267824b = hVar;
        this.f267823a = parcelable;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.snackbar.Snackbar.Callback, com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
    public final void onDismissed(Snackbar snackbar, int i) {
        Intrinsics.checkNotNullParameter(snackbar, "snackbar");
        snackbar.removeCallback(this);
        Parcelable parcelable = this.f267823a;
        h hVar = this.f267824b;
        if (i == 0) {
            hVar.f267828j.onNext(new c(a.BY_SWIPE, parcelable));
            return;
        }
        if (i == 1) {
            Intrinsics.checkNotNullParameter("Actions are currently not supported for snackbar", "message");
            throw new NotImplementedError("Actions are currently not supported for snackbar");
        }
        if (i == 2) {
            hVar.f267828j.onNext(new c(a.BY_TIMEOUT, parcelable));
        } else if (i == 3) {
            hVar.f267828j.onNext(new c(a.BY_DISMISS_METHOD_CALL, parcelable));
        } else {
            if (i != 4) {
                return;
            }
            hVar.f267828j.onNext(new c(a.BY_NEXT_SNACKBAR, parcelable));
        }
    }
}

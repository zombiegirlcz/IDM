package tji;

import android.app.Activity;
import android.content.IntentSender;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f271785a;

    public e(Activity activity, int i) {
        switch (i) {
            case 1:
                this.f271785a = activity;
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.f271785a = activity;
                break;
        }
    }

    public void a(IntentSender intentSender, int i) throws IntentSender.SendIntentException {
        this.f271785a.startIntentSenderForResult(intentSender, i, null, 0, 0, 0);
    }

    @Override // tji.o
    public n b(long j2) {
        return new c(this.f271785a, j2);
    }
}

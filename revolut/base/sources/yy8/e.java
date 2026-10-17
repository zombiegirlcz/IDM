package yy8;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends com.revolut.feature.kyc_documents_scan.ui.onfido.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f317866a;

    public e(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f317866a = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f317866a, ((e) obj2).f317866a);
    }

    public final int hashCode() {
        return this.f317866a.hashCode();
    }
}

package yy8;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends com.revolut.feature.kyc_documents_scan.ui.onfido.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f317864a;

    public b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f317864a = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f317864a, ((b) obj2).f317864a);
    }

    public final int hashCode() {
        return this.f317864a.hashCode();
    }
}

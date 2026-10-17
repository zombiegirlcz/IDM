package ko9;

import ipa.j;
import ipa.k;
import kb7.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lo9.d;
import org.jetbrains.annotations.NotNull;
import skm.e0;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements hpa.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f186276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f186277b;

    public b(d repository, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f186276a = repository;
        this.f186277b = appCoroutineScope;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Intrinsics.f(k.b(message), "PAYMENT_WIDGET_STATE_UPDATE") || (str = (String) message.get("widgetInstanceId")) == null) {
            return false;
        }
        e0.C(this.f186277b, null, null, new c(this, str, null, 28), 3);
        return true;
    }
}

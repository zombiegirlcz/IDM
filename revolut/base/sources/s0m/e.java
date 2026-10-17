package s0m;

import kotlin.jvm.internal.Intrinsics;
import z0m.j;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f259025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f259026b;

    public /* synthetic */ e(boolean z, String str) {
        this.f259025a = z;
        this.f259026b = str;
    }

    public final void a(Throwable th10) {
        String loggerTag = this.f259026b;
        Intrinsics.checkNotNullParameter(loggerTag, "$loggerTag");
        String localizedMessage = th10.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "No message provided.";
        }
        if (this.f259025a) {
            j.d(loggerTag, localizedMessage, th10);
        } else {
            j.b(loggerTag, localizedMessage, th10);
        }
    }
}

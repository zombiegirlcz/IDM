package e0m;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f121745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f121746b;

    public c(Function1 initialiser) {
        Intrinsics.checkNotNullParameter(initialiser, "initialiser");
        this.f121745a = initialiser;
    }

    public final void a(Object obj2) {
        if (this.f121746b) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f121746b) {
                    this.f121745a.invoke(obj2);
                    this.f121746b = true;
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}

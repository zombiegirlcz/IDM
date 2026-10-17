package h7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f149774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.f f149775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f149776c;

    public e0(Object obj2, k7.f keyPath, Object obj3) {
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
        d0 callback = new d0(obj3, 0);
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f149774a = obj2;
        this.f149775b = keyPath;
        this.f149776c = callback;
    }
}

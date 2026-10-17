package rd0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f253312a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a ownership) {
        super(null, null, false, false);
        Intrinsics.checkNotNullParameter(ownership, "ownership");
        this.f253312a = ownership;
    }
}

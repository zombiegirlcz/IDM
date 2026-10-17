package jq9;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177505a;

    public /* synthetic */ k(int i) {
        this();
    }

    public abstract String a();

    public final long b() {
        return c().a();
    }

    public abstract b c();

    public boolean d() {
        return this.f177505a;
    }

    public abstract int e();

    public boolean f(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return d0.J(a(), query, true);
    }

    private k() {
        this.f177505a = true;
    }
}

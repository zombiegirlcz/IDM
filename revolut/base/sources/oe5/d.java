package oe5;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import tla.f;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e4m.e f224543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e4m.e f224544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e4m.e f224545c;

    @Override // sji.b
    public final Set f() {
        f provider = (f) this.f224543a.get();
        re5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return ImmutableSet.of(provider);
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}

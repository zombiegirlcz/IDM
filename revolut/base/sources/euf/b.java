package euf;

import kl.c0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f129560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f129561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f129562c;

    public b(c0 beneficiaryNavBarMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryNavBarMapper, "beneficiaryNavBarMapper");
        this.f129560a = beneficiaryNavBarMapper;
        this.f129561b = j.b(new a(0));
        this.f129562c = j.b(new a(1));
    }
}

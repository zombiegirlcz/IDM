package ob2;

import kotlin.jvm.internal.Intrinsics;
import n33.r0;
import njj.l;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vz1.g f223866a;

    public h(vz1.g apmPaymentsAuthorisationsRepository, qb2.e additionalInfoItemMapper) {
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        Intrinsics.checkNotNullParameter(additionalInfoItemMapper, "additionalInfoItemMapper");
        this.f223866a = apmPaymentsAuthorisationsRepository;
    }

    public final l a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new l(new d(new r0(mo3.a.g(this.f223866a.b(id10), null, new a(0), 1), 11), 1), 5);
    }
}

package sd5;

import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wd5.d;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f261826a;

    public c(d cryptoConfigRepository) {
        Intrinsics.checkNotNullParameter(cryptoConfigRepository, "cryptoConfigRepository");
        this.f261826a = cryptoConfigRepository;
    }

    public final r a(boolean z) {
        return this.f261826a.d.f(Unit.f186387a, z);
    }
}

package zkd;

import asi.d;
import ipa.k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skd.j;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements hpa.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f322934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f322935b;

    public b(j slotsUpdateRelay, d userSessionInteractor) {
        Intrinsics.checkNotNullParameter(slotsUpdateRelay, "slotsUpdateRelay");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        this.f322934a = slotsUpdateRelay;
        this.f322935b = userSessionInteractor;
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Intrinsics.f(k.b(message), "slots_update") || !jh.d.h(this.f322935b.a())) {
            return false;
        }
        this.f322934a.f263838a.k(Unit.f186387a);
        return true;
    }
}

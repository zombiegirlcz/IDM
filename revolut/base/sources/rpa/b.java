package rpa;

import ihm.j;
import ipa.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f256308a = p.a.D("toSerialized(...)");

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!k.r(message)) {
            return false;
        }
        this.f256308a.onNext(message);
        return true;
    }
}

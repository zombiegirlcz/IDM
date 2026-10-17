package bc7;

import ihm.j;
import ipa.h;
import ipa.k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f14390a = p.a.h("toSerialized(...)");

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (k.l(message) != h.RETAIL_NPS) {
            return false;
        }
        this.f14390a.onNext(Unit.f186387a);
        return true;
    }
}

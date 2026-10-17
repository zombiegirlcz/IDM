package lhi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f0 implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.d f195277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.j f195278b;

    public f0(q06.d deeplinkParser) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f195277a = deeplinkParser;
        this.f195278b = p.a.D("toSerialized(...)");
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        String strF;
        Intrinsics.checkNotNullParameter(message, "message");
        String strE = ipa.k.e(message);
        if (strE == null || (strF = ((s06.c) this.f195277a).f(strE)) == null) {
            return false;
        }
        this.f195278b.onNext(strF);
        return false;
    }
}

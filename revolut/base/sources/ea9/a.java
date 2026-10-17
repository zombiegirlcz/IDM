package ea9;

import e0m.g;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import te0.s;
import y99.g0;
import y99.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements o89.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f124154a;

    public a(i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f124154a = state;
    }

    @Override // o89.a
    public final efm.b B(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        efm.b bVarIgnoreElements = ((g0) this.f124154a).x0().b(email).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o89.a
    public final r G0() {
        r map = a1().map(new e8h.c(18, new dkm.a(1, g.f121750a, g.class, "isValidEmail", "isValidEmail(Ljava/lang/String;)Z", 0, 19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // o89.a
    public final r W2() {
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // o89.a
    public final r a1() {
        return ((g0) this.f124154a).x0().c(s.f270018a);
    }
}

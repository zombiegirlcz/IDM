package sj1;

import elm.f;
import ipa.j;
import ipa.k;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import qm.e;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements hpa.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f263671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f263672b;

    public b(e advisedComponentsInteractor, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(advisedComponentsInteractor, "advisedComponentsInteractor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f263671a = advisedComponentsInteractor;
        this.f263672b = scope;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Intrinsics.f(k.b(message), "advised_components_update")) {
            return false;
        }
        p0 p0Var = p0.f264001a;
        e0.C(this.f263672b, f.f127540b, null, new s64.a(this, null, 22), 2);
        return true;
    }
}

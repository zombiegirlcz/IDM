package gmd;

import ang.f;
import com.revolut.data.model.Data;
import g48.r0;
import go.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import w4l.h;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f144808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f144809b;

    public d(r0 jointAccountsInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f144808a = jointAccountsInteractor;
        this.f144809b = userInteractor;
    }

    public final Flow a(String str) {
        return str == null ? new g(new Data(f0.f322471a, null, false, 6, null), 2) : nim.a.v(u0.m(this.f144808a.f(str), q.q(nim.a.v(this.f144809b.j(h.f294642c), new gk7.a(23)))), new gk7.a(this, 22));
    }
}

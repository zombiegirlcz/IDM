package w54;

import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o8b.g;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import vkm.v1;
import vq5.w;
import w3k.i;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends x7a.c {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.b f294691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f294692b;

    public d(n8b.b countryUtils, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f294691a = countryUtils;
        this.f294692b = configurationInteractor;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new c8a.a((String) d0.a0(ids));
    }

    @Override // x7a.c
    public final String k(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return ((g) this.f294691a).a(countryCode.f297794a);
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        return new v1(new w(this, (Continuation) null, 20));
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        return new v1(new i(this, (Continuation) null, 8));
    }
}

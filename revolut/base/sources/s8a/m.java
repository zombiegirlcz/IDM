package s8a;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import kotlin.jvm.internal.Intrinsics;
import n8a.c0;
import n8a.d0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements f8a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f260964a;

    public m(d0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f260964a = repository;
    }

    public final Object a(PixIdentifiedType.Valid valid, gim.i iVar) {
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, new c0(this.f260964a, valid, null), iVar);
    }
}

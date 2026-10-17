package bo8;

import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements cli.n {

    @NotNull
    private static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aj8.a f17313a;

    public e0(aj8.a juniorPaymentLinkCardProfileMapper) {
        Intrinsics.checkNotNullParameter(juniorPaymentLinkCardProfileMapper, "juniorPaymentLinkCardProfileMapper");
        this.f17313a = juniorPaymentLinkCardProfileMapper;
    }

    public static si8.a a(d dVar) {
        String str = dVar.f17308a;
        String str2 = dVar.f17309b;
        return new si8.a(str, str2, com.google.android.gms.internal.mlkit_vision_face.a.o(str2, " ", dVar.f17310c), dVar.d, dVar.e, dVar.f);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new n((List) iii.c.f(t1.t(domainState.f17296a, domainState.f17297b), new bng.a(this, 9), new bn4.y(7), new b1c.p(this, domainState, 17)));
    }
}

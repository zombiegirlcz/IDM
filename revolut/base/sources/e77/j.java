package e77;

import com.revolut.feature.giro.impl.ui.review.domain.SelectedPocket;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zs9.p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1j.b f123098b;

    public /* synthetic */ j(h1j.b bVar, int i) {
        this.f123097a = i;
        this.f123098b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f123097a) {
            case 0:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                h1j.d dVar = (h1j.d) this.f123098b;
                return f.a(update, new SelectedPocket(dVar.f148580a, dVar.f148581b), false, 5);
            case 1:
                hee.j updateState = (hee.j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return hee.j.a(updateState, zi0.c.P(((h1j.c) this.f123098b).f148579a, false, null, 3), null, null, null, false, false, 62);
            case 2:
                nt9.g update2 = (nt9.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                xi0.a aVar = xi0.b.Companion;
                String str = ((h1j.c) this.f123098b).f148579a;
                aVar.getClass();
                return nt9.g.a(update2, null, null, null, xi0.a.a(str), null, false, LDSFile.EF_DG15_TAG);
            case 3:
                up9.b bVar = (up9.b) obj2;
                xi0.a aVar2 = xi0.b.Companion;
                String str2 = ((h1j.c) this.f123098b).f148579a;
                aVar2.getClass();
                return up9.b.a(bVar, null, 0L, xi0.a.a(str2), 0, LDSFile.EF_SOD_TAG);
            default:
                p pVar = (p) obj2;
                xi0.a aVar3 = xi0.b.Companion;
                String str3 = ((h1j.c) this.f123098b).f148579a;
                aVar3.getClass();
                return p.a(pVar, null, null, null, zi0.c.P(xi0.a.a(str3), false, null, 3), null, false, LDSFile.EF_DG15_TAG);
        }
    }
}

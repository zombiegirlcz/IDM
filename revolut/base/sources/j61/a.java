package j61;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mjf.b0;
import tof.q6;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f171654b;

    public /* synthetic */ a(b bVar, int i) {
        this.f171653a = i;
        this.f171654b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        q6[] scopes = (q6[]) obj2;
        switch (this.f171653a) {
            case 0:
                ((b0) this.f171654b.f171655a).t((q6[]) Arrays.copyOf(scopes, scopes.length));
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter(scopes, "scopes");
                return ((b0) this.f171654b.f171655a).g((q6[]) Arrays.copyOf(scopes, scopes.length));
        }
    }
}

package sxd;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f266440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f266441c;
    public final /* synthetic */ dj0.d d;

    public /* synthetic */ n(List list, z zVar, dj0.d dVar, int i) {
        this.f266439a = i;
        this.f266440b = list;
        this.f266441c = zVar;
        this.d = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f266439a) {
            case 0:
                g gVar = (g) obj2;
                this.f266441c.f266455r.getClass();
                List suggestions = this.f266440b;
                Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                return g.a(gVar, null, null, null, suggestions, e0.b(1, this.d, suggestions), false, 79);
            default:
                g gVar2 = (g) obj2;
                this.f266441c.f266455r.getClass();
                List suggestions2 = this.f266440b;
                Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                return g.a(gVar2, null, suggestions2, e0.b(2, this.d, suggestions2), null, null, false, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
        }
    }
}

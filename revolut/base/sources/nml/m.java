package nml;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi0.b f217390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f217391c;
    public final /* synthetic */ String d;

    public /* synthetic */ m(int i, String str, wi0.b bVar, boolean z) {
        this.f217389a = i;
        this.f217390b = bVar;
        this.f217391c = z;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f217389a) {
            case 0:
                g gVar = (g) obj2;
                return Intrinsics.f(this.f217390b, gVar.f217378a) ? g.a(gVar, null, false, false, new Data(new f(this.f217391c, this.d), null, false, 6, null), 7) : gVar;
            default:
                g gVar2 = (g) obj2;
                return this.f217390b.equals(gVar2.f217378a) ? g.a(gVar2, null, false, false, new Data(new f(this.f217391c, this.d), null, false, 6, null), 7) : gVar2;
        }
    }
}

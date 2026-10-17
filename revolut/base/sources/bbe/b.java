package bbe;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f14261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hce.c f14262c;

    public /* synthetic */ b(p pVar, hce.c cVar, int i) {
        this.f14260a = i;
        this.f14261b = pVar;
        this.f14262c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data status = (Data) obj2;
        switch (this.f14260a) {
            case 0:
                Intrinsics.checkNotNullParameter(status, "status");
                hce.b bVar = this.f14262c.f150886a;
                return new a(bVar.f150884b, status, bVar.f150885c, this.f14261b);
            default:
                Intrinsics.checkNotNullParameter(status, "status");
                hce.b bVar2 = this.f14262c.f150886a;
                return new lbe.a(bVar2.f150884b, status, bVar2.f150885c, this.f14261b);
        }
    }
}

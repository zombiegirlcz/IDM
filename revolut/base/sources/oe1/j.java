package oe1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f224515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f224516c;
    public final /* synthetic */ od1.b d;

    public /* synthetic */ j(String str, long j2, od1.b bVar, int i) {
        this.f224514a = i;
        this.f224515b = str;
        this.f224516c = j2;
        this.d = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f224514a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, this.f224515b, this.f224516c, null, null, 0, this.d, 57);
            default:
                ye1.i update2 = (ye1.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ye1.i.a(update2, null, this.f224515b, this.f224516c, null, null, null, this.d, null, null, null, false, 3961);
        }
    }
}

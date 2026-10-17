package sda;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f261837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf0.c f261838c;

    public /* synthetic */ a(c cVar, jf0.c cVar2, int i) {
        this.f261836a = i;
        this.f261837b = cVar;
        this.f261838c = cVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b ccy = (xi0.b) obj2;
        switch (this.f261836a) {
            case 0:
                Intrinsics.checkNotNullParameter(ccy, "ccy");
                c cVar = this.f261837b;
                return cVar.b(ccy, cVar.f261842c.a(this.f261838c));
            default:
                Intrinsics.checkNotNullParameter(ccy, "ccy");
                c cVar2 = this.f261837b;
                return cVar2.b(ccy, cVar2.f261842c.a(this.f261838c));
        }
    }
}

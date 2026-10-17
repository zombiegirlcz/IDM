package jk5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f175099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f175100c;

    public /* synthetic */ j(l lVar, b bVar, int i) {
        this.f175098a = i;
        this.f175099b = lVar;
        this.f175100c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        od0.i url2 = (od0.i) obj2;
        switch (this.f175098a) {
            case 0:
                Intrinsics.checkNotNullParameter(url2, "url");
                String str = (String) url2.g();
                this.f175099b.getClass();
                return l.a(this.f175100c, str);
            default:
                Intrinsics.checkNotNullParameter(url2, "url");
                String str2 = (String) url2.g();
                this.f175099b.getClass();
                return l.a(this.f175100c, str2);
        }
    }
}

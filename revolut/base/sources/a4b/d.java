package a4b;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o7.b f1236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1237c;

    public /* synthetic */ d(o7.b bVar, String str, int i) {
        this.f1235a = i;
        this.f1236b = bVar;
        this.f1237c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        wel.e portfolio = (wel.e) obj2;
        switch (this.f1235a) {
            case 0:
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                break;
            default:
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                break;
        }
        return this.f1236b.i(portfolio, this.f1237c);
    }
}

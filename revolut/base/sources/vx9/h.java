package vx9;

import efm.d0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f292865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f292866c;

    public /* synthetic */ h(g gVar, List list, int i) {
        this.f292864a = i;
        this.f292865b = gVar;
        this.f292866c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f292864a) {
            case 0:
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (isEnabled.booleanValue()) {
                    g gVar = this.f292865b;
                    d0 d0VarFirstOrError = m70.a.g(aa6.c.a((aa6.c) gVar.f292863c, false), null, null, 3).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                }
                break;
            default:
                List charities = (List) obj2;
                Intrinsics.checkNotNullParameter(charities, "charities");
                if (!charities.isEmpty()) {
                    ufm.c cVar = new ufm.c(new to7.f(this.f292866c, charities, 21), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                }
                break;
        }
        return pfm.m.f235744a;
    }
}

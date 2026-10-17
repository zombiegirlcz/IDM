package ieb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f160701b;

    public /* synthetic */ o(p pVar, g gVar, int i) {
        this.f160700a = i;
        this.f160701b = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 function1 = (Function1) obj3;
        switch (this.f160700a) {
            case 0:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                return p.a(this.f160701b, true);
            default:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                return p.a(this.f160701b, false);
        }
    }
}

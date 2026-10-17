package t87;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f268855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eel.c f268856c;
    public final /* synthetic */ List d;

    public /* synthetic */ j(l lVar, eel.c cVar, List list, int i) {
        this.f268854a = i;
        this.f268855b = lVar;
        this.f268856c = cVar;
        this.d = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 function1 = (Function1) obj3;
        switch (this.f268854a) {
            case 0:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                break;
            default:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                break;
        }
        return this.f268855b.a(this.f268856c, this.d);
    }
}

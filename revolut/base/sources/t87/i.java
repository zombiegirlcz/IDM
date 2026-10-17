package t87;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f268852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eel.c f268853c;
    public final /* synthetic */ List d;

    public /* synthetic */ i(l lVar, eel.c cVar, List list, int i) {
        this.f268851a = i;
        this.f268852b = lVar;
        this.f268853c = cVar;
        this.d = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        switch (this.f268851a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "<unused var>");
                break;
        }
        return this.f268852b.f268857a.a(this.f268853c, this.d);
    }
}

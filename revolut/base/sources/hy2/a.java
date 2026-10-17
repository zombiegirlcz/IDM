package hy2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c93.f f156691b;

    public /* synthetic */ a(f fVar, c93.f fVar2, int i) {
        this.f156690a = i;
        this.f156691b = fVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        switch (this.f156690a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "designs");
                break;
        }
        return f.d(it8, this.f156691b);
    }
}

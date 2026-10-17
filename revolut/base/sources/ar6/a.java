package ar6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q90.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f8522b;

    public /* synthetic */ a(c cVar, int i) {
        this.f8521a = i;
        this.f8522b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i dto = (i) obj2;
        switch (this.f8521a) {
            case 0:
                Intrinsics.checkNotNullParameter(dto, "dto");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(dto, "dto");
                break;
            default:
                Intrinsics.checkNotNullParameter(dto, "dto");
                break;
        }
        return this.f8522b.f8524b.a(dto);
    }
}

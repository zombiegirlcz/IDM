package ro7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import to7.u;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f255926b;

    public /* synthetic */ m(u uVar, int i) {
        this.f255925a = i;
        this.f255926b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f255925a) {
            case 0:
                f updateState = (f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return f.a(updateState, null, this.f255926b.f272548a, null, null, null, null, null, null, null, 771);
            default:
                f updateState2 = (f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return f.a(updateState2, null, null, this.f255926b.f272548a, null, null, null, null, null, null, 775);
        }
    }
}

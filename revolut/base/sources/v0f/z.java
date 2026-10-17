package v0f;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f284842b;

    public /* synthetic */ z(t tVar, int i) {
        this.f284841a = i;
        this.f284842b = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        u update = (u) obj2;
        switch (this.f284841a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
        }
        return u.a(update, null, null, null, null, null, this.f284842b, null, null, false, false, false, false, false, false, 16351);
    }
}

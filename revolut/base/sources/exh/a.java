package exh;

import axh.b;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cue.d f130429b;

    public /* synthetic */ a(cue.d dVar, int i) {
        this.f130428a = i;
        this.f130429b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f130428a) {
            case 0:
                b.a it8 = (b.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(this.f130429b, it8);
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            case 2:
                b.a it9 = (b.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(this.f130429b, it9);
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
        }
        return this.f130429b;
    }
}

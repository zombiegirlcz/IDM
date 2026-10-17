package c9h;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f22462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n9l.b f22463c;

    public /* synthetic */ e(k kVar, n9l.b bVar, int i) {
        this.f22461a = i;
        this.f22462b = kVar;
        this.f22463c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        switch (this.f22461a) {
            case 0:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xi0.b bVar = (xi0.b) pair.f186385a;
                return this.f22462b.f((List) pair.f186386b, bVar, this.f22463c);
            default:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xi0.b bVar2 = (xi0.b) pair.f186385a;
                return this.f22462b.f((List) pair.f186386b, bVar2, this.f22463c);
        }
    }
}

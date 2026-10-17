package vf5;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ue0.e;
import vf0.p;
import w4l.k;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f288506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f288507c;

    public /* synthetic */ a(d dVar, k kVar, int i) {
        this.f288505a = i;
        this.f288506b = dVar;
        this.f288507c = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        switch (this.f288505a) {
            case 0:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                hha.d dVar = (hha.d) pair.f186385a;
                return this.f288506b.a(this.f288507c, e.J(dVar, (List) pair.f186386b), dVar);
            default:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                hha.d dVar2 = (hha.d) pair.f186385a;
                return nim.a.v(this.f288506b.a(this.f288507c, u.c((hha.d) pair.f186386b), dVar2), new p(7));
        }
    }
}

package zim;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class h1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f322642b;

    public /* synthetic */ h1(j1 j1Var, int i) {
        this.f322641a = i;
        this.f322642b = j1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322641a) {
            case 0:
                return new i1(this.f322642b);
            default:
                return this.f322642b.q();
        }
    }
}

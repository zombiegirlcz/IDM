package p24;

import ft3.h1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f232038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f232039c;

    public /* synthetic */ c(h1 h1Var, d dVar, int i) {
        this.f232037a = i;
        this.f232038b = h1Var;
        this.f232039c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        zz3.b it8 = (zz3.b) obj2;
        switch (this.f232037a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return czi.c.L(it8, this.f232038b.f137835a, this.f232039c.f232041b);
    }
}

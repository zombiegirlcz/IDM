package kn;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym.b f185955b;

    public /* synthetic */ a(ym.b bVar, int i) {
        this.f185954a = i;
        this.f185955b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f185954a) {
            case 0:
                if (((Boolean) obj2).booleanValue()) {
                    this.f185955b.e.set(true);
                }
                return Unit.f186387a;
            default:
                ym.b it8 = (ym.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f314825c, this.f185955b.f314825c) || it8.e.get());
        }
    }
}

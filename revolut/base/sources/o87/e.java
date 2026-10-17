package o87;

import h87.i;
import kotlin.jvm.functions.Function1;
import q87.j;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f222954b;

    public /* synthetic */ e(i iVar, int i) {
        this.f222953a = i;
        this.f222954b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f222953a) {
            case 0:
                return b.a((b) obj2, null, null, this.f222954b, null, null, 27);
            case 1:
                return b.a((b) obj2, null, null, null, this.f222954b, null, 23);
            case 2:
                return b.a((b) obj2, null, this.f222954b, null, null, null, 29);
            case 3:
                return j.a((j) obj2, null, this.f222954b, null, null, null, null, null, null, null, 509);
            default:
                return j.a((j) obj2, this.f222954b, null, null, null, null, null, null, null, null, 510);
        }
    }
}

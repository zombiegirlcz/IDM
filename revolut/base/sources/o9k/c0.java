package o9k;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f223297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ skm.l f223298c;

    public /* synthetic */ c0(j0 j0Var, skm.l lVar, int i) {
        this.f223296a = i;
        this.f223297b = j0Var;
        this.f223298c = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f223296a) {
            case 0:
                j0.Z2(this.f223297b, this.f223298c, q8k.h.f243145a);
                break;
            case 1:
                j0.Z2(this.f223297b, this.f223298c, q8k.i.f243146a);
                break;
            case 2:
                j0.Z2(this.f223297b, this.f223298c, q8k.h.f243145a);
                break;
            default:
                j0.Z2(this.f223297b, this.f223298c, q8k.i.f243146a);
                break;
        }
        return Unit.f186387a;
    }
}

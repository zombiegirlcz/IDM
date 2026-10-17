package o9k;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f223305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ skm.l f223306c;

    public /* synthetic */ e0(j0 j0Var, skm.l lVar, int i) {
        this.f223304a = i;
        this.f223305b = j0Var;
        this.f223306c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f223304a) {
            case 0:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                j0.Z2(this.f223305b, this.f223306c, new q8k.m(transaction));
                break;
            default:
                n1 it8 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                j0.Z2(this.f223305b, this.f223306c, q8k.h.f243145a);
                break;
        }
        return Unit.f186387a;
    }
}

package ro7;

import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import kl7.m2;
import kl7.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n8i.b1;
import to7.e0;
import to7.i0;
import to7.t;
import to7.u;
import to7.z;
import y7a.v;
import y7a.w;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f255924b;

    public /* synthetic */ l(o oVar, int i) {
        this.f255923a = i;
        this.f255924b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f255923a) {
            case 0:
                v outputData = (v) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                w wVar = outputData.f311454a;
                if (wVar instanceof u) {
                    u uVar = (u) wVar;
                    String str = uVar.f272548a;
                    o oVar = this.f255924b;
                    if (!Intrinsics.f(str, ((f) oVar.t2()).f255915c)) {
                        oVar.x2(new m(uVar, 0));
                    }
                }
                break;
            case 1:
                v outputData2 = (v) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                w wVar2 = outputData2.f311454a;
                if (wVar2 instanceof u) {
                    u uVar2 = (u) wVar2;
                    String str2 = uVar2.f272548a;
                    o oVar2 = this.f255924b;
                    if (!Intrinsics.f(str2, ((f) oVar2.t2()).d)) {
                        oVar2.x2(new m(uVar2, 1));
                    }
                }
                break;
            case 2:
                v outputData3 = (v) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                w wVar3 = outputData3.f311454a;
                if (wVar3 instanceof to7.j) {
                    this.f255924b.x2(new b1((to7.j) wVar3, 28));
                }
                break;
            case 3:
                v outputData4 = (v) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                w wVar4 = outputData4.f311454a;
                if (wVar4 instanceof to7.p) {
                    to7.p pVar = (to7.p) wVar4;
                    s0 s0Var = pVar.f272543a;
                    o oVar3 = this.f255924b;
                    if (s0Var != ((f) oVar3.t2()).e) {
                        oVar3.x2(new b1(pVar, 29));
                    }
                }
                break;
            case 4:
                v outputData5 = (v) obj2;
                Intrinsics.checkNotNullParameter(outputData5, "outputData");
                w wVar5 = outputData5.f311454a;
                if (wVar5 instanceof t) {
                    t tVar = (t) wVar5;
                    int i = tVar.f272547a;
                    o oVar4 = this.f255924b;
                    Integer num = ((f) oVar4.t2()).f255918j;
                    if (num == null || i != num.intValue()) {
                        oVar4.x2(new n(tVar, 0));
                    }
                }
                break;
            case 5:
                v outputData6 = (v) obj2;
                Intrinsics.checkNotNullParameter(outputData6, "outputData");
                w wVar6 = outputData6.f311454a;
                if (wVar6 instanceof z) {
                    z zVar = (z) wVar6;
                    m2 m2Var = zVar.f272555a;
                    o oVar5 = this.f255924b;
                    if (m2Var != ((f) oVar5.t2()).f255916g) {
                        oVar5.x2(new n(zVar, 1));
                    }
                }
                break;
            case 6:
                v outputData7 = (v) obj2;
                Intrinsics.checkNotNullParameter(outputData7, "outputData");
                w wVar7 = outputData7.f311454a;
                if (wVar7 instanceof e0) {
                    e0 e0Var = (e0) wVar7;
                    CarVariation carVariation = e0Var.f272524a;
                    o oVar6 = this.f255924b;
                    if (!carVariation.equals(((f) oVar6.t2()).f255917h)) {
                        oVar6.x2(new n(e0Var, 2));
                    }
                }
                break;
            default:
                v outputData8 = (v) obj2;
                Intrinsics.checkNotNullParameter(outputData8, "outputData");
                w wVar8 = outputData8.f311454a;
                if (wVar8 instanceof i0) {
                    i0 i0Var = (i0) wVar8;
                    int i2 = i0Var.f272535a;
                    o oVar7 = this.f255924b;
                    Integer num2 = ((f) oVar7.t2()).f;
                    if (num2 == null || i2 != num2.intValue()) {
                        oVar7.x2(new n(i0Var, 3));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}

package hea;

import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PocketDetailsScreen f151635w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(PocketDetailsScreen pocketDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f151635w = pocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f151635w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f151635w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f151635w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            case 3:
                h hVar4 = new h(this.f151635w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
            case 4:
                h hVar5 = new h(this.f151635w, continuation, 4);
                hVar5.v = obj2;
                return hVar5;
            case 5:
                h hVar6 = new h(this.f151635w, continuation, 5);
                hVar6.v = obj2;
                return hVar6;
            case 6:
                h hVar7 = new h(this.f151635w, continuation, 6);
                hVar7.v = obj2;
                return hVar7;
            case 7:
                h hVar8 = new h(this.f151635w, continuation, 7);
                hVar8.v = obj2;
                return hVar8;
            case 8:
                h hVar9 = new h(this.f151635w, continuation, 8);
                hVar9.v = obj2;
                return hVar9;
            default:
                h hVar10 = new h(this.f151635w, continuation, 9);
                hVar10.v = obj2;
                return hVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hea.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

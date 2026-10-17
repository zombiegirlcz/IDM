package ueg;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import ip0.ku;
import ip0.xu;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mx0.q9;
import mx0.s9;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsSearchResultsMapScreen f279396w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f279396w = travelHotelsSearchResultsMapScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f279396w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(this.f279396w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k(this.f279396w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
            case 3:
                k kVar4 = new k(this.f279396w, continuation, 3);
                kVar4.v = obj2;
                return kVar4;
            case 4:
                k kVar5 = new k(this.f279396w, continuation, 4);
                kVar5.v = obj2;
                return kVar5;
            case 5:
                k kVar6 = new k(this.f279396w, continuation, 5);
                kVar6.v = obj2;
                return kVar6;
            case 6:
                k kVar7 = new k(this.f279396w, continuation, 6);
                kVar7.v = obj2;
                return kVar7;
            case 7:
                k kVar8 = new k(this.f279396w, continuation, 7);
                kVar8.v = obj2;
                return kVar8;
            case 8:
                k kVar9 = new k(this.f279396w, continuation, 8);
                kVar9.v = obj2;
                return kVar9;
            case 9:
                k kVar10 = new k(this.f279396w, continuation, 9);
                kVar10.v = obj2;
                return kVar10;
            case 10:
                k kVar11 = new k(this.f279396w, continuation, 10);
                kVar11.v = obj2;
                return kVar11;
            case 11:
                k kVar12 = new k(this.f279396w, continuation, 11);
                kVar12.v = obj2;
                return kVar12;
            default:
                k kVar13 = new k(this.f279396w, continuation, 12);
                kVar13.v = obj2;
                return kVar13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((cr0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((TagViewData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((xu) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k) create((ku) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k) create((TagViewData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((k) create((ku) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((k) create((koi.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((k) create((yv0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((k) create((q9) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((k) create((s9) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((xu) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01da  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ueg.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a83;

import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardListScreen;
import ip0.t80;
import ip0.u80;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardListScreen f2052w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(CardListScreen cardListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2052w = cardListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f2052w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f2052w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i(this.f2052w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i(this.f2052w, continuation, 3);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i(this.f2052w, continuation, 4);
                iVar5.v = obj2;
                return iVar5;
            default:
                i iVar6 = new i(this.f2052w, continuation, 5);
                iVar6.v = obj2;
                return iVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((u80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((t80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((t80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a83.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

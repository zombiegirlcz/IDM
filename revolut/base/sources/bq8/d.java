package bq8;

import gim.i;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f17790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f17791x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f17792y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, LinkedHashSet linkedHashSet, List list, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f17790w = eVar;
        this.f17791x = linkedHashSet;
        this.f17792y = list;
        this.z = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f17790w, this.f17791x, this.f17792y, this.z, continuation, 0);
            default:
                return new d(this.f17790w, this.f17791x, this.f17792y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0168  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq8.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

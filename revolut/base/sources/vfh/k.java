package vfh;

import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ l A;
    public final /* synthetic */ kul.b B;
    public bfl.g u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f288653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Instant f288654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f288655y;
    public final /* synthetic */ hdh.h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hdh.h hVar, l lVar, kul.b bVar, Continuation continuation) {
        super(1, continuation);
        this.z = hVar;
        this.A = lVar;
        this.B = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vfh.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

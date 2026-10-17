package gq9;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function1 {
    public ip9.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f145601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ File f145602x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File file, Continuation continuation) {
        super(1, continuation);
        this.f145601w = fVar;
        this.f145602x = file;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f145601w, this.f145602x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0113 A[Catch: Exception -> 0x0021, LOOP:0: B:24:0x010d->B:26:0x0113, LOOP_END, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x001c, B:23:0x00f8, B:24:0x010d, B:26:0x0113, B:27:0x0135, B:29:0x0162, B:31:0x0168, B:40:0x018b, B:42:0x018f, B:34:0x0172, B:35:0x0176, B:37:0x017c, B:45:0x0196, B:13:0x002c, B:19:0x008e, B:16:0x0081), top: B:52:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0162 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x001c, B:23:0x00f8, B:24:0x010d, B:26:0x0113, B:27:0x0135, B:29:0x0162, B:31:0x0168, B:40:0x018b, B:42:0x018f, B:34:0x0172, B:35:0x0176, B:37:0x017c, B:45:0x0196, B:13:0x002c, B:19:0x008e, B:16:0x0081), top: B:52:0x0014 }] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gq9.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

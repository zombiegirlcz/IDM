package vkm;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class y implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290146a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f290147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gim.i f290148c;

    /* JADX WARN: Multi-variable type inference failed */
    public y(Function2 function2, Flow flow) {
        this.f290148c = (gim.i) function2;
        this.f290147b = flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Type inference failed for: r12v17, types: [gim.i, oim.n] */
    /* JADX WARN: Type inference failed for: r2v11, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v23, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009c -> B:34:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ae -> B:37:0x00ab). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.y.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(Flow flow, Function2 function2) {
        this.f290147b = flow;
        this.f290148c = (gim.i) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(Flow flow, Function3 function3) {
        this.f290147b = flow;
        this.f290148c = (gim.i) function3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(Flow flow, oim.n nVar) {
        this.f290147b = flow;
        this.f290148c = (gim.i) nVar;
    }
}

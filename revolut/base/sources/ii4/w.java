package ii4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ ProducerScope A;
    public final /* synthetic */ SpinnerConfiguration.Mode.Limited.TerminationCondition B;
    public Data u;
    public it3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f161563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f161564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f161565y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, q qVar, ProducerScope producerScope, SpinnerConfiguration.Mode.Limited.TerminationCondition terminationCondition, Continuation continuation) {
        super(2, continuation);
        this.f161565y = zVar;
        this.z = qVar;
        this.A = producerScope;
        this.B = terminationCondition;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.f161565y, this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a9, code lost:
    
        if (r30.A.send(r2, r30) == r7) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ii4.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

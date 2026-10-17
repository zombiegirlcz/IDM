package aed;

import android.accounts.Account;
import com.revolut.data.model.Data;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import pjl.z0;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;
    public final /* synthetic */ Object F;
    public Object G;
    public Object H;
    public final /* synthetic */ int u = 0;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3541y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Data data, o oVar, Continuation continuation) {
        super(2, continuation);
        this.D = data;
        this.F = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((Data) this.D, (o) this.F, continuation);
            default:
                return new j((ProducerScope) this.F, (Account[]) this.G, (z0) this.H, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:25:0x00b3, B:40:0x0119, B:35:0x00ec, B:37:0x00f2, B:43:0x0125, B:45:0x0129, B:42:0x0121, B:32:0x00d1, B:34:0x00d7), top: B:49:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:25:0x00b3, B:40:0x0119, B:35:0x00ec, B:37:0x00f2, B:43:0x0125, B:45:0x0129, B:42:0x0121, B:32:0x00d1, B:34:0x00d7), top: B:49:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:25:0x00b3, B:40:0x0119, B:35:0x00ec, B:37:0x00f2, B:43:0x0125, B:45:0x0129, B:42:0x0121, B:32:0x00d1, B:34:0x00d7), top: B:49:0x0093 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0079 -> B:15:0x007c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0116 -> B:40:0x0119). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aed.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ProducerScope producerScope, Account[] accountArr, z0 z0Var, Continuation continuation) {
        super(2, continuation);
        this.F = producerScope;
        this.G = accountArr;
        this.H = z0Var;
    }
}

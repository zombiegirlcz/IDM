package c00;

import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import et6.h3;
import gim.i;
import h30.q;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import om4.x2;
import xv.m;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends i implements Function2 {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f20086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f20087y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h3 h3Var, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.D = h3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((List) this.D, continuation, (xv.i) this.z, (m) this.B);
            case 1:
                d dVar = new d((h3) this.D, continuation);
                dVar.f20086x = obj2;
                return dVar;
            case 2:
                return new d((String) this.C, (ish.a) this.f20086x, (WidgetContext) this.D, continuation, 2);
            case 3:
                return new d((q) this.C, (Experiment) this.f20086x, (ite.d) this.D, continuation, 3);
            default:
                d dVar2 = new d((x2) this.B, (String) this.C, continuation);
                dVar2.f20086x = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f6 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:52:0x01df, B:54:0x01e8, B:75:0x0229, B:76:0x0238, B:78:0x023e, B:80:0x024b, B:82:0x0251, B:84:0x025b, B:85:0x025f, B:90:0x02ed, B:86:0x0297, B:88:0x02c7, B:89:0x02e2, B:59:0x01f6, B:60:0x01fa, B:62:0x0200, B:64:0x020c, B:66:0x0212, B:68:0x021c, B:71:0x0221, B:72:0x0224, B:48:0x01b5), top: B:182:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0200 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:52:0x01df, B:54:0x01e8, B:75:0x0229, B:76:0x0238, B:78:0x023e, B:80:0x024b, B:82:0x0251, B:84:0x025b, B:85:0x025f, B:90:0x02ed, B:86:0x0297, B:88:0x02c7, B:89:0x02e2, B:59:0x01f6, B:60:0x01fa, B:62:0x0200, B:64:0x020c, B:66:0x0212, B:68:0x021c, B:71:0x0221, B:72:0x0224, B:48:0x01b5), top: B:182:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0297 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:52:0x01df, B:54:0x01e8, B:75:0x0229, B:76:0x0238, B:78:0x023e, B:80:0x024b, B:82:0x0251, B:84:0x025b, B:85:0x025f, B:90:0x02ed, B:86:0x0297, B:88:0x02c7, B:89:0x02e2, B:59:0x01f6, B:60:0x01fa, B:62:0x0200, B:64:0x020c, B:66:0x0212, B:68:0x021c, B:71:0x0221, B:72:0x0224, B:48:0x01b5), top: B:182:0x01b5 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x0513 -> B:179:0x0516). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c00.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.C = obj2;
        this.f20086x = obj3;
        this.D = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, Continuation continuation, xv.i iVar, m mVar) {
        super(2, continuation);
        this.u = 0;
        this.D = list;
        this.z = iVar;
        this.B = mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(x2 x2Var, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.B = x2Var;
        this.C = str;
    }
}

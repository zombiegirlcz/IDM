package lb0;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nel.t0;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f193523w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f193524x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f193525y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f193523w = obj2;
        this.f193525y = str;
        this.f193524x = obj3;
    }

    private final Object b(Object obj2) throws IOException {
        String strP;
        File file;
        lr.e eVar = (lr.e) this.f193523w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        int i2 = 1;
        if (i == 0) {
            yhm.o.b(obj2);
            do {
                strP = j6.a.p("toString(...)");
                file = new File(eVar.f199342b, strP);
            } while (file.exists());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ByteBuffer byteBuffer = (ByteBuffer) this.f193524x;
            try {
                byteBuffer.rewind();
                FileChannel channel = fileOutputStream.getChannel();
                while (byteBuffer.hasRemaining()) {
                    channel.write(byteBuffer);
                }
                Unit unit = Unit.f186387a;
                fileOutputStream.close();
                zq.a aVarG = eVar.f199341a.g();
                ar.a aVar2 = new ar.a(strP, (String) this.f193525y);
                this.v = 1;
                aVarG.getClass();
                if (DBUtil.performSuspending((RoomDatabase) aVarG.f324335b, false, true, new zp5.f(aVarG, aVar2, i2), this) == aVar) {
                    return aVar;
                }
            } finally {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        if (r11 == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00de, code lost:
    
        if (r11 == r2) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb0.b0.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0((com.revolut.core.backend_flow.impl.ui.form_screen.a) this.f193523w, (BackendFlowFile) this.f193524x, (String) this.f193525y, continuation, 0);
            case 1:
                b0 b0Var = new b0((Data) this.f193524x, (lb1.n) this.f193525y, continuation, 1);
                b0Var.f193523w = obj2;
                return b0Var;
            case 2:
                b0 b0Var2 = new b0((lc0.b0) this.f193525y, continuation, 2);
                b0Var2.f193524x = obj2;
                return b0Var2;
            case 3:
                return new b0((ldh.m) this.f193523w, (t0) this.f193524x, (ArrayList) this.f193525y, continuation, 3);
            case 4:
                b0 b0Var3 = new b0((le3.f) this.f193524x, (AnalyticsAccount) this.f193525y, continuation, 4);
                b0Var3.f193523w = obj2;
                return b0Var3;
            case 5:
                b0 b0Var4 = new b0((le3.w) this.f193524x, (AnalyticsAccount) this.f193525y, continuation, 5);
                b0Var4.f193523w = obj2;
                return b0Var4;
            case 6:
                return new b0((com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.a) this.f193523w, (wi0.b) this.f193524x, (ybi.b) this.f193525y, continuation, 6);
            case 7:
                b0 b0Var5 = new b0((lf6.j) this.f193524x, (String) this.f193525y, continuation, 7);
                b0Var5.f193523w = obj2;
                return b0Var5;
            case 8:
                return new b0(8, (lf6.j) this.f193523w, (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) this.f193524x, (String) this.f193525y, continuation);
            case 9:
                return new b0((lfg.e) this.f193524x, (hfg.d) this.f193525y, continuation, 9);
            case 10:
                b0 b0Var6 = new b0((hfg.l) this.f193524x, (lfg.g0) this.f193525y, continuation, 10);
                b0Var6.f193523w = obj2;
                return b0Var6;
            case 11:
                return new b0((lhk.e0) this.f193523w, (zfk.m) this.f193524x, (lhk.k) this.f193525y, continuation, 11);
            case 12:
                return new b0((com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.a) this.f193523w, (Set) this.f193524x, (Set) this.f193525y, continuation, 12);
            case 13:
                b0 b0Var7 = new b0((lie.i) this.f193525y, continuation, 13);
                b0Var7.f193524x = obj2;
                return b0Var7;
            case 14:
                b0 b0Var8 = new b0((lie.i) this.f193524x, (AccountContent) this.f193525y, continuation, 14);
                b0Var8.f193523w = obj2;
                return b0Var8;
            case 15:
                b0 b0Var9 = new b0((lj1.a) this.f193524x, (String) this.f193525y, continuation, 15);
                b0Var9.f193523w = obj2;
                return b0Var9;
            case 16:
                return new b0(16, (ll7.h) this.f193523w, (String) this.f193524x, (String) this.f193525y, continuation);
            case 17:
                return new b0(17, (ll7.k) this.f193523w, (ArrayList) this.f193524x, (String) this.f193525y, continuation);
            case 18:
                return new b0((Function1) this.f193523w, (ll7.p) this.f193524x, (String) this.f193525y, continuation, 18);
            case 19:
                return new b0(19, (ll7.e0) this.f193523w, (ArrayList) this.f193524x, (String) this.f193525y, continuation);
            case 20:
                return new b0((llb.f) this.f193523w, this.f193524x, (String) this.f193525y, continuation, 20);
            case 21:
                b0 b0Var10 = new b0((lld.u) this.f193525y, continuation, 21);
                b0Var10.f193524x = obj2;
                return b0Var10;
            case 22:
                return new b0((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a) this.f193524x, (pcd.s) this.f193525y, continuation, 22);
            case 23:
                b0 b0Var11 = new b0((lmg.f) this.f193525y, continuation, 23);
                b0Var11.f193524x = obj2;
                return b0Var11;
            case 24:
                b0 b0Var12 = new b0((lmg.m) this.f193525y, continuation, 24);
                b0Var12.f193524x = obj2;
                return b0Var12;
            case 25:
                return new b0((lqk.d) this.f193523w, (String) this.f193525y, (Function1) this.f193524x, continuation);
            case 26:
                return new b0((lr.a) this.f193524x, (String) this.f193525y, continuation, 26);
            case 27:
                return new b0(27, (lr.e) this.f193523w, (ByteBuffer) this.f193524x, (String) this.f193525y, continuation);
            case 28:
                return new b0((vr.l) this.f193523w, (lr.h) this.f193524x, (String) this.f193525y, continuation, 28);
            default:
                return new b0((lr.p) this.f193523w, (String) this.f193524x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:571:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v146, types: [skd.i] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v52, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68, types: [com.revolut.feature.slot_manager.api.model.SlotContext] */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v78 */
    /* JADX WARN: Type inference failed for: r6v79 */
    /* JADX WARN: Type inference failed for: r6v80 */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb0.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f193523w = obj2;
        this.f193524x = obj3;
        this.f193525y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f193524x = obj2;
        this.f193525y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f193525y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(lqk.d dVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 25;
        this.f193523w = dVar;
        this.f193525y = str;
        this.f193524x = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(lr.p pVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 29;
        this.f193523w = pVar;
        this.f193524x = str;
    }
}

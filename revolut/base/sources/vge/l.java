package vge;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f288939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f288940x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(x xVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
        this.f288939w = productAccountDescriptor$Value;
        this.f288940x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, this.f288939w, this.f288940x, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

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
    public final Object invokeSuspend(Object obj2) {
        Object objC;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Throwable error = data.getError();
        ProductAccount.ValueItem productAccount = (ProductAccount.ValueItem) data.getContent();
        if (error != null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
        } else if (productAccount != null) {
            x xVar = this.v;
            e2 e2Var = xVar.f289051c;
            ProductAccountDescriptor$Value descriptor = x.b(xVar, this.f288939w, this.f288940x);
            t2 t2Var = (t2) e2Var;
            ne0.j jVar = t2Var.f289010a;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(productAccount, "productAccount");
            ReentrantReadWriteLock reentrantReadWriteLock = t2Var.e;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                f2 f2Var = t2.Companion;
                ProductId f89727a = descriptor.getF89727a();
                f2Var.getClass();
                List list = (List) jVar.get(f2.a(f89727a));
                if (list != null) {
                    int size = list.size();
                    ArrayList arrayListF1 = zhm.d0.f1(list);
                    Iterator it8 = arrayListF1.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it8.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (Intrinsics.f(((ProductAccount) it8.next()).getF89504c(), productAccount.getF89504c())) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 >= 0) {
                        arrayListF1.set(i3, productAccount);
                        objC = arrayListF1;
                    } else {
                        arrayListF1.add(size, productAccount);
                        objC = arrayListF1;
                    }
                } else {
                    objC = zhm.u.c(productAccount);
                }
                f2 f2Var2 = t2.Companion;
                ProductId f89727a2 = descriptor.getF89727a();
                f2Var2.getClass();
                jVar.f(f2.a(f89727a2), objC);
                Unit unit = Unit.f186387a;
            } finally {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        }
        return Unit.f186387a;
    }
}

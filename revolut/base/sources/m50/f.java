package m50;

import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import u10.n;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ List v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(List list, int i, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.v = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, 0, continuation);
            case 1:
                return new f(this.v, 1, continuation);
            default:
                return new f(this.v, 2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        File[] fileArrListFiles;
        int i = this.u;
        List list = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    ((File) it8.next()).delete();
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    ((File) it9.next()).delete();
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    final File file = new File(((n) it10.next()).e);
                    File parentFile = file.getParentFile();
                    if (parentFile != null && (fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: z20.m
                        @Override // java.io.FileFilter
                        public final boolean accept(File file2) {
                            Intrinsics.h(file2);
                            return a0.H(lim.o.o(file2), lim.o.o(file), false);
                        }
                    })) != null) {
                        for (File file2 : fileArrListFiles) {
                            file2.delete();
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}

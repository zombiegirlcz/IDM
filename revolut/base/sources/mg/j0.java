package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.n()) {
            try {
                arrayList.add(Integer.valueOf(aVar.s()));
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }
        aVar.i();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        cVar.f();
        int length = ((AtomicIntegerArray) obj2).length();
        for (int i = 0; i < length; i++) {
            cVar.u(r6.get(i));
        }
        cVar.i();
    }
}

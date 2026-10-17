package wc;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends ufm.d {
    public final void p(List list) {
        Object[] objArr = (Object[]) n();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.f279876b).getType().getComponentType(), list.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            objArr2[length] = it8.next();
            length++;
        }
        o(objArr2);
    }

    public final void q(Collection collection) {
        Object[] objArr = (Object[]) n();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.f279876b).getType().getComponentType(), collection.size() + (objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it8 = collection.iterator();
        while (it8.hasNext()) {
            objArr2[i] = it8.next();
            i++;
        }
        o(objArr2);
    }
}
